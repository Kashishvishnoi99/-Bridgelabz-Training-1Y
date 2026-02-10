public class ArrayIndex{

    public static void GenerateException(String[] Names) {
        System.out.println(Names[Names.length]);
    }

    public static void HandleException(String[] Names) {
        try {
            System.out.println(Names[Names.length]);
        } catch (ArrayIndexOutOfBoundsException Exception) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        } catch (RuntimeException Exception) {
            System.out.println("Other RuntimeException Handled");
        }
    }
    public static void main(String[] args) {

        String[] Names;
        if (args.length > 0) {
            Names = args;
        } else {
            Names = new String[] {""};
        }

        try {
            GenerateException(Names);
        } catch (ArrayIndexOutOfBoundsException Exception) {
            System.out.println("ArrayIndexOutOfBoundsException Generated");
        }
        HandleException(Names);
    }
}
