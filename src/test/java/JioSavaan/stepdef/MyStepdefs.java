package JioSavaan.stepdef;

import PomClasses.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static Utilities.Helper.getGivenKeyValue;
import static Utilities.Helper.waitforElement;

public class MyStepdefs {
    private static final WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Given("the user is in the HomePage")
    public void the_user_is_in_the_home_page()  throws Throwable {
        String url = getGivenKeyValue("jio.savaan.baseurl");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }
    
    @When("initial Pop ups are closed")
    public void initial_pop_ups_are_closed() throws Throwable {
        HomePage homePage=new HomePage(driver);
        waitforElement(driver,homePage.getOkayButton()).click();
        waitforElement(driver,homePage.getNoAdsCloseButton()).click();
        waitforElement(driver,homePage.getAdsPopup()).click();
        waitforElement(driver,homePage.getSearchBarTab()).click();
        waitforElement(driver,homePage.getSearchBar()).click();
        waitforElement(driver,homePage.getSearchBar()).sendKeys("Chak De India", Keys.ENTER);
    }


}
