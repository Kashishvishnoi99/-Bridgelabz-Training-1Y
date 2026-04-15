import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        if(matcher.matches()){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }

    }
}


