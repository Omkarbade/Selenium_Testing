import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest {

    @Test
    public void disabledTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C:\\Users\\OMKAR BADE\\IdeaProjects\\selenium\\src\\main\\resources\\disabledTest.html");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        javascriptExecutor.executeScript("document.getElementById('t1').value='omkar'");
        Thread.sleep(2000);

        javascriptExecutor.executeScript("document.getElementById('t1').value='re-written text in text field 1'");
        Thread.sleep(2000);

        javascriptExecutor.executeScript("document.getElementById('t2').value='gopal'");
        Thread.sleep(2000);

        javascriptExecutor.executeScript("document.getElementById('t2').value='text field 2'");
        Thread.sleep(4000);
        driver.close();

    }
}
