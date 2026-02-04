 import java.util.Scanner;

public class TwoD{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the number of rows and columns: ");
        int Rows = input.nextInt();
        int Columns = input.nextInt(); 
        int[][] Matrix = new int[Rows][Columns]; 
		
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                Matrix[i][j] = input.nextInt();
            }
        } 
        int[] Arr = new int[Rows * Columns]; 
        int Index = 0;
        for (int i = 0; i < Rows; i++) {      
            for (int j = 0; j < Columns; j++) { 
                Arr[Index] = Matrix[i][j];
                Index++;
            }
        } 
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i]);
        }
    }
}

