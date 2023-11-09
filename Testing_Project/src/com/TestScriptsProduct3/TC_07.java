package com.TestScriptsProduct3;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CommonUtility.ExcelFileData;

public class TC_07 extends BaseTest3 {
	
	@Test
	public void addToCart3() throws EncryptedDocumentException, IOException {

		String product = ExcelFileData.fetchData("Products_TC", 3, 0);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys(product);
		searchBox.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

		Set<String> set = driver.getWindowHandles();

		for (String i : set) {
			driver.switchTo().window(i);
		}

		driver.findElement(By.id("add-to-cart-button")).click();
	}
}