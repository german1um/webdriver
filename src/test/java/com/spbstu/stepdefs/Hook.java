package com.spbstu.stepdefs;

import com.spbstu.MantisSite;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by germanium on 30.05.17.
 */
public class Hook {

    public static WebDriver driver;



    @Before
    public void before(Scenario scenario){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--lang=en-US");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MantisSite.init(driver);

    }

    @After
    public void after(Scenario scenario){
        driver.close();
    }
}
