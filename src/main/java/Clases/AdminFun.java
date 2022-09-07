package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminFun {
    public static String GetUserName(String user) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("Select nombre_usuario from usuarios Where username = ?");
            pst.setString(1, user);
            ResultSet rs = pst.executeQuery();
            if (rs.next())
                return rs.getString("nombre_usuario");
        } catch (SQLException e) {
            System.err.println(e);
        }
        return "";
    }
}
