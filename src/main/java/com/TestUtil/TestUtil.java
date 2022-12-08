package com.TestUtil;

import java.io.File;
import org.openqa.selenium.Selenium;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import com.TestBase.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGELOADOUTTIME=20; 
	
	public static long IMPLICITWAITTIME=30;
	static Workbook book;
	static Sheet sheet;
	
	public static String TestData_Path="C:\\Users\\rsvac\\eclipse-workspace\\dell.qa\\src\\main\\java\\com\\TestData\\Service.xlsx";
public static Object[][] getTestData(String sheetName){
try {
	FileInputStream file;

file = new FileInputStream(TestData_Path);

book = WorkbookFactory.create(file);}
catch(EncryptedDocumentException e) {
	e.printStackTrace();
}catch(FileNotFoundException e) {
	e.printStackTrace();
}catch(IOException e) {
	e.printStackTrace();

sheet = book.getSheet(sheetName);
Object[][] data = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
for(int i=0;i < sheet.getLastRowNum();i++) {
	for(int k =0;k <sheet.getRow(0).getLastCellNum();k++) {

data[i][k]= sheet.getRow(i+1).getCell(k).toString();
}}
return data;}
return null;}}





