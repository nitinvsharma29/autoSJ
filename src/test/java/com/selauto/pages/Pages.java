package com.selauto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pages {

	private WebDriver driver;

	private SearchPage searchPage;
	private ResultPage resultPage;

	public Pages(WebDriver driver) {
		this.driver = driver;
	}

	// initialize and return SearchPage object
	public SearchPage SearchPage() {
		searchPage = PageFactory.initElements(driver, SearchPage.class);
		return searchPage;
	}

	// initialize and return ResultPage object
	public ResultPage ResultPage() {
		resultPage = PageFactory.initElements(driver, ResultPage.class);
		return resultPage;
	}
}
