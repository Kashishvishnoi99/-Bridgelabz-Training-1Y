import java.util.Scanner;

public class GreatestFactor2{
    public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);

	System.out.println("Enter a Number:"); 
    int Number = input.nextInt(); 
	
	int GreatestFactor = 1;
	int Counter = Number-1;
	
	while(Counter > 1){
	    if(Number % Counter == 0){
			GreatestFactor = Counter;
	        break;
	    }
		Counter--;
	}
	System.out.println("The Greatest Factor of "+ Number +" is " + GreatestFactor);
    }
}