import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a positive integer: ");
        int Number = input.nextInt(); 
		
        if (Number <= 0) {
            System.out.println("Please Enter A positive Integer.");
            return;
        }
        String[] Results = new String[Number + 1]; 
        for (int i = 1; i <= Number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                Results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                Results[i] = "Fizz";
            } else if (i % 5 == 0) {
                Results[i] = "Buzz";
            } else {
                Results[i] = String.valueOf(i);
            }
        } 
        for (int i = 1; i <= Number; i++) {
            System.out.println("Position " + i + " = " + Results[i]);
        } 
    }
}
