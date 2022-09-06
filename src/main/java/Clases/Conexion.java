package Clases;

import java.sql.*;

public class Conexion {
    // Conexion Local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds", "Marti", "Laem6630rda41374");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en conexion local " + e);
        }
        return (null);
    }
}
