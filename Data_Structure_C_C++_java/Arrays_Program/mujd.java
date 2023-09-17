import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class mujd {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager
                    .getConnection("jdbc:sqlite:/home/pradeepkumar/Downloads/sqlite-tools-linux-x86-3420000/univ.db");
            PreparedStatement ps = con
                    .prepareStatement("insert into user(Name, Password, Email, Country) values(?,?,?,?)");
            ps.setString(1, "Pradeep");
            ps.setString(2, "123");
            ps.setString(3, "p@gmail.com");
            ps.setString(4, "India");

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();  // /home/pradeepkumar/Downloads/sqlite-jdbc-3.42.0.0.jar


        }
    }
}
