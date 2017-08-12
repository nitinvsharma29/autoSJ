package com.selauto.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import com.selauto.pages.*;

public class My2Test extends BaseTest { // note: the name was 'Base' previously
	private WebDriver driver;
	public Pages pages;

	@BeforeTest
	public void setUp() {
		launchBrowser("Chrome");
		driver = super.driver;
		// initialize Pages class to get all the pages for use in the test class
		pages = PageFactory.initElements(driver, Pages.class);
		// searchPage = PageFactory.initElements(driver, SearchPage.class);
		// searchPage = PageFactory.initElements(driver, SearchPage.class);
	}

	@Test
	public void TestMethod() {
		openLink("https://www.google.at");
		pages.SearchPage().txtSearch.sendKeys("MyTest");
		pages.SearchPage().btnSearch.submit();
		System.out.println(pages.ResultPage().lblFirstResult.getText());
		// searchPage.enterInSearch("MyTest");
		// searchPage.clickSearch();
	}

	@AfterTest
	public void tearDown() {
		closeBrowser();
	}
}
