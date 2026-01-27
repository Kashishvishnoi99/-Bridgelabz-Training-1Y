import java.util.Scanner;

public class Power1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the number and Power: ");
        int Number = input.nextInt();
        int PowerOfNumber = input.nextInt(); 
		
        if (Number < 0 || PowerOfNumber < 0) {
            System.out.println("Please Enter Positive integers.");
        } else {
            int Result = 1;  
            for (int i = 1; i <= PowerOfNumber; i++) {
                Result = Result * Number;
            } 
            System.out.println(Result);
        } 
    }
}
