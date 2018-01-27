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
import register.model.signIn;

/**
 *
 * @author Sankalp
 */
public class DataHandleSignIn {
    // This Info is Already Entered In FriendsConnect SignInBtn
   /*public static int addSignInData(signIn sign) throws ClassNotFoundException, SQLException{
       Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/lps_connect", "root", "ufco");

        String query = "INSERT INTO member_lps VALUES ('" + signIn.getSignInEmail() + "','" + signIn.getSignInPass() +"')";

        Statement stm = connection.createStatement();

        int executeUpdate = stm.executeUpdate(query);

        return executeUpdate;}*/
}
    

