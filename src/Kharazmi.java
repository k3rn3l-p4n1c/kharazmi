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

import jasmin.Main;


/**
 * Created by Bardia on 3/10/17.
 */
public class Kharazmi {
    public static void main(String[] args) throws IOException {
        String fileName = "samples/1_print.kh";
        File file = new File(fileName);
        FileInputStream fis = null;

//        try {
        // Open the input file stream
        fis = new FileInputStream(file);

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

        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new KharazmiBaseListener(), tree);
//            System.out.println(); // print a \n after translation

        // Walk the tree again to translate to java
        walker.walk(new KharazmiCodeGenerator(), tree);
//        walker.walk(new KharazmiVariable(), tree);

        // PrintFunctionCall LISP-style tree
//            System.out.println(tree.toStringTree(parser));
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        String outputName = "temp_jasmin";
        String bytecode = "";
        try {
            URL location = Main.class.getProtectionDomain().getCodeSource().getLocation();
            URL jasmin_path = new URL(location,"../"+outputName+".j");
            System.out.println("Jasmin created in: "+jasmin_path);
            PrintWriter writer = new PrintWriter(jasmin_path.getPath(), "UTF-8");
            writer.print(bytecode);
            writer.close();

            (new Main()).assemble(jasmin_path.getPath());
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Manifest manifest = new Manifest();
        manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
        manifest.getMainAttributes().put(Attributes.Name.MAIN_CLASS, "Scrawlout");
        JarOutputStream target = new JarOutputStream(new FileOutputStream("Scrawlout.jar"), manifest);
        add(new File("Scrawlout.class"), target);
        target.close();
    }

    private static void add(File source, JarOutputStream target) throws IOException
    {
        BufferedInputStream in = null;
        try
        {
            if (source.isDirectory())
            {
                String name = source.getPath().replace("\\", "/");
                if (!name.isEmpty())
                {
                    if (!name.endsWith("/"))
                        name += "/";
                    JarEntry entry = new JarEntry(name);
                    entry.setTime(source.lastModified());
                    target.putNextEntry(entry);
                    target.closeEntry();
                }
                for (File nestedFile: source.listFiles())
                    add(nestedFile, target);
                return;
            }

            JarEntry entry = new JarEntry(source.getPath().replace("\\", "/"));
            entry.setTime(source.lastModified());
            target.putNextEntry(entry);
            in = new BufferedInputStream(new FileInputStream(source));

            byte[] buffer = new byte[1024];
            while (true)
            {
                int count = in.read(buffer);
                if (count == -1)
                    break;
                target.write(buffer, 0, count);
            }
            target.closeEntry();
        }
        finally
        {
            if (in != null)
                in.close();
        }
    }

}
