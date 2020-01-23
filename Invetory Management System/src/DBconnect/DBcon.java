
package DBconnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {

    public static Connection connect(){
    
        Connection  conn = null; 
    
            try {

                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory management system","root","");

            }
            
            catch (Exception e) {

                System.out.println(e);

            }
    
        return conn;
    }
    
}
