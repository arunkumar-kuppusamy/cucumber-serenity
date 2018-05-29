package com.google.finance.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultPage extends SearchPage {

	@FindBy(xpath = "//a[text()='Finance']")
	public WebElementFacade lnk_finance;

}
