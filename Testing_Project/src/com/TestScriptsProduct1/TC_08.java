package com.TestScriptsProduct1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CommonUtility.ExcelFileData;

public class TC_08 extends BaseTest1 {

	@Test
	public void filterProducts1() throws IOException {

		String product = ExcelFileData.fetchData("Products_TC", 1, 0);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys(product);
		searchBox.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Over ₹50,000']")).click();
		driver.findElement(By.xpath("//span[text()='Intel Core i7']")).click();
		driver.findElement(By.xpath("//span[text()='SSD']")).click();
		driver.findElement(By.xpath("//span[text()='Gaming']")).click();
	}
}
