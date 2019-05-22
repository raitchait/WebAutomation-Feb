package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id='gh-p-3']/a")
    WebElement helpncontact;

    @FindBy(id = "gh-ug")
    WebElement signInbtn;

    @FindBy(id = "gh-eb-My")
    WebElement myEbaybtn;

    @FindBy(id = "gh-ac")
    WebElement searchfield;

    @FindBy(id = "gh-btn")
    WebElement searcbtn;

    @FindBy(linkText = "Facebook")
    WebElement facebook;

    @FindBy(xpath = "//ul[@class='hl-cat-nav__container']/li[6]")
    WebElement collectionNart;

    @FindBy(id = "gh-cat")
    WebElement allcatagoriesDropdown;

    @FindBy(xpath = "//*[@id='gh-la']")
    WebElement ebayImage;

    @FindBy(xpath = "//h3[contains (text(), 'Mens Rolex 36mm DateJust Diamond Watch Oyster Steel Band Custom Black Dial 2 CT.') and @class='s-item__title']")
    WebElement rolex;

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    WebElement addtocart;

    @FindBy(css = ".vi_oly_clz_cntr")
    WebElement handlepopUp;

    @FindBy(css = "a[class='faux-link']")
    WebElement remove;

    @FindBy(css = "li[id='gh-cart']")
    WebElement cart;

    @FindBy(css = "select[id='gh-cat'][name='_sacat']")
    WebElement catagories;

    @FindBy(xpath = "//select[@id='gh-cat']")
    WebElement allcatagories;

    @FindBy(id = "gh-shop-a")
    WebElement shopcatagory;

    @FindBy(xpath = "//a[@href='https://www.ebay.com/rpp/exercise-fitness']")
    WebElement exerciseFitness;


    public void clickhelpncontact() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpncontact.click();
    }

    public void clickMyEbay() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        myEbaybtn.click();
        navigateBack();
    }

    public void searchItem() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchfield.sendKeys("rolex");
        Thread.sleep(1000);
        searcbtn.click();

    }

    public void getEbayImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ebayImage.click();
    }

    public void validateimg() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        if (ebayImage.isDisplayed()) {
            System.out.println("image is Displayed");
            System.out.println("the image text is: " + ebayImage.getAttribute(" alt"));
        } else {
            System.out.println("image not displayed");
        }
    }

    public void getTextAboutEbay() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTextFromWebElements("//*[@id='gf-BIG']/table/tbody/tr/td[4]/ul/li");
    }

    public void clickfacebook() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        facebook.click();
    }

    public void mouseHoverOnCollectionAndArt() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//ul[@class='hl-cat-nav__container']/li[6]");
        Thread.sleep(1000);
    }

    public void mouseHoverNclickOption() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//ul[@class='hl-cat-nav__container']/li[3]");
        Thread.sleep(1000);
        mouseHoverByXpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/div[1]/ul/li[3]/a");
        driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/div[1]/ul/li[3]/a")).click();
        Thread.sleep(2000);
    }

    public void mousehoverNgetText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a");
        getTextFromWebElements("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/div[2]/div[1]/div");
    }

    public void dropdown() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectOptionByVisibleText(allcatagoriesDropdown, "Baby");
    }

    // put item on cart
    public void signIn(String value1, String value2) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        driver.findElement(By.id("userid")).sendKeys(value1);
        driver.findElement(By.id("pass")).sendKeys(value2);
        driver.findElement(By.id("sgnBt")).click();

    }

    public void addTOCart() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn("demo32100@gmail.com", "admin1234");
        searchItem();
        rolex.click();
        addtocart.click();
        Thread.sleep(3000);
        handlepopUp.click();
    }

    public void removefromCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn("demo32100@gmail.com", "admin1234");
        cart.click();
        remove.click();

    }

    public void seeCatagories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        catagories.click();
        Select select = new Select(allcatagories);
        List<WebElement> selectOptions = select.getOptions();
        for (WebElement all : selectOptions) {
            System.out.println(all);
        }
    }

    public void dropdownShopCatagories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        shopcatagory.click();
        Thread.sleep(1000);
        exerciseFitness.click();
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.ebay.com/b/Fitness-Running-Yoga-Equipment/15273/bn_1855426", url);
    }

}