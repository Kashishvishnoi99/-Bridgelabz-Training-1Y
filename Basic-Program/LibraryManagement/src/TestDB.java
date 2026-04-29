import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {3
    public static void main(String[] args) {
        try {

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "root"
            );

            System.out.println("CONNECTED SUCCESSFULLY ✅");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
