import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
    @Before
    public void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\rozetkahomework\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua");


    }

}
