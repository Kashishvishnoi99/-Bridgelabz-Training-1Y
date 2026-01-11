import java.util.Scanner;
public class CelsiusToFahrenheit { 

    public static float convertToFahrenheit(float celsius) {
        return (celsius * 9/5) + 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
		
        System.out.print("Enter temperature :  ");
        float  celsius = scanner.nextFloat(); 
        float fahrenheit = convertToFahrenheit(celsius); 
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        scanner.close();
    }
}
