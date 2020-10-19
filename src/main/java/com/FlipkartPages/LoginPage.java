package com.FlipkartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flikartbase.BaseFlipkart;

public class LoginPage extends BaseFlipkart {
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement LoginHome;
	@FindBy(xpath = "//input[@type='text' and @class='_2zrpKA _1dBPDZ']")
	WebElement PhInput;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitLogin;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}

}
