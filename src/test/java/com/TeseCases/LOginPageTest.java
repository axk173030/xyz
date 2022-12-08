package com.TeseCases;



import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.TestPages.LoginPage;
import com.TestUtil.TestUtil;
@SuppressWarnings({ "deprecation", "unused" })
public class LOginPageTest extends TestBase{
	
	
LoginPage lp;
public LOginPageTest() {
	super();
}
@BeforeMethod
public void SetUp1() {
	initil();
	lp= new LoginPage();

}
 
@Test(priority=2)
public void VerifyLoginPage() throws InterruptedException, IOException, NullPointerException {
	
	lp.verifyLogin(prop.getProperty("emailaddress"), prop.getProperty("password1"));
}


@Test(priority =1)
public void VerifyTitleofThePage() throws IOException, NullPointerException {
	
	String title= lp.VerifyTitle();
	AssertJUnit.assertEquals(title, "TechFios - Login - Online and In-Class Dallas IT Training | Software Testing | Automation | SQL | Agile | DevOps | Java");
	
	
}
	@AfterMethod
	public void TearDowm() {
	driver.quit();}
	


}
