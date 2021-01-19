package org.sam;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Set {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SampleProgram\\sel\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		
		d.get("https://www.ajio.com/");
		
		
		WebElement sea = d.findElement(By.xpath("//input[@role='combobox']"));
		sea.sendKeys("T-shirt");
		
		WebElement search = d.findElement(By.xpath("//span[@class='ic-search']"));
		search.click();
		
		List<WebElement> brand = d.findElements(By.xpath("//div[@class='brand']"));
		
		for (int i = 0; i < brand.size(); i++) {
			
			WebElement new1 = brand.get(i);
			System.out.println(new1.getText());			
				
			}
		
		TreeSet s = new TreeSet<String>();
		 
		s.addAll(brand);
			System.out.println(s);
			
			for (Object x : s) {
				
				
				System.out.println(x);
				
			}
		
		d.close();	
			
		}
          
		 
		
		

	
}
