package com.Practicetestautomation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Practicetestautomation.Pages.LoginPractiseAutomationTest;

import Helper.BrowserFactory;

public class ExecuteLoginPage {
	@Test
	public void CheckValidUser() {
		 WebDriver driver=BrowserFactory.BrowserOptions("chrome", "https://practicetestautomation.com/practice-test-login/");
		 LoginPractiseAutomationTest loginPagePracticeAuto = PageFactory.initElements(driver, LoginPractiseAutomationTest.class);
		 loginPagePracticeAuto.login_PractiseTest("student", "Password123");
	 }
}
