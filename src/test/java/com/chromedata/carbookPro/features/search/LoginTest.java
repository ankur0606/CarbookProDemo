package com.chromedata.carbookPro.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.chromedata.carbookPro.steps.serenity.UserLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class LoginTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public UserLoginSteps user;

	@Test
	public void verifyUserLoginWithValidCredential() {
		user.openCBP();
		user.loginToCBP("ankur_jain@newgen.co.in", "password");
	}

	@Test
	public void verifyUserLoginWithInvalidCredential() {
		user.openCBP();
		user.loginToCBP("invalidUserName", "invalidPassword");
	}

}