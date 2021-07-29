import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Trial {

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
        element.click();
        element.sendKeys("Hello", Keys.ENTER);
    }
}
