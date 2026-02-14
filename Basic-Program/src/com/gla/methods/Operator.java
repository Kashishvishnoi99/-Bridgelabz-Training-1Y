import java.util.Scanner;
public class  Operaror{
    public static void  RemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number =input.nextInt();

        System.out.println("Enter the divisor: ");
        int divisor =input.nextInt();

        RemainderAndQuotient(number, divisor);
    }
}
