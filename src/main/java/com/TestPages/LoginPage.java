package com.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class LoginPage extends TestBase{
	
		//page factory or container 
			//we will keep all locator and method in this class
		@FindBy(xpath ="//input[@name=\"email\"]")
		WebElement emailaddress;
		@FindBy(xpath ="//input[@name=\"password\"]")
		WebElement password;
		@FindBy(xpath ="//button[@type='submit']")
		WebElement SignInButton;
		

public LoginPage() {
	PageFactory.initElements(driver,this);
}
public void verifyLogin(String email , String password1) throws InterruptedException {
	emailaddress.sendKeys((email));
	
	password.sendKeys((password1));
	Thread.sleep(5000);
	
}
public String VerifyTitle() {
	return driver.getTitle();
}

public void signIn() {
	SignInButton.click();
}


}
