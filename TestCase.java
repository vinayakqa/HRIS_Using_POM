import org.testng.annotations.Test;

import com.qait.pom.pomProgram.*;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestCase {
	WebDriver driver;
	String check="";
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hris.qainfotech.com/login.php");
		Assert.assertEquals("https://hris.qainfotech.com/login.php", driver.getCurrentUrl());
	}
	@Test
	public void step1_navigateToLoginButton() {

		List<WebElement> link=driver.findElements(By.tagName("a"));
		for(WebElement loginLink:link) {
			if(loginLink.getAttribute("href").contains("panel1"))
				loginLink.click();

		}
	}

	@Test
	public void step2_login() throws InterruptedException {
		LoginPage ll=new LoginPage(driver);
		ll.validUserLogin("vinayaknair", "Vinayak@321#");
		
		Thread.sleep(1000);
	}
	@Test(dependsOnMethods= {"step2_login"})
	public void Step3_TimeSheet() {
		String expectedUrl="https://hris.qainfotech.com:8086/time/timesheet";
		Assert.assertEquals(expectedUrl,driver.getCurrentUrl());
			TimeSheet time=new TimeSheet(driver);
			time.today_time("25");
			//ProfilePage pg=new ProfilePage(driver);
			//pg.personal_info();
		}
	@Test(dependsOnMethods= {"step2_login"})
	public void step4_profilePage() {
		String expectedUrl="https://hris.qainfotech.com:8086/time/timesheet";
		Assert.assertEquals(expectedUrl,driver.getCurrentUrl());
		ProfilePage myProfile=new ProfilePage(driver);
		myProfile.personal_info();
	}
	@AfterTest
	public void afterTest() {
	//driver.close();
	}

}
