package com.selauto.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import com.selauto.pages.SearchPage;

public class My2Test extends BaseTest { // note: the name was 'Base' previously
	private WebDriver driver;
	public SearchPage searchPage;

	@BeforeTest
	public void setUp() {
		launchBrowser("Chrome");
		driver = super.driver;
		searchPage = new SearchPage(driver);
	}

	@Test
	public void TestMethod() {
		openLink("https://www.google.at");
		searchPage.enterInSearch("MyTest");
		searchPage.clickSearch();
	}

	@AfterTest
	public void tearDown() {
		closeBrowser();
	}
}
