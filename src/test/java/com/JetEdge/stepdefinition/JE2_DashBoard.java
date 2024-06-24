package com.JetEdge.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JE2_DashBoard {

	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check Dashboard User is navigating to JetEdge Signin URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@And("To Check Dashboard Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@Then("click the SignIn button for Dashboard Check")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@And("Check the home page")
	public void Check_the_home_page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lblMainHeader")));
		boolean status = driver.findElement(By.id("lblMainHeader")).isDisplayed();
		System.out.println(status);
	}



	@And("Select a month in the calendar")
	public void Select_a_month_in_the_calendar() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtFromDate")));
		driver.findElement(By.id("ContentPlaceHolder1_txtFromDate")).click();
		//Select the january month
		driver.findElement(By.id("cal1_month_0_0")).click();
	}

	@And("Check the month in Tail Status")
	public void Check_the_month_in_Tail_Status() throws InterruptedException {
		Thread.sleep(15000);
		ele=driver.findElement(By.id("ContentPlaceHolder1_lblPLMonth"));
		String DisplayedMonth = ele.getText();
		System.out.println(DisplayedMonth);
	}

	@Then("close the Dashboard Page")
	public void close_the_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@And("Click a tail in the Grid")
	public void Click_a_tail_in_the_Grid() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvTailwise_lblTail_0")));
		driver.findElement(By.id("ContentPlaceHolder1_gvTailwise_lblTail_0")).click();
	}

	@And("Check Landing Page")
	public void Check_Landing_Page() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnLock")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnLock"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		if(ele.isDisplayed())
		{
			System.out.println("Page landed to : " + text + "Page");
		}
	}

	@Then("Enter {string} in the notes field")
	public void enter_in_the_notes_field(String Notes) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtLockNotes")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtLockNotes"));
		ele.clear();
		ele.sendKeys(Notes);
	}

	@And("Click UnLock report button")
	public void click_un_lock_report_button() {
		String ExpectedText="Un-Lock Report";
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnLock"));
		String ActualText = ele.getAttribute("value");
		System.out.println(ActualText);
		if(ActualText.equals(ExpectedText)) {
			ele.click();
		}
		else {
			System.out.println("Report is already Unlocked");
		}
	}

	@Then("Clear the notes field")
	public void Clear_the_notes_field() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtLockNotes")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtLockNotes"));
		ele.clear();
	}

	@And("Check Mandatory pop is shown or not")
	public void check_mandatory_pop_is_shown_or_not() {
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnLock"));
		ele.click();
		try {
			// Wait for a maximum of 5 seconds for the alert to be present
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Alert message is displayed!");

			// Optionally, retrieve and handle the alert text
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println("Alert text: " + alertText);
			alert.dismiss(); // Accept or dismiss the alert as needed

		} catch (NoAlertPresentException e) {
			// If no alert is present within the timeout, handle the scenario (optional)
			System.out.println("No alert message displayed.");
		}
	}

	@And("Click Lock report button")
	public void click_Lock_report_button() {
		String ExpectedText="Lock Report";
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnLock"));
		String ActualText = ele.getAttribute("value");
		System.out.println(ActualText);
		if(ActualText.equals(ExpectedText)) {
			ele.click();
		}
		else {
			System.out.println("Report is already Unlocked");
		}
	}

	@When("Click the Hide Transaction button")
	public void click_the_Hide_Transaction_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("liStep1")));
		driver.findElement(By.id("liStep1")).click();
	}

	@And("Click the Expense Radio button")
	public void click_the_Expense_Radio_button() {
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoReportType_0"));
		if (ele.isSelected()) {
			System.out.println("Radio button is already clicked!");
		} else {
			System.out.println("Radio button is not clicked.");
			ele.click();
		}
	}

	@Then("Select any expense from the dropdown")
	public void Select_any_expense_from_the_dropdown() throws InterruptedException {
		String ExpectedExpense="Landing and Navigation Cost";
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFilterBy"));
		Select sel=new Select(ele);
		sel.selectByVisibleText(ExpectedExpense);
		Thread.sleep(2000);
		ele1=driver.findElement(By.id("ContentPlaceHolder1_gvSummary_lblNAME_0"));
		String ActualExpense=ele1.getText();
		System.out.println(ActualExpense);
		if(ActualExpense.equals(ExpectedExpense)) {
			System.out.println("Tab should reflect the selected expense");
		}
		else {
			System.out.println("Tab should not reflect the selected expense");
		}
	}

	@Then("Select any status from the dropdown")
	public void Select_any_status_from_the_dropdown() throws InterruptedException {
		String Status="Shown to Owner Transaction";
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlStatus"));
		Select sel=new Select(ele);
		sel.selectByVisibleText(Status);
	}

	@Then("Select any sort from the dropdown")
	public void Select_any_sort_from_the_dropdown() throws InterruptedException {
		String Sort="By Amount";
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByVisibleText(Sort);
	}

	@Then("Click the Checkbox")
	public void Click_the_Checkbox() throws InterruptedException {
		ele=driver.findElement(By.id("ContentPlaceHolder1_cbControlled"));
		if (!(ele.isSelected())) {
			ele.click();
		} else {
			System.out.println("Checkbox is already selected.");
		}
	}

	@Then("Click the Expense Checkbox")
	public void click_the_expense_checkbox() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("ContentPlaceHolder1_gvSummary_cblApplicableLeg_1")).click();
	}

	@And("Click Show button and Click Cancel button")
	public void click_show_button_and_click_cancel_button() {
		driver.navigate().refresh();
		driver.findElement(By.id("ContentPlaceHolder1_btnRollback")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	@Then("Click Show button and Click Ok button")
	public void click_show_button_and_click_ok_button() {
		driver.findElement(By.id("ContentPlaceHolder1_btnRollback")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@And("Click Hide button and Click Cancel button")
	public void click_Hide_button_and_click_cancel_button() {
		driver.navigate().refresh();
		driver.findElement(By.id("ContentPlaceHolder1_btnHideTrans")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	@Then("Click Hide button and Click Ok button")
	public void click_Hide_button_and_click_ok_button() {
		driver.findElement(By.id("ContentPlaceHolder1_btnHideTrans")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@And("Click the Confirm and Continue button")
	public void click_the_Confirm_and_Continue_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("ContentPlaceHolder1_btnStep2")).click();
	}

	@Then("Click the close button in the popup")
	public void click_the_close_button_in_the_popup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Img1")));
		driver.findElement(By.id("ContentPlaceHolder1_Img1")).click();
	}

	@Then("Click the Confirm and Continue button in the popup")
	public void click_the_Confirm_and_Continue_button_in_the_popup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnConfirm")));
		driver.findElement(By.id("ContentPlaceHolder1_btnConfirm")).click();
	}

	@And("Click the Owner Pay Radio button")
	public void click_the_Owner_Pay_Radio_button() {
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoReportType_1"));
		if (ele.isSelected()) {
			System.out.println("Radio button is already clicked!");
		} else {
			System.out.println("Radio button is not clicked.");
			ele.click();
		}
	}

	@When("Click the Revenue Owner Pay button")
	public void click_the_Revenue_Owner_Pay_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("liStep2")));
		driver.findElement(By.id("liStep2")).click();
	}

	@Then("Click Previous Step button In Revenue Owner Pay")
	public void click_Previous_Step_button_In_Revenue_Owner_Pay() {
		driver.findElement(By.id("ContentPlaceHolder1_btnstep1")).click();
	}

	@And("Check The Landing Page")
	public void Check_The_Landing_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ContentPlaceHolder1_gvSummary\"]/tbody/tr[1]")));
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvSummary\"]/tbody/tr[1]"));
		if(ele.isDisplayed()) {
			System.out.println("Page Landed To Hide Transaction Tab");
		}
		else {
			System.out.println("Page does not landed to Hide Transaction Tab");
		}
	}

	@Then("Click the Attach button")
	public void click_the_Attach_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Attach']")));
		driver.findElement(By.xpath("//a[text()='Attach']")).click();
	}

	@And("Click Close button")
	public void Click_Close_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnCHTRClose")));
		driver.findElement(By.id("btnCHTRClose")).click();
	}

	@And("Enter All Valid Details")
	public void Enter_All_Valid_Details() throws InterruptedException, AWTException {
		String filePath = "C:\\Users\\thirumaran\\OneDrive\\Desktop\\blank.pdf"; // Replace with your file path
		driver.switchTo().frame(driver.findElement(By.id("ContentPlaceHolder1_frmCHTRORA")));
		driver.findElement(By.id("ContentPlaceHolder1_fuFile")).sendKeys(filePath);
		driver.findElement(By.id("ContentPlaceHolder1_FUQuote")).sendKeys(filePath);
		// Switch back to main content
		driver.switchTo().defaultContent();
	}

	@Then("Click The Clear button")
	public void click_The_Clear_button() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.id("ContentPlaceHolder1_frmCHTRORA")));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnClearORA")));
		driver.findElement(By.id("ContentPlaceHolder1_btnClearORA")).click();
	}

	@And("Click Save button and Check Page Behaviour")
	public void Click_Save_button_and_Check_Page_Behaviour() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.id("ContentPlaceHolder1_frmCHTRORA")));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnClearORA")));
		driver.findElement(By.id("ContentPlaceHolder1_btnSaveORA")).click();
		try {
			// Wait for a maximum of 5 seconds for the alert to be present
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofMinutes(1));
			wait1.until(ExpectedConditions.alertIsPresent());
			System.out.println("Alert message is displayed!");

			// Optionally, retrieve and handle the alert text
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println("Alert text: " + alertText);
			alert.dismiss(); // Accept or dismiss the alert as needed
		} catch (NoAlertPresentException e) {
			// If no alert is present within the timeout, handle the scenario (optional)
			System.out.println("No alert message displayed.");
		}
	}

	@Then("Enter Valid Details in Notes is {string}")
	public void Enter_Valid_Details_in_Notes(String Notes) throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.id("ContentPlaceHolder1_frmCHTRORA")));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtNotes")));
		driver.findElement(By.id("ContentPlaceHolder1_txtNotes")).sendKeys(Notes);
		// Switch back to main content
		driver.switchTo().defaultContent();
	}

	@And("Click The Save button and Check Page Behaviour")
	public void Click_The_Save_button_and_Check_Page_Behaviour() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.id("ContentPlaceHolder1_frmCHTRORA")));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnClearORA")));
		driver.findElement(By.id("ContentPlaceHolder1_btnSaveORA")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_pnlMessage")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_pnlMessage"));
		if(ele.isDisplayed()) {
			ele1=driver.findElement(By.id("ContentPlaceHolder1_lblMessageBody"));
			String text = ele1.getText();
			System.out.println("Popup Shows Like : " + text);
			ele2=driver.findElement(By.id("ContentPlaceHolder1_lblMessageBody"));
			ele2.click();
		}
	}

	@Then("Click Charter Flight Revenue button")
	public void click_Charter_Flight_Revenue_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rptRevenue_lblSubgroupName_0")));
		driver.findElement(By.id("ContentPlaceHolder1_rptRevenue_lblSubgroupName_0")).click();
	}

	@And("Check Data Is Shown In The Webtable")
	public void Check_Data_Is_Shown_In_The_Webtable() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rptRevenue_lblSubgroupName_0")));
		WebElement webTable = driver.findElement(By.id("ContentPlaceHolder1_rptRevenue_gvOwnerRevenue_0"));

		List<String> allTableData = new ArrayList<>();
		List<WebElement> rows = webTable.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) { // Skip the header row (adjust if needed)
			WebElement row = rows.get(i);
			List<WebElement> cells = row.findElements(By.tagName("td")); // Or "th" for headers

			// Extract text from each cell in the current row
			for (WebElement cell : cells) {
				String cellText = cell.getText().trim(); // Trim leading/trailing whitespace
				allTableData.add(cellText);
			}
		}

		// Now you have all the extracted text in the 'allTableData' list
		System.out.println("Extracted table data:");
		for (String data : allTableData) {
			System.out.println(data);
		}
	}

	@Then("Click Supplemental Crew Revenue button")
	public void click_Supplemental_Crew_Revenue_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rptRevenue_lblSubgroupName_1")));
		driver.findElement(By.id("ContentPlaceHolder1_rptRevenue_lblSubgroupName_1")).click();
	}

	@And("Check Data Is Shown In Webtable")
	public void Check_Data_Is_Shown_In_Webtable() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[text()='No Data Found']")));
		ele=driver.findElement(By.xpath("//td[text()='No Data Found']"));
		if(ele.isDisplayed()) {
			System.out.println("Tab shows like : " + ele.getText());
		}
	}

	@Then("Click Landing and Navigation Revenue button")
	public void click_Landing_and_Navigation_Revenue_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rptRevenue_lblSubgroupName_2")));
		driver.findElement(By.id("ContentPlaceHolder1_rptRevenue_lblSubgroupName_1")).click();
	}

	@Then("Click Cabin Attendants Revenue button")
	public void click_Cabin_Attendants_Revenue_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rptRevenue_lblSubgroupName_3")));
		driver.findElement(By.id("ContentPlaceHolder1_rptRevenue_lblSubgroupName_1")).click();
	}

	@Then("Click Rest Overnight Revenue button")
	public void click_Rest_Overnight_Revenue_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rptRevenue_lblSubgroupName_4")));
		driver.findElement(By.id("ContentPlaceHolder1_rptRevenue_lblSubgroupName_1")).click();
	}

	@Then("Enter Valid Details in Notes Field")
	public void Enter_Valid_Details_in_Notes_Field() throws InterruptedException {
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele.clear();
		ele.sendKeys("Test notes");
		ele1=driver.findElement(By.id("ContentPlaceHolder1_btnNSave"));
		ele1.click();
	}

	@And("Click Confirm and Continue button")
	public void click_Confirm_and_Continue_button() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnstep3")));
		driver.findElement(By.id("ContentPlaceHolder1_btnstep3")).click();
	}


	@When("Click the Expense Attach Invoice button")
	public void click_the_Expense_Attach_Invoice_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("liStep3")));
		driver.findElement(By.id("liStep3")).click();
	}

	@Then("Click Previous Step button In Expense Attach Invoice")
	public void click_Previous_Step_button_In_Expense_Attach_Invoice() {
		driver.findElement(By.id("ContentPlaceHolder1_btnStep2")).click();
	}

	@And("Check The Landing Page From In Expense Attach Invoice")
	public void Check_The_Landing_Page_From_In_Expense_Attach_Invoice() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvOwnerRevenuePayable")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOwnerRevenuePayable"));
		if(ele.isDisplayed()) {
			System.out.println("Page Landed To Revenue Owner Pay Page");
		}
		else {
			System.out.println("Page Doesnot Landed To Revenue Owner Pay Page");
		}
	}

	@Then("Select Any Expense From The Dropdown")
	public void Select_Any_Expense_From_The_Dropdown() {
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFilterBy"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("All Exhibits");
	}

	@Then("Select Any Status From The Dropdown")
	public void Select_Any_Status_From_The_Dropdown() {
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlAttachmentStatus"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Completed");
	}

	@Then("Click The Edit button")
	public void Click_The_Edit_button() {
		driver.findElement(By.id("ContentPlaceHolder1_gvExpense_imbEdit_1")).click();
	}

	@And("Check Edit Page In Expense Attach Invoice")
	public void Check_Edit_Page_In_Expense_Attach_Invoice() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnEditTransaction")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnEditTransaction"));
		if(ele.isDisplayed()) {
			System.out.println("Edit Transaction Page Is Displayed");
		}
		else {
			System.out.println("Edit Transaction Page Is Not Displayed");
		}
	}

	@And("Click The Edit Transaction button")
	public void Click_The_Edit_Transaction_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnEditTransaction")));
		driver.findElement(By.id("ContentPlaceHolder1_btnEditTransaction")).click();
	}

	@Then("Click Close button In Edit Transaction Page")
	public void Click_Close_button_In_Edit_Transaction_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnEditClose")));
		driver.findElement(By.id("btnEditClose")).click();
	}

	@Then("Update The Details")
	public void Update_The_Details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnEditClose")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele.clear();
		ele.sendKeys("Test");
		driver.findElement(By.id("ContentPlaceHolder1_btnPSave")).click();
	}

	@When("Click The Add Transaction button")
	public void Click_The_Add_Transaction_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnAddTransaction")));
		driver.findElement(By.id("ContentPlaceHolder1_btnAddTransaction")).click();
	}

	@And("Click Close button in Add Transaction button")
	public void Click_Close_button_in_Add_Transaction_button() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCloseMapTrxn")));
		driver.findElement(By.id("ContentPlaceHolder1_btnCloseMapTrxn")).click();
	}

	@And("Enter All Valid Details In Add Transaction")
	public void Enter_All_Valid_Details_In_Add_Transaction() throws InterruptedException {
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlPFilterBy")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlPFilterBy"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("All Exhibits");
		ele1=driver.findElement(By.id("ContentPlaceHolder1_ddlPAttachStatus"));
		Select sel1=new Select(ele1);
		sel1.selectByVisibleText("Pending");
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvExpense1\"]/tbody/tr[4]/td[11]")).click();
	}

	@Then("Click Submit button In Add Transaction button")
	public void Click_Submit_button_In_Add_Transaction_button() throws InterruptedException {
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnTSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnTSubmit"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClose")));
		ele1=driver.findElement(By.id("ContentPlaceHolder1_btnClose"));
		if(ele1.isDisplayed()) {
			System.out.println("Trasaction Added Sucessfully");
			ele1.click();
		}
		else {
			System.out.println("Trasaction Cannot Able to Add");
		}
	}

	@And("Click Delete button")
	public void Click_Delete_button() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvEditTrans_imbDelete_1")));
		ele1=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvEditTrans\"]/tbody/tr[3]/td[2]"));

		ele=driver.findElement(By.id("ContentPlaceHolder1_gvEditTrans_imbDelete_1"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		ele.click();
		alert.accept();



		if(ele1.isDisplayed()) {
			System.out.println("Transaction Cannot ABle to Delete");
		}
		else {
			System.out.println("Transaction is Deleted");
		}
	}

	@And("Click Delete Invoice button")
	public void Click_Delete_Invoice_button() throws InterruptedException, AWTException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnDeleteInvoice")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnDeleteInvoice"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		ele.click();
		alert.accept();
		System.out.println("Invoice is Deleted Sucessfully");
		Thread.sleep(2000);
		String FilePath="C:\\Users\\thirumaran\\OneDrive\\Desktop\\blank.pdf";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}


	@And("Click Next button")
	public void Click_Next_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnNextTransaction")));
		driver.findElement(By.id("ContentPlaceHolder1_btnNextTransaction")).click();
	}

	@And("Click Back button")
	public void Click_Back_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnTranEditBack")));
		driver.findElement(By.id("ContentPlaceHolder1_btnTranEditBack")).click();
	}

	@And("Upload Document In Invoice")
	public void Upload_Document_In_Invoice() throws InterruptedException, AWTException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnDeleteInvoice")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnDeleteInvoice"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		ele.click();
		alert.accept();
		Thread.sleep(3000);
		ele1=driver.findElement(By.id("ContentPlaceHolder1_dvdropattach1"));
		ele1.click();
		Thread.sleep(2000);
		String FilePath="C:\\Users\\thirumaran\\OneDrive\\Desktop\\blank.pdf";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("Click Confirm and Continue button In Expense Page")
	public void Click_Confirm_and_Continue_button_In_Expense_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnStep4")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnStep4"));
		ele.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnConfirm")));
		driver.findElement(By.id("ContentPlaceHolder1_btnConfirm")).click();
	}

	@When("Click the Invoice Audit button")
	public void Click_the_Invoice_Audit_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("liStep3_1")));
		ele=driver.findElement(By.id("liStep3_1"));
		ele.click();
	}

	@Then("Click Previous Step button In Invoice Audit")
	public void Click_Previous_Step_button_In_Invoice_Audit() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnStep2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnStep2"));
		ele.click();
	}

	@And("Check The Landing Page From Invoice Audit")
	public void Check_The_Landing_Page_From_Invoice_Audit() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_tblTailWise")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_tblTailWise"));
	}

	@And("Click The Edit button In Invoice Audit")
	public void Click_The_Edit_button_In_Invoice_Audit() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvAttachment_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvAttachment_imbEdit_0"));
		ele.click();
	}

	@Then("Click The Close button In Invoice Audit")
	public void Click_The_Close_button_In_Invoice_Audit() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_btnCloseMapTrxn")));
		ele1=driver.findElement(By.id("ContentPlaceHolder1_btnCloseMapTrxn"));
		ele1.click();
	}

	@When("Click the Flight Activity button")
	public void Click_The_Flight_Activity_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("liStep4")));
		driver.findElement(By.id("liStep4")).click();
	}

	@Then("Click Previous Step button In Flight Activity Page")
	public void Click_Previous_Step_button_In_Flight_Activity_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnStep2")));
		driver.findElement(By.id("ContentPlaceHolder1_btnStep2")).click();
	}

	@And("Check The Landing Page From Flight Activity Page")
	public void Check_The_Landing_Page_From_Flight_Activity_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ContentPlaceHolder1_gvAttachment\"]/tbody/tr[1]")));
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvAttachment\"]/tbody/tr[1]"));
		if(ele.isDisplayed()) {
			System.out.println("Page Landed To Invoice Audit");
		}
		else {
			System.out.println("Page Doesnot Landed To Invoice Audit");
		}
	}

	@Then("Click the Edit button in Flight Activity Page")
	public void Click_the_Edit_button_in_Flight_Activity_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvActualFlightActivity_imbEdit_0")));
		driver.findElement(By.id("ContentPlaceHolder1_gvActualFlightActivity_imbEdit_0")).click();
	}

	@And("Click The Close button in Flight Activity Page")
	public void Click_The_Close_button_in_Flight_Activity_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnTailMappingClose")));
		driver.findElement(By.id("btnTailMappingClose")).click();
	}

	@And("Clear Details in Flight Activity Page")
	public void Clear_Details_in_Flight_Activity_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFARREG")));
		driver.findElement(By.id("ContentPlaceHolder1_txtFARREG")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_txtTRIPTYPE")).clear();
		ele1=driver.findElement(By.id("ContentPlaceHolder1_btnAdd"));
		//To find Alert Message is show or not
		try {
			ele1.click();
			Alert alert = driver.switchTo().alert();

			// Check if alert is present (optional)
			if (alert != null) {
				String message = alert.getText();
				System.out.println("Alert message is shown without any issues");
				System.out.println("Alert message: " + message);
				alert.accept(); // Or alert.dismiss();
			}

		} catch (NoAlertPresentException e) {
			// No alert present, continue test execution (optional)
			System.out.println("No alert message displayed.");
		}

	}

	@And("Modify Details in Flight Activity Page")
	public void Modify_Details_in_Flight_Activity_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFARREG")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFARREG"));
		ele.clear();
		ele.sendKeys("134");
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtTRIPTYPE"));
		ele1.clear();
		ele1.sendKeys("CHTR");
		ele2=driver.findElement(By.id("ContentPlaceHolder1_btnAdd"));
		ele2.click();
		System.out.println("Details Modified Sucessfully Without Any Issues");
	}

	@Then("Click Confirm and Continue button In Flight Activity Page")
	public void Click_Confirm_and_Continue_button_In_Flight_Activity_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnStep4")));
		driver.findElement(By.id("ContentPlaceHolder1_btnStep4")).click();
	}

	@When("Click the Report Preview button")
	public void Click_The_Report_Preview_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("liStep5")));
		driver.findElement(By.id("liStep5")).click();
	}

	@Then("Click Previous Step button In Report Preview Page")
	public void Click_Previous_Step_button_In_Report_Preview_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnStep4")));
		driver.findElement(By.id("ContentPlaceHolder1_btnStep4")).click();
	}

	@And("Check The Landing Page From Report Preview Page")
	public void Check_The_Landing_Page_From_Report_Preview_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ContentPlaceHolder1_gvActualFlightActivity\"]/tbody/tr[11]/td[10]")));
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvActualFlightActivity\"]/tbody/tr[11]/td[10]"));
		if(ele.isDisplayed()) {
			System.out.println("Page Landed To Flight Activity Page");
		}
		else {
			System.out.println("Page Doesnot Landed To Flight Activity Page");
		}
	}

	@And("Click The View Icon In Report Preview Page")
	public void Click_The_View_Icon_In_Report_Preview_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvBalance_imgHelp_7")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvBalance_imgHelp_7"));
		ele.click();
	}

	@Then("Click Hide button In Report Preview Page")
	public void Click_Hide_button_In_Report_Preview_Page() {
		//Click Hide Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvOwnerRevenue_lnkHide_0")));
		driver.findElement(By.id("ContentPlaceHolder1_gvOwnerRevenue_lnkHide_0")).click();

		//Click no Button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button4")));
		driver.findElement(By.id("ContentPlaceHolder1_Button4")).click();

		//Click View Icon
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvBalance_imgHelp_7")));
		driver.findElement(By.id("ContentPlaceHolder1_gvBalance_imgHelp_7")).click();

		//Click Hide Button
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvOwnerRevenue_lnkHide_0")));
		driver.findElement(By.id("ContentPlaceHolder1_gvOwnerRevenue_lnkHide_0")).click();

		//Click Yes Button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button2")));
		driver.findElement(By.id("ContentPlaceHolder1_Button2")).click();

		//Click Close Button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button3")));
		driver.findElement(By.id("ContentPlaceHolder1_Button3")).click();
	}

	@And("Click Restore button In Report Preview Page")
	public void Click_Restore_button_In_Report_Preview_Page() {

		//Click View Icon
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvBalance_imgHelp_7")));


		try {
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvBalance_imgHelp_7")));
			element.click();
		} catch (StaleElementReferenceException e) {
			// Element has become stale, handle the exception (e.g., refresh the element or retry)
			System.out.println("Element has become stale: " + e.getMessage());
		}

		driver.findElement(By.id("ContentPlaceHolder1_gvBalance_imgHelp_7")).click();

		//Click Restore Button
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvOwnerRevenue_lnkHide_0")));
		driver.findElement(By.id("ContentPlaceHolder1_gvHided_lnkHide_0")).click();

		//Click no Button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button4")));
		driver.findElement(By.id("ContentPlaceHolder1_Button4")).click();

		//Click View Icon
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvBalance_imgHelp_7")));
		driver.findElement(By.id("ContentPlaceHolder1_gvBalance_imgHelp_7")).click();

		//Click Restore Button
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvOwnerRevenue_lnkHide_0")));
		driver.findElement(By.id("ContentPlaceHolder1_gvHided_lnkHide_0")).click();

		//Click Yes Button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button2")));
		driver.findElement(By.id("ContentPlaceHolder1_Button2")).click();

		//Click Close Button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button3")));
		driver.findElement(By.id("ContentPlaceHolder1_Button3")).click();
	}

	@Then("Click Close button In Report Preview Page")
	public void Click_Close_button_In_Report_Preview_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_ImageButton2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ImageButton2"));
		ele.click();
	}

	@Then("Click Confirm and Continue button In Report Preview Page")
	public void Click_Confirm_and_Continue_button_In_Report_Preview_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnStep6")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnStep6"));
		ele.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnConfirm")));
		driver.findElement(By.id("ContentPlaceHolder1_btnConfirm")).click();
	}

	@When("Click the Generate PDF File button")
	public void Click_the_Generate_PDF_File_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("liStep6")));
		ele=driver.findElement(By.id("liStep6"));
		ele.click();
	}

	@Then("Click Previous Step button In Generate PDF File button")
	public void Click_Previous_Step_button_In_Generate_PDF_File_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnStep5")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnStep5"));
		ele.click();
		//Checking Landing Page
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvBalance_imgHelp_7")));
		ele1=driver.findElement(By.id("ContentPlaceHolder1_gvBalance_imgHelp_7"));
		if(ele1.isDisplayed()){
			System.out.println("Page Landed To Report Preview Page Sucessfully");
		}
		else {
			System.out.println("Page Doesnot Landed To Report Preview Page");
		}
				}

	@Then("Click Download Index In Generate PDF File")
	public void Click_Download_Index_In_Generate_PDF_File() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_lnkACMFile1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_lnkACMFile1"));
		ele.click();
	}

	@Then("Click Download MS Report In Generate PDF File")
	public void Click_Download_MS_Report_In_Generate_PDF_File() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnDownload")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnDownload"));
		ele.click();
	}

	@And("Enter The Document Name")
	public void Enter_The_Document_Name() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtDocumentName")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtDocumentName"));
		ele.sendKeys("Test");
	}

	@Then("Attach MS Report and Click Upload button")
	public void Attach_MS_Report_and_Click_Upload_button() throws InterruptedException, AWTException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/form/div[5]/div/div[2]/div[3]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[2]")));
		ele=driver.findElement(By.xpath("/html/body/form/div[5]/div/div[2]/div[3]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"));
		boolean enabled = ele.isEnabled();
		System.out.println(enabled);
		ele.click();
		Thread.sleep(2000);
		String FilePath="C:\\Users\\thirumaran\\OneDrive\\Desktop\\blank.pdf";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnAddtionalMS")));
		driver.findElement(By.id("ContentPlaceHolder1_btnAddtionalMS")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("imgClose")));
		driver.findElement(By.id("imgClose")).click();
	}

	@And("Click The Delete button")
	public void Click_The_Delete_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvAdditional_imbDelete_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvAdditional_imbDelete_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		ele.click();
		alert.accept();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("imgClose")));
		driver.findElement(By.id("imgClose")).click();
	}

	@And("Click The Regenerate button")
	public void Click_The_Regenerate_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnRegerateReport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnRegerateReport"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@And("Enter Details")
	public void Enter_Details() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rbnManagementType_0")));
		driver.findElement(By.id("ContentPlaceHolder1_rbnManagementType_0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_rblACMIndex_1")).click();
		Thread.sleep(3000);
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtinvoiceN"));
		String text = ele.getAttribute("value");
		for(int i=0; i<text.length();i++) {
			ele.clear();
		}
		ele.sendKeys("123");
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtSystemNotes"));
		ele1.clear();
		Thread.sleep(2000);
		ele1.sendKeys("Test");
	}

	@Then("Click Generate button For Mandatory Message")
	public void Click_Generate_button_For_Mandatory_Message() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnGenerate")));
		driver.findElement(By.id("ContentPlaceHolder1_btnGenerate")).click();
		try {
			  wait.until(ExpectedConditions.alertIsPresent());
			  System.out.println("Alert is present!");
			  // Get the alert text:
			  String alertText = driver.switchTo().alert().getText();
			  System.out.println("Alert text: " + alertText);
			} catch (NoAlertPresentException e) {
				System.out.println("No alert message displayed.");
			}
	}

	@Then("Click Generate button")
	public void Click_Generate_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnGenerate")));
		driver.findElement(By.id("ContentPlaceHolder1_btnGenerate")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		driver.findElement(By.id("imgClose")).click();
	}



	@And("Check Mandatory Message")
	public void Check_Mandatory_Message() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rblACMIndex_1")));
		driver.findElement(By.id("ContentPlaceHolder1_txtinvoiceN")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_txtSystemNotes")).clear();
	}

	@And("Remove the Index File and Add New File")
	public void Remove_the_Index_File_and_Add_New_File() throws InterruptedException, AWTException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rblACMIndex_1")));
		driver.findElement(By.id("ContentPlaceHolder1_rblACMIndex_1")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ContentPlaceHolder1_tblSystemGenerated\"]/div[2]")));
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tblSystemGenerated\"]/div[2]")).click();
		Thread.sleep(2000);
		String FilePath="C:\\Users\\thirumaran\\OneDrive\\Desktop\\N109CH.pdf";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("ContentPlaceHolder1_btnACMUpload")).click();
	}

	@And("Click The Not Reqired button")
	public void Click_The_Not_Reqired_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rblACMIndex_2")));
		driver.findElement(By.id("ContentPlaceHolder1_rblACMIndex_2")).click();
	}

	@And("Enter Details In Not Required")
	public void Enter_Details_In_Not_Required() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtinvoiceN")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtinvoiceN"));
		ele.clear();
		ele.sendKeys("123");
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtSystemNotes"));
		ele1.clear();
		ele1.sendKeys("Test");
	}

	@Then("Click The Manual Report button")
	public void Click_The_Manual_Report_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rbnManagementType_1")));
		driver.findElement(By.id("ContentPlaceHolder1_rbnManagementType_1")).click();
	}

	@And("Delete The Existing File")
	public void Delete_The_Existing_File() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_imgDelete")));
		//Download the file
		driver.findElement(By.id("ContentPlaceHolder1_lnkAttach2")).click();
		//Delete the File
		driver.findElement(By.id("ContentPlaceHolder1_imgDelete")).click();
	}

	@And("Upload File and Enter Details")
	public void Upload_File_and_Enter_Details() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_dvManual\"]/div[1]/div[2]")));
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_dvManual\"]/div[1]/div[2]"));
		ele.click();
		Thread.sleep(2000);
		String FilePath="C:\\Users\\thirumaran\\OneDrive\\Desktop\\N109CH.pdf";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtManualInvoiceNo"));
		ele.clear();
		ele.sendKeys("123");
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtManualNotes"));
		ele1.clear();
		ele1.sendKeys("Test");
		driver.findElement(By.id("ContentPlaceHolder1_ButSubmit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		driver.findElement(By.id("imgClose")).click();
	}

	@And("Click Confirm and Continue button In Generate PDF File button")
	public void Click_Confirm_and_Continue_button_In_Generate_PDF_File_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnStep7")));
		driver.findElement(By.id("ContentPlaceHolder1_btnStep7")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnConfirm")));
		driver.findElement(By.id("ContentPlaceHolder1_btnConfirm")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnConfirm")));
		driver.findElement(By.id("ContentPlaceHolder1_btnConfirm")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnLock")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnLock"));
		if(ele.isDisplayed()) {
			System.out.println("Page Landed To Lock Report Page");
		}
		else {
			System.out.println("Page Doesnot Landed To Lock Report Page");
		}

	}
}

