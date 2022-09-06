package Clases;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

public class Conexiontest {
    @Test
    public void ConectarTest() throws SQLException {
        Connection cn = Conexion.conectar();
        assertTrue(!cn.isClosed());
        cn.close();
    }
}
