import java.sql.*;
import java.util.*;

public class data1 {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        // Statement stm = con.createStatement();

        PreparedStatement stm = con.prepareStatement("insert into students values(?,?,?,?)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        int r = sc.nextInt();
        String name = sc.next();
        String city = sc.next();
        int dno = sc.nextInt();

        stm.setInt(1, r);
        stm.setString(2, name);
        stm.setString(3, city);
        stm.setInt(4, dno);
        
        stm.executeUpdate();

        // stm.executeUpdate("insert into dept values(70,'Chem')");
        // stm.executeUpdate("delete from dept where deptno>=60");
        // stm.executeUpdate("update dept set dname='Chem' where deptno=50");
        
        stm.close();
        con.close();
    }
 }

