import java.util.Scanner;

public class Multiples1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter a Number: ");
        int Number = input.nextInt();
 
        if (Number <= 0 || Number >= 100) {
            System.out.println("Please Enter a Positive Integer. ");
        } else { 
        int counter = 100; 
            while (counter >= 1) {
                if (counter % Number == 0) {
                System.out.println(counter);
                }
                counter--;
            }
        } 
    }
}
