package com.TestScriptsProduct1;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CommonUtility.ExcelFileData;
import com.CommonUtility.PropertiesFileData;

public class TC_04 extends BaseTest1 {

	@Test
	public void searchProduct1() throws IOException, EncryptedDocumentException, AWTException {

		String product = ExcelFileData.fetchData("Products_TC", 1, 0);

		WebElement element = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"));
		element.click();

		driver.findElement(By.id("ap_email")).sendKeys(PropertiesFileData.getPropertyValue("email"));

		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("ap_password")).sendKeys(PropertiesFileData.getPropertyValue("password"));

		driver.findElement(By.id("signInSubmit")).click();

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys(product);
		searchBox.sendKeys(Keys.ENTER);
	}
}