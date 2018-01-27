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
import register.model.ForRegistry;
import register.model.ForUserUpdate;

/**
 *
 * @author Sankalp
 */
public class DataHandleUserUpdate {

    public static int addUserUpdateData(ForUserUpdate user) throws ClassNotFoundException, SQLException  {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6100273", "sql6100273", "sgTCHQBbhD");

        String query = "UPDATE member_lps_data Set Relation_Status='"+ user.getUserRelation() + "', Intrested_In='" + user.getUserIntrest() + "', Year_Of_Join='" + user.getUserJoin() + "', Hobbies='" + user.getUserHobby() + "' WHERE E_Mail='"+user.getUserEmail()+"' ";

        Statement stm = connection.createStatement();

        int executeUpdate = stm.executeUpdate(query);

        return executeUpdate; //To change body of generated methods, choose Tools | Templates.
    }
    
}
