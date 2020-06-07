package com.project.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSetup {
static WebDriver driver;
	
	public static WebDriver ChromeDriver() {
		//To setup chrome driver
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver FirefoxDriver() {
		//To setup firefox driver
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe"); 
		DesiredCapabilities dc = DesiredCapabilities.firefox(); 
		dc.setCapability("marionette", true);
		driver =  new FirefoxDriver();
		return driver;
	}
	
}
