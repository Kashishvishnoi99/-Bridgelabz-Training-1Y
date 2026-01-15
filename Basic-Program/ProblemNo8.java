import java.util.Scanner;
public class ProblemNo8{
public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	double Kilometer = sc.nextDouble();
	double Miles = Kilometer/1.6;
	
	System.out.println("The total miles "+ Miles+ " mile for the given "+ Kilometer+ " km");
}
}