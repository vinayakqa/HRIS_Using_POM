package com.qait.pom.pomProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage {
	WebDriver driver;
	public ProfilePage(WebDriver driver) {
		this.driver=driver;
	}
public void personal_info() {
/*WebElement ams=driver.findElement(By.cssSelector(".user-profile-option.user-profile-option1.list-unstyled"));
System.out.println(ams.getAttribute("class"));
Select a=new Select(ams);
List<WebElement> we=a.getAllSelectedOptions();
for(WebElement awe:we)
	System.out.println(awe.getAttribute("href"));*/
	driver.findElement(By.cssSelector("div[class*=\"col-sm-3\"]>ul>li>a")).click();
//driver.findElement(By.cssSelector("div[class*=\"col-sm-3\"]>ul>li>ul>li")).click();
	driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[1]/div[2]/ul/li/ul/li[1]/a")).click();
	//ll.get(0).click();li[xpath="1"]
}

}
