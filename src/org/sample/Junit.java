package org.sample;


import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	static WebDriver driver;
	@BeforeClass
	public static void LaunchBrouser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sankar\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
		Assert.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
	}
	@AfterClass
	public static void closeBrouser() {
		driver.quit();
	}
	@Before
	public static void startTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@After
	public static void endTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void test1() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Jayprakash");
		Assert.assertEquals("Jayprakash", email.getAttribute("value"));
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("jay");
		Assert.assertEquals("jay", pass.getAttribute("value"));
	}
	@Test
	public void test2() {
		driver.findElement(By.id("u_0_b")).click();
	}
		

	
	
}
