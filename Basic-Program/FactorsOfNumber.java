import java.util.Scanner;

public class FactorsOfNumber{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int Number = input.nextInt(); 
        int MaxFactor = 10;
        int[] Factors = new int[MaxFactor];
        int Index = 0; 
        for (int i = 1; i <= Number; i++) {
            if (Number % i == 0) { 
                if (Index == MaxFactor) {
                MaxFactor = MaxFactor * 2;
                int[] Temp = new int[MaxFactor];

                for (int j = 0; j < Factors.length; j++) {
                Temp[j] = Factors[j];
                }
                Factors = Temp;
                }
                Factors[Index] = i;
                Index++;
            }
        }  
        for (int i = 0; i < Index; i++) {
            System.out.print(Factors[i] + " ");
        } 
    }
}
