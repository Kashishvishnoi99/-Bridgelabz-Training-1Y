import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Year: ");
        int Year = input.nextInt(); 
    
        if(Year >= 1582) {
            if (Year % 4 == 0) {
                if (Year % 100 == 0) {
                    if (Year % 400 == 0) {
                        System.out.println("Year is a Leap Year");
                    } else {
                        System.out.println("Year is Not a Leap Year");
                    }
                } else {
                    System.out.println("Year is a Leap Year");
                }
            } else {
                System.out.println("Year is Not a Leap Year");
            }
        }
        else{
            System.out.println("Plese Enter Year greater than 1582. ");
        } 
    }
}
