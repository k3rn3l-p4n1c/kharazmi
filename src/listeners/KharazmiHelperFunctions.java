package listeners;

import parser.KharazmiBaseListener;
import parser.KharazmiParser;

/**
 * Created by Aseman-Manzar on 7/7/17.
 */
public class KharazmiHelperFunctions {
    private KharazmiHelperFunctions(){}

    public static String PrintFunctionCall(KharazmiParser.ExprContext exprContext){
        if (exprContext.STRING() != null){
            return "; push System.out onto the stack\n" +
                    "    getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                    "\n" +
                    "    ; push a string onto the stack\n" +
                    "    ldc \""+exprContext.getText().substring(1, exprContext.getText().length()-1)+"\"\n" +
                    "\n" +
                    "    ; call the PrintStream.println() method.\n" +
                    "    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";
        }else if (exprContext.NUMBER() != null){
            return "; push System.out onto the stack\n" +
                        "    getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                        "\n" +
                        "    ; push a string onto the stack\n" +
                        "    ldc \""+exprContext.getText()+"\"\n" +
                        "\n" +
                        "    ; call the PrintStream.println() method.\n" +
                        "    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";
        }else if (exprContext.ID() != null){
            // TODO print variable
        }else{
            throw new RuntimeException("Can not print '" + exprContext.getText() + "'");
        }
        return "";
    }

    public static String JasminPrefix(){
        String prefix = ".class public KharazmiProgram\n" +
                ".super java/lang/Object\n" +
                "\n" +
                ".method public <init>()V\n" +
                "    aload_0\n" +
                "    invokenonvirtual java/lang/Object/<init>()V\n" +
                "    return\n" +
                ".end method"+"\n.method public static main([Ljava/lang/String;)V\n" +
                "    .limit stack 100\n" +
                "    .limit locals 100\n";
        return prefix;
    }

    public static String JasminPostfix(){
        String postfix = "    return\n" +
                ".end method\n";
        return postfix;
    }

    public static String ToEnglishNumber(String s){
        String temp = "";
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case '.':
                    temp += "0";
                    break;
                case '۱':
                    temp += "1";
                    break;
                case '۲':
                    temp += "2";
                    break;
                case '۳':
                    temp += "3";
                    break;
                case '۴':
                    temp += "4";
                    break;
                case '۵':
                    temp += "5";
                    break;
                case '۶':
                    temp += "6";
                    break;
                case '۷':
                    temp += "7";
                    break;
                case '۸':
                    temp += "8";
                    break;
                case '۹':
                    temp += "9";
                    break;
                default:
                    temp += s.charAt(i);
            }
        }
        return temp;
    }


}
