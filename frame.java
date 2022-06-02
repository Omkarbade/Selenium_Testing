import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frame {

    @Test
    public void frameDemo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\OMKAR BADE\\IdeaProjects\\selenium\\src\\main\\resources\\page2.html");
        driver.findElement(By.id("t2")).sendKeys("T2 Text Field");
        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("T1 text Field");
        Thread.sleep(2000);
        driver.switchTo().parentFrame();

        driver.switchTo().frame("f2");
        driver.findElement(By.id("t3")).sendKeys("T3 text Field");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.id("t2")).clear();
    }
}
