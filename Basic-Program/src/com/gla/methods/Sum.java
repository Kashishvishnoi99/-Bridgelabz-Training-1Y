import java.util.Scanner;
public class Sum {
    public static int CalculateSum(int n) {
        int Sum = 0;
        for (int i = 1; i <= n; i++) {
            Sum += i;
        }
        return Sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n =input.nextInt();

        if (n <= 0) {
            System.out.println("Please Enter a positive integer.");
        } else {
            int Sum = CalculateSum(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + Sum);
        }
    }
}

