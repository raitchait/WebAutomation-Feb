package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.HomePage;
import reporting.TestLogger;

public class TestHomepage extends CommonAPI {
    HomePage homePage;
    String url = "https://www.ebay.com/";
    private Object ApplicationLog;

    @BeforeMethod
    public void initializing() {
        driver.get( url );
        homePage = PageFactory.initElements( driver, HomePage.class );
    }
    @Test
    public void verifywebAdress() {
        TestLogger.log( getClass().getSimpleName() + ": " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName() ) );
        String url = driver.getCurrentUrl();
        Assert.assertEquals( "https://www.ebay.com/", url );
    }
}
