import java.util.Scanner;

public class Numbers{
    public static void  SmallestAndLargest(int Number1, int Number2, int Number3) {
        int Smallest = Number1;
        int Largest = Number1;

        if (Number2 < Smallest) {
            Smallest = Number2;
        }
        if (Number3 < Smallest) {
            Smallest = Number3;
        }
        if (Number2 > Largest) {
            Largest = Number2;
        }
        if (Number3 > Largest) {
            Largest = Number3;
        }

        System.out.println("Smallest number is: " + Smallest);
        System.out.println("Largest number is: " + Largest);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Numbers: ");
        int Num1 = input.nextInt();
        int Num2 = input.nextInt();
        int Num3 = input.nextInt();

        SmallestAndLargest(Num1, Num2, Num3);
    }
}
