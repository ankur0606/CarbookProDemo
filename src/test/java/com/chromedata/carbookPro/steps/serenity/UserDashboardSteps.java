package com.chromedata.carbookPro.steps.serenity;

import com.chromedata.carbookPro.pages.DashboardPage;
import com.chromedata.carbookPro.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserDashboardSteps extends ScenarioSteps {

	DashboardPage dashboardPage;

	@Step
	public void loginToCBP(String userName, String password) {
		
	}

	@Step
	public void openCBP() {
		//loginPage.open();
	}

}