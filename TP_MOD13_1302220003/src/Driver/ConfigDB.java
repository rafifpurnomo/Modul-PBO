/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {
private static Connection mySQLconfig;
    
    public static Connection getConnection() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/db_pbo_tpmod13";
            String user  = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mySQLconfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Koneksi gagal " + e.getMessage());
        }
        return mySQLconfig;
    }
}
