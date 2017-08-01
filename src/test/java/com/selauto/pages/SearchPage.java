package com.selauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	private WebDriver driver;

	By txtSearch = By.id("lst-ib");
	By btnSearch = By.name("btnK");

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterInSearch(String text) {
		driver.findElement(txtSearch).sendKeys(text);
	}

	public void clickSearch() {
		driver.findElement(btnSearch).clear();
	}
}
