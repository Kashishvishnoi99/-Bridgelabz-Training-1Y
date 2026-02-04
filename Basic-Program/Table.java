import java.util.Scanner;

public class Table{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
		
        int[] Table = new int[10]; 
        for (int i = 1; i <= 10; i++) {
            Table[i - 1] = Number * i;
        } 
		
        for (int i = 1; i <= 10; i++) {
            System.out.println(Number + " * " + i + " = " + Table[i - 1]);
        } 
    }  
}

