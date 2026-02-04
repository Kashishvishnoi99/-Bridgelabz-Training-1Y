import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in); 
        System.out.print("Enter a Natural number: ");
        int Number = input.nextInt();

        if (Number <= 0) {
            System.out.println("Please Enter greater than 0.");
            return;
        } 
		
        int Size = Number / 2 + 1;
        int[] Odd = new int[Size];
        int[] Even = new int[Size];
        int OddIndex = 0;
        int EvenIndex = 0; 
		
        for (int i = 1; i <= Number; i++) {
            if (i % 2 == 0) {
                Even[EvenIndex] = i;
                EvenIndex++;
            } else {
                Odd[OddIndex] = i;
                OddIndex++;
            }
        } 
        System.out.println("Odd numbers:");
        for (int i = 0; i < OddIndex; i++) {
            System.out.print(Odd[i] + " ");
        }
        System.out.println(" Even numbers:");
        for (int i = 0; i < EvenIndex; i++) {
            System.out.print(Even[i] + " ");
        } 
    }
}
