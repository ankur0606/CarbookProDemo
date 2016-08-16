package com.chromedata.carbookPro.pages;

import com.chromedata.carbookPro.utils.CbpParameters;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;


public class LoginPage extends PageObject {

	@FindBy(name = "username")
	private WebElementFacade userNameTextBox;

	@FindBy(name = "password")
	private WebElementFacade passwordTextBox;

	@FindBy(xpath = "//*[starts-with(text(), 'Log')]")
	private WebElementFacade loginButton;

	public void enterUserName(String userName) {
		typeInto(userNameTextBox, userName);
	}

	public void enterPassword(String password) {
		typeInto(passwordTextBox, password);
	}

	public DashboardPage clickLoginButtonAndOpenDashboard() {
		loginButton.click();
		return new DashboardPage();
	}
	
	
	
	public void openLoginPage(){
		String url = System.getProperty("webdriver.base.url") + CbpParameters.getBrands() + "/login.jsp";
		this.getDriver().get(url);
	}
}