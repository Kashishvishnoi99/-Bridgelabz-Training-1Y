import java.util.Scanner;

public class GreatestFactor1{
    public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);

	System.out.println("Enter a Number:"); 
    int n = input.nextInt(); 
	int GreatestFactor = 1;
	
	for(int i = n-1;i>=1;i--){
	    if(n % i == 0){
			GreatestFactor = i;
	        break;
	    }
	}
	System.out.println("The Greatest Factor of "+ n +" is " + GreatestFactor);
    }
}