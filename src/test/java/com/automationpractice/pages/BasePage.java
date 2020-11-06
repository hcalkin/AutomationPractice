package com.automationpractice.pages;
import org.openqa.selenium.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utils.Driver;

public class BasePage {

    @FindBy(xpath = "//div[@id='header_logo']/a/img")
    public WebElement logo;
    public  BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }
    //First We need to test the logo with id
    public void testLogo(){
        logo.isDisplayed();
        System.out.println("Logo is displayed");
    }
}
