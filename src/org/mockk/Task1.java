package org.mockk;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\Mock1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	List<WebElement> ar = driver.findElements(By.tagName("a"));
	int count =0;
	for (WebElement wt : ar) {	
	String at = wt.getAttribute("href");
		if(!(at==null)) {
		
			URL ur= new URL(at);
			URLConnection oc = ur.openConnection();
			HttpsURLConnection ne=(HttpsURLConnection)oc;
				int rc = ne.getResponseCode();
				if(!(rc==200)){
					count++;
					System.out.println(rc);
					System.out.println(at);
				}
			
	}
	
}
	System.out.println(count);	
}
}




