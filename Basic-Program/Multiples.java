import java.util.Scanner;

public class Multiples{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int Number = sc.nextInt();
		
        if (Number <= 0 || Number >= 100) {
            System.out.println("Please Enter  Postive Integer. ");
        } else {
            for (int i = 100; i >= 1; i--) {
                if (i % Number == 0) {
                System.out.println(i);
                }
            }
		}
    }
}
