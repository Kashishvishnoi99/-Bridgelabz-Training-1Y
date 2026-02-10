public class NumberFormat{
    public static void GenerateException(String Text) {
        int Number = Integer.parseInt(Text);
        System.out.println(Number);
    }
    public static void HandleException(String Text) {
        try {
            int Number = Integer.parseInt(Text);
            System.out.println(Number);
        } catch (NumberFormatException Exception) {
            System.out.println("NumberFormatException Handled");
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
        } catch (NumberFormatException Exception) {
            System.out.println("NumberFormatException Generated");
        }
        HandleException(Text);
    }
}

