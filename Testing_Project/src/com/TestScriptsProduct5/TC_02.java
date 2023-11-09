package com.TestScriptsProduct5;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CommonUtility.ExcelFileData;

public class TC_02 extends BaseTest5 {

	@Test
	public void fetchProductNames5() throws EncryptedDocumentException, IOException {

		String product = ExcelFileData.fetchData("Products_TC", 5, 0);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys(product);
		searchBox.sendKeys(Keys.ENTER);

		List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		for (WebElement webElement : list) {
			String productName1 = webElement.getText();
			Reporter.log(productName1, true);
			System.out.println();
		}
	}
}