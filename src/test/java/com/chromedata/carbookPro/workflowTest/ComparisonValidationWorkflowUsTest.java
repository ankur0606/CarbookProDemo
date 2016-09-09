package com.chromedata.carbookPro.workflowTest;

import java.util.concurrent.TimeUnit;

import org.junit.Assume;
import org.junit.Before;
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
public class ComparisonValidationWorkflowUsTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public UserLoginSteps loginStep;

	@Steps
	public UserDashboardSteps dashboardSteps;

	@Before
	public void checkCbpBrand() {
		String brandName = CbpParameters.getBrands();
		boolean condition = !((brandName.equalsIgnoreCase("/dashboard/brands/chrome-ca"))
				|| (brandName.equalsIgnoreCase("/dashboard/brands/isuzu-ca")));
		Assume.assumeTrue(condition);
	}

	@Test @Ignore
	public void ComparisonValidationWorkflowUsTest() {
		loginStep.openCBP();
		loginStep.loginToCBP("ankur_jain@newgen.co.in", "password");

		dashboardSteps.setImplicitTimeout(30, TimeUnit.SECONDS);

		dashboardSteps.openComparisonTab();
		// Selecting Vehicle ONE
		dashboardSteps.addNewVehicle();
		dashboardSteps.selectMode("Fleet");
		dashboardSteps.selectModelYear("2016");
		dashboardSteps.selectMakeforGmModel("Chevy Cars");
		dashboardSteps.selectGmModel("Camaro");
		dashboardSteps.enablePegCheckBox();
		dashboardSteps.selectStyleFromList();
		dashboardSteps.selectPEG();

		// Selecting Vehicle TWO
		dashboardSteps.addSavedVehicle();
		dashboardSteps.addNewVehicleFromSaved();
		dashboardSteps.pressSelectButtonFromSaved();

		// Selecting Vehicle THREE
		dashboardSteps.addNewVehicle();
		dashboardSteps.selectMode("Retail");
		dashboardSteps.selectModelYear("2016");
		dashboardSteps.selectMakeforGmModel("Chevy Cars");
		dashboardSteps.selectGmModel("Impala");
		dashboardSteps.enablePegCheckBox();
		dashboardSteps.selectStyleFromList();
		dashboardSteps.selectPEG();

		// Selecting Vehicle FOUR
		dashboardSteps.addSavedVehicle();
		dashboardSteps.addNewVehicleFromSaved();

		// Selecting Vehicle FIVE
		dashboardSteps.addNewVehicle();
		dashboardSteps.selectMode("Fleet");
		dashboardSteps.selectModelYear("2016");
		dashboardSteps.selectMakeforGmModel("Chevy Chassis-Cabs");
		dashboardSteps.selectGmModel("Silverado 3500HD");
		dashboardSteps.enablePegCheckBox();
		dashboardSteps.selectStyleFromList();
		dashboardSteps.selectPEG();

	}

}