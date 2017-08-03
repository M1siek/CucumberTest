package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by shandj on 22/06/2017.
 */

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    //every scenario
    public void initialiseTest (){

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        base.driver = new ChromeDriver();

    }

    @After
    //every scenario
    public void tearDownTest (Scenario scenario){

        System.out.println("\nScenario: "+scenario.getName()+" -- "+scenario.getStatus()+"\n");

        base.driver.close();
        base.driver.quit();

    }

}
