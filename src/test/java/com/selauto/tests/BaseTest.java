package com.selauto.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.selauto.utils.*;

public class BaseTest {
	public WebDriver driver;

	public void launchBrowser(String browser) {
		if (browser == "firefox") {
			Log.info("Initializing firefox browser.");
			System.setProperty("webdriver.gecko.driver",
					"C:\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser == "Chrome") {
			Log.info("Initializing Chrome browser.");
			System.setProperty("webdriver.chrome.driver",
					"C:\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void openLink(String url) {
		Log.info("Opening " + url);
		driver.get(url);
	}

	public void closeBrowser() {
		Log.info("Closing browser.");
		driver.quit();
	}
}
