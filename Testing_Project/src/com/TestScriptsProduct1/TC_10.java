package com.TestScriptsProduct1;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CommonUtility.ExcelFileData;
import com.CommonUtility.Screenshot;

public class TC_10 extends BaseTest1 {

	@Test
	public void getProductScreenShot1() throws IOException {

		String product = ExcelFileData.fetchData("Products_TC", 1, 0);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys(product);
		searchBox.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

		Set<String> set = driver.getWindowHandles();

		for (String i : set) {
			driver.switchTo().window(i);
		}

		WebElement productElement = driver.findElement(By.xpath("//img[@id='landingImage']"));

		Screenshot.getScreenShotOfWebElement(productElement, "laptopPic");
	}
}