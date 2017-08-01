//package Steps.FrontPage;
//
//import Base.BaseUtil;
//import Pages.FrontPagePage;
//import cucumber.api.PendingException;
//import cucumber.api.java8.En;
//import junit.framework.Assert;
//import org.openqa.selenium.NoSuchElementException;
//
//public class Search extends BaseUtil implements En {
//
//    private BaseUtil base;
//    private FrontPagePage frontPagePage;
//
//    public void SearchFor(BaseUtil base) {
//        this.base = base;
//
//        frontPagePage = new FrontPagePage(this.base);
//        Given("^I navigate to ([^\"]*)$", (String url) -> {
//            url = baseURL;
//            try {
//                base.driver.get(url);
//            } catch (NoSuchElementException e) {
//                Assert.fail("URL not found");
//            }
//        });
//
//        Then("^I should be navigated to ([^\"]*)$", (String url) -> {
//            url = baseURL;
//            try {
//                base.driver.getCurrentUrl().equals(url);
//            } catch (NoSuchElementException e) {
//                Assert.fail("Incorrect URL");
//            }
//        });
//
//        Given("^I enter ([^\"]*)$", (String str0) -> {
//            frontPagePage.iEnterString(str0);
//        });
//
//        When("^I press Search button$", () -> {
//            frontPagePage.iPressSearchButton();
//        });
//
//        Then("^I should see search results$", () -> {
//            System.out.println(frontPagePage.iShouldSeeSearchResult());
//        });
//    }
//}