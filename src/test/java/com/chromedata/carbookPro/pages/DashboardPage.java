package com.chromedata.carbookPro.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DashboardPage extends PageObject {
	@Override
	public void setImplicitTimeout(int duration, TimeUnit unit) {
		// TODO Auto-generated method stub
		super.setImplicitTimeout(duration, unit);
	}

	@FindBy(css = "select[class='gwt-ListBox component-selector-mode-input']")
	private WebElementFacade modeElement;

	@FindBy(xpath = "html/body/table/tbody/tr[1]/td/table/tbody/tr/td[4]/table/tbody/tr/td[1]/div/table/tbody/tr/td[1]/img")
	private WebElementFacade buildVehicleButton;

	@FindBy(css = "select[class='gwt-ListBox component-selector-year-input']")
	private WebElementFacade modelYearDropDown;

	@FindBy(css = "select[class='gwt-ListBox component-selector-make-input']")
	private WebElementFacade modelMakeDropDown;

	@FindBy(css = "select[class='gwt-ListBox component-selector-model-input']")
	private WebElementFacade modelDropDown;

	@FindBy(name = "auto")
	private WebElementFacade pegCheckBox;

	@FindBy(css = "select[class='select[class='gwt-ListBox component-selector-model-input']")
	private WebElementFacade selectStyleFromList;

	@FindBy(xpath = "html/body/div[9]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[2]/td/div/fieldset/div[3]/div/table/thead/tr[3]/th[2]/div")
	private WebElementFacade selectPegButton;

	@FindBy(xpath = "//*[contains(text(), 'Standard Equipment')]")
	private WebElementFacade selectStandardEquipment;

	@FindBy(xpath = "//*[contains(text(), 'Reports')]")
	private WebElementFacade selectReports;

	@FindBy(css = "img[class='gwt-Image repInline'][src='reports/images/toolbar/contact_off.gif']")
	private WebElementFacade selectEditContactInfo;

	@FindBy(xpath = "//*[starts-with(text(), 'Save')]")
	private WebElementFacade saveButton;

	@FindBy(css = "img[src='reports/images/toolbar/removeall_off.gif']")
	private WebElementFacade removeAllButton;

	@FindBy(css = "img[src='reports/images/toolbar/addone_off.gif']")
	private WebElementFacade addOneButton;

	@FindBy(css = "img[src='reports/images/toolbar/remove_one_off.gif']")
	private WebElementFacade removeOneButton;

	@FindBy(css = "img[src='reports/images/toolbar/addall_off.gif']")
	private WebElementFacade addAllButton;

	@FindBy(css = "img[src='reports/images/toolbar/moveup_off.gif']")
	private WebElementFacade upButton;

	@FindBy(css = "img[src='reports/images/toolbar/movedown_off.gif']")
	private WebElementFacade downButton;

	@FindBy(xpath = "//*[contains(text(), 'Table of Contents')]")
	private WebElementFacade priceSummarySelect;

	@FindBy(xpath = "//*[contains(text(), 'Quote Worksheet')]")
	private WebElementFacade quoteWorksheetTab;

	@FindBy(xpath = "//*[contains(text(), 'Add Item+')]")
	private WebElementFacade item1;

	@FindBy(xpath = "html/body/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[3]/div/div/div/table[4]/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[1]/div/div[2]/div")
	private WebElementFacade itemName1;

	@FindBy(xpath = "html/body/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div[3]/div/div/div/table[4]/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[3]/div/div")
	private WebElementFacade itemPrice1;

	@FindBy(xpath = "//*[contains(text(), 'Save Quote')]")
	private WebElementFacade quoteIcon;

	@FindBy(css = "input[class='gwt-TextBox'][type='text']")
	private WebElementFacade quoteNameSave;

	// important
	@FindBy(xpath = "//tbody/tr[2]/td/div/div[3]/div[@class='html-face']")
	private WebElementFacade quoteSave;

	@FindBy(xpath = "//*[contains(text(), 'Open Quote')]")
	private WebElementFacade quoteOpenButton;

	/*
	 * @FindBy(css = "//tbody/tr[1]/td/div/div[3]/div[@class='html-face']")
	 * private WebElementFacade quoteSelect;
	 */

	@FindBy(xpath = "//*[contains(text(), 'Delete Selected Quotes')]")
	private WebElementFacade quoteDelete;

	@FindBy(xpath = "//*[contains(text(), 'Manage Vehicle List')]")
	private WebElementFacade selectMvlTab;

	@FindBy(css = "img[src='managevehiclelist/images/create_folder_off.jpg']")
	private WebElementFacade MvlNewFolder;

	@FindBy(css = "img[src='common/image/icons/icon_pencil_edit_disabled.gif']")
	private WebElementFacade vehicleSelectFromList;

	@FindBy(css = "img[src='managevehiclelist/images/delete_vehicle_off.jpg']")
	private WebElementFacade vehicleDelete;

	@FindBy(xpath = "//*[contains(text(), 'Comparison')]")
	private WebElementFacade comparisonTab;

	@FindBy(css = "div[class='addNewVehicle']")
	private WebElementFacade newVehicleAdd;

	@FindBy(css = "div[class='addNewVehicle Hover']")
	private WebElementFacade newVehicleHoverAdd;

	@FindBy(css = "div[class='addSavedVehicle']")
	private WebElementFacade newVehicleSaved;

	private TimeUnit seconds;

	public void clickOnBuildAVehicle() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buildVehicleButton.waitUntilClickable();
		buildVehicleButton.click();
	}

	public void selectMode(String mode) {

		modeElement.selectByVisibleText(mode);

	}

	public void selectModelYear(String modelYear) {
		modelYearDropDown.waitUntilVisible().selectByVisibleText(modelYear);
		// TODO Auto-generated method stub

	}

	public void selectMakeforGmModel(String gmModelMake) {
		modelMakeDropDown.selectByVisibleText(gmModelMake);

	}

	public void selectGmModel(String gmModel) {
		// TODO Auto-generated method stub
		modelDropDown.selectByVisibleText(gmModel);

	}

	public void enablePegCheckBox() {
		if (pegCheckBox.isCurrentlyEnabled())
			;
		else
			pegCheckBox.click();

	}

	public void selectStyleFromList() {
		try {
			Thread.sleep(2000);
		} catch (Exception ex) {

		}

		// get table
		List<WebElement> tableELement = getDriver()
				.findElement(org.openqa.selenium.By.cssSelector("table[class='style-cellTableWidget']"))
				.findElement(org.openqa.selenium.By.tagName("tbody"))
				.findElements(org.openqa.selenium.By.tagName("tr"));

		// select style row
		if (tableELement.size() == 0)
			Assert.fail();
		else {
			waitFor(tableELement.get(1).findElement(org.openqa.selenium.By.tagName("td"))).click();
		}

	}

	public void selectPEG() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<WebElement> pgElement = getDriver().findElements(org.openqa.selenium.By.className("peg-pegButton"));
		pgElement.get(1).findElement(org.openqa.selenium.By.tagName("div")).click();
		System.out.println("### total elements avaialble ##" + pgElement.size());
		/*
		 * WebElement pegElement =
		 * getDriver().findElement(By.cssSelector("tr[class='peg-headerRow3']"))
		 * .findElement(By.xpath("//*[contains(text(), 'Select')]")); Actions
		 * action = new Actions(getDriver());
		 * action.doubleClick(pegElement).build().perform();
		 */
	}

	public void verifyStandardEquipmentTab() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectStandardEquipment.waitUntilClickable().click();

	}

	public void verifyReportsTab() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectReports.waitUntilVisible().click();

	}

	public void editContactInfo() {
		// TODO Auto-generated method stub
		selectEditContactInfo.waitUntilClickable().click();

	}

	public void enterContactInformation() {
		List<WebElement> contactTables = getDriver()
				.findElements(org.openqa.selenium.By.cssSelector("table[class='repContactInfoTable']"));
		int loopVar = 0;
		for (WebElement table : contactTables) {
			List<WebElement> rows = table.findElements(org.openqa.selenium.By.tagName("tr"));
			for (WebElement row : rows) {
				String name = row.findElement(org.openqa.selenium.By.tagName("td")).getText();
				if (name.equalsIgnoreCase("name")) {
					row.findElement(org.openqa.selenium.By.tagName("input")).clear();
					row.findElement(org.openqa.selenium.By.tagName("input")).sendKeys("test_" + loopVar + name);
				} else if (name.equalsIgnoreCase("company")) {
					row.findElement(org.openqa.selenium.By.tagName("input")).clear();
					row.findElement(org.openqa.selenium.By.tagName("input")).sendKeys("test company_" + loopVar);
				} else if (name.equalsIgnoreCase("phone")) {
					row.findElement(org.openqa.selenium.By.tagName("input")).clear();
					row.findElement(org.openqa.selenium.By.tagName("input")).sendKeys("9876543210");
				} else if (name.equalsIgnoreCase("email")) {
					row.findElement(org.openqa.selenium.By.tagName("input")).clear();
					row.findElement(org.openqa.selenium.By.tagName("input")).sendKeys("test_" + loopVar + "@gmail.com");
				}
			}
			loopVar++;
		}
	}

	public void clickSave() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getDriver().findElement(org.openqa.selenium.By.cssSelector("table[class='repFloatRight']"))
				.findElement(org.openqa.selenium.By.tagName("tr")).findElement(org.openqa.selenium.By.tagName("td"))
				.findElement(org.openqa.selenium.By.tagName("div")).click();
		// saveButton.click();

	}

	public void removeAllPageBreak() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addAllButton.waitUntilClickable().click();
	}

	public void addOnePageBreak() {
		// TODO Auto-generated method stub
		addOneButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void removeOnePageBreak() {
		// TODO Auto-generated method stub
		removeOneButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addAllPageBreak() {
		// TODO Auto-generated method stub
		addAllButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void movePriceSummaryUp() {
		// TODO Auto-generated method stub
		upButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void movePriceSummaryDown() {
		// TODO Auto-generated method stub
		downButton.click();
	}

	public void selectPriceSummary() {
		// TODO Auto-generated method stub
		priceSummarySelect.waitUntilEnabled().click();

	}

	public void verifyQuoteWorksheetTab() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		quoteWorksheetTab.waitUntilClickable().click();

	}

	public void addItem1() {
		// TODO Auto-generated method stub
		item1.waitUntilClickable().click();
		// add item

		/*
		 * getDriver().findElement(By.cssSelector(
		 * "table[class='qwsTableContainer']")).findElements(By.tagName("tr"))
		 * .get(1).findElements(By.tagName("td")).get(0).findElement(By.tagName(
		 * "div")).findElements(By.tagName("Div")).get(1).click();
		 */
	}

	public void userItemName1() {
		// TODO Auto-generated method stub
		Actions Action = new Actions(getDriver());
		Action.doubleClick(itemName1).build().perform();
		itemName1.sendKeys("this is item name");
	}

	public void userItemPrice1() {
		// TODO Auto-generated method stub
		Actions Action = new Actions(getDriver());
		Action.doubleClick(itemPrice1).perform();
		itemName1.sendKeys("100");

	}

	public void saveIcon() {
		// TODO Auto-generated method stub
		quoteIcon.waitUntilClickable().click();
	}

	public void saveName() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name = "testName_" + System.currentTimeMillis();
		getDriver().findElement(By.cssSelector("div[class='saveAsContainer']")).findElement(By.tagName("input"))
				.clear();
		getDriver().findElement(By.cssSelector("div[class='saveAsContainer']")).findElement(By.tagName("input"))
				.sendKeys(name);
	}

	public void saveQuote() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		quoteSave.waitUntilEnabled().click();

		/*
		 * int rows = getDriver().findElement(By.
		 * cssSelector("div[class='dialogMiddleCenterInner dialogContent']"))
		 * .findElement(By.tagName("table")).findElements(By.tagName("tr")).size
		 * (); System.out.println("#### totoal rows" + rows);
		 *//*
			 * try { Thread.sleep(2000); } catch (InterruptedException e) { //
			 * TODO Auto-generated catch block e.printStackTrace(); }
			 * quoteSave.waitUntilClickable().click();
			 * getDriver().findElement(By.
			 * cssSelector("div[class='dialogMiddleCenterInner dialogContent']"
			 * ))
			 * .findElement(By.xpath("//*[contains(text(), 'Save')]")).click();
			 */
	}

	public void openQuote() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		quoteOpenButton.waitUntilEnabled().click();
	}

	public void selectQuote() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getDriver().findElement(By.cssSelector("div[class='quoteListContainer']")).findElement(By.tagName("table"))
				.findElement(By.tagName("tbody")).findElements(By.tagName("tr")).get(1).findElements(By.tagName("td"))
				.get(0).click();

	}

	public void deleteQuote() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		quoteDelete.waitUntilVisible().click();

		Alert alert = getDriver().switchTo().alert();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alert.accept();
	}

	public void openManageVehicleListTab() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectMvlTab.waitUntilClickable().click();

	}

	public void createFolderIcon() {
		// TODO Auto-generated method stub
		MvlNewFolder.waitUntilClickable().click();
	}

	public void renameNewFolder() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// get vehicle folder table
		List<WebElement> tableList = getDriver()
				.findElement(org.openqa.selenium.By.cssSelector("div[class='manage-vehicle-folder-holder']"))
				.findElements(By.tagName("table"));
		// get element from above table
		tableList.get(tableList.size() - 1).findElement(By.tagName("input"))
				.sendKeys("testFoldername_" + System.currentTimeMillis());
	}

	public void selectMyVehiclesFolder() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> tableList = getDriver()
				.findElement(org.openqa.selenium.By.cssSelector("div[class='manage-vehicle-folder-holder']"))
				.findElements(By.tagName("table"));

		tableList.get(0).findElement(By.tagName("tr")).findElement(By.tagName("img")).click();
	}

	public void selectVehicleFromList() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vehicleSelectFromList.waitUntilClickable().click();

	}

	public void deleteVehicleFromList() {
		// TODO Auto-generated method stub
		vehicleDelete.waitUntilClickable().click();

	}

	public void deleteVehicleConfirm() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			getDriver().findElement(By.cssSelector("manage-vehicle-decisionpanel-confirmation-align"))
					.findElement(By.tagName("tr")).findElements(By.tagName("td")).get(0).findElement(By.tagName("div"))
					.click();

		}

	}

	public void openComparisonTab() {
		// TODO Auto-generated method stub

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		comparisonTab.waitUntilVisible().click();
	}

	public void addNewVehicle() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		newVehicleAdd.waitUntilVisible().click();
	}

	public void addSavedVehicle() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		newVehicleSaved.waitUntilClickable().click();
	}

	public void addNewVehicleHover() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		newVehicleHoverAdd.waitUntilVisible().click();
	}

}