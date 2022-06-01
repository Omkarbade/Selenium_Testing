import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;



public class CapScreenshot {
    @Test
    public void ScreenshotTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OMKAR BADE\\IdeaProjects\\selenium\\src\\drive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        try{
            FileHandler.copy(takesScreenshot.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\OMKAR BADE\\IdeaProjects\\selenium\\Screenshot\\Screenshot_"+System.currentTimeMillis()+".png"));
        }catch (WebDriverException e){
        }catch (IOException e) {
        }
        Thread.sleep(2000);
        driver.close();

    }
}
