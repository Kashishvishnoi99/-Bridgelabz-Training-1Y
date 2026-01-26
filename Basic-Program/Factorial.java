import java.util.Scanner;

public class Factorial{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter a Positive Number ");
double Number = input.nextDouble();

if(Number <= 0){
    System.out.println("This is Negative Integer");
    } else {
 int i=1;
 int Fact = 1;
    while(i <= Number){
	Fact = Fact * i ;
	i++;
	        }
	System.out.println("The Factorial of "+Number + " is "+ Fact);
        }
    }
}