class NullPointerExample {

    public static void GenerateException(String Input) {
        String Text = null;
        System.out.println(Text.length());
    }

    public static void HandleException(String Input) {
        String Text = null;
        try {
            System.out.println(Text.length());
        } catch (NullPointerException Exception) {
            System.out.println("NullPointerException Handled");
        }
    }

    public static void main(String[] args) {

        String Input = args.length > 0 ? args[0] : "";

        try {
            GenerateException(Input);
        } catch (NullPointerException Exception) {
            System.out.println("NullPointerException Generated");
        }

        HandleException(Input);
    }
}
