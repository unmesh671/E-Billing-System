package electricity.billing.system;

import java.sql.*;

public class DatabaseConnection {

    Connection conn;
    Statement state;
    DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/ebs", "root","Unmesh@123");  
            //here sonoo is database name, root is username and password  
            state=conn.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 
