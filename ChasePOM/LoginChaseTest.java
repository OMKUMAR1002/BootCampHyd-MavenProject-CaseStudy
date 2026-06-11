package com.Chase.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginChaseTest {
	WebDriver driver;
    public LoginChaseTest(WebDriver driver) {
 	   this.driver=driver;
    }
    @FindBy(id="userId-text-input-field")
    WebElement username;
    @FindBy(id="password-text-input-field")
    WebElement password;
    @FindBy(xpath="//button[@id='signin-button']")
    WebElement loginbtn;

	 
public void login_PractiseTest(String uname, String pass) throws Exception {
	Thread.sleep(6000);
	 username.sendKeys(uname);
	   password.sendKeys(pass);
	   loginbtn.click();
}
}
