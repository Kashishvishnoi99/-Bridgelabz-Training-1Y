import java.util.Scanner;

public class Counter{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int Number = input.nextInt();

for(int i=Number;i>=1;i--){
System.out.println("Countdown "+i);
 }
 
}
}