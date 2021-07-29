package JioSavaan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
    @Test
    public void launchJioSavaan() {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jiosaavn.com/");
        driver.findElement(By.xpath("//span[contains(text(),'Okay')]")).click();
        driver.findElement(By.xpath("//i[@class='o-icon-close-circle o-icon--large']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Chak de India", Keys.ENTER);
        driver.findElement(By.xpath("//span[@class='o-icon-play o-icon--xlarge']")).click();

    }
}
