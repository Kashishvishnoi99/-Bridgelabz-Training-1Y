import java.util.Scanner;
public class CheckNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int Number = input.nextInt();

if(Number < 0){
System.out.println("Negative");
} else if(Number == 0){
System.out.println("Zero"); 
} else {
System.out.println("Positive");
}
}
}