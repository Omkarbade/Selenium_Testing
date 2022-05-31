import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class createnewaccount {
@Test
    public void Account() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\OMKAR BADE\\IdeaProjects\\selenium\\src\\drive\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]"));
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Omkar");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Bade");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("111111111");
        Thread.sleep(2000);

        Select date = new Select(driver.findElement(By.id("day")));
        date.selectByVisibleText("14");
        Thread.sleep(2000);

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Aug");
        Thread.sleep(2000);

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1999");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.name("websubmit")).click();
        driver.close();
    }

}
