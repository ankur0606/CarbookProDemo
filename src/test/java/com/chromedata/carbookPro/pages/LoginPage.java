package com.chromedata.carbookPro.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

	@FindBy(css = "input[class='btn-login']")
	private WebElementFacade gmabloginButton;

	public void enterUserName(String userName) {
		typeInto(userNameTextBox, userName);
	}

	public void enterPassword(String password) {
		typeInto(passwordTextBox, password);
	}

	public DashboardPage clickLoginButtonAndOpenDashboard() {
		List<WebElement> loginTableList = getDriver().findElements(By.cssSelector("table[id='login-box-form']"));
		if (loginTableList.size() != 0)
			loginTableList.get(0).findElements(By.tagName("tr")).get(3).findElements(By.tagName("button")).get(0)
					.click();
		else
			gmabloginButton.click();

		// loginButton.click();
		return new DashboardPage();
	}

	public void openLoginPage() {
		String url = System.getProperty("webdriver.base.url") + CbpParameters.getBrands() + "/login.jsp";
		this.getDriver().get(url);
	}
}