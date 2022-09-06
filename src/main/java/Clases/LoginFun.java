package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginFun {

    public static boolean Validos(String user, String pass) {
        if (user == null || pass == null || user.trim().equals("") || pass.trim().equals("")) {

            return false;
        }
        return true;
    }

    public static LogArgs LogInEvent(String user, String pass) throws SQLException {
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement(
                "select tipo_nivel, estatus from usuarios where username = ? and password = ?");
        pst.setString(1, user);
        pst.setString(2, pass);
        ResultSet rs = pst.executeQuery();
        if (!rs.next())
            return null;
        return new LogArgs(rs.getString("tipo_nivel"), rs.getString("estatus"));
    }
}
