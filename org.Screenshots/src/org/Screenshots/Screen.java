package org.Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praneeth.Praneeth-PC\\eclipse-workspace\\org.Screenshots\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src =tk.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\Praneeth.Praneeth-PC\\eclipse-workspace\\org.hcl.sel1\\SH\\fb.png");
	FileUtils.copyFile(src, des);
	driver.quit();
	
	

}
	

}
