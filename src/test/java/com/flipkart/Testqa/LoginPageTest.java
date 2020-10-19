package com.flipkart.Testqa;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Flikartbase.BaseFlipkart;
import com.FlipkartPages.LoginPage;

public class LoginPageTest extends BaseFlipkart{
	LoginPage LoginPage1;
	public LoginPageTest(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		LoginPage1= new LoginPage();
	}
	@Test
	public void loginPageTitleTest(){
		String Title= LoginPage1.validateLoginPageTitle();
		Assert.assertEquals(Title, "Login");
		System.out.println(Title);
		
	}
	@AfterMethod
	public void Terminate(){
		driver.close();
	}
	

}
