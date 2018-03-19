import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
    public static  WebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\rozetkahomework\\src\\main\\resources\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            return new ChromeDriver();

    }
}
