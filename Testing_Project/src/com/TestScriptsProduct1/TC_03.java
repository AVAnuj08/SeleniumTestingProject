package com.TestScriptsProduct1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.CommonUtility.PropertiesFileData;

public class TC_03 extends BaseTest1{

	@Test
	public void LoginTest() throws IOException, InterruptedException {

		WebElement element = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"));
		element.click();

		driver.findElement(By.id("ap_email")).sendKeys(PropertiesFileData.getPropertyValue("email"));

		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("ap_password")).sendKeys(PropertiesFileData.getPropertyValue("password"));

		driver.findElement(By.id("signInSubmit")).click();
	}
}