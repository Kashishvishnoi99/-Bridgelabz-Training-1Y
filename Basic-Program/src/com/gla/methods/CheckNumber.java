import java.util.Scanner;

public class CheckNumber{
    public static int check(int Number) {
        if (Number > 0) {
            return 1;
        } else if (Number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int Number = input.nextInt();
        int Result = check(Number);

        if (Result == 1) {
            System.out.println("The number is Positive.");
        } else if (Result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}


