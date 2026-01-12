import java.util.Scanner;

public class CalculateAverageofThreeNumbers{
	public static float CalculateAverageofThreeNumbers(float n1,float n2,float n3){
		return (n1+n2+n3)/3;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		 
		System.out.println("Enter nnumber1,number2,number3: ");
		 
		float n1 = sc.nextFloat();
	    float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		
		float calAverage = CalculateAverageofThreeNumbers(n1,n2,n3);
		 
        System.out.println("The average of Three numbers is : "+calAverage);

	}
	
}