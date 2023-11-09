package com.TestScriptsProduct1;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_01 extends BaseTest1{

	@Test
	public void StartTest() throws IOException {
		
		Reporter.log("Login Test", true);
	}
}