import java.util.Scanner;
public class ProblemNo16{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double NumberOfStudent = input.nextDouble();
		double MaxPossibleHandShakes = (NumberOfStudent*(NumberOfStudent-1)) / 2;
		 
		System.out.println("The maximum number of possible handshakes is " + MaxPossibleHandShakes);
   		 }
	}