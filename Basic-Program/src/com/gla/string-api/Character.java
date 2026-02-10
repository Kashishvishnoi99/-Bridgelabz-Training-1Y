import java.util.Scanner;
public class Character{
    public static char[] GetCharacters(String Text) {
        char[] Result = new char[Text.length()];
        for (int i = 0; i < Text.length(); i++) {
            Result[i] = Text.charAt(i);
        }
        return Result;
    }
    public static boolean CompareArrays(char[] Arr1, char[] Arr2) {
        if (Arr1.length != Arr2.length) {
            return false;
        }
        for (int i = 0; i < Arr1.length; i++) {
            if (Arr1[i] != Arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String Text = input.next();

        char[] UserArray = GetCharacters(Text);
        char[] BuiltInArray = Text.toCharArray();
        boolean Result = CompareArrays(UserArray, BuiltInArray);
        System.out.println("RESULT: " + Result);
    }
}
