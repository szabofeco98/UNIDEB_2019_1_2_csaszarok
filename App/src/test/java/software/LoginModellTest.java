package software;

import org.junit.jupiter.api.Test;
import software.modell.LoginModell;

import static org.junit.jupiter.api.Assertions.*;

public class LoginModellTest {
    LoginModell modell=new LoginModell();
    @Test
    boolean LoginModellTestHelper(String name, String passwd, int excepted){

        return excepted==modell.login(name, passwd);
    }
    @Test
    void login(){
        assertEquals(modell.login("feco", "feco"),1);
        assertNotEquals(modell.login("feco", "feco"),2);
        assertNotEquals(modell.login("feco", "feco"),3);
        assertNotEquals(modell.login("feco", "feco"),4);

        assertEquals(modell.login("pdavidson", "asd123"),1);
        assertNotEquals(modell.login("pdavidson", "asd123"),2);
        assertNotEquals(modell.login("pdavidson", "asd123"),3);
        assertNotEquals(modell.login("pdavidson", "asd123"),4);

        assertNotEquals(modell.login("feco", "asd1"),1);
        assertEquals(modell.login("feco", "asd1"),2);
        assertNotEquals(modell.login("feco", "asd1"),3);
        assertNotEquals(modell.login("feco", "asd1"),4);

        assertNotEquals(modell.login("hfdj", "asd1"),1);
        assertNotEquals(modell.login("hfdj", "asd1"),2);
        assertEquals(modell.login("hfdj", "asd1"),3);
        assertNotEquals(modell.login("hfdj", "asd1"),4);


        assertNotEquals(modell.login("hfd", "asd1"),1);
        assertNotEquals(modell.login("hfd", "asd1"),2);
        assertNotEquals(modell.login("hfd", "asd1"),3);
        assertEquals(modell.login("hfd", "asd1"),4);

        assertNotEquals(modell.login("hfdj", "asd"),1);
        assertNotEquals(modell.login("hfdj", "asd"),2);
        assertNotEquals(modell.login("hfdj", "asd"),3);
        assertEquals(modell.login("hfdj", "asd"),4);

        assertNotEquals(modell.login("feco", "asd"),1);
        assertNotEquals(modell.login("feco", "asd"),2);
        assertNotEquals(modell.login("feco", "asd"),3);
        assertEquals(modell.login("feco", "asd"),4);



    }
}
