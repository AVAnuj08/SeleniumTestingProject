package com.TestScriptsProduct2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CommonUtility.ExcelFileData;

public class TC_04 extends BaseTest2 {

	@Test
	public void filterProducts2() throws IOException {

		String product = ExcelFileData.fetchData("Products_TC", 2, 0);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys(product);
		searchBox.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Over ₹20,000']")).click();
		driver.findElement(By.xpath("//span[text()='Eligible for Pay On Delivery']")).click();
	}
}