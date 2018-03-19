import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    private By userNameField = By.xpath("//*[@id=\"signup_form\"]/div[1]/input");
    private By emailField = By.xpath("//*[@id=\"signup_form\"]/div[2]/input");
    private By passwordField = By.xpath("//*[@id=\"signup_form\"]/div[3]/input");
    private By signUpButton = By.xpath("//*[@class='btn-link btn-link-green btn-link-sign']");
    private By headtitle = By.xpath("//*[@class='signup-title']");

    public SignUpPage typeUserName (String username){
        driver.findElement(userNameField).sendKeys("username12");
        return this;

    }

    public SignUpPage typeEmail (String emai){
        driver.findElement(emailField).sendKeys("homework1@yopmail.com");
        return this;
    }

    public SignUpPage typePassword (String passwrod){
        driver.findElement(passwordField).sendKeys("Qwerty1");
        return this;
    }

    public PersonalData clickSignUpButton(){
        driver.findElement(signUpButton).click();
        return new PersonalData();
    }

    public SignUpPage getTitle(){
        driver.getTitle();
        return this;

    }
}


////*[@id='confirm_email_btn'] dlya proverki