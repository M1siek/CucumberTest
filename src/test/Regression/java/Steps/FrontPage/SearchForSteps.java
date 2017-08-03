package Steps.FrontPage;

import Base.BaseUtil;
import Pages.FrontPagePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.NoSuchElementException;

public class SearchForSteps extends BaseUtil {

    private FrontPagePage frontPagePage;
    private BaseUtil base;
//    private FrontPagePage fpp;

    public SearchForSteps(BaseUtil base) {
        this.base = base;
        frontPagePage = new FrontPagePage(this.base);
    }

    @Given("^I navigate to Google$")
    public void iNavigateToGoogle() throws Throwable {
        try {
            base.driver.get(baseURL);
        } catch (NoSuchElementException e) {
            Assert.fail("URL not found");
        }
    }

    @Then("^I should be navigated to Google$")
    public void iShouldBeNavigatedToGoogle() throws Throwable {
        frontPagePage.iShouldSeeURL(baseURL);
    }

    @Given("^I enter nothing$")
    public void iEnterNothing() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I press Search button$")
    public void iPressSearchButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see search results$")
    public void iShouldSeeSearchResults() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
