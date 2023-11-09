package com.TestScriptsProduct1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_02 extends BaseTest1 {

	@Test
	public void LoginPageOpenTest() throws IOException, InterruptedException {

		WebElement element = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"));
		element.click();

	}
}