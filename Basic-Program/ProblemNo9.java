import java.util.Scanner;

public class ProblemNo9{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	  double Fee = input.nextDouble();
        double DiscountPercent = input.nextDouble();
        double Discount = Fee * DiscountPercent / 100;
        double FinalFee = Fee - Discount;
		
        System.out.println("The discount amount is INR " +Discount+ " and final discounted fee is INR "+ FinalFee);
}
}