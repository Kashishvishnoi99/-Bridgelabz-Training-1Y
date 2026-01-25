import java.util.Scanner;

public class SmallestNo{
 public static void main(String[] args){
	
Scanner input = new Scanner(System.in);

int num1 = input.nextInt();
int num2 = input.nextInt();
int num3 = input.nextInt();

if(num1 < num2 && num1 < num3){
System.out.println("The smallest number is "+ num1);
}
else if(num2 < num1 && num2 < num3){
System.out.println("The smallest number is "+ num2);
}
else {
System.out.println("The smallest number is "+ num3);
}

}
}
