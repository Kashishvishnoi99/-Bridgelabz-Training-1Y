import java.util.Scanner;

public class ProblemNo10{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	  double Height = input.nextDouble(); // in cm
       double Inch = Height / 2.54;
	   double Feet = Inch / 12;
	   double RemainingInch = Inch % 12;
		
        System.out.println("Your height in cm is " + Height + " while in feet is "+ Feet+" and inches is "+ RemainingInch);
}
}