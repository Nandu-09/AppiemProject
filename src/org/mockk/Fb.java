package org.mockk;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fb {

	protected  void getInfo()  
    {  

		
		System.out.println("method of Base class");  
		
		ChromeDriver ch = new ChromeDriver();
		ch.navigate().to("http://adactinhotelapp.com/");
	ch.findElement(By.xpath("//a[text()='New User Register Here']")).click();
	ch.findElement(By.cssSelector("#username")).sendKeys("nkr");
	ch.findElement(By.cssSelector("#password")).sendKeys("kr");
	ch.findElement(By.cssSelector("#re_password")).sendKeys("nke");
	ch.switchTo().window(li.gew325v)
	String windowHandle = ch.getWindowHandle();
	Set<String> windowHandles = ch.getWindowHandles();
	 for (String string : windowHandles) {
		
	}
	 
	ch.findElement(By.c)

		
		ChromeOptions n= new ChromeOptions();

    }  }



