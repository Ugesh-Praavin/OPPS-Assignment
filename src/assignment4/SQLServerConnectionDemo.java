import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnectionDemo {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=YourDatabaseName;encrypt=false";
        String username = "ugesh";
        String password = "ugesh@2006";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to SQL Server Successful!");
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("SQL Server JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println("Failed to connect to SQL Server: " + e.getMessage());
        }
    }
}
