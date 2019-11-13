package org.sample;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	public static void LaunchBrouser(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sankar\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	public static void SendKeys(WebElement lo,String inp) {
		lo.sendKeys(inp);

	}
	public static void click(WebElement lo) {
		lo.click();

	}
	public static void CloseBrow() {
		driver.quit();

	
	}
	public static void SelectByText(WebElement lo,String inp) {
		Select s=new Select(lo);
		s.selectByVisibleText(inp);
	}
	public static void SelectByIndex(WebElement lo,int i) {
		Select s=new Select(lo);
		s.selectByIndex(i);
	}
	public static void SelectBy(WebElement lo,String inp) {
		Select s=new Select(lo);
		s.selectByValue(inp);
	}
	public static void alert() {
		Alert al=driver.switchTo().alert();
		al.accept();
		
	}
	public static void scrollDown(WebElement down) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", down);
		

	}
	public static void screenshot(String path) throws IOException  {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sr=ts.getScreenshotAs(OutputType.FILE);
		File d=new File(path);
		FileUtils.copyFile(sr,d);

	}
}