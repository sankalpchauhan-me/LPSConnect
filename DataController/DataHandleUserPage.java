/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataController;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import register.model.ForUser;

/**
 *
 * @author Sankalp
 */
public class DataHandleUserPage {
  

    public static int addUserData(ForUser user) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6100273", "sql6100273", "sgTCHQBbhD");

        String query = "INSERT INTO member_lps_data VALUES ('" + user.getUserMail() + "','" + user.getUserRelation() + "','" + user.getUserIntrest() + "','" + user.getUserJoin() + "','" + user.getUserHobby() + "')";

        Statement stm = connection.createStatement();

        int executeUpdate = stm.executeUpdate(query);

        return executeUpdate;//To change body of generated methods, choose Tools | Templates.
    }
}