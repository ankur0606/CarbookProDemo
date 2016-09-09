package com.chromedata.carbookPro.workflowTest;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.chromedata.carbookPro.steps.serenity.UserDashboardSteps;
import com.chromedata.carbookPro.steps.serenity.UserLoginSteps;
import com.chromedata.carbookPro.utils.CbpParameters;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/testData/CBPTestData.csv")
public class VechicleSelectionWorkflowTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public UserLoginSteps loginStep;

	@Steps
	public UserDashboardSteps dashboardSteps;

	private String mode;
	private String modelYear;
	private String make;
	private String model;

	public void setMode(String mode) {
		this.mode = mode;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Test

	public void verifyVechicleSelectionWorkflow() {
		loginStep.openCBP();
		loginStep.loginToCBP("ankur_jain@newgen.co.in", "password");

		dashboardSteps.setImplicitTimeout(30, TimeUnit.SECONDS);
		dashboardSteps.clickOnBuildAVehicle();

		String brandName = CbpParameters.getBrands();
		if (brandName.equalsIgnoreCase("/dashboard/brands/chrome-ca")
				|| brandName.equalsIgnoreCase("/dashboard/brands/isuzu-ca") || brandName.equalsIgnoreCase("/dashboard/brands/isuzu"))
			;
		else
			dashboardSteps.selectMode(mode);

		dashboardSteps.selectModelYear(modelYear);
		dashboardSteps.selectMakeforGmModel(make);
		dashboardSteps.selectGmModel(model);
		dashboardSteps.enablePegCheckBox();
		dashboardSteps.selectStyleFromList();
		dashboardSteps.selectPEG();
		dashboardSteps.openManageVehicleListTab();
		dashboardSteps.verifyQuoteWorksheetTab();
		dashboardSteps.verifyReportsTab();
		dashboardSteps.verifyStandardEquipmentTab();
		dashboardSteps.selectCategory("interior");
		dashboardSteps.selectCategory("safety-interior");
		dashboardSteps.selectCategory("exterior");
		dashboardSteps.selectCategory("safety-mechanical");
		dashboardSteps.selectCategory("mechanical");
		dashboardSteps.selectCategory("Warranty");
		dashboardSteps.selectCategory("entertainment");
		dashboardSteps.verifyTechSpecs();

	}

}