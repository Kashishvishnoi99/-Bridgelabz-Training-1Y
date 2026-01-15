public class ProblemNo7{
public static void main(String[] args){
	
	double radius = 6378;
	double VolumeSphereInKm = 4/3 * 3.14 * radius * radius * radius;
	double VolumeSphereInMiles =  VolumeSphereInKm * 0.239913;
	
	System.out.println("The Volume of Earth in cubic kilometers is "+  VolumeSphereInKm + " and cubic miles is " + VolumeSphereInMiles);
}
}