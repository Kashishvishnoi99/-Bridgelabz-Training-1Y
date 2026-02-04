import java.util.Scanner;

public class Sum{
    public static void main(String[] args) { 
        double[] Arr = new double[10];
        double Total = 0.0;
        int Index = 0;

        Scanner input = new Scanner(System.in); 
        while (true) {
            System.out.print("Enter a number: ");
            double Number = input.nextDouble(); 
            if ( Number <= 0) {
                break;
            } 
            if (Index == 10) {
                break;
            } 
            Arr[Index] =  Number;
            Index++;
        } 
        for (int i = 0; i < Index; i++) {
            Total += Arr[i];
            System.out.println("Number " + (i + 1) + ": " + Arr[i]);
        } 
        System.out.println("Sum of all Numbers = " + Total);
 
    }
}
