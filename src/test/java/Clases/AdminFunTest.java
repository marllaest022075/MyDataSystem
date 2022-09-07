package Clases;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AdminFunTest {
    @ParameterizedTest
    @CsvSource({ "Marti,Martin Llamas Estrada", "Mart,Amanda Lucia Servin Molina", "Mar,Jose Adan Llamas Servin",
            "Juan, " })
    public void Get_FullName_Of_Specific_User(String user, String expected) {
        String actual = AdminFun.GetUserName(user);
        if (expected == null) {
            assertTrue(actual.isEmpty());
            return;
        }
        assertTrue(actual.equals(expected));
    }
}
