import java.util.Scanner;

public class SimpleInterest {
    public static double CalSimpleInterest(double Principal, double Rate, double Time) {
        return (Principal * Rate * Time) / 100;
    }

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter the Principal , Rate ,Time: ");
        double Principal =  input.nextDouble();
        double Rate =  input.nextDouble();
        double Time = input.nextDouble();

        double SimpleInterest = CalSimpleInterest(Principal, Rate, Time);

        System.out.println("The Simple Interest is " + SimpleInterest + "  and Principal is " + Principal +
                ", and Rate of Interest " + Rate +
                " and Time " + Time);
    }
}


