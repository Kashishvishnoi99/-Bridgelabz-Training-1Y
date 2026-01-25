import java.util.Scanner;

public class Voter{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int Person = input.nextInt();

if(Person >= 18){
System.out.println("The person can vote. ");
}
else {
System.out.println("The person cannot vote. ");
}
}
}