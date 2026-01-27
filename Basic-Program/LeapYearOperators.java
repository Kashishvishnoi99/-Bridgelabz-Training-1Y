import java.util.Scanner;

public class LeapYearOperators{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Year: ");
        int Year = input.nextInt(); 
		
		 if (Year >= 1582 && (Year % 400 == 0 || Year % 4 == 0 && Year % 100 != 0)) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
   
    }
}
