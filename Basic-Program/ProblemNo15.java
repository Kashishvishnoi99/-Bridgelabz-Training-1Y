import java.util.Scanner;
public class ProblemNo15{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double UnitPrice = input.nextDouble();
		double Quantity = input.nextDouble();
		double TotalPrice = UnitPrice * Quantity;
		System.out.println("The total purchase price is INR "+ TotalPrice +
		" if the quantity" + Quantity + "and unit price is INR" + UnitPrice);
  		 }
	}