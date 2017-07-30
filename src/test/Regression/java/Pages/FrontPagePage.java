package Pages;

import Base.BaseUtil;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FrontPagePage extends BaseUtil {

    public FrontPagePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='gs_htif0']")
    private WebElement searchBar;

    @FindBy(how = How.XPATH, using = ".//*[@id='tsf']/div[2]/div[3]/center/input[1]")
    public WebElement searchButton;

//    public void iNavigateToURL(String url) {
//        url = baseURL;
//        try {
//            driver.get(url);
//        } catch (NoSuchElementException e) {
//            Assert.fail("URL not found");
//        }
//    }

//    public void iShouldSeeURL(String url) {
//        try {
//            driver.getCurrentUrl().equals(url);
//        } catch (NoSuchElementException e) {
//            Assert.fail("Incorrect URL");
//        }
//    }

    public void iEnterString(String word) {
        try {
            searchBar.sendKeys(word);
        } catch (NoSuchElementException e) {
            Assert.fail("Search field not found");
        }
    }

    public void iPressSearchButton() {
        try {
            searchBar.click();
        } catch (NoSuchElementException e) {
            Assert.fail("Search button not found");
        }
    }

    public String iShouldSeeSearchResult() {
        return driver.getTitle();
    }

}