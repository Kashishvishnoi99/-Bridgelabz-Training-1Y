import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args){ 
        int[] Numbers = new int[5];
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = input.nextInt();
        } 
		
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] > 0) {
                if (Numbers[i] % 2 == 0) {
                    System.out.println(Numbers[i] + " is a positive Even Number");
                } else {
                    System.out.println(Numbers[i] + " is a positive Odd Number");
                }
            } else if (Numbers[i] < 0) {
                System.out.println(Numbers[i] + " is a Negative number");
            } else {
                System.out.println(Numbers[i] + " is Zero");
            }
        } 
        if (Numbers[0] == Numbers[4]) {
            System.out.println("First and last elements are equal");
        } else if (Numbers[0] > Numbers[4]) {
            System.out.println("First element is Greater than Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }
    }   
}
