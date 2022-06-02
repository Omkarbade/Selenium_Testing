import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HiddenpopupTest {

    WebDriver driver= null;
    @BeforeClass
    public void Initialization() {
        WebDriverManager.chromedriver().setup();
       ChromeOptions option = new ChromeOptions();
       option.addArguments("--disable-notifications");
        driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void Hidepopup() throws InterruptedException {
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("8983323680");
        driver.findElement(By.id("pass")).sendKeys("omkarbade3799");
        driver.findElement(By.name("login")).submit();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("----disable--geolocation");

        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[contains(text(),'Omkar Bade')]")).click();
    }

    @AfterMethod
    public void closeDriver(){
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        // driver.quit();
    }
}
