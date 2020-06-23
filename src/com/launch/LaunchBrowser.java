package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LaunchBrowser {
	SoftAssert Assert = new SoftAssert();
    WebDriver driver;
    @Test
    public void Launch() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        try {
        Assert.assertEquals(driver.getTitle(), "Google");    
        System.out.println("Assertion Equals Passed");
        Assert.assertTrue(driver.getTitle().equals("Google"));
        System.out.println("Assertion True Passed");
        Assert.assertFalse(driver.getTitle().equals("Google"));
        System.out.println("Assertion False Passed");
        Assert.assertAll();
        } catch (AssertionError e) {
            System.out.println("Assertion Error");
            //e.printStackTrace();
        }
    }



}
