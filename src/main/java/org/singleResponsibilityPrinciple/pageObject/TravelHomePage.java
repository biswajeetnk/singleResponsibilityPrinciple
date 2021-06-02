package org.singleResponsibilityPrinciple.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.singleResponsibilityPrinciple.pageComponents.FooterNav;
import org.singleResponsibilityPrinciple.pageComponents.NavigationBar;

public class TravelHomePage
{
    /*URL : https://rahulshettyacademy.com/dropdownsPractise/*/

    WebDriver driver;
    By footer = By.id("traveller-home");
    By navigationBar = By.id("buttons");

    public TravelHomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void goTo()
    {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }

    //to access this method from any test code should be TravelHomePage.getNavigationBar();
    //to access this method from any test code should be TravelHomePage.getNavigationBar().anyMethodsInNavigationBar.java
    public NavigationBar getNavigationBar()
    {
        return new NavigationBar(driver, navigationBar);
    }

    public FooterNav getFooterNav()
    {
        return new FooterNav(driver, footer);
        //new add 02-06-2021..
    }
}
