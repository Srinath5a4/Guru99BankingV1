package com.Guru99BankingV1.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Guru99BankingV1.pageObjects.LoginPage;




public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException
	{
		
		logger.info("URL is opened");

		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered UserName");
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickLogin();
		logger.info("Clicked on login Button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage" ))
		{
			Assert.assertTrue(true);
			logger.info("Login test Passed");
		}
		else
		{	captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

}
