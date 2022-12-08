package com.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class ProductAndService extends TestBase{
@FindBy(xpath="//input[@id=\"name\"]")
WebElement TypeName;

@FindBy(xpath="//input[@id=\"sales_price\"]")
WebElement salesprice;

@FindBy(xpath="//input[@id=\"item_number\"]")
WebElement itemnumber;

@FindBy(xpath="//textarea[@class=\"form-control\"]")
WebElement Description;
@FindBy(xpath="//span[text()='Product & Services']")
WebElement ProductNServices;
@FindBy(xpath="//a[text()='New Service']")
WebElement NewService;
@FindBy(xpath="//button[@id=\"submit\"]")
WebElement Submit;
@FindBy(xpath="//[@class=\"alert alert-successfade in \" ]")
WebElement SuccessMessage;

public ProductAndService() {
	PageFactory.initElements(driver,this);}

public void ProductNServices() {
	ProductNServices.click();
	
}

public void NewService() {
	NewService.click();}
public boolean ValidateSuccessMessage() {
		return SuccessMessage.isDisplayed();
	}

	public void NewOrder(String name, String SalesPrice, String description ,String itemNumber) {
TypeName.sendKeys(name);
salesprice.sendKeys(SalesPrice);
itemnumber.sendKeys(itemNumber);
Description.sendKeys(description);
Submit.click();





}}
