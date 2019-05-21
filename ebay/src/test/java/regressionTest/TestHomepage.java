package regressionTest;

import org.testng.annotations.Test;
import regression.HomePage;

public class TestHomepage extends HomePage {

    @Test(priority = 1)
            public static void homepage(){
        Homepage1( );

    }
@Test(priority = 2)
    public static void login(){

}
@Test(priority = 3)
public static void CrateAccount(){

}
}
