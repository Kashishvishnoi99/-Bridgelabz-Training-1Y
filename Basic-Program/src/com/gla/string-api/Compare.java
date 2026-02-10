import java.util.Scanner;
public class  Compare{
    public static boolean CompareCharAt(String S1, String S2) {
        if (S1.length() != S2.length()) {
            return false;
        }
        for(int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) != S2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str1 =  input.next();
        String str2 = input.next();
        boolean CharAtResult = CompareCharAt(str1, str2);
        boolean EqualsResult = str1.equals(str2);
        System.out.println("Result using charAt() method: " + CharAtResult);
        System.out.println("Result using equals() method: " + EqualsResult);
        if (CharAtResult == EqualsResult) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both  are differnt");
        }
    }
}
