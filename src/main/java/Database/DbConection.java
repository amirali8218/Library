package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConection {
    private final String url = "jdbc:postgresql://localhost:5432/Library";
    private final String userName="postgres";
    private final String password="amir4530";
    public Connection getInstance() throws SQLException {
        Connection connection = DriverManager.getConnection(url,userName,password);
        return connection;
    }
}
