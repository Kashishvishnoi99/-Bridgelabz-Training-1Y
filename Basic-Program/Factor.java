import java.util.Scanner;

public class Factor{
    public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);

	System.out.println("Enter a Number:"); 
    int Number = input.nextInt(); 
	 
	if(Number > 0){
	    for(int i=1;i<=Number;i++){
		    if(Number % i == 0){
			    System.out.println("The factor of " + Number + " is " + i);
			}
		}
	} else {
	    System.out.println("Not a Positive Number.");
	    }
    }
}