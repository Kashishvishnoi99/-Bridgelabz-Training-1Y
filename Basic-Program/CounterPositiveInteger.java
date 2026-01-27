import java.util.Scanner;

public class CounterPositiveInteger{
    public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);

	System.out.println("Enter a Number:"); 
    int Number = input.nextInt(); 
	 
	if(Number > 0){
	int Counter =1;
	    while(Counter < Number){
		    if(Number % Counter == 0){
			    System.out.println("The factor of " + Number + " is " + Counter);
			}
			Counter++;
		}
	} else {
	    System.out.println("Not a Positive Number.");
	    }
    }
}