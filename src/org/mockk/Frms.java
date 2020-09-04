package org.mockk;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frms {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Mock1\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://netbanking.hdfcbank.com/netbanking/");
//driver.switchTo().frame("login_page");
//WebElement fra = driver.findElement(By.xpath("//frame[@noresize='true'][1]"));
//driver.switchTo().frame(fra);
WebElement fin = driver.findElement(By.tagName("frame"));
Point location = fin.getLocation();
System.out.println(location);

TakesScreenshot ts=(TakesScreenshot);
String screenshotAs = ts.getScreenshotAs(OutputType.BASE64);

//WebElement num = driver.findElement(By.name("fldLoginUserId"));
//num.sendKeys("68768944");
//WebElement cli = driver.findElement(By.xpath("//img[@alt='continue'][1]"));
//cli.click();

}
}