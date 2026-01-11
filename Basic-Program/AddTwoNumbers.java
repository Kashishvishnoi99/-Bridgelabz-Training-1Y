import java.util.Scanner;
public class AddTwoNumbers {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter two number: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = add(num1, num2);
        System.out.println("Sum = " + sum);

 
    }
}
