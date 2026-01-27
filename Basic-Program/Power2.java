import java.util.Scanner;

public class Power2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the Number and Power: ");
        int Number = input.nextInt(); 
        int Power = input.nextInt();

        int Result = 1;     
        int Counter = 0;  
        while (Counter < Power) {
            Result = Result * Number;
            Counter++;
        } 
        System.out.println(Number + " of power " + Power + " is: " + Result);
    }
}
