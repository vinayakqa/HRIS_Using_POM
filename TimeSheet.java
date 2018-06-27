package com.qait.pom.pomProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimeSheet {
WebDriver driver;
public TimeSheet(WebDriver driver) {
	this.driver=driver;
}

public void today_time(String myDate) {
	System.out.println(driver.findElement(By.xpath("//*[text()="+myDate+"]/../div/div[2]/p/span")).getText());
}

}
