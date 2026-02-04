import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int Number = input.nextInt(); 
        int[] Result = new int[4]; 
        int Index = 0;
        for (int i = 6; i <= 9; i++) {
            Result[Index] = Number * i;
            Index++;
        } 
        Index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(Number + " * " + i + " = " + Result[Index]);
            Index++;
        } 
    }
}
