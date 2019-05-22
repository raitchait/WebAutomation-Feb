package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccount extends CommonAPI {

    public static void creatAcounturl() {
         clickByXpath("//*[@id=\"gh-ug\"]/a");
        //getLinks("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
    }

    public static void createacount() {
        clickByXpath("//a[@id='InLineCreateAnAccount']");
    }

    public static void firstname() {
        typeByXpath("//*[@id='firstname']", "rachid");
    }

    public static void lastname() {

        typeByXpath("//*[@id='lastname']", "Ait chait");
    }

    public static void email() {

        typeByXpath("//*[@id='email']", "raitchait1@gmail.com");
    }

    public static void password() {
        typeByXpath("//*[@id='PASSWORD']", "12345");

        clickByXpath("//*[@id='ppaFormSbtBtn']");
    }

}
