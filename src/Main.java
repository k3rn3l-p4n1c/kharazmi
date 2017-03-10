import listeners.KharazmiTyper;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.KharazmiBaseListener;
import parser.KharazmiLexer;
import parser.KharazmiParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Bardia on 3/10/17.
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "samples/source.kh";
        File file = new File(fileName);
        FileInputStream fis = null;

        try {
            // Open the input file stream
            fis = new FileInputStream(file);

            // Create a CharStream that reads from standard input
            ANTLRInputStream input = new ANTLRInputStream(fis);

            // Create a lexer that feeds off of input CharStream
            KharazmiLexer lexer = new KharazmiLexer(input);

            // Create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser that feeds off the tokens buffer
            KharazmiParser parser = new KharazmiParser(tokens);

            // Begin parsing at rule prog
            ParseTree tree = parser.prog();

            // Close the input file
            fis.close();

            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            walker.walk(new KharazmiBaseListener(), tree);
            System.out.println(); // print a \n after translation

            // Walk the tree again to translate to java
            walker.walk(new KharazmiTyper(), tree);

            // Print LISP-style tree
            System.out.println(tree.toStringTree(parser));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
