/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataController;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sankalp
 */
public class DataHandleuserFinal {
    public Connection getConnection() throws ClassNotFoundException, SQLException {

    String connURL = "jdbc:mysql://localhost:3306/test";
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = (Connection) DriverManager.getConnection(connURL, "username", "password");
    return con;
}
    
}
