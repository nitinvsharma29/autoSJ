package com.selauto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultPage {

	private WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"rso\"]/div/div/div[1]/div/div/h3")
	public WebElement lblFirstResult;

	public ResultPage(WebDriver driver) {
		this.driver = driver;
	}
}
