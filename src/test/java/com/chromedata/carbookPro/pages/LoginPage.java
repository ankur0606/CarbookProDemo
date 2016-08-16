package com.chromedata.carbookPro.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;


public class LoginPage extends PageObject {

	@FindBy(name = "username")
	private WebElementFacade userNameTextBox;

	@FindBy(name = "password")
	private WebElementFacade passwordTextBox;

	@FindBy(xpath = "//*[@id='login-box']/tbody/tr[2]/td[2]")
	private WebElementFacade loginButton;

	public void enterUserName(String userName) {
		typeInto(userNameTextBox, userName);
	}

	public void enterPassword(String password) {
		typeInto(passwordTextBox, password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
	
}