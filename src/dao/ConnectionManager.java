package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Služi za stvaranje konekekcije (povezivanje) i uništavanje konekcije za bazom podataka  
 * **/
public class ConnectionManager {
	public static final String DATABASE = "localhost:3306/aerodrom";
    public static final String DB_USER_NAME = "root";
    public static final String DB_PASSWORD = "root";
    
    private static Connection connection;

    /**
     * Stvaranje konekcije (povezivanje sa bazom)
     * **/
    public static void open() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + DATABASE + "?useSSL=false",
                    DB_USER_NAME, DB_PASSWORD);
            System.out.println("otvorena konekcija");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /** 
     * Vraæa trenutu konekciju 
     * **/
    public static Connection getConnection() {
        return connection;
    }

    /**
     * Zatvaranje konekcije
     * **/
    public static void close() {
        try {
            connection.close();
        } catch (SQLException ex) {

            ex.printStackTrace();
        }
    }
}
