import java.util.Scanner;
public class ProblemNo12{
	public static void main(String[] args){
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter Base and Height");
		 double Height = input.nextDouble();
		 double Base = input.nextDouble();
		 double AreaOfTraingleInches = 0.5 * Base * Height; 
		 double SquareCentimeters = AreaOfTraingleInches * 6.4516;  
		 
		 System.out.println("The Height and the Base of a traingle is "+ Height + ","+ Base+
		 " and in square inches "+AreaOfTraingleInches+
		 " and in the sqaure center is "+ SquareCentimeters);
  		 }
	}