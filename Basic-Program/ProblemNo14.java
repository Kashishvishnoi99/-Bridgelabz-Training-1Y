import java.util.Scanner;
public class ProblemNo14{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double DistanceInFeet = input.nextDouble();
		double DistanceInYards = DistanceInFeet / 3;
		double DistanceInMiles = DistanceInYards / 1760;
	    System.out.println("Your distance in feet is " + DistanceInFeet + " while in yards is " +
	    DistanceInYards + " and in miles is " + DistanceInMiles );
  		 }
	}