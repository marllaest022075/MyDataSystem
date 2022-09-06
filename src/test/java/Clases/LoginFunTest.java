package Clases;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

//import java.sql.Connection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LoginFunTest {
    @ParameterizedTest
    @CsvSource({ " , ,false", " ,123,false", "Marti, ,false", "Marti,123,true" })
    public void Validar_Campos_Test(String user, String pass, boolean expected) {
        boolean actual = LoginFun.Validos(user, pass);
        assertTrue(actual == expected);
    }

    @ParameterizedTest
    @CsvSource({ "Marti,123456,Administrador,Activo", "Mart,123456,Capturista,Activo",
            "Mar,123456,Tecnico,Activo" })
    public void LogInEvent_Shoud_Be_Success_Test(String user, String pass, String tipo_nivel, String estatus) {
        LogArgs args;
        try {
            args = LoginFun.LogInEvent(user, pass);
            assertTrue(args != null);
            assertTrue(args.get_tipo_nivel().equalsIgnoreCase(tipo_nivel));
            assertTrue(args.get_estatus().equalsIgnoreCase(estatus));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
