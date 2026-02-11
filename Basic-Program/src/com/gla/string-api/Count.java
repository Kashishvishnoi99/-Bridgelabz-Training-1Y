import.java.util.Scanner;
public class Count{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = input.nextline();
        int vowels = 0;
        int Consonants =0;

        for(int i=0;i<str.length;i++){
          char ch = str.charAt(i);
          if(ch == 'a' || ch == e || ch == 'i' || ch == '0' || ch == 'u' || ch == 'A' || ch == 'E'|| ch == 'I' || ch =='O' || ch =='U' ){
              Vowels++;
          }else{
              Consonants++;
            }
          System.out.println("VOWELS: "+vowels);
          Sytem.out.println("CONSONANTS: "+Consonants);
        }
    }
}