import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {
    public static void main(String[] args) {
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
            Statement myStmt = myConn.createStatement();

            ResultSet myRs = myStmt.executeQuery("SELECT * FROM employee");
            while (myRs.next()) {
                System.out.println(myRs.getInt("EmpId") + ", " + myRs.getString("EmpName"));
            }

            myRs.close();
            myStmt.close();
            myConn.close();
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
