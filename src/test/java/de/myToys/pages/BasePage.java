package de.myToys.pages;

import de.myToys.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(xpath = "//button[normalize-space(text())='Zustimmen']")
    public WebElement cookies;





}
