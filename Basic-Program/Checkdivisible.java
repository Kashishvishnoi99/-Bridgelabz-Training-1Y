import java.util.Scanner;

public class CheckDivisible{
public static void main(String args[]){
Scanner input = new Scanner(System.in);

int Number = input.nextInt();
if(Number % 5 == 0){
	System.out.println("Is the number "+Number+" divisible by 5?");
    System.out.println("Yes");
}else {
    System.out.println(Number+ " is not divisible by 5. ");
}
}
}