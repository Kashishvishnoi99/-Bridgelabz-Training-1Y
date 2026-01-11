import java.util.Scanner;
public class VolumeofaCylinder{
	public static float VolumeofaCylinder(float radius,float height){
		return 3.14f*radius*radius*height;
	}
	public static void main() {
		Scanner scanner = new Scanner(System.in); 
		 
		System.out.println("Enter Radius and Height: ");
		 
		float radius = scanner.nextFloat();
		float height = scanner.nextFloat();
		
		float volume =  VolumeofaCylinder(radius,height);
		 
        System.out.println(" The Volume of a Cylinder is :"+volume);

	}
	
}