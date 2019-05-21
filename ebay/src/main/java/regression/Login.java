package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Login extends CommonAPI {


    public static void login( ) {

        clickByXpath("//*[@id=\"gh-ug\"]/a");
    }


     public static void login2(){
        clickByXpath("//*[@id=\"gh-ug\"]/a");
typeByXpath("//input[@id='userid']","rachid");
typeByXpath("//input[@id='pass']","12346");



    }

}
