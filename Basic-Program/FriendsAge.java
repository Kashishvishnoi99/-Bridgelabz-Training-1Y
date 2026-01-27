import java.util.Scanner;

public class FriendsAge{
    public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);

	System.out.println("Enter 3 Friend's Age: "); 
    int AmarAge = input.nextInt();
	int AkhbarAge = input.nextInt();
	int AnthonyAge = input.nextInt();
	
	 // youngest 
	    if(AmarAge < AkhbarAge && AmarAge < AnthonyAge){
        System.out.println("Youngest is Amar is "+AmarAge);
	    }
		else if (AkhbarAge < AmarAge && AkhbarAge < AnthonyAge){
		 System.out.println("Youngest is Akhbar is "+AkhbarAge);
		}
		else {
		 System.out.println("Youngest is Anthony is "+AnthonyAge);
		}
		
		// Tallest 
		if(AmarAge > AkhbarAge && AmarAge > AnthonyAge){
        System.out.println("Tallest is Amar is "+AmarAge);
	    }
		else if (AkhbarAge > AmarAge && AkhbarAge > AnthonyAge){
		 System.out.println("Tallest is Akhbar is "+AkhbarAge);
		}
		else {
		 System.out.println("Tallest is Anthony is "+AnthonyAge);
		}
		
	}
}