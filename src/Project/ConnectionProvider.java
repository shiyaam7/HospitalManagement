
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author Shiyaam
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","password");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
            
    }
    
}
