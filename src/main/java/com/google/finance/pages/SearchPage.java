package com.google.finance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;

public class SearchPage extends PageObject {

	@FindBy(name = "q")
	public WebElement tbx_stock;

	@FindBy(xpath = "//input[@value='Google Search']")
	public WebElement btn_search;

	public void openSearchPage() {
		getDriver().get("https://www.google.com/");
		getDriver().manage().window().maximize();

	}

	public void searchOnPage(String stockName) {
		tbx_stock.sendKeys(stockName);
		btn_search.click();

	}

}
