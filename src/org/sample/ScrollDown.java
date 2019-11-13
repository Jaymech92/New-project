package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sankar\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement a1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement b1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions a= new Actions(driver);
		a.dragAndDrop(a1, b1).perform();
		Thread.sleep(5000);
		driver.quit();
}
}