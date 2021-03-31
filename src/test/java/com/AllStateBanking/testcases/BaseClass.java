package com.AllStateBanking.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String URL = "http://demo.guru99.com/V4/";
	public String Username ="mngr292680";
	public String Password = "jerasup";
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setup() throws FileNotFoundException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Ankita Selenium projects\\AllStateBanking\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
//To maximize browser
		driver.manage().window().maximize();
 //implicit wait 
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		Logger logger = LogManager.getLogger("AllStateBanking");
		Properties props = new Properties();
		props.load(new FileInputStream("log4j.properties"));
		PropertyConfigurator.configure(props);
		
		
	}
	
	@AfterClass
	public void TreadDownTest() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
