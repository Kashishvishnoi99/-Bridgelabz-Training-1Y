import java.util.Scanner;
public class AreaofaCircle{
	public static float calCircle(float radius){
		return 3.14f*radius*radius;
	}
	public static void main() {
		 Scanner scanner = new Scanner(System.in); 
		 
		 System.out.println("Enter Radius: ");
		 float radius = scanner.nextFloat();
		 float area = calCircle(radius);
		 
		  System.out.println("Area of the circle = " + area);
	}
	
}