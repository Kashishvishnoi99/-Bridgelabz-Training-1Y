import java.util.Scanner;

public class CompareResult{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Natural number: ");
    int Number = sc.nextInt();
		
    if (Number <= 0) {
        System.out.println("It is not a Natural number. ");
    } else {
    int Sum = 0;
	for(int i=0;i<=Number ;i++){
	    Sum = Sum + i;
     }
    int Formula = Number * (Number + 1) / 2;
			
    System.out.println("The Sum using while loop is " + Sum);
    System.out.println("The Sum using formula is " + Formula);
 
    if (Sum == Formula) {
    System.out.println("Result is correct and same");
    } else {
    System.out.println("Result is different ");
	}
    }
    }
}
