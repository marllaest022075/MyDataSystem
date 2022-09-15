package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistroFun {
    public static boolean UserExist(String usr) {
        Connection cn = Conexion.conectar();
        PreparedStatement pst;
        boolean res = false;
        try {
            pst = cn.prepareStatement(
                    "select * from usuarios where username = ? ");
            pst.setString(1, usr);
            ResultSet rs = pst.executeQuery();
            if (rs.next())
                res = true;
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

    public static boolean UserRegiter(String nombre_usuario, String eMail, String telephone, String tipo_nivel,
            String username,
            String password, String registrado_por) {
        Connection cn = Conexion.conectar();
        PreparedStatement pst;
        boolean res = false;
        try {
            pst = cn.prepareStatement(
                    "INSERT INTO usuarios VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);");
            pst.setInt(1, 0);
            pst.setString(2, nombre_usuario);
            pst.setString(3, eMail);
            pst.setString(4, telephone);
            pst.setString(5, username);
            pst.setString(6, password);
            pst.setString(7, tipo_nivel);
            pst.setString(8, "Activo");
            pst.setString(9, registrado_por);
            pst.executeUpdate();
            res = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
