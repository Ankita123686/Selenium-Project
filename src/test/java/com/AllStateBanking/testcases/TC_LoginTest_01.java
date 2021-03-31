package com.AllStateBanking.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.AllStateBanking.pageObject.LoginPage;

public class TC_LoginTest_01 extends BaseClass {
	
	@Test
	public void LoginTest() throws InterruptedException
	{
		driver.get(URL); logger.info("URL is Open");
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		
		lp.setUsername(Username);
		Thread.sleep(2000);
		
		lp.setPassword(Password);
		
		lp.clickLogin();
		System.out.println( "Title is :" + driver.getTitle());
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
