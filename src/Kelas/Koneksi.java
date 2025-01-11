package Kelas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Wifna 
 */
public class Koneksi {
    private Connection konekSQL;
    private String host = "localhost";
    private String db = "kepegawaian";
    private String user = "root";
    private String password = "";
    private String port = "3306";
    private String url = "jdbc:mysql://" + host + ":" + port + "/" + db;
    
    public Connection konekDB() throws SQLException{
       
        try {
            konekSQL = DriverManager.getConnection(url, user, password);
            System.out.println("koneksi berhasil");
        } catch (SQLException sQLException) {
            System.out.println("koneksi gagal");
        }
            
        return konekSQL;
        
    }

}
