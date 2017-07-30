package Steps.FrontPage;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class SearchForSteps extends BaseUtil implements En {

    private BaseUtil base;


    public SearchForSteps(BaseUtil base) {

        this.base = base;

        Given("^I navigate to Google$", () -> {
            base.driver.navigate().to(baseURL);
        });

        Then("^I should see Google$", () -> {
            System.out.println("I'm on " + base.driver.getCurrentUrl());
        });
    }
}
