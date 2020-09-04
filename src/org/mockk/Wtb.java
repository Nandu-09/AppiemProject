package org.mockk;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wtb {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Mock1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.w3schools.com/html/html_tables.asp");
List<WebElement> fin = driver.findElements(By.xpath("//table[@id='customers']"));
for (WebElement we : fin) {
	String text = we.getText();
	System.out.println(text);
}
}
}


