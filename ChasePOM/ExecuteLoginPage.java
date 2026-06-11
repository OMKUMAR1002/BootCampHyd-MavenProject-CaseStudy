package com.Chase.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Chase.Pages.LoginChaseTest;

import Helper.BrowserFactory;

public class ExecuteLoginPage  {
		@Test
		public void CheckValidUser() throws Exception {
			 WebDriver driver=BrowserFactory.BrowserOptions("chrome", "https://www.chase.com/");
			 LoginChaseTest loginPagePracticeAuto = PageFactory.initElements(driver, LoginChaseTest.class);
			 loginPagePracticeAuto.login_PractiseTest("student", "Password123");
		 }
}
