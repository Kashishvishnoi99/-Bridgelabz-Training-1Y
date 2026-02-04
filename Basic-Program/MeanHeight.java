import java.util.Scanner;

public class MeanHeight{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
		
        double[] Heights = new double[11];
        double Sum = 0.0;
        System.out.println("Enter the Heights of 11 football players: ");
		
        for (int i = 0; i < Heights.length; i++) {
            Heights[i] = input.nextDouble();
        } 
        for (int i = 0; i < Heights.length; i++) {
            Sum += Heights[i];
        } 
        double Mean = Sum / 11;
        System.out.println("Mean height of the football team = " + Mean);
		
    }
}
