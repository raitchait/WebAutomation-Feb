package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccount extends CommonAPI {

    public static void creatAcount(){
   // clickByXpath("//*[@id=\"gh-ug\"]/a");
        getLinks("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
        clickByXpath("create an account");
      typeByXpath("//*[@id='firstname']","rachid");

        typeByXpath("//*[@id='lastname']","Ait chait");
        typeByXpath("//*[@id='email']","raitchait1@gmail.com");
        typeByXpath("//*[@id='PASSWORD']","12345");
        clickByXpath("//*[@id='ppaFormSbtBtn']");
    }

}
