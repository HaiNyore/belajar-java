/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Form;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Rasyid_
 */
public class ctrlKoneksi {
    private static Connection mysqlconfig;
//    public static Connection mariaDB()throws SQLException{
//        try {
//            // String driver="com.mysql.jdbc.Driver";
//            String url="jdbc:mysql://localhost/dboop"; //url database
//            String user="root"; //user database
//            String pass=""; //password database
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//            mysqlconfig=DriverManager.getConnection(url, user, pass);
//	} catch (SQLException e) {
//            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
//	}
//	return mysqlconfig;
//    }
    
    public static Connection mariaDB(){
        if(mysqlconfig==null){
            try{
                String url;
                url="jdbc:mysql://localhost/dboop";
                String user="root";
                String pass="";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                mysqlconfig=DriverManager.getConnection(url,user,pass);
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Error Koneksi ");
            }
        }return mysqlconfig;
    }static Object getConnection(){
        throw new UnsupportedOperationException("Belum diimplementasi");
    }
}
