import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);

	System.out.println("Enter a Positive Number: "); 
    int Number = input.nextInt();
	
    if(Number > 0){
	    for(int i=0;i<=Number;i++){
			
	        if(i%3 ==0 && i % 5 ==0 ){
	        System.out.println("FizzBuzz");
	        } 
	        else if(i % 5 == 0){
	        System.out.println("Buzz");
	        } 
		    else {
		    System.out.println("Fizz");
		    }
	    }
	}
	    else{
		    System.out.println("Please enter a Positive Number.");
	    }
		
	}
}