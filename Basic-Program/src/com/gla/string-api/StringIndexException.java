public class StringIndexException{

    public static void GenerateException(String Text) {
        System.out.println(Text.charAt(Text.length()));
    }

    public static void HandleException(String Text) {
        try {
            System.out.println(Text.charAt(Text.length()));
        } catch (StringIndexOutOfBoundsException Exception) {
            System.out.println("StringIndexOutOfBoundsException Handled");
        }
    }

    public static void main(String[] args) {
        String Text;
        if (args.length > 0) {
            Text = args[0];
        } else {
            Text = "";
        }

        try {
            GenerateException(Text);
        } catch (StringIndexOutOfBoundsException Exception) {
            System.out.println("StringIndexOutOfBoundsException Generated");
        }
        HandleException(Text);
    }
}

