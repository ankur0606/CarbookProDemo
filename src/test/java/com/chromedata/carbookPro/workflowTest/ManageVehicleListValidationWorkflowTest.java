package com.chromedata.carbookPro.workflowTest;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynAnySeqHelper;
import org.openqa.selenium.WebDriver;

import com.chromedata.carbookPro.steps.serenity.UserDashboardSteps;
import com.chromedata.carbookPro.steps.serenity.UserLoginSteps;
import com.chromedata.carbookPro.utils.CbpParameters;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ManageVehicleListValidationWorkflowTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public UserLoginSteps loginStep;

	@Steps
	public UserDashboardSteps dashboardSteps;
	
	

	@Test
	public void ManageVehicleListValidationWorkflowTest() {
		loginStep.openCBP();
		loginStep.loginToCBP("ankur_jain@newgen.co.in", "password");

		dashboardSteps.setImplicitTimeout(30, TimeUnit.SECONDS);
		dashboardSteps.clickOnBuildAVehicle();
		
		String brandName = CbpParameters.getBrands();
		if (brandName.equalsIgnoreCase("/dashboard/brands/chrome-ca")
				|| brandName.equalsIgnoreCase("/dashboard/brands/isuzu-ca") || brandName.equalsIgnoreCase("/dashboard/brands/isuzu"))
			;
		else
			dashboardSteps.selectMode("Fleet");
		
		dashboardSteps.selectModelYear("2016");
		dashboardSteps.selectMakeforGmModel("GMC Specialty Vehicles");
		dashboardSteps.selectGmModel("Savana Commercial Cutaway");
		dashboardSteps.enablePegCheckBox();
		dashboardSteps.selectStyleFromList();
		dashboardSteps.selectPEG();
		dashboardSteps.openManageVehicleListTab();
		dashboardSteps.createFolderIcon();
		dashboardSteps.renameNewFolder();
		dashboardSteps.selectMyVehiclesFolder();
		/*dashboardSteps.selectVehicleFromList();
		dashboardSteps.deleteVehicleFromList();
		dashboardSteps.deleteVehicleConfirm();*/
		dashboardSteps.selectVehicleFromList();
		dashboardSteps.selectPencilIconForDefaultVehicle();
		dashboardSteps.renameVehiclePencilIcon();
		dashboardSteps.selectMyVehiclesFolder();
		
		
		

	}

}