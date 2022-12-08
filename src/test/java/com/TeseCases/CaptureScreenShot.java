package com.TeseCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot  {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Drivers\\chromedriver.exe\\");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.cnn.com/");
		
		TakesScreenshot ts= ((TakesScreenshot)driver1);
		File src=ts.getScreenshotAs(OutputType.FILE);
		
	File dest = new File("C:\\Users\\rsvac\\eclipse-workspace\\dell.qa\\ScreenShot\\fullpage.png");
		
		FileUtils.copyFile(src,dest);

	}

}
