import java.util.Scanner;
public class CalculateSimpleInterest{
	public static float CalculateSimpleInterest(float principal, float rate, float time){
		return (principal*rate*time)/100;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		 
		System.out.println("Enter principal,rate,time: ");
		 
		float principal = sc.nextFloat();
		float rate = sc.nextFloat();
		float time = sc.nextFloat();
		
		float simpleInterest =  CalculateSimpleInterest(principal,rate,time);
		 
        System.out.println("The simple interest is : "+simpleInterest);

	}
	
}