package com.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LathaSanthavadhanan\\eclipse-workspace\\P_Travels\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/login");
		Thread.sleep(3000);
		WebElement us = driver.findElement(By.name("username"));
		us.sendKeys("user@phptravels.com");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("demouser");
		WebElement radioBtn = driver.findElement(By.xpath("//ins[@class='iCheck-helper']"));
		radioBtn.click();
		WebElement logiBtn = driver.findElement(By.xpath("//input[@id='login']"));
		logiBtn.click();
	}
	
}
