package regressionTest;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import regression.CreateAccount;

public class TestCreateAccount extends CreateAccount {
//create  Account
    @Test

    public static void test() {
        creatAcounturl();
        createacount();
        //send key
        firstname();
        sleepFor(3);
        lastname();
        sleepFor(3);
        email();
        sleepFor(3);
        password();
        sleepFor(3);
    }
}


