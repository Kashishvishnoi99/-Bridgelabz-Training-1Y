import java.util.Scanner;

public class  Rounds {
    public static double CalculateRounds(double s1, double s2, double s3) {
        double perimeter = s1 + s2 + s3;
        double  Distance = 5000;
        return  Distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sides of  the park");
        double s1 =  input.nextDouble(); ;
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        double TotalRounds = CalculateRounds(s1, s2, s3);

        System.out.println("The Total rounds are: "+TotalRounds);

    }
}
