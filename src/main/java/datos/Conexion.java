package datos;

import java.sql.*;

public class Conexion {
    //private static final String JDBC_URL = "jdbc:mysql://localhost/test?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_URL = "jdbc:mysql://localhost/cursojava?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "";

    public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }

    public static Connection getConnection_mysql() throws SQLException {
        //private static final String JDBC_URL = "jdbc:mysql://localhost/test?useSSL=false&serverTimezone=UTC";
         String JDBC_URL = "jdbc:mysql://localhost/mysql?useSSL=false&serverTimezone=UTC";
         String JDBC_USER = "root";
         String JDBC_PASS = "";
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }
    
}
