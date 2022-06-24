package de.myToys.step_definition;

import de.myToys.pages.BasePage;
import de.myToys.pages.DashboardPage;
import de.myToys.utilities.BrowserUtils;
import de.myToys.utilities.ConfigurationReader;
import de.myToys.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class HomePageStepsDefs {

    DashboardPage dashboardPage = new DashboardPage();


    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {

        String url = ConfigurationReader.get("myToys.url");
        Driver.get().get(url);

        BrowserUtils.waitFor(5);
        dashboardPage.cookies.click();
        BrowserUtils.waitFor(2);

        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals("https://www.mytoys.de/",actualUrl);

    }
}
