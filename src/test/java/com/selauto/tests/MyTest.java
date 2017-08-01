package com.selauto.tests;

import org.testng.annotations.Test;

public class MyTest extends BaseTest {

	@Test
	public void firstTest() throws Exception {
		launchBrowser("Chrome");
		openLink("https://www.google.at");
		Thread.sleep(2000);
		closeBrowser();
		System.out.println("This is the firstTest Method");
	}
}
