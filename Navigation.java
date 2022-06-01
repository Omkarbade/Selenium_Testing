import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {

    @Test
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\OMKAR BADE\\IdeaProjects\\selenium\\src\\drive\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
            driver.navigate().to("https://www.zomato.com/");
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            driver.navigate().forward();
            Thread.sleep(3000);
            driver.navigate().refresh();
            driver.close();
        }
    }
