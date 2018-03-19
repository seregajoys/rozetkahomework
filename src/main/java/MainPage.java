import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    private By signInButton = By.xpath("//a[@name='signin']");
    private By signUpForm = By.xpath("//*[@class='auth-f-signup']");
    private By emailField = By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[1]/input");
    private By passfield = By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[2]/div[1]/div[1]/input");
    private By loginbutton = By.xpath("//*[@name='auth_submit']");
    private By searchfield = By.xpath("//*[@id=\"rz-search\"]/form/div[1]/div[2]/input");


    public MainPage clickSignIn() {
        driver.findElement(signInButton).click();
        return this;
    }
    public MainPage typelogin(){
        driver.findElement(emailField).sendKeys("homework1@yopmail.com");
        return this;
    }

    public MainPage typepass(){
        driver.findElement(passfield).sendKeys("Qwerty1");
        return this;
    }

    public PersonalData clickLogInbutt(){
        driver.findElement(loginbutton).click();
        return new PersonalData(driver);
    }


    public RegisterPage clickSignUpForm(){
        driver.findElement(signUpForm).click();
        new RegisterPage(driver);
    }

}



