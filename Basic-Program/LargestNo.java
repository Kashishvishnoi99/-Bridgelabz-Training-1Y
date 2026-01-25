import java.util.Scanner;
public class LargestNo{
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);

int num1 = input.nextInt();
int num2 = input.nextInt();
int num3 = input.nextInt();

if(num1 > num2 && num1 > num3){
System.out.println("Is the first number the largest ?");
System.out.println("yes "+num1);
}
else if(num2 > num1 && num2 > num3){
System.out.println("Is the second number the largest ?");
System.out.println("yes "+num2);
}
else {
System.out.println("Is the third number the largest ?");
System.out.println("yes "+num3);
}

}
}
