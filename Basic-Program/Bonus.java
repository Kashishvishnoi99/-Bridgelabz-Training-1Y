import java.util.Scanner;

public class Bonus{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter a Year: ");
        int YearOfService = input.nextInt(); 
		
		System.out.println("Enter a Salary: ");
		int Salary = input.nextInt();
		
		int EmployeeBonus = Salary * 5 /100;
		
        if(YearOfService > 5){
		System.out.println("The bonus of the Employee "+EmployeeBonus);
		}
		else {
		System.out.println("The Year of Service of Person's is not more than 5 years. ");
		}
    }
}
