/**
 * Created by Sony VAIO on 13/01/2016.
 **/
import com.sun.corba.se.spi.orbutil.fsm.Guard;

import java.sql.*;

public class database_console {

    public static void main(String[] args) throws SQLException {

        String host = "localhost";
        int port = 3306;
        String uName = "lewdevc1_Employ";
        String uPass = "root1";
        String uDatabase = "lewdevc1_Employees";

        Connection con = DriverManager.getConnection(host,uName,uPass);
        Statement statement = con.createStatement();
        String SQL = "SELECT * FROM Employees";
        ResultSet rs = statement.executeQuery(SQL);



    }
}
