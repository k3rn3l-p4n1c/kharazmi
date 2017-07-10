package listeners;

public class KharazmiHelperFunctions {
    private KharazmiHelperFunctions() {
    }


    public static String JasminPrefix() {
        return ".class public KharazmiProgram\n" +
                ".super java/lang/Object\n" +
                "\n" +
                ".method public <init>()V\n" +
                "    aload_0\n" +
                "    invokenonvirtual java/lang/Object/<init>()V\n" +
                "    return\n" +
                ".end method" + "\n.method public static main([Ljava/lang/String;)V\n" +
                "    .limit stack 100\n" +
                "    .limit locals 100\n";
    }

    public static String JasminPostfix() {
        return " return\n" +
                ".end method\n";
    }

    public static String ToEnglishNumber(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
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
