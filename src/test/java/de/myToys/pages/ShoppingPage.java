package de.myToys.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Suchbegriff']")
    public WebElement searchBar;

    @FindBy(xpath = "//*[@class='btn-1 search-form__btn']")
    public WebElement searchBarButton;

    @FindBy(xpath = "//div[@class='view-options view-options--top']//select[@name='select']")
    public WebElement arrangementButton;






}
