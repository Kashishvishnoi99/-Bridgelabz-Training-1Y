import java.util.Scanner;

public class Sum{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double Number = input.nextDouble();
double Sum = 0.0;

while(true){
System.out.println("Enter a negative or zero number to stop  ");

Number = input.nextDouble();
if(Number <= 0){
break;
}
Sum += Number;
}
System.out.println("The Total Sum is "+Sum);
}
}