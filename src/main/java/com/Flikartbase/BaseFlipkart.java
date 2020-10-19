package com.Flikartbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseFlipkart {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public static void innitilization(){
	System.setProperty("webdriver.chrome.driver", "");
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/?gclid=CjwKCAjwz6_8BRBkEiwA3p02Ve_QsaH6Lp8dvP2cJ_"
			+ "svCZcKFpou0fiy44iAVYI-Wv-0MEeFgQSoBxoC73YQAvD_BwE");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "C:\\Users\\lenovo\\workspace\\FlipkartTest\\src\\main\\java\\com\\Flipkrt\\prop\\config.pro");
		
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}


public static void initialization(){
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Documents\\Chrome\\chromedriver.exe");	
		driver = new ChromeDriver(); 
	}
	else if(browserName.equals("FF")){
		System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
		driver = new FirefoxDriver(); 
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
	}
}
