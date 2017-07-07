package listeners;

import parser.KharazmiParser;

/**
 * Created by Aseman-Manzar on 7/7/17.
 */
public class KharazmiHelperFunctions {
    private KharazmiHelperFunctions(){}

    public static void PrintFunctionCall(KharazmiParser.ExprContext exprContext){
        if (exprContext.STRING() != null){
            System.out.println("; push System.out onto the stack\n" +
                    "    getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                    "\n" +
                    "    ; push a string onto the stack\n" +
                    "    ldc \""+exprContext.getText().substring(1, exprContext.getText().length()-1)+"\"\n" +
                    "\n" +
                    "    ; call the PrintStream.println() method.\n" +
                    "    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        }else if (exprContext.NUMBER() != null){
                System.out.println("; push System.out onto the stack\n" +
                        "    getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                        "\n" +
                        "    ; push a string onto the stack\n" +
                        "    ldc \""+exprContext.getText()+"\"\n" +
                        "\n" +
                        "    ; call the PrintStream.println() method.\n" +
                        "    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        }else if (exprContext.ID() != null){
            // TODO print variable
        }else{
            throw new RuntimeException("Can not print '" + exprContext.getText() + "'");
        }
    }

    public static void JasminPrefix(){
        String prefix = ".class public KharazmiProgram\n" +
                ".super java/lang/Object\n" +
                "\n" +
                ".method public <init>()V\n" +
                "    aload_0\n" +
                "    invokenonvirtual java/lang/Object/<init>()V\n" +
                "    return\n" +
                ".end method";
        System.out.println(prefix);
    }



}
