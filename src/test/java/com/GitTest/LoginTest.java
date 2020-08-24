package com.GitTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\EPIQ\\NewWorkspace\\Demoexample\\src\\main\\java\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
	}
	@Test
	public void doLogIn() {
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	

}
