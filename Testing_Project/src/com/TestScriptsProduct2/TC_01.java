package com.TestScriptsProduct2;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CommonUtility.ExcelFileData;

public class TC_01 extends BaseTest2 {

	@Test
	public void searchProduct2() throws IOException, EncryptedDocumentException, AWTException {

		String product = ExcelFileData.fetchData("Products_TC", 2, 0);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys(product);
		searchBox.sendKeys(Keys.ENTER);
	}
}