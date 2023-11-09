package com.TestScriptsProduct1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CommonUtility.ExcelFileData;

public class TC_07 extends BaseTest1{

	@Test
	public void scrollAtElement() throws IOException, InterruptedException {

		String product = ExcelFileData.fetchData("Products_TC", 1, 0);


		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys(product);
		searchBox.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement item = driver.findElement(By.xpath("//span[text()='Acer Aspire Lite 11th Gen Intel Core i3 Premium Metal Laptop (8GB RAM/512GB SSD/Windows 11 Home) AL15-51, 39.62cm (15.6\") Full HD Display, Metal Body, Steel Gray, 1.59 Kg']"));
		js.executeScript("arguments[0].scrollIntoView(true);",item);
	}
}