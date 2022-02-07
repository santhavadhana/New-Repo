package com.org.makemytrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resource {

	public static WebDriver driver;

	static String path = "C:/Users/Zapcom/Desktop/chromedriver.exe";

	static String url = "https://www.makemytrip.com/";



	public static WebDriver getdriver(String browser) {

		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", path);

			driver = new ChromeDriver();

			driver.get(url);

			driver.manage().window().maximize();

		}

		return driver;



	}

}

