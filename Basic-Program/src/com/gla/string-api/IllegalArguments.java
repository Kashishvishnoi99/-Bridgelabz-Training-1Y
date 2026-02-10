 public class IllegalArguments{

    public static void GenerateException(String Text) {
        if (Text.length() < 3) {
            throw new IllegalArgumentException("Text is too short");
        }
        System.out.println(Text.substring(2, 1));
    }
    public static void HandleException(String Text) {
        try {
            if (Text.length() < 3) {
                throw new IllegalArgumentException("Text is too short");
            }
            System.out.println(Text.substring(2, 1));
        } catch (IllegalArgumentException Exception) {
            System.out.println("IllegalArgumentException Handled");
        } catch (RuntimeException Exception) {
            System.out.println("Other RuntimeException Handled");
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
        } catch (IllegalArgumentException Exception) {
            System.out.println("IllegalArgumentException Generated");
        }

        HandleException(Text);
    }
}




