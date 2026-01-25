import java.util.Scanner;

public class CountDown{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int Counter = input.nextInt();

while(Counter >=1){
System.out.println("Countdown "+ Counter);
Counter--;
}
}
}