import jasmin.Main;
import listeners.KharazmiCodeGenerator;
import listeners.ThrowingErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.KharazmiBaseListener;
import parser.KharazmiLexer;
import parser.KharazmiParser;

import java.io.*;
import java.net.URL;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;


/**
 * Created by Bardia on 3/10/17.
 */
public class Kharazmi {

    public static void main(String[] args) throws IOException {
        String outputName = "KharazmiProgram";
        String inputPath = null;
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--help":
                case "-h":
                    System.out.println("usage: Scrawl [--output <output name>] <file> \n");
                    return;
                case "--ouput":
                case "-o":
                    i++;
                    outputName = args[i];
                    break;
                default:
                    inputPath = args[i];
            }
        }

        if (inputPath == null) {
            System.out.println("No .kh file is specified");
            System.out.println("usage: Scrawl [--output <output name>] <file> \n");
            return;
        }
        String jasminPath = generateJasminCode(inputPath, outputName);
        if (jasminPath != null) {
            assembleJasmin(jasminPath);
            generateJarFile(outputName);
        }
    }

    private static String generateJasminCode(String fileName, String outputName) throws IOException {
        File file = new File(fileName);
        FileInputStream fis;

        try {
            // Open the input file stream
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " was not found.");
            return null;
        }
        System.out.print("Compiling...");

        // Create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(fis);

        // Create a lexer that feeds off of input CharStream
        KharazmiLexer lexer = new KharazmiLexer(input);
        lexer.addErrorListener(new ThrowingErrorListener());

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        KharazmiParser parser = new KharazmiParser(tokens);
        parser.addErrorListener(new ThrowingErrorListener());

        // Begin parsing at rule prog
        ParseTree tree = parser.prog();

        // Close the input file
        fis.close();

        URL location = Main.class.getProtectionDomain().getCodeSource().getLocation();
        URL jasmin_path = new URL(location, "../" + outputName + ".j");
        PrintWriter writer = new PrintWriter(jasmin_path.getPath(), "UTF-8");

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new KharazmiBaseListener(), tree);
        KharazmiCodeGenerator kharazmiCodeGenerator = new KharazmiCodeGenerator(writer);
        walker.walk(kharazmiCodeGenerator, tree);

        writer.close();
        System.out.println(" Done");

        return jasmin_path.getPath();
    }

    static void assembleJasmin(String path) {
        System.out.println("Assembling...");
        (new Main()).assemble(path);
    }

    static void generateJarFile(String outputName) throws IOException {
        System.out.print("Generating output...");

        Manifest manifest = new Manifest();
        manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
        manifest.getMainAttributes().put(Attributes.Name.MAIN_CLASS, "KharazmiProgram");
        JarOutputStream target = new JarOutputStream(new FileOutputStream(outputName + ".jar"), manifest);
        add(new File("KharazmiProgram.class"), target);
        target.close();
        System.out.println(" Done");
        System.out.println("Generated: " + outputName + ".jar");

    }

    private static void add(File source, JarOutputStream target) throws IOException {
        BufferedInputStream in = null;
        try {
            if (source.isDirectory()) {
                String name = source.getPath().replace("\\", "/");
                if (!name.isEmpty()) {
                    if (!name.endsWith("/"))
                        name += "/";
                    JarEntry entry = new JarEntry(name);
                    entry.setTime(source.lastModified());
                    target.putNextEntry(entry);
                    target.closeEntry();
                }
                for (File nestedFile : source.listFiles())
                    add(nestedFile, target);
                return;
            }

            JarEntry entry = new JarEntry(source.getPath().replace("\\", "/"));
            entry.setTime(source.lastModified());
            target.putNextEntry(entry);
            in = new BufferedInputStream(new FileInputStream(source));

            byte[] buffer = new byte[1024];
            while (true) {
                int count = in.read(buffer);
                if (count == -1)
                    break;
                target.write(buffer, 0, count);
            }
            target.closeEntry();
        } finally {
            if (in != null)
                in.close();
        }
    }

}
