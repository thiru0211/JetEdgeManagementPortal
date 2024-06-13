package com.JetEdge.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
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
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class JE7_Setup {
	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9,ele10,
	ele11,ele12,ele13,ele14,ele15,ele16,ele17,ele18,ele19,ele20,
	ele21,ele22,ele23,ele24,ele25,ele26,ele27,ele28,ele29,ele30;

	@Given("To Check Setup User is Navigating to JetEdge Signin URL is {string}")
	public void user_is_navigating_to_jet_edge_signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@And("To Check Setup Enter The User Name and Password are {string} and {string}")
	public void enter_the_user_name_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@Then("Click The SignIn button for Setup Check")
	public void click_the_sign_in_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@Then("Close The Setup Page")
	public void close_the_owner_portal_page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@And("Click Tail Setup button In Setup")
	public void Select_The_Valid_From_Month_Tab_In_State_Tax(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/div/ul/li[2]/a/span"));
		ele1.click();
	}

	@Then("Click Export All button In Setup")
	public void Click_Export_All_button_In_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnExport"));
		ele.click();
	}

	@And("Click Close button In Export Popup")
	public void Click_Close_button_In_Export_Popup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button5")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Button5"));
		ele.click();
	}

	@And("Select All Checkbox In Export Popup")
	public void Select_All_Checkbox_In_Export_Popup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button5")));
		//Select all checkbox
		ele=driver.findElement(By.id("ContentPlaceHolder1_ChkMSReport"));
		ele.click();
		ele1=driver.findElement(By.id("ContentPlaceHolder1_ChkAERotation"));
		ele1.click();
		ele2=driver.findElement(By.id("ContentPlaceHolder1_ChkAEContract"));
		ele2.click();
		ele3=driver.findElement(By.id("ContentPlaceHolder1_ChkOwnerSetup"));
		ele3.click();
		ele4=driver.findElement(By.id("ContentPlaceHolder1_ChkAcAd"));
		ele4.click();
	}

	@Then("Click Export button In Export Popup")
	public void Click_Export_button_In_Export_Popup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnExportPopup")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnExportPopup"));
		ele.click();
	}

	@Then("Select Valid Aircraft Type In Tail Setup")
	public void Select_Valid_Aircraft_Type_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlFType")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFType"));
		Select sel=new Select(ele);
		sel.selectByIndex(2);
	}

	@And("Select Valid Type In Tail Setup")
	public void Select_Valid_Type_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailType")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailType"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}

	@Then("Select Valid Owner Portal In Tail Setup")
	public void Select_Valid_Owner_Portal_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlOwnerPortal")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlOwnerPortal"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}

	@And("Enter Tail Number In Tail Setup")
	public void Enter_Tail_Number_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtSearch")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtSearch"));
		ele.sendKeys("170SW");
	}

	@Then("Select Valid Company Name In Tail Setup")
	public void Select_Valid_Company_Name_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompany")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlCompany"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}

	@And("Click View button In Tail Setup")
	public void Click_View_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnView")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnView"));
		ele.click();
	}

	@Then("Click Add New Tail button In Tail Setup")
	public void Click_Add_New_Tail_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click View Tail Details button In Tail Setup")
	public void Click_View_Tail_Details_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnViewTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnViewTail"));
		ele.click();
	}

	@And("Click Add button In Tail Setup")
	public void Click_Add_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAircraftDetails")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAircraftDetails"));
		ele.click();
	}

	@Then("Click Close button In Aircraft Details")
	public void Click_Close_button_In_Aircraft_Details(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAircraftDetailsClose")));
		ele=driver.findElement(By.id("btnAircraftDetailsClose"));
		ele.click();
	}

	@Then("Click Save button In Aircraft Details")
	public void Click_Save_button_In_Aircraft_Details(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is: "+text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Alert Message is Displayed");
		}
	}

	@Then("Enter Valid Details In Aircraft Details")
	public void Enter_Valid_Details_In_Aircraft_Details(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlType")));
		//Select type
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlType"));
		Select sel=new Select(ele);
		sel.selectByValue("38");
		//Select Fleet Range
		ele1=driver.findElement(By.id("ContentPlaceHolder1_ddlAircraftSubType"));
		Select sel1=new Select(ele1);
		sel1.selectByValue("3");
		//Enter serial number
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtSerialNo"));
		ele2.sendKeys("123");
		//Enter seats
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtSeats"));
		ele3.sendKeys("12");
		//Enter Tail
		ele4=driver.findElement(By.id("ContentPlaceHolder1_txtTailNo"));
		ele4.sendKeys("2");
		//Select Operating base
		ele5=driver.findElement(By.id("ContentPlaceHolder1_ddlBase"));
		Select sel2=new Select(ele5);
		sel2.selectByValue("18");
		//select manufacturing date
		ele6=driver.findElement(By.id("ContentPlaceHolder1_txtYOM"));
		ele6.click();
		ele7=driver.findElement(By.id("calendar8_month_0_0"));
		ele7.click();
		//Enter Lavatory Seats
		ele8=driver.findElement(By.id("ContentPlaceHolder1_txtLavSeat"));
		ele8.clear();
		ele8.sendKeys("1");
		//Enter Tail
		ele9=driver.findElement(By.id("ContentPlaceHolder1_txtTailNoInFOS"));
		ele9.sendKeys("1");
		//Select effective from
		ele10=driver.findElement(By.id("ContentPlaceHolder1_txtFLTEffective"));
		ele10.click();
		WebElement	ele11=driver.findElement(By.id("CalendarExtender1_day_1_5"));
		ele11.click();
	}

	@Then("Click Clear button In Aircraft Details")
	public void Click_Clear_button_In_Aircraft_Details(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Button2"));
		ele.click();
	}

	@And("Click Edit button In Tail Setup")
	public void Click_Edit_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAircraftDetails")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAircraftDetails"));
		ele.click();
	}

	@Then("Click MS Report Type button In Tail Setup")
	public void Click_MS_Report_Type_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hdTailReportType\"]/div/table/tbody/tr/td/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"hdTailReportType\"]/div/table/tbody/tr/td/span"));
		ele.click();
	}

	@And("Click Save button In MS Report Type")
	public void Click_Save_button_In_MS_Report_Type(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnMSReportType")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnMSReportType"));
		ele.click();
	}

	@And("Click Managed Radio button In MS Report Type")
	public void Click_Managed_Radio_button_In_MS_Report_Type(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblMSReportType_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblMSReportType_0"));
		ele.click();
	}

	@Then("Select Valid Date In Effective Calendar In MS Report Type")
	public void Select_Valid_Date_In_Effective_Calendar_In_MS_Report_Type() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTailRptTypeEffec")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtTailRptTypeEffec"));
		ele.click();
		ele1=driver.findElement(By.id("CalendarExtender13_day_1_5"));
		ele1.click();
	}

	@And("Select No Radio button In AdvantEdge")
	public void Select_No_Radio_button_In_AdvantEdge(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblIsAdvantEdge_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblIsAdvantEdge_1"));
		ele.click();
	}

	@And("Select Yes Radio button In AdvantEdge")
	public void Select_Yes_Radio_button_In_AdvantEdge(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblIsAdvantEdge_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblIsAdvantEdge_0"));
		ele.click();
	}

	@Then("Select Percentage Radio button In Calculated")
	public void Select_Percentage_Radio_button_In_Calculated(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoCalFrom_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoCalFrom_1"));
		ele.click();
	}

	@Then("Select Formula Radio button In Calculated")
	public void Select_Formula_Radio_button_In_Calculated(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoCalFrom_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoCalFrom_0"));
		ele.click();
	}

	@And("Enter Notes In MS Report Type")
	public void Enter_Notes_In_MS_Report_Type(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTailRptTypeNotes")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtTailRptTypeNotes"));
		ele.sendKeys("Test");
	}

	@And("Click All Quoted Revenue Radio button In MS Report Type")
	public void Click_All_Quoted_Revenue_Radio_button_In_MS_Report_Type(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblMSReportType_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblMSReportType_1"));
		ele.click();
	}

	@Then("Enter Percentage Split In MS Report Type")
	public void Enter_Percentage_Split_In_MS_Report_Type(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTailRptTypePercentage")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtTailRptTypePercentage"));
		ele.sendKeys("10");
	}

	@Then("Click Revenue Owner Pay button In Tail Setup")
	public void Click_Revenue_Owner_Pay_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hdOwnerPaySh\"]/div/table/tbody/tr/td/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"hdOwnerPaySh\"]/div/table/tbody/tr/td/span"));
		ele.click();
	}

	@And("Click Save button In Revenue Owner Pay")
	public void Click_Save_button_In_Revenue_Owner_Pay(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnOwnerpaySH")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnOwnerpaySH"));
		ele.click();
	}

	@Then("Click AdvantEDGE Contract button In Tail Setup")
	public void Click_AdvantEDGE_Contract_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"headingAdvantEDGE\"]/div/table/tbody/tr/td/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"headingAdvantEDGE\"]/div/table/tbody/tr/td/span"));
		ele.click();
	}

	@And("Click Save button In AdvantEDGE Contract")
	public void Click_Save_button_In_AdvantEDGE_Contract(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAdvContractAdd")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAdvContractAdd"));
		ele.click();
	}

	@And("Click No Radio button In AdvantEDGE Contract")
	public void Click_No_Radio_button_In_AdvantEDGE_Contract(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblAdvContract_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblAdvContract_1"));
		ele.click();
	}

	@Then("Select Valid Date In AdvantEDGE Contract")
	public void Select_Valid_Date_In_AdvantEDGE_Contract(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtAdvContractEffective")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtAdvContractEffective"));
		ele.click();
		ele1=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender2_day_1_5"));
		ele1.click();
	}

	@And("Click Yes Radio button In AdvantEDGE Contract")
	public void Click_Yes_Radio_button_In_AdvantEDGE_Contract(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblAdvContract_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblAdvContract_0"));
		ele.click();
	}

	@Then("Select AdvantEDGE Type In AdvantEDGE Contract")
	public void Select_AdvantEDGE_Type_In_AdvantEDGE_Contract(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlAdvContractType")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlAdvContractType"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Click AdvantEDGE Rotation button In Tail Setup")
	public void Click_AdvantEDGE_Rotation_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"headingOne2\"]/div/table/tbody/tr/td/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"headingOne2\"]/div/table/tbody/tr/td/span"));
		ele.click();
	}

	@And("Click Save button In AdvantEDGE Rotation")
	public void Click_Save_button_In_AdvantEDGE_Rotation(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCTAddtoList")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnCTAddtoList"));
		ele.click();
	}

	@And("Select Valid Date In Effective From Calendar In AdvantEDGE Rotation")
	public void Select_Valid_Date_In_Effective_From_Calendar_In_AdvantEDGE_Rotation(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtCTEffectiveFrom")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtCTEffectiveFrom"));
		ele.click();
		ele1=driver.findElement(By.id("ContentPlaceHolder1_calCTEffeciveFrom_day_0_5"));
		ele1.click();
	}

	@Then("Select Valid Date In Effective To Calendar In AdvantEDGE Rotation")
	public void Select_Valid_Date_In_Effective_To_Calendar_In_AdvantEDGE_Rotation(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtCTEffectiveTo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtCTEffectiveTo"));
		ele.click();
		ele1=driver.findElement(By.id("ContentPlaceHolder1_calCTEffeciveTo_day_5_2"));
		ele1.click();
	}

	@Then("Click Owner Setup button In Tail Setup")
	public void Click_Owner_Setup_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"headingThree2\"]/div/table/tbody/tr/td[1]/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"headingThree2\"]/div/table/tbody/tr/td[1]/span"));
		ele.click();
	}

	@And("Click Checkbox In Tail Setup")
	public void Click_Checkbox_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_chkOwner")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_chkOwner"));
		ele.click();
	}

	@Then("Click Account Advisor button In Tail Setup")
	public void Click_Account_Advisor_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"headingFour2\"]/div/table/tbody/tr/td[1]/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"headingFour2\"]/div/table/tbody/tr/td[1]/span"));
		ele.click();
	}

	@And("Click Add New button In Tail Setup")
	public void Click_Add_New_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkRepresentative")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_lnkRepresentative"));
		ele.click();
	}

	@Then("Click Close button In Account Advisor")
	public void Click_Close_button_In_Account_Advisor(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnRepClose")));
		ele=driver.findElement(By.id("btnRepClose"));
		ele.click();
	}

	@Then("Click Save button In Account Advisor")
	public void Click_Save_button_In_Account_Advisor(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnRepAddtoList")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnRepAddtoList"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : "+ text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Alert is displayed");
		}
	}

	@Then("Enter Valid Details In Account Advisor")
	public void Enter_Valid_Details_In_Account_Advisor(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlRep")));
		//select account advisor
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlRep"));
		Select sel=new Select(ele);
		sel.selectByValue("493");
		//Select Role
		ele2=driver.findElement(By.id("ContentPlaceHolder1_ddlRole"));
		Select sel1=new Select(ele2);
		sel1.selectByIndex(1);
		//Select Effective from
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtRepEffectiveFrom"));
		ele3.click();
		ele4=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender8_day_2_1"));
		ele4.click();
	}

	@And("Upload Valid File In Account Advisor")
	public void Upload_Valid_File_In_Account_Advisor() throws InterruptedException, AWTException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_pnlRepresentativeSetup\"]/div/div/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td")));
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_pnlRepresentativeSetup\"]/div/div/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
		ele.click();
		Thread.sleep(2000);
		String FilePath="C:\\Users\\thirumaran\\OneDrive\\Desktop\\Image.jpg";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}

	@And("Click Yes Radio button In Account Advisor")
	public void Click_Yes_Radio_button_In_Account_Advisor(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblErights_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblErights_1"));
		ele.click();
	}

	@Then("Unselect The Checkbox In Account Advisor")
	public void Unselect_The_Checkbox_In_Account_Advisor(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_CheckBox4")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_CheckBox4"));
		if(ele.isSelected()) {
			ele.click();
		}
		else {
			System.out.println("Checkbox is Already Unselected");
		}
	}

	@And("Click Edit button In Account Advisor")
	public void Click_Edit_button_In_Account_Advisor(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvRep_imbView_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvRep_imbView_0"));
		ele.click();
	}

	@And("Click Delete button In Account Advisor")
	public void Click_Delete_button_In_Account_Advisor(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvRep_imgDelete_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvRep_imgDelete_0"));
		ele.click();
	}

	@Then("Click Maintenance button In Tail Setup")
	public void Click_Maintenance_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"headingTen2\"]/div/table/tbody/tr/td[1]/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"headingTen2\"]/div/table/tbody/tr/td[1]/span"));
		ele.click();
	}

	@And("Click Add New button In Maintenance")
	public void Click_Add_New_button_In_Maintenance(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkMaintanance")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_lnkMaintanance"));
		ele.click();
	}

	@Then("Click Close button In Maintenance")
	public void Click_Close_button_In_Maintenance(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imgcloseNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imgcloseNew"));
		ele.click();
	}

	@Then("Click Save button In Maintenance")
	public void Click_Save_button_In_Maintenance() throws InterruptedException{
		Thread.sleep(3000);
		String frameId = "ContentPlaceHolder1_frmImageGallery"; 
		driver.switchTo().frame(frameId);
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtLeftEngine")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnMaintananceSave"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		Thread.sleep(2000);
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : "+text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Alert Message is Displayed");
		}
		driver.switchTo().defaultContent();
	}

	@And("Upload Valid Files In Maintenance")
	public void Upload_Valid_Files_In_Maintenance() throws InterruptedException, AWTException{
		Thread.sleep(3000);
		String frameId = "ContentPlaceHolder1_frmImageGallery"; 
		driver.switchTo().frame(frameId);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_fuContract\"]")));
		String FilePath="C:\\Users\\thirumaran\\OneDrive\\Desktop\\Image.jpg";
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fuContract\"]"));
		ele.sendKeys(FilePath);

		ele1=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fuContract1\"]"));
		ele1.sendKeys(FilePath);

		ele2=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fuContract2\"]"));
		ele2.sendKeys(FilePath);

		ele3=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fuContract3\"]"));
		ele3.sendKeys(FilePath);

		ele4=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fuContract4\"]"));
		ele4.sendKeys(FilePath);

		ele5=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fucontract5\"]"));
		ele5.sendKeys(FilePath);
	}

	@Then("Click Delete button In Maintenance")
	public void Click_Delete_button_In_Maintenance() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Image5")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Image5"));
		ele.click();

		ele1=driver.findElement(By.id("ContentPlaceHolder1_Image5"));
		ele1.click();

		ele2=driver.findElement(By.id("ContentPlaceHolder1_Image6"));
		ele2.click();

		ele3=driver.findElement(By.id("ContentPlaceHolder1_Image7"));
		ele3.click();

		ele4=driver.findElement(By.id("ContentPlaceHolder1_Image8"));
		ele4.click();

		ele5=driver.findElement(By.id("ContentPlaceHolder1_Image9"));
		ele5.click();
	}

	@Then("Enter Valid Details In Maintenance")
	public void Enter_Valid_Details_In_Maintenance() throws InterruptedException{
		Thread.sleep(3000);
		String frameId = "ContentPlaceHolder1_frmImageGallery"; 
		driver.switchTo().frame(frameId);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_txtLeftEngine\"]")));
		//Left Engine
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtLeftEngine\"]"));
		ele.sendKeys("Test");
		//Center Engine
		ele1=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtCenterEngine\"]"));
		ele1.sendKeys("Test");
		//Right engine
		ele2=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtRightEngine\"]"));
		ele2.sendKeys("Test");
		//MX Program
		ele3=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtMXProgramEngines\"]"));
		ele3.sendKeys("Test");
		//Other MX
		ele4=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtOtherMX\"]"));
		ele4.sendKeys("Test");
		//MX Program Avionics
		ele5=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtMXProgramParts\"]"));
		ele5.sendKeys("Test");
		//Max Personeel
		ele6=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtMaxPersonnel\"]"));
		ele6.sendKeys("Test");
		//Max Controller
		ele7=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtMaxController\"]"));
		ele7.sendKeys("Test");
		//cost
		ele8=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtOtherMxPerHour\"]"));
		ele8.sendKeys("123");
		//cost
		ele9=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtMXAviParts\"]"));
		ele9.sendKeys("123");
		//max approval
		ele10=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtMaxApproval\"]"));
		ele10.sendKeys("Test");
		//APU
		WebElement ele11=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtAPUMake\"]"));
		ele11.sendKeys("Test");
		//Max APU
		WebElement ele12=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtMXProgramAPU\"]"));
		ele12.sendKeys("Test");
		//Cost
		WebElement ele13=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtAPUCostHour\"]"));
		ele13.sendKeys("123");
		//Document Name 1
		WebElement ele14=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtDocu1\"]"));
		ele14.sendKeys("Test");
		//Document Name 2
		WebElement ele15=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtDoc2\"]"));
		ele15.sendKeys("Test");
		//Document Name 3
		WebElement ele16=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtAttac3\"]"));
		ele16.sendKeys("Test");
		//Document Name 4
		WebElement ele17=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtAttach4\"]"));
		ele17.sendKeys("Test");
		//Document Name 5
		WebElement ele18=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtAttach5\"]"));
		ele18.sendKeys("Test");
		//Document Name 6
		WebElement ele19=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtAttach6\"]"));
		ele19.sendKeys("Test");
	}

	@And("Upload Valid Files In Maintenance Page")
	public void Upload_Valid_Files_In_Maintenance_Page() throws InterruptedException, AWTException{
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_fuContract\"]")));
		String FilePath="C:\\Users\\thirumaran\\OneDrive\\Desktop\\Image.jpg";
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fuContract\"]"));
		ele.sendKeys(FilePath);

		ele1=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fuContract1\"]"));
		ele1.sendKeys(FilePath);

		ele2=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fuContract2\"]"));
		ele2.sendKeys(FilePath);

		ele3=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fuContract3\"]"));
		ele3.sendKeys(FilePath);

		ele4=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fuContract4\"]"));
		ele4.sendKeys(FilePath);

		ele5=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_fucontract5\"]"));
		ele5.sendKeys(FilePath);
	}

	@Then("Click Clear button In Maintenance")
	public void Click_Clear_button_In_Maintenance() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnMaintananceClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnMaintananceClear"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		ele.click();
	}

	@Then("Click Save button In Maintenance Page")
	public void Click_Save_button_In_Maintenance_Page() throws InterruptedException{
		Thread.sleep(3000);
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtLeftEngine")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnMaintananceSave"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		Thread.sleep(2000);
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : "+text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Alert Message is Displayed");
		}
		driver.switchTo().defaultContent();
	}

	@Then("Click Guaranteed Hours button In Tail Setup")
	public void Click_Guaranteed_Hours_button_In_Tail_Setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"headingTwele2\"]/div/table/tbody/tr/td[1]/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"headingTwele2\"]/div/table/tbody/tr/td[1]/span"));
		ele.click();
	}

	@And("Click Add New Setup button In Guaranteed Hours")
	public void Click_Add_New_Setup_button_In_Guaranteed_Hours(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNewSetup")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNewSetup"));
		ele.click();
	}

	@Then("Click Close button In Guaranteed Hours")
	public void Click_Close_button_In_Guaranteed_Hours(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ImageButton1")));
		ele=driver.findElement(By.id("ImageButton1"));
		ele.click();
	}

	@Then("Click Save button In Guaranteed Hours")
	public void Click_Save_button_In_Guaranteed_Hours(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveGuaran")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSaveGuaran"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : "+text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Alert is Displayed");
		}
	}

	@And("Enter Valid Details In Guaranteed Hours")
	public void Enter_Valid_Details_In_Guaranteed_Hours() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtStartDate")));
		//Start Date
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtStartDate"));
		ele.click();
		ele1=driver.findElement(By.id("CalendarExtender10_nextArrow"));
		ele1.click();
		Thread.sleep(2000);
		ele4=driver.findElement(By.id("CalendarExtender10_day_1_3"));
		ele4.click();
		//Guaranteed Hour
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtGuarHours"));
		ele2.sendKeys("3");
		//Shortfall Payout
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtShortfall"));
		ele3.sendKeys("1");
	}

	@Then("Click Clear button In Guaranteed Hours")
	public void Click_Clear_button_In_Guaranteed_Hours(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnGHClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnGHClear"));
		ele.click();
	}

	@Then("Click Yes Radio button In Guaranteed Hours")
	public void Click_Yes_Radio_button_In_Guaranteed_Hours(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoMxHourSetup_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoMxHourSetup_1"));
		ele.click();
	}

	@And("Click Flat Radio button In Guaranteed Hours")
	public void Click_Flat_Radio_button_In_Guaranteed_Hours(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoOwnerRequirement_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoOwnerRequirement_1"));
		ele.click();
	}

	@Then("Enter Details In Flat Details In Guaranteed Hours")
	public void Enter_Details_In_Flat_Details_In_Guaranteed_Hours() throws InterruptedException{
		Thread.sleep(3000);
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtOwnHrReq"));
		ele.sendKeys("2");
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtOwnDayReq"));
		ele1.sendKeys("1");
	}

	@And("Click Range Radio button In Guaranteed Hours")
	public void Click_Range_Radio_button_In_Guaranteed_Hours(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoOwnerRequirement_2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoOwnerRequirement_2"));
		ele.click();
	}

	@Then("Click Add Range button In Guaranteed Hours")
	public void Click_Add_Range_button_In_Guaranteed_Hours(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnORAdd")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnORAdd"));
		ele.click();
	}

	@And("Click Both Radio button In Range Setup")
	public void Click_Both_Radio_button_In_Range_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblOWRRange_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblOWRRange_0"));
		ele.click();
	}

	@Then("Enter Details In Range Setup")
	public void Enter_Details_In_Range_Setup() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnORAdd")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtOwnerHRFrom"));
		ele.sendKeys("1");

		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtOwnerHRTo"));
		ele1.sendKeys("1");

		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtOwnerDayFrom"));
		ele2.sendKeys("1");

		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtOwnerDayTo"));
		ele3.sendKeys("1");

		ele4=driver.findElement(By.id("ContentPlaceHolder1_txtGHtoOwner"));
		ele4.sendKeys("1");
	}

	@And("Click Clear button In Range Setup")
	public void Click_Clear_button_In_Range_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnRangeClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnRangeClear"));
		ele.click();
	}

	@And("Click Add button In Range Setup")
	public void Click_Add_button_In_Range_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnRangeSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnRangeSave"));
		ele.click();
	}

	@And("Click Hours Radio button In Range Setup")
	public void Click_Hours_Radio_button_In_Range_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblOWRRange_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblOWRRange_1"));
		ele.click();
	}

	@Then("Enter Details In Hours Range Setup")
	public void Enter_Details_In_Hours_Range_Setup() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtOwnerHRFrom")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtOwnerHRFrom"));
		ele.sendKeys("1");

		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtOwnerHRTo"));
		ele1.sendKeys("1");

		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtGHtoOwner"));
		ele2.sendKeys("1");

	}

	@And("Click Days Radio button In Range Setup")
	public void Click_Days_Radio_button_In_Range_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblOWRRange_2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblOWRRange_2"));
		ele.click();
	}

	@Then("Enter Details In Date Range Setup")
	public void Enter_Details_In_Date_Range_Setup() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtOwnerDayFrom")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtOwnerDayFrom"));
		ele.sendKeys("1");

		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtOwnerDayTo"));
		ele1.sendKeys("1");

		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtGHtoOwner"));
		ele2.sendKeys("1");
	}

	@Then("Click Specs Sheet button In Tail Setup")
	public void Click_Specs_Sheet_button_In_Tail_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"headingFourteen2\"]/div/table/tbody/tr/td[1]/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"headingFourteen2\"]/div/table/tbody/tr/td[1]/span"));
		ele.click();
	}

	@And("Click Add button In Specs Sheet")
	public void Click_Add_button_In_Specs_Sheet(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnMiscellaneous")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnMiscellaneous"));
		ele.click();
	}

	@Then("Click Close button In Specs Sheet")
	public void Click_Close_button_In_Specs_Sheet(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imgcloseNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imgcloseNew"));
		ele.click();
	}

	@Then("Enter Valid Details In Specs Sheet")
	public void Enter_Valid_Details_In_Specs_Sheet() throws InterruptedException{
		Thread.sleep(3000);
		String frameId = "ContentPlaceHolder1_frmImageGallery"; 
		driver.switchTo().frame(frameId);
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTotalTime")));
		//Total time
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtTotalTime"));
		ele.click();
		ele.sendKeys("Test");
		//Sub total time
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtSubTotal"));
		ele1.sendKeys("Test");
		//Landings
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtLandings"));
		ele2.sendKeys("Test");
		//LE Total time
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtLeftEngine"));
		ele3.sendKeys("Test");
		//LE Cycles
		ele4=driver.findElement(By.id("ContentPlaceHolder1_txtLeftCycles"));
		ele4.sendKeys("Test");
		//LE Time Since Midlife
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtLeftMidlife"));
		ele5.sendKeys("Test");
		//RE Total time
		ele6=driver.findElement(By.id("ContentPlaceHolder1_txtRightEngine"));
		ele6.sendKeys("Test");
		//RE Cycles
		ele7=driver.findElement(By.id("ContentPlaceHolder1_txtRightCycles"));
		ele7.sendKeys("Test");
		//RE Time Since Midlife
		ele8=driver.findElement(By.id("ContentPlaceHolder1_txtRightMidlife"));
		ele8.sendKeys("Test");
		//Allied Signal GTCP36-150
		ele9=driver.findElement(By.id("ContentPlaceHolder1_txtAllied"));
		ele9.sendKeys("Test");
		//Flt.Guidance Comp
		ele10=driver.findElement(By.id("ContentPlaceHolder1_txtFltGudance"));
		ele10.sendKeys("Test");
		//Auto Pilot
		ele11=driver.findElement(By.id("ContentPlaceHolder1_txtAutoPilot"));
		ele11.sendKeys("Test");
		//Navigation
		ele12=driver.findElement(By.id("ContentPlaceHolder1_txtNavigation"));
		ele12.sendKeys("Test");
		//Communication
		ele13=driver.findElement(By.id("ContentPlaceHolder1_txtCommunication"));
		ele13.sendKeys("Test");
		//DME
		ele14=driver.findElement(By.id("ContentPlaceHolder1_txtDME"));
		ele14.sendKeys("Test");
		//ADF
		ele15=driver.findElement(By.id("ContentPlaceHolder1_txtADF"));
		ele15.sendKeys("Test");
		//Transponder
		ele16=driver.findElement(By.id("ContentPlaceHolder1_txtTranspondar"));
		ele16.sendKeys("Test");
		//Color Radar
		ele17=driver.findElement(By.id("ContentPlaceHolder1_txtColorRadar"));
		ele17.sendKeys("Test");
		//Radio Altimeter
		ele18=driver.findElement(By.id("ContentPlaceHolder1_txtRadioAltimeter"));
		ele18.sendKeys("Test");
		//EGPWS
		ele19=driver.findElement(By.id("ContentPlaceHolder1_txtEGPWS"));
		ele19.sendKeys("Test");
		//FMS
		ele20=driver.findElement(By.id("ContentPlaceHolder1_txtFMSFirst"));
		ele20.sendKeys("Test");
		//GPS
		ele21=driver.findElement(By.id("ContentPlaceHolder1_txtGPS"));
		ele21.sendKeys("Test");
		//IRS
		ele22=driver.findElement(By.id("ContentPlaceHolder1_txtIRS"));
		ele22.sendKeys("Test");
		//HF
		ele23=driver.findElement(By.id("ContentPlaceHolder1_txtHF"));
		ele23.sendKeys("Test");
		//TCAS
		ele24=driver.findElement(By.id("ContentPlaceHolder1_txtTCAS"));
		ele24.sendKeys("Test");
		//CVR
		ele25=driver.findElement(By.id("ContentPlaceHolder1_txtCVR"));
		ele25.sendKeys("Test");
		//FDR
		ele26=driver.findElement(By.id("ContentPlaceHolder1_txtFDR"));
		ele26.sendKeys("Test");
		//NAV
		ele27=driver.findElement(By.id("ContentPlaceHolder1_txtNAV"));
		ele27.sendKeys("Test");
		//FMS
		ele28=driver.findElement(By.id("ContentPlaceHolder1_txtFMS"));
		ele28.sendKeys("Test");
		//Other Features
		ele29=driver.findElement(By.id("ContentPlaceHolder1_txtOtherFeatures"));
		ele29.sendKeys("Test");
		//Exterior
		ele30=driver.findElement(By.id("ContentPlaceHolder1_txtExterior"));
		ele30.sendKeys("Test");
		//Interior
		ele30=driver.findElement(By.id("ContentPlaceHolder1_txtIntereior"));
		ele30.sendKeys("Test");
	}

	@And("Click Clear button In Specs Sheet")
	public void Click_Clear_button_In_Specs_Sheet() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnMiscellaneousClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnMiscellaneousClear"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		ele.click();
	}
	
	@And("Click Save button In Specs Sheet")
	public void Click_Save_button_In_Specs_Sheet() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnMiscellaneousSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnMiscellaneousSave"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		ele.click();
	}
	
	@And("Click MS Cover Page button In Setup")
	public void Click_MS_Cover_Page_button_In_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/div/ul/li[4]/a/span"));
		ele1.click();
	}
	
	@Then("Click Add New button In MS Cover Page")
	public void Click_Add_New_button_In_MS_Cover_Page(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}
	
	@And("Click Back button In MS Cover Page")
	public void Click_Back_button_In_MS_Cover_Page(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}
	
	@And("Click Sample File button In MS Cover Page")
	public void Click_Sample_File_button_In_MS_Cover_Page(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkSample")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_lnkSample"));
		ele.click();
	}
	
	@And("Select Valid Tail In MS Cover Page")
	public void Select_Valid_Tail_In_MS_Cover_Page(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	
	@Then("Upload The File In MS Cover Page")
	public void Upload_The_File_In_MS_Cover_Page() throws InterruptedException, AWTException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div/div/div/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td/label")));
		ele=driver.findElement(By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div/div/div/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td/label"));
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
	}
	
	@Then("Click View button In MS Cover Page")
	public void Click_View_button_In_MS_Cover_Page() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlFilterTail")));
		//Select tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFilterTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		//click view button
		ele1=driver.findElement(By.id("ContentPlaceHolder1_gvSummary_imbEdit_0"));
		ele1.click();
	}
	
	@Then("Click Delete button In MS Cover Page")
	public void Click_Delete_button_In_MS_Cover_Page(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnDelete")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnDelete"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		ele.click();
		alert.accept();
	}
	
	@And("Click Crew Setup button In Setup")
	public void Click_Crew_Setup_button_In_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/div/ul/li[5]/a/span"));
		ele1.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		}
	
	@Then("Click Add Crew button In Crew Setup")
	public void Click_Add_Crew_button_In_Crew_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}
	
	@And("Click Save button In Crew Setup")
	public void Click_Save_button_In_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnStep5")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnStep5"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : "+text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Alert Message is Displayed");
		}
		
	}
		@And("Click Back button In Crew Setup")
		public void Click_Back_button_In_Setup(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
			ele.click();
			try {
				Alert alert = driver.switchTo().alert();
				String text = alert.getText();
				System.out.println("Alert Message is : "+text);
				alert.accept();
			}
			catch(NoAlertPresentException e) {
				System.out.println("No Alert Message is Displayed");
			}
}
	
		@And("Enter Valid Details In Crew Setup")
		public void Enter_Valid_Details_In_Crew_Setup(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtPilotId")));
			//Crew ID
			ele=driver.findElement(By.id("ContentPlaceHolder1_txtPilotId"));
			ele.sendKeys("1234565");
			//First Name
			ele1=driver.findElement(By.id("ContentPlaceHolder1_txtFirstName"));
			ele1.sendKeys("Test");
			//Last Name
			ele2=driver.findElement(By.id("ContentPlaceHolder1_txtLastName"));
			ele2.sendKeys("Test");
			//User Role
			ele3=driver.findElement(By.id("ContentPlaceHolder1_ddlUserType"));
			Select sel=new Select(ele3);
			sel.selectByIndex(4);
			//Crew Type
			ele4=driver.findElement(By.id("ContentPlaceHolder1_ddlCrewType"));
			Select sel1=new Select(ele4);
			sel1.selectByIndex(1);
			//Email ID
			ele5=driver.findElement(By.id("ContentPlaceHolder1_txtEmail"));
			ele5.sendKeys("0211thiru@gmail.com");
			//GP Account Number
			ele6=driver.findElement(By.id("ContentPlaceHolder1_txtCrewAccNo"));
			ele6.sendKeys("1234567890");
			//GP Account Name
			ele7=driver.findElement(By.id("ContentPlaceHolder1_txtNameInGP"));
			ele7.sendKeys("Tester");
			//Position
			ele8=driver.findElement(By.id("ContentPlaceHolder1_ddlPosition"));
			ele8.sendKeys("Tester");
			//Start Date
			ele9=driver.findElement(By.id("ContentPlaceHolder1_txtStartDate"));
			ele9.click();
			ele10=driver.findElement(By.id("CalendarExtender7_day_2_2"));
			ele10.click();
			//Country
			ele11=driver.findElement(By.id("ContentPlaceHolder1_ddlCountry"));
			Select sel2=new Select(ele11);
			sel2.selectByValue("1");
			//State
			ele12=driver.findElement(By.id("ContentPlaceHolder1_ddlState"));
			Select sel3=new Select(ele12);
			sel3.selectByIndex(1);
			//City
			ele13=driver.findElement(By.id("ContentPlaceHolder1_txtCity"));
			ele13.sendKeys("Test");
			//Zipcode
			ele14=driver.findElement(By.id("ContentPlaceHolder1_txtZipcode"));
			ele14.sendKeys("123456");
			//Address 1
			ele15=driver.findElement(By.id("ContentPlaceHolder1_txtAddress1"));
			ele15.sendKeys("Test");
			//Address 2
			ele16=driver.findElement(By.id("ContentPlaceHolder1_txtAddress2"));
			ele16.sendKeys("Test");
			//Alt Email ID
			ele17=driver.findElement(By.id("ContentPlaceHolder1_txtAltEmailId"));
			ele17.sendKeys("0211thiru@gmail.com");
			//Phone
			ele18=driver.findElement(By.id("ContentPlaceHolder1_txtPhone"));
			ele18.sendKeys("9876543210");
		}
		
		@Then("Upload Profile Photo In Crew Setup")
		public void Upload_Profile_Photo_In_Crew_Setup() throws InterruptedException, AWTException{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_GetImage")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_GetImage"));
			ele.click();
			Thread.sleep(2000);
			ele1=driver.findElement(By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div/div/div/div/div[8]/div/div/div[2]/table/tbody/tr[2]"));
			ele1.click();
			Thread.sleep(2000);
			String FilePath="C:\\Users\\thirumaran\\OneDrive\\Desktop\\Image.jpg";
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
			ele2=driver.findElement(By.id("ContentPlaceHolder1_btnYes"));
			ele2.click();
			Thread.sleep(2000);
			ele3=driver.findElement(By.id("ContentPlaceHolder1_btnClose"));
			ele3.click();
		}
		
		@Then("Click Salary Setup button In Crew Setup")
		public void Click_Salary_Setup_button_In_Crew_Setup(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ancSalary")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_ancSalary"));
			ele.click();
		}
		
		@And("Click Save button In Salary Setup")
		public void Click_Save_button_In_Salary_Setup(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnUpdate")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_btnUpdate"));
			ele.click();
			try {
				Alert alert = driver.switchTo().alert();
				String text = alert.getText();
				System.out.println("Alert Message is : "+text);
				alert.accept();
			}
			catch(NoAlertPresentException e) {
				System.out.println("No Alert Message is Displayed");
			}
		}
		
		@And("Enter Valid Details In Salary Setup")
		public void Enter_Valid_Details_In_Salary_Setup() throws InterruptedException{
			Thread.sleep(2000);
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtBasicSalry")));
			//Basic Salary
			ele=driver.findElement(By.id("ContentPlaceHolder1_txtBasicSalry"));
			ele.sendKeys("1212");
			//Medical
			ele1=driver.findElement(By.id("ContentPlaceHolder1_txtMedicalk"));
			ele1.sendKeys("12");
			//Life
			ele2=driver.findElement(By.id("ContentPlaceHolder1_txtLife"));
			ele2.sendKeys("12");
			//STD
			ele3=driver.findElement(By.id("ContentPlaceHolder1_txtSTD"));
			ele3.sendKeys("12");
			//Dental
			ele4=driver.findElement(By.id("ContentPlaceHolder1_txtDental"));
			ele4.sendKeys("12");
			//ADAD
			ele5=driver.findElement(By.id("ContentPlaceHolder1_txtADAD"));
			ele5.sendKeys("12");
			//F401k
			ele6=driver.findElement(By.id("ContentPlaceHolder1_txtF401K"));
			ele6.sendKeys("34");
			//Cell Phone
			ele7=driver.findElement(By.id("ContentPlaceHolder1_txtCellPhone"));
			ele7.sendKeys("123444");
			//Vision
			ele8=driver.findElement(By.id("ContentPlaceHolder1_txtVision"));
			ele8.sendKeys("12");
			//LTD
			ele9=driver.findElement(By.id("ContentPlaceHolder1_txtLtd"));
			ele9.sendKeys("14");
			//WC
			ele10=driver.findElement(By.id("ContentPlaceHolder1_txtWC"));
			ele10.sendKeys("14");
			//Vacation Hour
			ele11=driver.findElement(By.id("ContentPlaceHolder1_txtVacationHour"));
			ele11.sendKeys("14");
			//Vacation Liability
			ele12=driver.findElement(By.id("ContentPlaceHolder1_txtVacLia"));
			ele12.sendKeys("12");
		}
		
		@And("Click Back button In Salary Setup")
		public void Click_Back_button_In_Salary_Setup(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
			ele.click();
		}
		
		@And("Click Peak Days button In Setup")
		public void Click_Peak_Days_button_In_Setup(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span")));
			ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span"));
			ele.click();
			ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/div/ul/li[9]/a/span"));
			ele1.click();
		}
		
		@Then("Click Download button In Peak Days")
		public void Click_Download_button_In_Peak_Days(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvPeekDays_imbExport_0")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_gvPeekDays_imbExport_0"));
			ele.click();
		}
		
		@Then("Click Add New button In Peak Days")
		public void Click_Add_New_button_In_Peak_Days(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
			ele.click();
		}
		
		@And("Click Upload button In Peak Days")
		public void Click_Upload_button_In_Peak_Days(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnUpload")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_btnUpload"));
			ele.click();
			try {
				Alert alert = driver.switchTo().alert();
				String text = alert.getText();
				System.out.println("Alert Message is : "+text);
				alert.accept();
			}
			catch(NoAlertPresentException e) {
				System.out.println("No Alert Message is Displayed");
			}
		}
		
		@And("Click Back button In Peak Days")
		public void Click_Back_button_In_Peak_Days(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
			ele.click();
		}
		
		@And("Click Sample Files button In Peak Days")
		public void Click_Sample_Files_button_In_Peak_Days(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkSample")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_lnkSample"));
			ele.click();
		}
		
		@And("Enter Valid Details In Peak Days")
		public void Enter_Valid_Details_In_Peak_Days() throws InterruptedException, AWTException{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
			//From Date
			ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
			ele.click();
			ele1=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_day_2_2"));
			ele1.click();
			//To date
			ele2=driver.findElement(By.id("ContentPlaceHolder1_txtToDate"));
			ele2.click();
			ele3=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender2_day_5_1"));
			ele3.click();
			//Upload File
			ele4=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_dvFormView\"]/div[2]/div[2]/div/label/div"));
			ele4.click();
			Thread.sleep(2000);
			String FilePath="C:\\Users\\thirumaran\\OneDrive\\Desktop\\New XLSX Worksheet.xlsx";
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
			//Notes
			ele5=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
			ele5.sendKeys("Test");
		}
		
		@And("Click Admin OP Rights button In Setup")
		public void Click_Admin_OP_Rights_button_In_Setup(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span")));
			ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span"));
			ele.click();
			ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/div/ul/li[10]/a/span"));
			ele1.click();
		}
		
		@Then("Click Add OP Rights In Admin OP Rights button")
		public void Click_Add_OP_Rights_In_Admin_OP_Rights_button(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
			ele.click();
		}
		
		@And("Click Save button In Admin OP Rights button")
		public void Click_Save_button_In_Admin_OP_Rights_button() throws InterruptedException{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		
			ele4=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0, 0)");
		
			ele=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
			ele.click();
			try {
				Alert alert = driver.switchTo().alert();
				String text = alert.getText();
				System.out.println("Alert Message is : "+text);
				alert.accept();
			}
			catch(NoAlertPresentException e) {
				System.out.println("No Alert Message is Displayed");
			}
		}
		
		@And("Click Back button In Admin OP Rights button")
		public void Click_Back_button_In_Admin_OP_Rights_button(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnback")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_btnback"));
			ele.click();
		}
		
		@And("Enter Valid Details In Admin OP Rights button")
		public void Enter_Valid_Details_In_Admin_OP_Rights_button() throws InterruptedException{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddluser")));
			//Select User
			ele=driver.findElement(By.id("ContentPlaceHolder1_ddluser"));
			Select sel=new Select(ele);
			sel.selectByValue("471");
			
			//Select tail
			ele1=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
			Select sel1=new Select(ele1);
			sel1.selectByIndex(1);
			
			//Enter notes
			ele2=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
			ele2.sendKeys("Test");
			
			//Click Active Radio Button
			ele3=driver.findElement(By.id("ContentPlaceHolder1_rblactive_0"));
			ele3.click();
			
			Thread.sleep(2000);
			
			By showRadioButtonLocator = By.xpath("//input[@type='radio' and @value='ON']"); // Replace with a suitable locator
			List<WebElement> showRadioButtons = driver.findElements(showRadioButtonLocator);
			// Click each "show" radio button
			for (WebElement radioButton : showRadioButtons) {
				if (!radioButton.isSelected()) {
					radioButton.click();
				}
			}
			
			ele4=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", ele4);
			Thread.sleep(2000);
			By HideRadioButtonLocator = By.xpath("//input[@type='radio' and @value='OF']"); // Replace with a suitable locator
			List<WebElement> HideRadioButtons = driver.findElements(HideRadioButtonLocator);
			// Click each "show" radio button
			for (WebElement radioButton : HideRadioButtons) {
				if (!radioButton.isSelected()) {
					radioButton.click();
				}
			}
			
		}
		
		@Then("Click Edit button In Admin OP Rights button")
		public void Click_Edit_button_In_Admin_OP_Rights_button(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvOPGrid_imbEdit_0")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_gvOPGrid_imbEdit_0"));
			ele.click();
		}
		
		@And("Click Unlock User button In Setup")
		public void Click_Unlock_User_button_In_Setup(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span")));
			ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span"));
			ele.click();
			ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/div/ul/li[7]/a/span"));
			ele1.click();
		}
		
		@Then("Click Unlock button In Unlock User")
		public void Click_Unlock_button_In_Unlock_User(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvUsers_imbEdit_0")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_gvUsers_imbEdit_0"));
			ele.click();
		}
		
		@And("Click Owner Radio button In Unlock User")
		public void Click_Owner_Radio_button_In_Unlock_User(){
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblChooseUser_1")));
			ele=driver.findElement(By.id("ContentPlaceHolder1_rblChooseUser_1"));
			ele.click();
		}
		
}

