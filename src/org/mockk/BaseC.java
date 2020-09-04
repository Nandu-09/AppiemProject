package org.mockk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseC {
static WebDriver driver;
static Actions a;
public static static WebDriver browserLaunc() {
System.setProperty("webdriver.chrome.driver","D:\\Mock1\\Driver\\chromedriver.exe");

driver= new ChromeDriver();
	}
public void pageTitle()
{
String title = driver.getTitle();
System.out.println(title);
// TODO Auto-generated method stub

}

public void pageUrl() {
	String curl = driver.getCurrentUrl();
	System.out.println(curl);
	// TODO Auto-generated method stub

}

public void openPage(String url) 
{
driver.get(url);
	
}
public void fill(WebElement e,String text) 
{
	e.sendKeys(text);
	
}
public void btnClick(WebElement e)
{
e.click();
}
	// TODO Auto-generated method stub


}



