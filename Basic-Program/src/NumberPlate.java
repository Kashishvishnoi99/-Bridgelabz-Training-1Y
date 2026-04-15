import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPlate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String license = sc.nextLine();
        String regexp = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(license);

        if(matcher.matches()){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

    }
}
