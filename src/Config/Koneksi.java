/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Lenovo
 */
public class Koneksi {
    private static Connection conn;
    public static Connection configDB()throws SQLException{
        try {
            String url= "jdbc:mysql://localhost:3306/db_pos";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.err.println("Koneksi Gagal "+ e.getMessage());
        }
        return conn;
    }
}
