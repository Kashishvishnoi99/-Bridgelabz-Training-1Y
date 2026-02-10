public class LowerCase{

    public static String ConvertToLowercase(String Text) {
        String Result = "";
        for (int i = 0; i < Text.length(); i++) {
            char Ch = Text.charAt(i);
            if (Ch >= 'A' && Ch <= 'Z') {
                Ch = (char)(Ch + 32);
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

        String Text = "";
        for (int i = 0; i < args.length; i++) {
            Text = Text + args[i] + " ";
        }
        Text = Text.trim();

        String  UsingCharAt = ConvertToLowercase(Text);
        String  UsingBuiltIn = Text.toLowerCase();

        boolean Result = CompareString(UsingCharAt,  UsingBuiltIn);

        System.out.println("Lowercase using charAt" +  UsingCharAt);
        System.out.println("Lowercase using toLowerCase" + UsingBuiltIn);
        System.out.println(" Result: " + Result);
    }
}
