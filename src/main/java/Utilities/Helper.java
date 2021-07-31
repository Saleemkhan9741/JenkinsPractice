package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.util.Properties;

public class Helper {

    public static String getGivenKeyValue(String key) throws Throwable {
        FileInputStream fis=new FileInputStream("src/test/testConfig.properties");
        Properties prop=new Properties();
        prop.load(fis);
        String value = prop.getProperty(key);
        return value;
    }

    public static WebElement waitforElement(WebDriver driver,WebElement webElement){
        WebDriverWait wait=new WebDriverWait(driver,20);
        webElement=wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement;
    }
}
