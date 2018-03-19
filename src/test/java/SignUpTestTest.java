import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SignUpTestTest extends MainClass {

    public static void main(String[] args){
        WebDriver driver = getDriver();
        MainPage mainPage = new MainPage();
        driver.get("http://rozetka.com.ua");
        mainPage.clickSignIn();
        (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='auth-f-signup']")));
        mainPage.clickSignUpForm();



    }
}