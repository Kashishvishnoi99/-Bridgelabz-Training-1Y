import java.util.Scanner;

class  PossibleHandshakes{
    public static  int Handshakes(int NumberOfStudents) {
        int Possiblility = (NumberOfStudents * (NumberOfStudents - 1)) / 2;
        return Possiblility;
    }

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        System.out.println("Enter the Number of Students: ");
        int NumberOfStudents = input.nextInt();

        int CalHandshakes = Handshakes(NumberOfStudents);
        
        System.out.println("The maximum possible Handshakes are : "+ CalHandshakes);
    }
}


