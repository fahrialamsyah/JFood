package fahrialamsyah.jfood;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 * this class is to connect to local PostgreSQL Database
 *
 * @author Fahri Alamsyah
 * @version 1.0
 * @since 29 - 5 - 2020
 */
public class DatabaseConnectionPostgre {
    public static Connection connection(){
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "faerrens");
            System.out.println("Opened database Successfully");
        }catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return c;
    }

}
