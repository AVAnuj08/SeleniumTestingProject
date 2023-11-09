package com.TestScriptsProduct5;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CommonUtility.ExcelFileData;

public class TC_05 extends BaseTest5 {

	@Test
	public void ProductPage5() throws IOException {

		String product = ExcelFileData.fetchData("Products_TC", 5, 0);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys(product);
		searchBox.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//span[text()='Samsung']")).click();
		driver.findElement(By.xpath("//span[text()='Over ₹20,000']")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[34]")).click();

		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();

		Set<String> set = driver.getWindowHandles();

		for (String string : set) {
			driver.switchTo().window(string);
		}
	}
}