import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlStuff {

	public Connection conn = null;
	
	public void connect() {
        
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:C:/Program Files/eclipse/workspace/CheckMigrationsDaten/db/datastorage.db");          
            System.out.println("\nVerbindung wurde aufgebaut.");
            
        } catch (SQLException e) {
        	System.out.println(e.getMessage());
        } 
    }
	
	public void disconnect() {
        
        try {
        	conn.close();
        	conn = null;
            System.out.println("\nVerbindung wurde abgebaut.");
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        } 
    }
	
}
