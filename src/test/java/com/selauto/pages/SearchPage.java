package com.selauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;

public class SearchPage {
	private WebDriver driver;

	@FindBy(how = How.ID, using = "lst-ib")
	public WebElement txtSearch;

	@FindBy(how = How.NAME, using = "btnK")
	public WebElement btnSearch;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	// public void enterInSearch(String text) {
	// driver.findElement(txtSearch).sendKeys(text);
	// }
	//
	// public void clickSearch() {
	// driver.findElement(btnSearch).clear();
	// }
}
