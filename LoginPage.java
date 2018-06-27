package com.qait.pom.pomProgram;

import org.openqa.selenium.*;

public class LoginPage 
{
	WebDriver driver;
	WebElement username;
	WebElement password;

public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void inputUserName(String text) {
		username=driver.findElement(By.id("txtUserName"));
		username.sendKeys(text);
	}
	public void inputPassword(String text) {
		password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(text);
	}

	public void validUserLogin(String user,String pass) {
		inputUserName(user);
		inputPassword(pass);
		driver.findElement(By.id("txtPassword")).submit();

	}
}
