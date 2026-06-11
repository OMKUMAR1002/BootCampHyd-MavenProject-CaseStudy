package com.Practicetestautomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPractiseAutomationTest {
	WebDriver driver;
    public LoginPractiseAutomationTest(WebDriver driver) {
 	   this.driver=driver;
    }
    @FindBy(id="username")
    WebElement username;
    @FindBy(name="password")
    WebElement password;
    @FindBy(xpath="//button[@id='submit']")
    WebElement loginbtn;

	 
public void login_PractiseTest(String uname, String pass) {
	 username.sendKeys(uname);
	   password.sendKeys(pass);
	   loginbtn.click();
}
}
