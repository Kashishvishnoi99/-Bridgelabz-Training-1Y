import java.util.Scanner;

public class FizzBuzz1{
    public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);

	System.out.println("Enter a Positive Number: "); 
    int Number = input.nextInt();
	
    if(Number > 0){
		int i=1;
	    while(i<= Number){
		if(i%3 ==0 && i % 5 ==0 ){
	            System.out.println("FizzBuzz");
	        } 
	        else if(i % 5 == 0){
	            System.out.println("Buzz");
	        } 
		    else if(i % 3 == 0){
		        System.out.println("Fizz");
		    }
			else if(i % 3 != 0 && i % 5 != 0){
				System.out.println("Niether divisible by 5 nor by 3.");
			}
			i++;
		}
	}
	    else{
		    System.out.println("Please enter a Positive Number.");
	    }
		
	}
}