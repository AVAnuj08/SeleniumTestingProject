package com.TestScriptsProduct4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CommonUtility.ExcelFileData;

public class TC_04 extends BaseTest4 {

	@Test
	public void filterProducts4() throws IOException {

		String product = ExcelFileData.fetchData("Products_TC", 4, 0);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys(product);
		searchBox.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//span[text()='₹500 - ₹1,000']")).click();
		driver.findElement(By.xpath("//span[text()='Action & Adventure']")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")).click();
	}
}