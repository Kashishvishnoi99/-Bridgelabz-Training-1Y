public class SpringSeason {
    public static int  SpringSeason(int Month, int Day) {
        if ((Month == 3 && Day >= 20) ||
                (Month == 4) ||
                (Month == 5) ||
                (Month == 6 && Day <= 20)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int Month = Integer.parseInt(args[0]);
        int Day = Integer.parseInt(args[1]);

        int Result =  SpringSeason(Month, Day);

        if (Result == 1) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Its Not a Spring Season");
        }
    }
}