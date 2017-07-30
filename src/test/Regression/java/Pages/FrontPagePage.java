package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FrontPagePage {

    public FrontPagePage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.XPATH, using = ".//*[@id='gs_htif0']")
    public WebElement searchBar;

    @FindBy(how = How.XPATH, using = ".//*[@id='tsf']/div[2]/div[3]/center/input[1]")
    public WebElement searchButton;

}
