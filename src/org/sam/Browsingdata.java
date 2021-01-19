package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Browsingdata {

public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SampleProgram\\sel\\chromedriver.exe");

	WebDriver d = new ChromeDriver();
	
	d.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	
	Thread.sleep(3000);
	
	WebElement signin = d.findElement(By.xpath("//input[@class='btn btn-default']"));
	
	signin.click();
	
	//Actions ac = new Actions(d);l
	
	
	Alert a = d.switchTo().alert();
	
	Thread.sleep(3000); 
	
	a.accept();
	
	d.quit();
	
	
}
	

}


	
