package com.chromedata.carbookPro.steps.serenity;

import java.util.concurrent.TimeUnit;

import com.chromedata.carbookPro.pages.DashboardPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserDashboardSteps extends ScenarioSteps {

	DashboardPage dashboardPage;

	public void setImplicitTimeout(int duration, TimeUnit timeUnit) {
		dashboardPage.setImplicitTimeout(duration, timeUnit);

	}

	@Step
	public void clickOnBuildAVehicle() {
		// TODO Auto-generated method stub
		dashboardPage.clickOnBuildAVehicle();

	}

	@Step
	public void selectMode(String mode) {
		// TODO Auto-generated method stub
		dashboardPage.selectMode(mode);
	}

	@Step
	public void selectModelYear(String modelYear) {
		// TODO Auto-generated method stub
		dashboardPage.selectModelYear(modelYear);
	}

	@Step
	public void selectMakeforGmModel(String gmModelMake) {
		// TODO Auto-generated method stub
		dashboardPage.selectMakeforGmModel(gmModelMake);
	}

	@Step
	public void selectGmModel(String gmModel) {
		// TODO Auto-generated method stub
		dashboardPage.selectGmModel(gmModel);

	}

	@Step
	public void enablePegCheckBox() {
		// TODO Auto-generated method stub
		dashboardPage.enablePegCheckBox();
	}

	@Step
	public void selectStyleFromList() {
		// TODO Auto-generated method stub
		dashboardPage.selectStyleFromList();

	}

	@Step
	public void selectPEG() {
		// TODO Auto-generated method stub
		dashboardPage.selectPEG();

	}

	@Step
	public void verifyStandardEquipmentTab() {
		// TODO Auto-generated method stub
		dashboardPage.verifyStandardEquipmentTab();
	}

	@Step
	public void verifyReportsTab() {
		// TODO Auto-generated method stub
		dashboardPage.verifyReportsTab();

	}

	@Step
	public void editContactInfo() {
		// TODO Auto-generated method stub
		dashboardPage.editContactInfo();

	}

	@Step
	public void enterContactDetails() {
		dashboardPage.enterContactInformation();
	}

	@Step
	public void clickSave() {
		// TODO Auto-generated method stub
		dashboardPage.clickSave();

	}

	@Step
	public void removeAllPageBreak() {
		// TODO Auto-generated method stub
		dashboardPage.removeAllPageBreak();
	}

	@Step
	public void addOnePageBreak() {
		// TODO Auto-generated method stub
		dashboardPage.addOnePageBreak();
	}

	@Step
	public void removeOnePageBreak() {
		// TODO Auto-generated method stub
		dashboardPage.removeOnePageBreak();
	}

	@Step
	public void addAllPageBreak() {
		// TODO Auto-generated method stub
		dashboardPage.addAllPageBreak();

	}

	@Step
	public void movePriceSummaryUp() {
		// TODO Auto-generated method stub
		dashboardPage.movePriceSummaryUp();

	}

	@Step
	public void movePriceSummaryDown() {
		// TODO Auto-generated method stub
		dashboardPage.movePriceSummaryDown();
	}

	@Step
	public void selectPriceSummary() {
		// TODO Auto-generated method stub
		dashboardPage.selectPriceSummary();
	}

	@Step
	public void verifyQuoteWorksheetTab() {
		// TODO Auto-generated method stub
		dashboardPage.verifyQuoteWorksheetTab();

	}

	@Step
	public void addItem1() {
		// TODO Auto-generated method stub
		dashboardPage.addItem1();
	}

	@Step
	public void userItemName1() {
		// TODO Auto-generated method stub
		dashboardPage.userItemName1();
	}

	@Step
	public void userItemPrice1() {
		// TODO Auto-generated method stub
		dashboardPage.userItemPrice1();

	}

	@Step
	public void saveIcon() {
		// TODO Auto-generated method stub
		dashboardPage.saveIcon();
	}

	@Step
	public void saveName() {
		dashboardPage.saveName();
	}

	@Step
	public void saveQuote() {
		// TODO Auto-generated method stub
		dashboardPage.saveQuote();
	}

	@Step
	public void openQuote() {
		// TODO Auto-generated method stub
		dashboardPage.openQuote();
	}

	@Step
	public void selectQuote() {
		// TODO Auto-generated method stub
		dashboardPage.selectQuote();
	}

	@Step
	public void openManageVehicleListTab() {
		// TODO Auto-generated method stub
		dashboardPage.openManageVehicleListTab();
	}

	@Step
	public void createFolderIcon() {
		// TODO Auto-generated method stub
		dashboardPage.createFolderIcon();
	}

	@Step
	public void renameNewFolder() {
		// TODO Auto-generated method stub
		dashboardPage.renameNewFolder();

	}

	@Step
	public void selectMyVehiclesFolder() {
		// TODO Auto-generated method stub
		dashboardPage.selectMyVehiclesFolder();
	}

	@Step
	public void selectVehicleFromList() {
		// TODO Auto-generated method stub
		dashboardPage.selectVehicleFromList();
	}

	@Step
	public void deleteVehicleFromList() {
		// TODO Auto-generated method stub
		dashboardPage.deleteVehicleFromList();

	}

	@Step
	public void deleteVehicleConfirm() {
		// TODO Auto-generated method stub
		dashboardPage.deleteVehicleConfirm();
	}

	@Step
	public void deleteQuote() {
		// TODO Auto-generated method stub
		dashboardPage.deleteQuote();

	}

	@Step
	public void openComparisonTab() {
		// TODO Auto-generated method stub
		dashboardPage.openComparisonTab();
	}

	@Step
	public void addNewVehicle() {
		// TODO Auto-generated method stub
		dashboardPage.addNewVehicle();

	}

	@Step
	public void addSavedVehicle() {
		// TODO Auto-generated method stub
		dashboardPage.addSavedVehicle();
	}

	@Step
	public void addNewVehicleHover() {
		// TODO Auto-generated method stub
dashboardPage.addNewVehicleHover();
	}

}