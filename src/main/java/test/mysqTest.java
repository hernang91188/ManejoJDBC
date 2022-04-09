package test;

import datos.Conexion;
import datos.UsuarioJDBC;
import domain.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mysqTest {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            conn = Conexion.getConnection_mysql();
            stmt = conn.prepareStatement("SELECT * FROM `user` WHERE 1 ");
            rs = stmt.executeQuery();
            while(rs.next()){
                String host = rs.getString("Host");
                String user = rs.getString("User");
                String password = rs.getString("Password");
                System.out.println("host: "+host);
                System.out.println("user: "+user);
                System.out.println("password: "+password);


            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }


    }
}
