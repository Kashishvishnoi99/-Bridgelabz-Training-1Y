import java.util.Scanner;
 
public class powerCalculation {
    public static double powerCalculation(double base,double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base and Exponent : ");
		
       double base = sc.nextDouble();
        double exponent = sc.nextDouble();
		
        double PowerCalculation = powerCalculation(base, exponent);

        System.out.println("The calculated Power is :" + PowerCalculation);
    }
}