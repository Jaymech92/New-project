package org.sample;

import java.util.Date;

//import org.junit.AfterClass;
//seimport org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
	static WebDriver driver;
	@BeforeClass
	public void LaunchBrouser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sankar\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
		Assert.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
	}
	@AfterClass
	public void closeBrouser() {
		driver.quit();
	}
	@BeforeMethod
	public void startTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@AfterMethod
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void atest() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Jayprakash");
		Assert.assertEquals("Jayprakash", email.getAttribute("value"));
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("jay");
		Assert.assertEquals("jay", pass.getAttribute("value"));
	}
	@Test
	public void ztest() {
		driver.findElement(By.id("u_0_b")).click();
		System.out.println("rajesh");
		
	}
}
