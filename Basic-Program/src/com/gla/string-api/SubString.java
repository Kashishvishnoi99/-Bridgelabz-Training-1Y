import java.util.Scanner;

class SubString{
    public static String UsingCharAt(String text, int start, int end) {
        String Result = "";
        for (int i = start; i < end; i++) {
            Result = Result + text.charAt(i);
        }
        return Result;
    }
    public static boolean CompareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String Text = input.next();
        System.out.print("Enter start and end index: ");
        int Start = input.nextInt();
        int End = input.nextInt();

        String CharAtSubstring = UsingCharAt(Text, Start, End);
        String BuiltInSubstring = Text.substring(Start, End);
        boolean CompareResult = CompareStrings(CharAtSubstring, BuiltInSubstring);

        System.out.println("SubString using charAt " + CharAtSubstring);
        System.out.println("SubString using subString " + BuiltInSubstring);
        System.out.println("RESULT: " + CompareResult);
    }
}
