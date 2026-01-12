import java.util.Scanner;
 
public class KilometersToMiles{
    public static double ConvertKilometersToMiles(double Kilometers) {
		double Miles = Kilometers * 0.621371;
        return Miles;
    }

    public static void main(String[] args){
	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kilometers : ");
        double Kilometers = sc.nextDouble();
		
        double  CalMiles = ConvertKilometersToMiles(Kilometers);

        System.out.println("The Calculated Miles is :" + CalMiles);
    }
}
