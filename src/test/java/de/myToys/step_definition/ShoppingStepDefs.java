package de.myToys.step_definition;

import de.myToys.pages.ShoppingPage;
import de.myToys.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ShoppingStepDefs {

    ShoppingPage shoppingPage = new ShoppingPage();


    @When("the user should be able to write {string} the product name")
    public void the_user_should_be_able_to_write_the_product_name(String trampolin) {

        shoppingPage.searchBar.sendKeys(trampolin);
        BrowserUtils.waitFor(2);

        shoppingPage.searchBarButton.click();


    }

    @Then("the user should be able to sort product list by price")
    public void the_user_should_be_able_to_sort_product_list_by_price() {

        Select dropdown = new Select(shoppingPage.arrangementButton);

        List<WebElement>getText = dropdown.getOptions();
        for (WebElement webElement : getText) {

            System.out.println(webElement.getText());
        }
        BrowserUtils.waitFor(2);

        dropdown.selectByIndex(2);

        BrowserUtils.waitFor(2);

    }



}
