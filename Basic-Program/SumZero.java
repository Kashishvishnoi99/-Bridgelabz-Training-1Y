import java.util.Scanner;

public class SumZero{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double Number = input.nextDouble();
double Sum = 0.0;

while(Sum != 0){
Sum += Number;
System.out.println("Enter a Number until the sum is zero ");
Number = input.nextDouble();
}
System.out.println("The Total Sum is "+Sum);
}
}