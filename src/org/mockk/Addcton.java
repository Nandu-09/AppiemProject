package org.mockk;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Addcton {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Mock1\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.tagName("a[1]")).click();

}
}

