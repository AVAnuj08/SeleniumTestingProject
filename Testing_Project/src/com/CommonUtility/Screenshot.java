package com.CommonUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static WebDriver driver;

	public static void getScreenShotOfWebPage(String screenshotName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots/" + screenshotName + ".png");

		FileHandler.copy(src, destination);
	}

	public static void getScreenShotOfWebElement(WebElement element, String screenshotName) throws IOException {

		File src = element.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots/" + screenshotName + ".png");

		FileHandler.copy(src, destination);
	}
}