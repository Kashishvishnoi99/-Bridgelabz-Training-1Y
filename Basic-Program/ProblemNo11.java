import java.util.Scanner;
public class ProblemNo11{
	public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 double Number1 = input.nextDouble();
		 double Number2 = input.nextDouble();
		 
		 double Addition = Number1 + Number2;
		 double Subtraction;
		 if(Number1>Number2){
		 Subtraction = Number1 - Number2;
		 }
		 else {
		 Subtraction = Number2 -Number1;
		 }
		double Multiplication = Number1 * Number2;
		double Division = Number1 / Number2;
			
	    System.out.println("The Addition, Subtraction, Multiplication and Division value of 2 numbers "
  		+ Number1 + " and " + Number2 + " is " +Addition + ", " +Subtraction + ", " +Multiplication + ", and " +Division);
 		 }
	}