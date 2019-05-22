package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Login extends CommonAPI {

    public static void loginurl() {

        clickByXpath("//a[contains(text(),'Sign in')]");
    }

    public static void loginusername() {
        typeByXpath("//input[@id='userid']", "rachid");

    }

    public static void loginpassword() {
        typeByXpath("//input[@id='pass']", "12346");
        clickByXpath("//button[@id='sgnBt']");
    }

}
