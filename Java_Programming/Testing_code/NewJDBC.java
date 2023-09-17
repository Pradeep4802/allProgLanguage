import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class NewJDBC {
    public static void main(String[] args) {
        int status = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            PreparedStatement ps = con
                    .prepareStatement("insert into test1(name, password, email, country) values(?,?,?,?)");

            ps.setString(1, "Pradeep");
            ps.setString(2, "prad123");
            ps.setString(3, "Pradeep@gmail.com");
            ps.setString(4, "India");

            status = ps.executeUpdate();
            con.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }

        System.out.println("Status is : " + status);
    }
}
