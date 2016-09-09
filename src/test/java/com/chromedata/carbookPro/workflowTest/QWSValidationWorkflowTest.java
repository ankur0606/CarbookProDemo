package com.chromedata.carbookPro.workflowTest;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.chromedata.carbookPro.steps.serenity.UserDashboardSteps;
import com.chromedata.carbookPro.steps.serenity.UserLoginSteps;
import com.chromedata.carbookPro.utils.CbpParameters;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class QWSValidationWorkflowTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public UserLoginSteps loginStep;

	@Steps
	public UserDashboardSteps dashboardSteps;

	@Test
	public void QWSValidationWorkflowTest() {
		loginStep.openCBP();
		loginStep.loginToCBP("ankur_jain@newgen.co.in", "password");

		dashboardSteps.setImplicitTimeout(30, TimeUnit.SECONDS);
		dashboardSteps.clickOnBuildAVehicle();
		// mode selection logic
		String brandName = CbpParameters.getBrands();
		if (brandName.equalsIgnoreCase("/dashboard/brands/chrome-ca")
				|| brandName.equalsIgnoreCase("/dashboard/brands/isuzu-ca") || brandName.equalsIgnoreCase("/dashboard/brands/isuzu"))
			;
		else
			dashboardSteps.selectMode("Fleet");

		dashboardSteps.selectModelYear("2016");
		dashboardSteps.selectMakeforGmModel("Chevy Pickups");
		dashboardSteps.selectGmModel("Colorado");
		dashboardSteps.enablePegCheckBox();
		dashboardSteps.selectStyleFromList();
		dashboardSteps.selectPEG();
		dashboardSteps.verifyQuoteWorksheetTab();
		dashboardSteps.addItem1();
		dashboardSteps.saveIcon();
		dashboardSteps.saveName();
		dashboardSteps.saveQuote();
		dashboardSteps.openQuote();
		dashboardSteps.selectQuote();
		dashboardSteps.deleteQuote();

	}

}