import java.util.Scanner;

public class Numbers{
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
System.out.println("Enter a Number: ");
int Num = input.nextInt();

if(Num <= 0){
	System.out.println("This is not a Natural number.");
}
    else {
        for(int i=1;i<=Num;i++){
		    if(i % 2 ==0){
	    System.out.println("Even Number ");
	    System.out.println(i);
			}
            else {
	    System.out.println("Odd Number ");
	    System.out.println(i);
			    }
            }
        }
    }
}