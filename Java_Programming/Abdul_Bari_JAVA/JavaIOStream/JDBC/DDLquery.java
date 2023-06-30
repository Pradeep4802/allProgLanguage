// import java.beans.Statement;
import java.sql.*;

public class DDLquery {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        Statement stm = con.createStatement();

        stm.executeUpdate("drop table Temp");

        stm.close();
        con.close();
    }
}
