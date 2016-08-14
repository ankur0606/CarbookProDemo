package com.chromedata.carbookPro.steps.serenity;

import com.chromedata.carbookPro.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserLoginSteps extends ScenarioSteps {

	LoginPage loginPage;

	@Step
	public void loginToCBP(String userName, String password) {
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();
	}

	@Step
	public void openCBP() {
		loginPage.open();
	}

}