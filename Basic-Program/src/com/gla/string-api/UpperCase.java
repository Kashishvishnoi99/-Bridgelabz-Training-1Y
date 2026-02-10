class Uppercase{

    public static String ConvertToUppercase(String Text) {
        String Result = "";
        for (int i = 0; i < Text.length(); i++) {
            char Ch = Text.charAt(i);
            if (Ch >= 'a' && Ch <= 'z') {
                Ch = (char)(Ch - 32);
            }
            Result = Result + Ch;
        }
        return Result;
    }

    public static boolean CompareString(String Text1, String Text2) {
        if (Text1.length() != Text2.length()) {
            return false;
        }
        for (int i = 0; i < Text1.length(); i++) {
            if (Text1.charAt(i) != Text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String Text;
        if (args.length > 0) {
            Text = args[0];
        } else {
            Text = "";
        }
        String UsingCharAt = ConvertToUppercase(Text);
        String UsingBuiltIn = Text.toUpperCase();

        boolean Result = CompareString(UsingrCharAt, UsingBuiltIn);

        System.out.println("Uppercase using charAt " + UsingCharAt);
        System.out.println("Uppercase using toUpperCse " + UsingBuiltIn);
        System.out.println("RESULT: " + Result);
    }
}

