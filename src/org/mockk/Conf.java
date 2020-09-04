package org.mockk;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conf {
	 static public void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Mock1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	WebElement name = driver.findElement(By.name("q"));
	name.sendKeys("iphone");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	List<WebElement> names = driver.findElements(By.xpath("//div[@class='_3wU53n']"));	
	TreeSet<String>	t = new TreeSet<String>();
	
	for (WebElement inames : names) {
		 String text = inames.getText();
t.add(text);
System.out.println(t);

	List<WebElement> price = driver.findElements(By.xpath("//*[@class='_1vC4OE _2rQ-NK']"));
	TreeSet<String>	t1 = new TreeSet<String>();
	for (WebElement newprice : price) {
	String text2 = newprice.getText();	
	t1.add(text2);}
	System.out.println(t1);
	

	}
	 }
	 }
	
	 
	 

	
	
	
	


