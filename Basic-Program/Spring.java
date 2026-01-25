import java.util.Scanner;
public class Spring{
public static void main(String[] args){
// Spring Season is from 20 March  to 20 June
Scanner input = new Scanner(System.in);
int Month = input.nextInt();
int Day = input.nextInt();

if(Month == 3 && Day >= 20 || Month == 4 || Month == 5 || Month == 6 && Day <=20 ){
System.out.println("Its a Spring Season. ");
}
else {
System.out.println("Its not a Spring season. ");
}

}
}