package regressionTest;

import org.testng.annotations.Test;
import regression.Login;

import java.lang.reflect.Parameter;

public class Testlogin extends Login {
    @Test
    public static void loginur() {
        loginurl();
        sleepFor(2);
        loginusername();
        sleepFor(2);
        loginpassword();
        sleepFor(2);
    }

}
