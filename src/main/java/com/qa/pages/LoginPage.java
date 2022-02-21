package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory - Object Repo:
	
	@FindBy(name="email")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="(//div[contains(text(),'Login')])[1]")
	WebElement loginButton;
	
	@FindBy(linkText ="Sign Up")
	WebElement signUpButton;
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pass) {
		username.sendKeys(un);
		password.sendKeys(pass);
		loginButton.click();
		
		return new HomePage();
	}
	
}
