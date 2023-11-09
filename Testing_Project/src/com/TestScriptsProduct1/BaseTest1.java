package com.TestScriptsProduct1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.CommonUtility.PropertiesFileData;

public class BaseTest1 {

	public WebDriver driver;

	@BeforeClass
	public void navigateToURL() throws IOException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(PropertiesFileData.getPropertyValue("url"));
	}

//	@AfterClass
//	public void closeBrowser() {
//		driver.quit();
//	}
}