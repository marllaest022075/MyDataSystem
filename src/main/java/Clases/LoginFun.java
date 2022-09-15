package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginFun {

    public static LogArgs LogInEvent(String user, String pass) {
        Connection cn = Conexion.conectar();
        LogArgs res = null;
        PreparedStatement pst;
        try {
            pst = cn.prepareStatement(
                    "select tipo_nivel, estatus from usuarios where username = ? and password = ?");
            pst.setString(1, user);
            pst.setString(2, pass);
            ResultSet rs = pst.executeQuery();
            if (rs.next())
                res = new LogArgs(rs.getString("tipo_nivel"), rs.getString("estatus"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return res;
    }
}
