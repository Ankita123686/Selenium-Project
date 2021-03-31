package com.AllStateBanking.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	public WebDriver driver; 
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		//Using findBy 	locating elements
	
	@FindBy(name = "uid")WebElement username;
	@FindBy(name= "password")WebElement password;
	@FindBy(name="btnLogin")WebElement LoginButton;
	@FindBy(name = "btnReset")WebElement ResetButton;
	
	//Action Methods
	
	public void setUsername(String UN ) { 
		System.out.println(UN);
		username.sendKeys(UN);
	}
	public void setPassword(String PW) {
		password.sendKeys(PW);	
	}
	public void clickLogin() {
		LoginButton.click();
	}
	
	public void clickReset() {
		ResetButton.click();
}
}