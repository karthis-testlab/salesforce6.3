package com.salesforce.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.Assertions;
import com.framework.utils.PropertyHandler;
import com.framework.utils.WaitUtils;

import org.joda.time.DateTime;

public class FilesPage extends ProjectSpecificMethods {

	public static String FileName = null;

	public static List<String> dateStrings = null;
	DateTime mostRecentDate = null;

	private static String DownloadedFileExtension = null;

	private static String DownloadedFileName = null;

	Robot robot;

	public FilesPage() {
		dateStrings = new ArrayList<String>();
	}

	WebElement ddNavigationMenu = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "NavigationMenu.dropdown"));

	List<WebElement> optionsSeviceConsole = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "SeviceConsole.options"));

	WebElement tblHeaderLastModified = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "HeaderLastModified.table"));

	List<WebElement> dateLastModifiedDate = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "LastModifiedDate.date"));

	List<WebElement> colTitle = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "Title.column"));

	List<WebElement> tblFiles = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "Files.table"));

	List<WebElement> tblFilesColumn = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "FilesColumn.table"));

	WebElement linkPublic = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "Public.link"));

	WebElement toggleExpirationDate = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "ExpirationDate.toggle"));

	WebElement btnCreateLink = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "CreateLink.button"));

	WebElement btnCreate = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "Create.button"));

	WebElement btnCopyLink = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "CopyLink.button"));

	WebElement txtReadOnlyPublicUrl = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "ReadOnlyPublicUrl.text"));

	WebElement btnClosePopup = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "ClosePopup.button"));

	WebElement btnDownload = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "Download.button"));

	WebElement btnShare = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "Share.button"));

	WebElement txtSearchPeople = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "SearchPeople.textbox"));

	WebElement modalPeopleResults = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "PeopleResults.modal"));

	List<WebElement> tblpeopleResults = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "peopleResults.table"));

	WebElement errorMessageCannotShare = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "errorMessageCannotShare.popup"));

	WebElement deleteShareWith = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "deleteShareWith.button"));

	WebElement txtAddMessage = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "AddMessage.textbox"));

	WebElement successMessageShare = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "MessageShare.popup"));

	WebElement btnUpload = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "Upload.button"));

	WebElement messageSuccessUpload = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "SuccessUpload.popup"));

	WebElement messageFileUpload = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "FileUpload.popup"));

	WebElement btnDone = locateElement(Locators.XPATH, PropertyHandler.readObjectProperty("FilesPage", "Done.button"));

	List<WebElement> ddAction = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "Action.dropdown"));

	List<WebElement> listActionOptions = locateElements(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "ActionOptions.options"));

	WebElement labelFileName = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "FileName.label"));

	WebElement lblFileExtension = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "FileExtension.label"));

	WebElement btnCloseTestCase = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "CloseTestCase.button"));

	WebElement hdrDeletePopup = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "DeletePopup.header"));

	WebElement btnDelete = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "Delete.button"));

	WebElement messageSuccessDelete = locateElement(Locators.XPATH,
			PropertyHandler.readObjectProperty("FilesPage", "SuccessDelete.popup"));

	public static String getDownloadedFileName() {
		return DownloadedFileName;

	}

	public static String getDownloadedFileExtension() {
		return DownloadedFileExtension;

	}
	// Select service console Option

	public FilesPage selectServiceConsoleOption() {
		clickUsingJs(ddNavigationMenu);
		selectDropDownUsingValue(ddNavigationMenu, "Files");
		return this;
	}

	public int identifyRecentDate() {
		int rowCount = 0;
		try {
			for (int i = 0; i <= (dateLastModifiedDate.size()) - 1; i++) {
				dateStrings.add(dateLastModifiedDate.get(i).getText().trim());
			}
			for (int j = 0; j <= (dateStrings.size()) - 1; j++) {
				DateTime date = convertDateToSpecifiedFormat(dateStrings.get(j));
				dates.add(date);
			}
			for (int i = 0; i <= (dates.size()) - 1; i++) {
				if (mostRecentDate == null || dates.get(i).isAfter(mostRecentDate)) {
					mostRecentDate = dates.get(i);
					rowCount = i;
				}
			}

		} catch (java.lang.IndexOutOfBoundsException e) {
			Assertions.assertFail("Failed due to Index Out of bound" + e);
		} catch (Exception e) {
			Assertions.assertFail("Failed due to " + e);
		}
		return rowCount;

	}

	// Select the recent File and download

	public FilesPage openRecentFile(String Title) {
		int value = this.identifyRecentDate();
		try {
			for (int i = 0; i <= (colTitle.size()) - 1; i++) {
				if (colTitle.get(i).getText().trim().equals(Title)) {

					for (int j = 0; j <= (tblFiles.size()) - 1; j++) {
						if (j == value) {
							WebElement FileLink = getDriver()
									.findElement(By.xpath("//table[@data-aura-class='uiVirtualDataTable']//tbody//tr["
											+ j + "]//th[" + i + "]//a"));
							DownloadedFileExtension = getDriver()
									.findElement(By.xpath("//table[@data-aura-class='uiVirtualDataTable']//tbody//tr["
											+ j + "]//th[" + i + "]//a//span[@class='slds-assistive-text']"))
									.getText().trim();
							DownloadedFileName = getDriver().findElement(By.xpath(
									"(//*[@class='itemTitle desktop outputTextOverride uiOutputText'])[" + j + "]"))
									.getText().trim();
							clickUsingJs(FileLink);

						}

					}
				}

			}
		} catch (Exception e) {
			Assertions.assertFail("Unable to download the file due to " + e);
		}
		return this;
	}

	public FilesPage downloadFile() {
		new WaitUtils().waitForElementToBeVisible(btnDownload);
		clickUsingJs(btnDownload);
		return this;
	}

	// verify the file is downloaded in the project

	public FilesPage verifyFileDownload() {
		try {
			File file = new File(downloadDir, FilesPage.DownloadedFileName);
			if (file.exists() && file.isFile()) {
				Assertions.assertTrue(true, "File is successfully downloaded");
				reportStep("File is successfully downloaded", "pass");
			}
		} catch (Exception e) {
			Assertions.assertFail("File is not downloaded due to " + e);
			reportStep("File is not downloaded due to", "fail");
		}
		return this;
	}

	public boolean isFileAlreadyUploaded() {
		boolean flag = false;
		try {
			for (int i = 0; i <= (tblFilesColumn.size()) - 1; i++) {
				if (tblFilesColumn.get(i).getText()
						.equals(PropertyHandler.readObjectProperty("FilesPage", "FileName"))) {
					flag = true;
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	// Upload File

	public FilesPage uploadFile() throws AWTException, IOException {
		try {
			robot = new Robot();
			int Suffix = 1;
			String ModifiedFileName = null;
			String Path = PropertyHandler.readObjectProperty("FilesPage", "UploadFolder");
			if (Path != null && Path.isEmpty()) { // Check if UploadFolder is not empty or null
				clickUsingJs(btnUpload);
				robot.delay(5000);
//				String DesiredUploadFileName = property.getProperty("FileName");
				String DesiredUploadFileName = PropertyHandler.readObjectProperty("FilesPage", "FileName");
				String UploadFilePath = ProjectRoot + File.separator + Path + File.separator + DesiredUploadFileName;
				File file = new File(UploadFilePath, DesiredUploadFileName);
				while (file.exists() && this.isFileAlreadyUploaded() == true) {
					ModifiedFileName = DesiredUploadFileName + "_" + Suffix;
					UploadFilePath = ProjectRoot + File.separator + Path + File.separator + ModifiedFileName;
					file = new File(UploadFilePath);
					Suffix++;
				}
				StringSelection selection = new StringSelection(UploadFilePath);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			} else {
				// Handle the case where UploadFolder is empty or null
			}
		} catch (Exception e) {
			Assertions.assertFail("Unable to upload the file due to" + e);
		}
		return this;
	}

	public FilesPage verifyUploadIsSuccess() {
		try {
			verifyDisplayed(messageSuccessUpload);
			reportStep("Success Toaster Message", "pass");
		} catch (Exception e) {
			reportStep("Success Toaster Message is not displayed", "fail");
		}
		return this;
	}

	// Clicking on Public Link
	public FilesPage clickPublicLink() {
		try {
			clickUsingJs(linkPublic);
		} catch (Exception e) {
			Assertions.assertFail("Unable to click pn Public Link due to " + e);
		}
		return this;
	}

	// Disable the toggle button
	public FilesPage disableToggleButton() {
		try {
			clickUsingJs(toggleExpirationDate);

		} catch (Exception e) {
			Assertions.assertFail("Unable to select the Toggle Button due to " + e);
		}
		return this;
	}

	// verify the link is generated
	public FilesPage verifyLinkIsGenerated() {
		try {
			verifyDisplayed(txtReadOnlyPublicUrl);
		} catch (Exception e) {
			Assertions.assertFail("Element is not displayed due to" + e);
		}
		clickUsingJs(btnClosePopup);
		return this;
	}

	// Clicking on Sharing
	public FilesPage clickShare() {
		try {
			verifyDisplayed(btnShare);
			clickUsingJs(btnShare);
		} catch (Exception e) {
			Assertions.assertFail("Unable to click on Share due to " + e);
		}
		return this;
	}

	// Verify the error message
	public FilesPage veriFyErrorMessageWhileSharing() {
		try {
			append(txtSearchPeople, PropertyHandler.readObjectProperty("FilesPage", "InvalidSearchNameInSharing"));
			pressEnter();
			checkWindowHandles();
			new WaitUtils().waitForElementToBeVisible(modalPeopleResults);
			for (int i = 0; i <= (tblpeopleResults.size()) - 1; i++) {
				clickUsingJs(tblpeopleResults.get(i));
				defaultContent();
				new WaitUtils().waitForElementToBeVisible(errorMessageCannotShare);
				verifyExactText(errorMessageCannotShare, "Error Message");
				click(btnClosePopup);
			}
		} catch (Exception e) {
			Assertions.assertFail("Unable to search for Invalid User due to " + e);
		}

		return this;
	}

}
