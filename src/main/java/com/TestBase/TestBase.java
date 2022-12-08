package com.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.TestUtil.TestUtil;

public class TestBase  {

  public static  Properties prop= new Properties();
	 public static  WebDriver driver;
	public TestBase() {
	
		try{
			FileInputStream fle= new FileInputStream("\\C:\\Users\\rsvac\\eclipse-workspace\\dell.qa\\src\\main\\java\\com\\config\\Config.properties\\");
		
	prop.load(fle);
	}
catch(FileNotFoundException e) {
	e.printStackTrace();
} 
		catch (IOException e) {
	e.printStackTrace();
}}
	
	public static void  initil() {
		
		
		String  browser = prop.getProperty("browser");
	try {
	if(browser.equalsIgnoreCase("Chrome")) {
	
	System.setProperty("webdriver.chrome.driver", "\\C:\\Drivers\\chromedriver.exe\\");
	driver = new ChromeDriver();
	}else if( browser.equalsIgnoreCase("firefox") ){
	System.setProperty("webdriver.gecko.driver", "\\C:\\Drivers\\geckodriver.exe\\");
		driver = new FirefoxDriver();
	}}
	catch(NullPointerException e) {
		System.out.println(e);
	}
	try {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	driver .manage().window().maximize();
	driver.manage().deleteAllCookies();
     driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGELOADOUTTIME, TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITWAITTIME, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	}catch(NullPointerException e) {
		System.out.println(e);}
	
}}
	
	
	

