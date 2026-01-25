import java.util.Scanner;
public class SumOfNaturalNo{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int number = input.nextInt();
int Sum = number*(number+1)/2;

if(number % 2 == 0){
System.out.println("The sum of the Natural number is "+Sum);
}
else {
System.out.println("The number "+number+" is not a natural number.");
}

}
}