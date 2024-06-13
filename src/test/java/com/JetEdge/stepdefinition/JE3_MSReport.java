package com.JetEdge.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
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

public class JE3_MSReport {

	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check MS Report User is navigating to JetEdge URL is {string}")
	public void User_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@And("To Check MS Report To Check MS Report Enter The username and password are {string} and {string}")
	public void Enter_The_username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@Then("click The Sign In button for MS Report Check")
	public void click_The_Sign_In_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@And("Click Payments In MS Report button")
	public void Click_Payments_In_MS_Report_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span")));
		driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span")).click();
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[1]/a/span"));
		ele.click();
	}

	@Then("close the MS Report Page")
	public void close_the_MS_Report_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Select Valid From and To Month")
	public void Select_Valid_From_and_To_Month() {
		//From Calendar
		driver.findElement(By.id("ContentPlaceHolder1_txtTDate")).click();
		//select january month in 2024
		driver.findElement(By.id("cal1_month_0_0")).click();
		//To calendar
		driver.findElement(By.id("ContentPlaceHolder1_txtToMonth")).click();
		//select january month in 2024
		driver.findElement(By.id("cal4_month_0_3")).click();
	}

	@And("Select Valid Tail In Dropdown and Click Search button")
	public void Select_Valid_Tail_In_Dropdown_and_Click_Search_button() {
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlNTailNo"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("All");
		driver.findElement(By.id("ContentPlaceHolder1_btnSearch")).click();
	}


	@Then("Click Export button")
	public void Click_Export_button() {
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnExport"));
		ele.click();
	}

	@Then("Click Add Payment button")
	public void Click_Add_Payment_button()  {
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click Save button in Payments Page")
	public void Click_Save_button_in_Payments_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText(); // Get the alert message
			System.out.println("Alert message: " + alertText);
			alert.accept(); // Accept the alert (optional)
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}
	}

	@And("Click Back button in Payments Page")
	public void Click_Back_button_in_Payments_Page()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnBack")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnAddNew")));
		ele1=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		if(ele1.isDisplayed())
		{
			System.out.println("Page Navigates To Home Page");
		}
		else {
			System.out.println("Page Doesnot Navigates To Home Page");
		}
	}

	@And("Enter Details Payments Page")
	public void Enter_Details_Payments_Page()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnBack")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtDate"));
		ele.sendKeys("Test");
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtDisplayMonth"));
		ele1.sendKeys("Test");
		ele2 = driver.findElement(By.id("ContentPlaceHolder1_txtAmount"));
		ele2.sendKeys("Test");
		ele3 = driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele3.sendKeys("Test");

	}

	@Then("Click Clear button in Payments Page")
	public void Click_Clear_button_in_Payments_Page()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnClear")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}

	@And("Enter Details in Payments Page")
	public void Enter_Details_in_Payments_Page() throws InterruptedException  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_ddlTailNo")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		//Select transaction DAte
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtDate"));
		ele3.click();
		Thread.sleep(2000);
		ele4=driver.findElement(By.id("ContentPlaceHolder1_calendar1ss_day_1_5"));
		ele4.click();
		Thread.sleep(2000);
		//Select MS Display month
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtDisplayMonth"));
		ele5.click();
		Thread.sleep(2000);
		ele6=driver.findElement(By.id("cal3_month_1_0"));
		ele6.click();
		Thread.sleep(2000);
		//Select payment mode
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_ddlPaymentMode"));
		Select sel1=new Select(ele1);
		sel1.selectByVisibleText("Wire Transfer");
		Thread.sleep(2000);
		//Select payment from
		ele2 = driver.findElement(By.id("ContentPlaceHolder1_ddlPaymentFrom"));
		Select sel2=new Select(ele2);
		sel2.selectByVisibleText("Jetedge to Owner");
		Thread.sleep(2000);
		//Enter Amount
		ele7=driver.findElement(By.id("ContentPlaceHolder1_txtAmount"));
		ele7.sendKeys("1234");
		Thread.sleep(2000);
		//Select Invoice Month
		ele8=driver.findElement(By.id("ContentPlaceHolder1_txtInvoiceMonth"));
		ele8.click();
		Thread.sleep(2000);
		ele9=driver.findElement(By.id("cal2_month_1_0"));
		ele9.click();
		Thread.sleep(2000);
		//Enter Reference Details
		WebElement ele10= driver.findElement(By.id("ContentPlaceHolder1_txtTranNumber"));
		ele10.sendKeys("Test");
		Thread.sleep(2000);
		//Enter Notes
		WebElement ele11=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele11.sendKeys("Test");
	}

	@Then("Click Edit Payment button")
	public void Click_Edit_Payment_button()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvSetup_imbView_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvSetup_imbView_0"));
		ele.click();
	}

	@Then("Click Delete button In Payment Page")
	public void Click_Delete_button_In_Payment_Page()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvSetup_imbDel_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvSetup_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@And("Click Additional Cost In MS Report button")
	public void Click_Additional_Cost_In_MS_Report_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span")));
		driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span")).click();
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[2]/a/span"));
		ele.click();
	}

	@Then("Click Add Additional Cost button")
	public void Click_Add_Additional_Cost_button()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnAddNew")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click Save button In MS Report button")
	public void Click_Save_button_In_MS_Report_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnSave")));
		driver.findElement(By.id("ContentPlaceHolder1_btnSave")).click();
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText(); // Get the alert message
			System.out.println("Alert message: " + alertText);
			alert.accept(); // Accept the alert (optional)
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}
	}

	@And("Click Back button In MS Report button")
	public void Click_Back_button_In_MS_Report_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnBack")));
		driver.findElement(By.id("ContentPlaceHolder1_btnBack")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		if(ele.isDisplayed()) {
			System.out.println("Page Landed To Home Page");
		}
		else {
			System.out.println("Page Doesnot Landed To Home Page");
		}
	}

	@And("Click Clear button In MS Report button")
	public void Click_Clear_button_In_MS_Report_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtAmount"));
		ele.sendKeys("1234");
		ele1=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele1.sendKeys("Test");

		driver.findElement(By.id("ContentPlaceHolder1_btnClear")).click();
	}

	@And("Enter Valid Details In MS Report button")
	public void Enter_Valid_Details_In_MS_Report_button() throws AWTException, InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtCostName")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtCostName"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele.sendKeys(text);
		Thread.sleep(2000);
		ele1=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele1);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		//Select transaction date
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtDate"));
		ele2.click();
		Thread.sleep(2000);
		//Select the date
		ele2=driver.findElement(By.id("ContentPlaceHolder1_calendar1ss_day_2_3"));
		ele2.click();
		Thread.sleep(2000);
		//Select payment from
		ele3=driver.findElement(By.id("ContentPlaceHolder1_ddlPaymentFrom"));
		Select sel1=new Select(ele3);
		sel1.selectByIndex(1);
		Thread.sleep(2000);
		//Enter Amount
		ele4=driver.findElement(By.id("ContentPlaceHolder1_txtAmount"));
		ele4.sendKeys("12345");
		Thread.sleep(2000);
		//Select invoice month
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtInvoiceMonth"));
		ele5.click();
		Thread.sleep(2000);
		//Select the month
		ele5=driver.findElement(By.id("cal2_month_1_0"));
		ele5.click();
		Thread.sleep(2000);
		//Enter Notes
		ele6=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele6.sendKeys("test");
		Thread.sleep(2000);
	}

	@Then("Upload the File In MS Report button")
	public void Upload_the_File_In_MS_Report_button() throws InterruptedException, AWTException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnClear")));
		//Upload the file
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_AddOffSet\"]/div[5]")).click();
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
		Thread.sleep(2000);
		//Click Add To List
		ele7=driver.findElement(By.id("ContentPlaceHolder1_btnUpload"));
		ele7.click();
	}

	@And("Click Download button In MS Report button")
	public void Click_Download_button_In_MS_Report_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvTemp_imgAttach_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvTemp_imgAttach_0"));
		ele.click();

	}

	@And("Click Delete button In MS Report button")
	public void Click_Delete_button_In_MS_Report_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvTemp_imbDelete_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvTemp_imbDelete_0"));
		ele.click();
	}

	@Then("Click Edit Additional Cost button")
	public void Click_Edit_Additional_Cost_button()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvSetup_imbView_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvSetup_imbView_0"));
		ele.click();
	}

	@Then("Click Delete button In Additional Cost button")
	public void Click_Delete_button_In_Additional_Cost_button()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvSetup_imbDel_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvSetup_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@And("Click Prepare MS Report button")
	public void Click_Prepare_MS_Report_button()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span")));
		driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span")).click();
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span"));
		ele.click();
	}

	@Then("Select The Month In The Calendar button")
	public void Select_The_Month_In_The_Calendar_button()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtFromMonth")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		driver.findElement(By.id("cal2_month_1_0")).click();
	}

	@Then("Click The Work In Progress button")
	public void Click_The_Work_In_Progress_button()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_WIP")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_WIP"));
		ele.click();
	}

	@Then("Click The Completed button")
	public void Click_The_Completed_button()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_COPM")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_COPM"));
		ele.click();
	}

	@Then("Click The Pending button")
	public void Click_The_Pending_button()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_PEND")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_PEND"));
		ele.click();
	}

	@And("Click Run MS Report button")
	public void Click_Run_MS_Report_button()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span")));
		driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span")).click();
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[5]/a/span"));
		ele.click();
	}

	@Then("Select Valid Details and Click View button")
	public void Select_Valid_Details_and_Click_View_button()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtFromDate")));
		//Click the Month
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		ele.click();
		//Select the Month
		ele1 = driver.findElement(By.id("cal1_month_0_2"));
		ele1.click();
		//Select the tail
		ele2 = driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele2);
		sel.selectByIndex(1);
		//Select the Report Type
		ele3 = driver.findElement(By.id("ContentPlaceHolder1_ddlReportBy"));
		Select sel1=new Select(ele3);
		sel1.selectByIndex(0);
		//Click View Button
		ele4 = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele4.click();
	}

	@And("Click Excel button In Run MS Report Page")
	public void Click_Excel_button_In_Run_MS_Report_Page()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_imbExport")));
		driver.findElement(By.id("ContentPlaceHolder1_imbExport")).click();
	}

	@And("Click Account Balance and Click Summary Tab")
	public void Click_Account_Balance_and_Click_Summary_Tab()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_imbExport")));
		//Click Account Balance Tab
		driver.findElement(By.id("ContentPlaceHolder1_aSummary")).click();
		//Click Summary Tab
		driver.findElement(By.id("ContentPlaceHolder1_aDetail")).click();
	}

	@And("Click Owner Revenue Payable Tab")
	public void Click_Owner_Revenue_Payable_Tab()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_aRevenue")));
		driver.findElement(By.id("ContentPlaceHolder1_aRevenue")).click();
	}

	@Then("Click Attach button In Owner Revenue Payable Tab")
	public void Click_Attach_button_In_Owner_Revenue_Payable_Tab()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvOwnerRevenuePayable_lnkORAAttch_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOwnerRevenuePayable_lnkORAAttch_0"));
		if(ele.isDisplayed()) {
			ele.click();
		}
		else {
			System.out.println("Files are already attached");
		}
	}

	@And("Click Close button In Owner Revenue Payable Tab")
	public void Click_Close_button_In_Owner_Revenue_Payable_Tab()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCHTRClose")));
		driver.findElement(By.id("btnCHTRClose")).click();
	}

	@And("Enter Valid Details In Owner Revenue Payable Tab")
	public void Enter_Valid_Details_In_Owner_Revenue_Payable_Tab() throws InterruptedException, AWTException  {
		driver.switchTo().frame(driver.findElement(By.id("ContentPlaceHolder1_frmCHTRORA")));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtTripNo")));
		driver.findElement(By.id("ContentPlaceHolder1_txtTripNo")).clear();

	}

	@And("Click Monthly Expenses and Click Actual Flight Activity Tab")
	public void Click_Monthly_Expenses_and_Click_Actual_Flight_Activity_Tab() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("ContentPlaceHolder1_aExpenses")));
		driver.findElement(By.id("ContentPlaceHolder1_aExpenses")).click();
		driver.findElement(By.id("ContentPlaceHolder1_aFlightActivity")).click();
	}

	@Then("Enter Details In The Notes")
	public void Enter_Details_In_The_Notes() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("ContentPlaceHolder1_txtNotes")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele.clear();
		Thread.sleep(2000);
		ele.sendKeys("Test");
	}


	@And("Click Download MS Report button")
	public void Click_Download_MS_Report_button()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span")));
		driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span")).click();
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[6]/a/span"));
		ele.click();
	}

	@Then("Click Edit button in Download MS Report Page")
	public void Click_Edit_button_in_Download_MS_Report_Page() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvSummary_imbView_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvSummary_imbView_0"));
		ele.click();
	}

	@And("Click Back button in Download MS Report Page")
	public void Click_Back_button_in_Download_MS_Report_Page() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnSumBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSumBack"));
		ele.click();
	}

	@And("Click Download button in Download MS Report Page")
	public void Click_Download_button_in_Download_MS_Report_Page() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvTailDetails_imbView_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvTailDetails_imbView_0"));
		ele.click();
	}





}

