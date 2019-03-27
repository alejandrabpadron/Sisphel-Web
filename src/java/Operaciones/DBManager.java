package Operaciones;

import java.sql.*;
public class DBManager {

    private final String url = "jdbc:mysql://localhost:3306/sisphelweb";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "root";
    private final String password = "";

    public Connection getConnection() throws SQLException {
        try {
            Class.forName(driver).newInstance();
            return (DriverManager.getConnection(url, user, password));
        } catch (Exception e) {
            throw new SQLException("Imposible acceder a los datos..." + e.toString());
        }
    }

    public void closeConnection(Connection con) throws SQLException {
        con.close();
    }
}
