package org.singleResponsibilityPrinciple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.singleResponsibilityPrinciple.pageObject.TravelHomePage;
import org.testng.annotations.Test;

public class DemoTest
{
    @Test
    public void demoTest() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver_ver90//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();
        System.out.println(travelHomePage.getFooterNav().selectFlightInFooter()); //we are getting object of the FooterNav class by using getFoortNav()
                                                              //and using the selectFlightInFooter() method
        System.out.println(travelHomePage.getNavigationBar().selectFlightInHeader());
        System.out.println("The links count in header : "+travelHomePage.getNavigationBar().getLinkCount());
        System.out.println("The links count in footer : "+travelHomePage.getFooterNav().getLinkCount());
        //new add 02-06-2021
    }
}
