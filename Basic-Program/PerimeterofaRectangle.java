import java.util.Scanner;
public class  PerimeterofaRectangle{
	public static int PerimeterofaRectangle(int length,int width){
		return 2*(length + width);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		 
		System.out.println("Enter Length and Width : ");
		 
		int length = sc.nextInt();
	    int width = sc.nextInt();
		
		int PerimeterOfaRectangle =  PerimeterofaRectangle(length,width);
		 
        System.out.println("The simple interest is : "+PerimeterOfaRectangle);

	}
	
}