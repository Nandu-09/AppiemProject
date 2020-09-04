package org.mockk;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Mock1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.snapdeal.com/");
WebElement src = driver.findElement(By.id("inputValEnter"));
src.sendKeys("iphone 6");
WebElement cli = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
cli.click();
WebElement ipone = driver.findElement(By.xpath("//p[text()='Apple iPhone 6 Cover by Store At Ur Door - Golden']"));
String att = ipone.getAttribute("title");
System.out.println(att);
String parid = driver.getWindowHandle();
System.out.println(parid);
Set<String> allid = driver.getWindowHandles();
Thread.sleep(2000);
for (String string : allid) {
	System.out.println(string);
	if(!parid.equals(string)) {
		driver.switchTo().window(string);
		
	

WebElement cart = driver.findElement(By.xpath("//span[text()='Cart']"));
cart.click();
}
}
}
}