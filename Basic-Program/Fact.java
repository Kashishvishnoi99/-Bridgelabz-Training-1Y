import java.util.Scanner;

public class Fact{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter a Positive Number ");
int Number = input.nextInt();

if(Number <= 0){
    System.out.println("This is Negative Integer");
    } else {
  int Factorial = 1;
  for(int i=1;i<=Number;i++){
   Factorial = Factorial * i;
  }
	System.out.println("The Factorial of "+Number + " is "+ Factorial);
        }
    }
}