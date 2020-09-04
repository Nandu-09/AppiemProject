package org.mockk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WT {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Mock1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/html/html_tables.asp");

WebElement fe= driver.findElement(By.id("email"));
Select s = new Select(fe);
s.selectByVisibleText("India");
String att = fe.getAttribute("India");
fe.sendKeys(att);
List<WebElement> findElements = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
for (WebElement webElement : findElements) {
	String text = webElement.getText();
System.out.println(text);
}
}


}


