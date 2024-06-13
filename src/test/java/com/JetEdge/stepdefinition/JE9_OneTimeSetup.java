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


public class JE9_OneTimeSetup {
	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9,ele10,
	ele11,ele12,ele13,ele14,ele15,ele16,ele17,ele18,ele19,ele20,
	ele21,ele22,ele23,ele24,ele25,ele26,ele27,ele28,ele29,ele30;

	@Given("To Check One Time Setup User Is Navigating To JetEdge Signin URL Is {string}")
	public void user_is_navigating_to_jet_edge_signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@And("To Check One Time Setup Enter User Name and Password Are {string} and {string}")
	public void enter_the_user_name_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@Then("Click Sign In button for One Time Setup Check")
	public void click_the_sign_in_button_In_JetEdge() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@Then("Close One Time Setup Page")
	public void close_Management_portal_page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@And("Click Opening Balance button In One Time Setup")
	public void Click_Opening_Balance_button_In_One_Time_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[10]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[10]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[10]/div/ul/li[1]/a/span"));
		ele1.click();
	}
	
	@Then("Click Add New button In Opening Balance")
	public void Click_Add_New_button_In_Opening_Balance(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}
	
	@And("Click Save button In Opening Balance")
	public void Click_Save_button_In_Opening_Balance(){
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
	
	@And("Click Close button In Opening Balance")
	public void Click_Close_button_In_Opening_Balance(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele=driver.findElement(By.id("btnClose"));
		ele.click();
	}
	
	@And("Enter Valid Details In Opening Balance")
	public void Enter_Valid_Details_In_Opening_Balance(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTail")));
		
		//Select tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		
		//Begin Month
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtInvMonth"));
		ele1.click();
		ele2=driver.findElement(By.id("cal1_month_1_1"));
		ele2.click();
		
		//Opening Balance
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtAmount"));
		ele3.sendKeys("1212");
		
		//Notes
		ele4=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele4.sendKeys("Test");
	}
	
	@And("Click Clear button In Opening Balance")
	public void Click_Clear_button_In_Opening_Balance(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}
	
	@Then("Click Edit button In Opening Balance")
	public void Click_Edit_button_In_Opening_Balance() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlFTail")));
		//Select tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		Thread.sleep(3000);
		//Click Edit button
		ele1=driver.findElement(By.id("ContentPlaceHolder1_gvCloInvestment_imbEdit_0"));
		ele1.click();
	}
	
	@Then("Select Valid Tail In One Time Setup")
	public void Select_Valid_Tail_In_One_Time_Setup() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlFTail")));
		//Select tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	
	@And("Click Delete button In One Time Setup")
	public void Click_Delete_button_In_One_Time_Setup() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvCloInvestment_imbDelete_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvCloInvestment_imbDelete_0"));
		ele.click();
	}
	
	@And("Click Operating Deposit button In One Time Setup")
	public void Click_Operating_Deposit_button_In_One_Time_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[10]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[10]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[10]/div/ul/li[2]/a/span"));
		ele1.click();
	}
	
	@Then("Click Excel button In Operating Deposit")
	public void Click_Excel_button_In_Operating_Deposit() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnExport"));
		ele.click();
	}
	
	@Then("Click Add New button In Operating Deposit")
	public void Click_Add_New_button_In_Operating_Deposit() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}
	
	@And("Click Save button In Operating Deposit")
	public void Click_Save_button_In_Operating_Deposit(){
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
	
	@And("Click Back button In Operating Deposit")
	public void Click_Back_button_In_Operating_Deposit(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}
	
	@Then("Enter Valid Details In Operating Deposit")
	public void Enter_Valid_Details_In_Operating_Deposit() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailNo")));
		//Select tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		//transaction date
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtDate"));
		ele1.click();
		ele2=driver.findElement(By.id("ContentPlaceHolder1_calendar1ss_day_2_3"));
		ele2.click();
		//Ref/cheque Number
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtTranNumber"));
		ele3.sendKeys("Test123");
		//Notes
		ele4=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele4.sendKeys("Test");
		//Amount
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtAmount"));
		ele5.sendKeys("12");
		//Payment mode
		ele6=driver.findElement(By.id("ContentPlaceHolder1_ddlPaymentMode"));
		Select sel1=new Select(ele6);
		sel1.selectByIndex(1);
		//Payment from
		ele7=driver.findElement(By.id("ContentPlaceHolder1_ddlPaymentFrom"));
		Select sel2=new Select(ele7);
		sel2.selectByIndex(1);
	}
	
	@And("Click Clear button In Operating Deposit")
	public void Click_Clear_button_In_Operating_Deposit(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}
	
	@Then("Select Valid From Month In Operating Deposit")
	public void Select_Valid_From_and_To_Month_In_Operating_Deposit() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTDate")));
		//From Month click
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtTDate"));
		ele.click();
		Thread.sleep(2000);
		//select previous year arrow
		ele1=driver.findElement(By.id("cal1_prevArrow"));
		ele1.click();
		Thread.sleep(2000);
		//select month
		ele2=driver.findElement(By.id("cal1_month_0_0"));
		ele2.click();
	}
	
	@And("Select Valid Tail In Operating Deposit")
	public void Select_Valid_Tail_In_Operating_Deposit(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlNTailNo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlNTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	
	@Then("Click Search button In Operating Deposit")
	public void Click_Search_button_In_Operating_Deposit(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSearch")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSearch"));
		ele.click();
	}
	
	@And("Click Edit button In Operating Deposit")
	public void Click_Edit_button_In_Operating_Deposit() throws InterruptedException{
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvSetup_imbView_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvSetup_imbView_0"));
		ele.click();
	}
	
	@Then("Modify Details In Operating Deposit")
	public void Modify_Details_In_Operating_Deposit(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailNo")));
		//Select tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		//transaction date
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtDate"));
		ele1.click();
		ele2=driver.findElement(By.id("ContentPlaceHolder1_calendar1ss_day_2_3"));
		ele2.click();
		//Ref/cheque Number
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtTranNumber"));
		ele3.sendKeys("Test123");
		//Notes
		ele4=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele4.sendKeys("Test");
		//Amount
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtAmount"));
		ele5.sendKeys("12");
		//Payment mode
		ele6=driver.findElement(By.id("ContentPlaceHolder1_ddlPaymentMode"));
		Select sel1=new Select(ele6);
		sel1.selectByIndex(1);
		//Payment from
		ele7=driver.findElement(By.id("ContentPlaceHolder1_ddlPaymentFrom"));
		Select sel2=new Select(ele7);
		sel2.selectByIndex(1);
	}
	
	@And("Click Delete button In Operating Deposit")
	public void Click_Delete_button_In_Operating_Deposit() throws InterruptedException{
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvSetup_imbDel_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvSetup_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert Message is : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}
	
	@And("Click Cycle Or Flight Hour Setup button In One Time Setup")
	public void Click_Cycle_Or_Flight_Hour_Setup_button_In_One_Time_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[10]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[10]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[10]/div/ul/li[3]/a/span"));
		ele1.click();
	}
	
	@Then("Click Add New button In Cycle Or Flight Hour Setup")
	public void Click_Add_New_button_In_Cycle_Or_Flight_Hour_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}
	
	@And("Click Save button In Cycle Or Flight Hour")
	public void Click_Save_button_In_Cycle_Or_Flight_Hour_Setup(){
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
	
	@And("Click Close button In Cycle Or Flight Hour")
	public void Click_Close_button_In_Cycle_Or_Flight_Hour_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ImageButton2")));
		ele=driver.findElement(By.id("ImageButton2"));
		ele.click();
	}
	
	@Then("Enter Valid Details In Cycle Or Flight Hour Setup")
	public void Enter_Valid_Details_In_Cycle_Or_Flight_Hour_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTail")));
		
		//Select Tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		
		//Begin Date
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtBeginDate"));
		ele1.click();
		ele9=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_day_2_3"));
		ele9.click();
		
		//Cycle Count
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtCycleCount"));
		ele2.sendKeys("1");
		
		//flight hours 
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtFlyHours"));
		ele3.sendKeys("1");
		
		//cycle count (Engine 1)
		ele4=driver.findElement(By.id("ContentPlaceHolder1_txtEngine1Cycle"));
		ele4.sendKeys("1");
		
		//Flight hours (Engine 1)
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtEngine1Hours"));
		ele5.sendKeys("1");
		
		//Cycle Count (Engine 2)
		ele6=driver.findElement(By.id("ContentPlaceHolder1_txtEngine2Cycle"));
		ele6.sendKeys("1");
		
		//Flight Hours (Engine 2)
		ele7=driver.findElement(By.id("ContentPlaceHolder1_txtEngien2Hours"));
		ele7.sendKeys("1");
		
		
		//Notes
		ele8=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele8.sendKeys("Test");
	}
	
	@And("Click Clear button In Cycle Or Flight Hour")
	public void Click_Clear_button_In_Cycle_Or_Flight_Hour_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}
	
	@And("Select Valid Tail In Cycle Or Flight Hour Setup")
	public void Select_Valid_Tail_In_Cycle_Or_Flight_Hour_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlNTailNo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlNTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	
	@Then("Click Edit button In Cycle Or Flight Hour Setup")
	public void Click_Edit_button_In_Cycle_Or_Flight_Hour_Setup() throws InterruptedException{
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvCycleFlyHour_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvCycleFlyHour_imbEdit_0"));
		ele.click();
	}
	
	@Then("Modify Valid Details In Cycle Or Flight Hour Setup")
	public void Modify_Valid_Details_In_Cycle_Or_Flight_Hour_Setup() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTail")));
		
		//Select Tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		
		//Begin Date
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtBeginDate"));
		ele1.click();
		ele9=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_day_2_3"));
		ele9.click();
		
		//Cycle Count
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtCycleCount"));
		ele2.sendKeys("1");
		
		//flight hours 
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtFlyHours"));
		ele3.sendKeys("1");
		
		//cycle count (Engine 1)
		ele4=driver.findElement(By.id("ContentPlaceHolder1_txtEngine1Cycle"));
		ele4.sendKeys("1");
		
		//Flight hours (Engine 1)
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtEngine1Hours"));
		ele5.sendKeys("1");
		
		//Cycle Count (Engine 2)
		ele6=driver.findElement(By.id("ContentPlaceHolder1_txtEngine2Cycle"));
		ele6.sendKeys("1");
		
		//Flight Hours (Engine 2)
		ele7=driver.findElement(By.id("ContentPlaceHolder1_txtEngien2Hours"));
		ele7.sendKeys("1");
		
		
		//Notes
		ele8=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele8.sendKeys("Test");
	}
	
	@And("Click Exhibit Index File button In One Time Setup")
	public void Click_Exhibit_Index_File_button_In_One_Time_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[10]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[10]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[10]/div/ul/li[4]/a/span"));
		ele1.click();
	}
	
	@Then("Click Add New button In Exhibit Index")
	public void Click_Add_New_button_In_Exhibit_Index(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_AddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_AddNew"));
		ele.click();
	}
	
	@And("Click View Exhibit Index File button In Exhibit Index")
	public void Click_View_Exhibit_Index_File_button_In_Exhibit_Index(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}
	
	@And("Click Exhibit Radio button In Exhibit Index")
	public void Click_Exhibit_Radio_button_In_Exhibit_Index(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblSetupby_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblSetupby_0"));
		ele.click();
	}
	
	@Then("Select Date In Effective Calendar In Exhibit Index")
	public void Select_Date_In_Effective_Calendar_In_Exhibit_Index() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtEffFrom")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtEffFrom"));
		ele.click();
		ele1=driver.findElement(By.id("CalendarExtender5_day_2_3"));
		ele1.click();
	}
	
	@And("Enter Valid Notes In Exhibit Index")
	public void Enter_Valid_Notes_In_Exhibit_Index(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNotes")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele.sendKeys("Test");
	}
	
	@Then("Upload Valid Files In Exhibit Index")
	public void Upload_Valid_Files_In_Exhibit_Index() throws InterruptedException, AWTException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvGLCode\"]/tbody/tr[2]/td[3]")));
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvGLCode\"]/tbody/tr[2]/td[3]"));
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
	
	@And("Click Clear button In Exhibit Index")
	public void Click_Clear_button_In_Exhibit_Index() throws InterruptedException{
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}
	
	@And("Click Save button In Exhibit Index")
	public void Click_Save_button_In_Exhibit_Index() throws InterruptedException{
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnUpload")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnUpload"));
		ele.click();
	}
	
	@And("Click Group Radio button In Exhibit Index")
	public void Click_Group_Radio_button_In_Exhibit_Index(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblSetupby_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblSetupby_1"));
		ele.click();
	}
	
	@Then("Upload Valid Files In Exhibit Index File")
	public void Upload_Valid_Files_In_Exhibit_Index_File() throws InterruptedException, AWTException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_tdGeneric\"]/table/tbody/tr[1]/td[2]")));
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tdGeneric\"]/table/tbody/tr[1]/td[2]"));
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
	
	@Then("Click Edit button In Exhibit Index")
	public void Click_Edit_button_In_Exhibit_Index(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvExhibitIndex_imbView_4")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvExhibitIndex_imbView_4"));
		ele.click();
	}
	
	@Then("Click Delete button In Exhibit Index")
	public void Click_Delete_button_In_Exhibit_Index(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvGLCode_imbDelete_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvGLCode_imbDelete_1"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert Message is : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}
	
	
}

