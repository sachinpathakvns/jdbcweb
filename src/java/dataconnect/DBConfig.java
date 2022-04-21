
package dataconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.OracleDriver;


public class DBConfig {
    public static Connection connect()
    {
        try
        {
            DriverManager.registerDriver(new OracleDriver());
            String user = "bank", password = "bank", url = "jdbc:oracle:thin:@localhost:1521:xe";
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            return null;
        }
    }
            
}
