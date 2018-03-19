import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResult {
    private WebDriver driver;

    public SearchResult(WebDriver driver) {
        this.driver = driver;
    }

    private By firstItem = By.xpath("//*[@class='g-i-tile-l clearfix']/div[1]");




