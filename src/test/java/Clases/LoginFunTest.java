package Clases;

import static org.junit.Assert.assertTrue;

//import java.sql.Connection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LoginFunTest {

    @ParameterizedTest
    @CsvSource({ "Marti,123456,Administrador,Activo", "Mart,123456,Capturista,Activo",
            "Mar,123456,Tecnico,Activo" })
    public void LogInEvent_Shoud_Be_Success_Test(String user, String pass, String tipo_nivel, String estatus) {

        LogArgs args = LoginFun.LogInEvent(user, pass);
        assertTrue(args != null);
        assertTrue(args.get_tipo_nivel().equalsIgnoreCase(tipo_nivel));
        assertTrue(args.get_estatus().equalsIgnoreCase(estatus));

    }

    @ParameterizedTest
    @CsvSource({ "Marti,12345", "Mrt,123456", "Mr,13456" })
    public void LogInEvent_Should_Be_Fail_Test(String user, String pass) {
        LogArgs args = LoginFun.LogInEvent(user, pass);
        assertTrue(args == null);
    }
}
