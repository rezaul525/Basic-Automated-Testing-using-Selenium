import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//<---Automation LifeCycle--->//
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//<---Automation LifeCycle--->//
public class WebAutomation {
    WebDriver driver;
    @BeforeAll
    public void Setup(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @DisplayName("User Login")
    @Test
    public void myLogIn_1(){
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        driver.findElement(By.id("email")).sendKeys("rezaul.robin8080@gmail.com");
        driver.findElements(By.id("pass")).get(0).sendKeys("Abcd12345678");
        driver.findElements(By.cssSelector("[type='submit']")).get(1).click();
    }
    @DisplayName("Add to Cart")
    @Test
    public void addCart_2(){
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElements(By.className("product-image-photo")).get(2).click();
        driver.findElements(By.className("swatch-option")).get(2).click();
        driver.findElement(By.id("option-label-color-93-item-52")).click();
        driver.findElement(By.id("qty")).click();
        driver.findElement(By.id("product-addtocart-button")).click();

    }
    public void CloseDriver(){
        //driver.quit();
    }
}
