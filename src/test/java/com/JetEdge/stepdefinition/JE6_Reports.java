package com.JetEdge.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class JE6_Reports {
	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9,ele10;

	@Given("To Check Reports User Is Navigating To Jet Edge Signin URL is {string}")
	public void User_Is_Navigating_To_Jet_Edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@And("To Check Reports Enter The User Name and Password Are {string} and {string}")
	public void Enter_The_User_Name_and_Password_Are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@Then("Click The Sign In button for Reports Check")
	public void Click_The_Sign_In_button_In_Jet_Edge() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@Then("Close The Reports Page")
	public void Close_The_Web_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@And("Click The State Tax button In Reports")
	public void Click_The_State_Tax_button_In_Reports(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[2]/a/span"));
		ele1.click();
	}

	@Then("Select The Valid From Month Tab In State Tax")
	public void Select_The_Valid_From_Month_Tab_In_State_Tax(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele1=driver.findElement(By.id("cal1_month_0_0"));
		ele1.click();
	}

	@And("Select The Valid To Month Tab In State Tax")
	public void Select_The_Valid_To_Month_Tab_In_State_Tax(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToMonth")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele.click();
		ele1=driver.findElement(By.id("cal2_month_1_1"));
		ele1.click();
	}

	@Then("Select Valid Tail From The Dropdown In State Tax")
	public void Select_Valid_Tail_From_The_Dropdown_In_State_Tax(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailNo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("109CH");
	}

	@And("Click View button In State Tax")
	public void Click_View_button_In_State_Tax(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}

	@Then("Click Excel button In State Tax")
	public void Click_Excel_button_In_State_Tax(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}

	@And("Click The Flight Activity button In Reports")
	public void Click_The_Flight_Activity_button_In_Reports(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[3]/a/span"));
		ele1.click();
	}

	@Then("Select The Valid From Month Tab In Flight Activity")
	public void Select_The_Valid_From_Month_Tab_In_Flight_Activity(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele1=driver.findElement(By.id("cal1_month_0_0"));
		ele1.click();
	}

	@And("Select The Valid To Month Tab In Flight Activity")
	public void Select_The_Valid_To_Month_Tab_In_Flight_Activity(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToMonth")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele.click();
		ele1=driver.findElement(By.id("cal2_month_1_1"));
		ele1.click();
	}

	@Then("Select The Valid Tail From The Dropdown In Flight Activity")
	public void Select_Valid_Tail_From_The_Dropdown_In_Flight_Activity(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailNo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Select Trip Type Radio button In Flight Activity")
	public void Select_Trip_Type_Radio_button_In_Flight_Activity(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoType_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoType_0"));
		ele.click();
	}

	@Then("Click View button In Flight Activity")
	public void Click_View_button_In_Flight_Activity(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}

	@And("Select Leg Type Radio button In Flight Activity")
	public void Select_Leg_Type_Radio_button_In_Flight_Activity(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoType_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoType_1"));
		ele.click();
	}

	@Then("Click The Scheduler button In Flight Activity")
	public void Click_The_Scheduler_button_In_Flight_Activity(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnscheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnscheduler"));
		ele.click();
	}

	@And("Click The Go Report button In Flight Activity")
	public void Click_The_Go_Report_button_In_Flight_Activity(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Button1"));
		ele.click();
	}

	@And("Click The Add Scheduler button In Flight Activity")
	public void Click_The_Add_Scheduler_button_In_Flight_Activity(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddScheduler"));
		ele.click();
	}

	@Then("Click Save button In Scheduler Setup")
	public void Click_Save_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : " + text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Alert is Present");
		}
	}

	@Then("Click Back button In Scheduler Setup")
	public void Click_Back_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@Then("Click The Add External User In Scheduler Setup")
	public void Click_The_Add_External_User_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddExtUser"));
		ele.click();
	}

	@And("Click Save button In External Users")
	public void Click_Save_button_In_External_Users(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSaveExtUser"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : " + text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Alert is Present");
		}
	}

	@And("Click Close button In External Users")
	public void Click_Close_button_In_External_Users(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCloseExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnCloseExtUser"));
		ele.click();
	}

	@And("Enter Valid Details In External Users")
	public void Enter_Valid_Details_In_External_Users(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtName")));
		//Enter name
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtName"));
		ele.sendKeys("Test");
		//Enter Email ID
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtEmailId"));
		ele1.sendKeys("0211thiru@gmail.com");
		//Enter User Role
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtUserRole"));
		ele2.sendKeys("Tester");
	}

	@And("Click Clear button In External Users")
	public void Click_Clear_button_In_External_Users(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCloseExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClearExtUser"));
		ele.click();
	}

	@And("Enter Valid Details In Scheduler Setup")
	public void Enter_Valid_Details_In_Scheduler_Setup() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtEffFrom")));
		//Click Effective calendar
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtEffFrom"));
		ele.click();
		Thread.sleep(2000);
		//Select The Effective calendar
		ele1=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender2_day_4_6"));
		ele1.click();
		Thread.sleep(2000);
		//Select valid tail from the dropdown
		ele2=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele2);
		sel.selectByIndex(1);
		Thread.sleep(4000);
		//Select valid trips
		ele5=driver.findElement(By.id("ContentPlaceHolder1_ddlTripsFrom"));
		Select sel1=new Select(ele5);
		sel1.selectByIndex(1);
		Thread.sleep(2000);
		//Select Email Signature
		ele6=driver.findElement(By.id("ContentPlaceHolder1_ddlSignature"));
		Select sel2=new Select(ele6);
		sel2.selectByIndex(133);
	}

	@Then("Click The Checkbox In Scheduler Setup")
	public void Click_The_Checkbox_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"lblChoose\"]/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"lblChoose\"]/span"));
		ele.click();
	}

	@And("Click Clear button In Scheduler Setup")
	public void Click_Clear_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}

	@And("Click The Edit button In Scheduler Setup")
	public void Click_The_Edit_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvScheduler_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvScheduler_imbEdit_0"));
		ele.click();
	}

	@Then("Click The Back button In Scheduler Setup")
	public void Click_The_Back_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@Then("Click The Stop button In Scheduler Setup")
	public void Click_The_Stop_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnStopScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnStopScheduler"));
		ele.click();
	}

	@Then("Click The Run button In Scheduler Setup")
	public void Click_The_Run_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnRunScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnRunScheduler"));
		ele.click();
	}

	@Then("Click The Clear button In Scheduler Setup")
	public void click_the_clear_button_in_scheduler_setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}

	@And("Click The Flight Activity WPAX button In Reports")
	public void Click_The_Flight_Activity_WPAX_button_In_Reports(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[4]/a/span"));
		ele1.click();
	}

	@Then("Select The Valid From Month Tab In Flight Activity WPAX")
	public void Select_The_Valid_From_Month_Tab_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele1=driver.findElement(By.id("cal1_month_0_0"));
		ele1.click();
	}

	@And("Select The Valid To Month Tab In Flight Activity WPAX")
	public void Select_The_Valid_To_Month_Tab_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToMonth")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele.click();
		ele1=driver.findElement(By.id("cal2_month_1_1"));
		ele1.click();
	}

	@Then("Select The Valid Tail From The Dropdown In Flight Activity WPAX")
	public void Select_Valid_Tail_From_The_Dropdown_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailNo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Select Trip Type Radio button In Flight Activity WPAX")
	public void Select_Trip_Type_Radio_button_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoType_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoType_0"));
		ele.click();
	}

	@Then("Click View button In Flight Activity WPAX")
	public void Click_View_button_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}

	@And("Select Leg Type Radio button In Flight Activity WPAX")
	public void Select_Leg_Type_Radio_button_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoType_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoType_1"));
		ele.click();
	}

	@Then("Click Excel button In Flight Activity WPAX")
	public void Click_Excel_button_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}

	@Then("Click The Scheduler button In Flight Activity WPAX")
	public void Click_The_Scheduler_button_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnScheduler"));
		ele.click();
	}

	@And("Click The Add Scheduler button In Flight Activity WPAX")
	public void Click_The_Add_Scheduler_button_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddScheduler"));
		ele.click();
	}

	@Then("Click Save button In Scheduler Setup In Flight Activity WPAX")
	public void Click_Save_button_In_Scheduler_Setup_In_Scheduler_Setup_In_Flight_Activity_WPAX() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : " + text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Alert is Present");
		}
	}

	@Then("Click The Add External User In Scheduler Setup In Flight Activity WPAX")
	public void Click_The_Add_External_User_In_Scheduler_Setup_In_Flight_Activity_WPAX() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddExUsers")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddExUsers"));
		ele.click();
	}


	@And("Click Close button In External Users In Scheduler Setup In Flight Activity WPAX")
	public void Click_Close_button_In_External_Users_In_Scheduler_Setup_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Image112345")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Image112345"));
		ele.click();
	}

	@Then("Click Back button In Scheduler Setup In Flight Activity WPAX")
	public void Click_Back_button_In_Scheduler_Setup_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Enter Valid Details In External Users In Flight Activity WPAX")
	public void Enter_Valid_Details_In_External_Users_In_Scheduler_Setup_In_Flight_Activity_WPAX() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtExName")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtExName"));
		ele.sendKeys("Tester");
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtExEmailID"));
		ele1.sendKeys("0211thiru@gmail.com");
		Thread.sleep(2000);
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtExUserRole"));
		ele2.sendKeys("Tester");
	}

	@Then("Click Submit button In External Users In Flight Activity WPAX")
	public void Click_Submit_button_In_External_Users_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button4")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Button4"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : "+text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Mandatory Alert Message is showed");
		}
	}

	@Then("Click The Add User In Scheduler Setup In Flight Activity WPAX")
	public void click_the_add_user_in_scheduler_setup_in_flight_activity_wpax() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddAddress")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddAddress"));
		ele.click();
	}

	@And("Click Close button In Users In Scheduler Setup In Flight Activity WPAX")
	public void Click_Close_button_In_Users_In_Scheduler_Setup_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Image1123")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Image1123"));
		ele.click();
	}

	@And("Click Checkbox In Users In Scheduler Setup In Flight Activity WPAX")
	public void Click_Checkbox_In_Users_In_Scheduler_Setup_In_Flight_Activity_WPAX() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[436]/td[5]/label/span")));
		WebElement targetElement = driver.findElement(By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[436]/td[5]/label/span")); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
		Thread.sleep(2000);
		ele=driver.findElement(By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[436]/td[5]/label/span"));
		ele.click();
	}

	@Then("Click Submit button In Users In Flight Activity WPAX")
	public void Click_Submit_button_In_Users_In_Flight_Activity_WPAX() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAdd")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAdd"));
		ele.click();
	}

	@And("Enter Valid Details In Scheduler Setup In Flight Activity WPAX")
	public void Enter_Valid_Details_In_Scheduler_Setup_In_Flight_Activity_WPAX() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtRepName")));
		//Enter Report Name
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtRepName"));
		ele.sendKeys("Tester");	
		//Click effective date
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtEffFrom"));
		ele1.click();
		Thread.sleep(2000);
		//Select effective date
		ele2=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender2_day_1_4"));
		ele2.click();
		//Date Range
		ele3=driver.findElement(By.id("ContentPlaceHolder1_ddlDateRange"));
		Select sel=new Select(ele3);
		sel.selectByIndex(1);
	}

	@Then("Click Clear button In Scheduler Setup In Flight Activity WPAX")
	public void Click_Clear_button_In_Scheduler_Setup_In_Flight_Activity_WPAX() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}

	@Then("Click The Add Tails button In Scheduler Setup In Flight Activity WPAX")
	public void Click_The_Add_Tails_button_In_Scheduler_Setup_In_Flight_Activity_WPAX() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rbltail_1")));
		//Click Specific OP Tails button
		ele=driver.findElement(By.id("ContentPlaceHolder1_rbltail_1"));
		ele.click();
		//Click Add Tails button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddTail"));
		ele.click();
	}

	@And("Click Close button In Add Tails In Scheduler Setup In Flight Activity WPAX")
	public void Click_Close_button_In_Add_Tails_In_Scheduler_Setup_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Image11234")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Image11234"));
		ele.click();
	}

	@And("Select The Tail In Add Tails In Flight Activity WPAX")
	public void Select_The_Tail_In_Add_Tails_In_Flight_Activity_WPAX() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"lblChoose\"]/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"lblChoose\"]/span"));
		ele.click();
	}

	@Then("Click Submit button In Add Tails In Flight Activity WPAX")
	public void Click_Submit_button_In_Add_Tails_In_Flight_Activity_WPAX() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Button2"));
		ele.click();
	}

	@And("Select The Email Signature In Scheduler Setup In Flight Activity WPAX")
	public void Select_The_Email_Signature_In_Scheduler_Setup_In_Flight_Activity_WPAX() throws InterruptedException{
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSignature")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlSignature"));
		Select sel=new Select(ele);
		sel.selectByValue("496");
	}

	@And("Click The Edit Scheduler button In Flight Activity WPAX")
	public void Click_The_Edit_Scheduler_button_In_Flight_Activity_WPAX(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvScheduler_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvScheduler_imbEdit_0"));
		ele.click();
	}

	@Then("Click The Back button In Flight Activity WPAX")
	public void Click_The_Back_button_In_Flight_Activity_WPAX() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@Then("Click The Stop button In Flight Activity WPAX")
	public void Click_The_Stop_button_In_Flight_Activity_WPAX() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnStopScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnStopScheduler"));
		ele.click();
	}

	@Then("Click The Run button In Flight Activity WPAX")
	public void Click_The_Run_button_In_Flight_Activity_WPAX() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnRunScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnRunScheduler"));
		ele.click();
	}

	@Then("Click The Clear button In Flight Activity WPAX")
	public void Click_The_Clear_button_In_Flight_Activity_WPAX() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}

	@And("Modify The Details In Flight Activity WPAX")
	public void Modify_The_Details_In_Flight_Activity_WPAX() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtRepName")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtRepName"));
		String ExistingName = ele.getAttribute("value");
		ele.clear();
		Thread.sleep(2000);
		ele.sendKeys(ExistingName);
	}

	@Then("Click The Update button In Flight Activity WPAX")
	public void Click_The_Update_button_In_Flight_Activity_WPAX() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
	}

	@And("Click The GL Wise Expense button In Reports")
	public void Click_The_GL_Wise_Expense_button_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[5]/a/span"));
		ele1.click();
	}

	@Then("Select From Month In GL Wise Expense")
	public void Select_From_Month_In_GL_Wise_Expense() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//Click From Month
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		//Select The month
		ele1=driver.findElement(By.id("cal1_month_0_0"));
		ele1.click();
	}

	@And("Select To Month GL Wise Expense")
	public void Select_To_Month_GL_Wise_Expense() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToMonth")));
		//Click To Month
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele2.click();
		//Select The month
		ele3=driver.findElement(By.id("cal2_month_1_1"));
		ele3.click();
	}

	@Then("Select Valid Tail In Dropdown In GL Wise Expense")
	public void Select_Valid_Tail_In_Dropdown_In_GL_Wise_Expense() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailNo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Select The Single Expense In GL Wise Expense")
	public void Select_The_Single_Expense_In_GL_Wise_Expense() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTripType")));
		//Click the tab
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtTripType"));
		ele.click();
		//Select the checkbox
		ele1=driver.findElement(By.id("ContentPlaceHolder1_cbTripType_0"));
		ele1.click();
		//click Close button
		ele2=driver.findElement(By.id("ContentPlaceHolder1_Image1"));
		ele2.click();
	}

	@And("Select The Multiple Expense In GL Wise Expense")
	public void Select_The_Multiple_Expense_In_GL_Wise_Expense() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTripType")));
		//Click the tab
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtTripType"));
		ele.click();
		//Select the checkbox
		ele1=driver.findElement(By.id("ContentPlaceHolder1_cbTripType_0"));
		ele1.click();
		ele3=driver.findElement(By.id("ContentPlaceHolder1_cbTripType_1"));
		ele3.click();
		ele4=driver.findElement(By.id("ContentPlaceHolder1_cbTripType_2"));
		ele4.click();
		//click Close button
		ele2=driver.findElement(By.id("ContentPlaceHolder1_Image1"));
		ele2.click();
	}

	@Then("Click View button In GL Wise Expense")
	public void Click_View_button_In_GL_Wise_Expense() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}

	@And("Click Excel button In GL Wise Expense")
	public void Click_Excel_button_In_GL_Wise_Expense() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}

	@And("Click The Statement View button In Reports")
	public void Click_The_Statement_View_button_In_Reports(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[6]/a/span"));
		ele1.click();
	}

	@Then("Select From Month In Statement View")
	public void Select_From_Month_In_Statement_View() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//Click The From Calendar
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		//Select The From Calendar
		ele1=driver.findElement(By.id("cal1_month_0_0"));
		ele1.click();
	}

	@And("Select To Month In Statement View")
	public void Select_To_Month_In_Statement_View() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToMonth")));
		//Click The From Calendar
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele.click();
		//Select The From Calendar
		ele1=driver.findElement(By.id("cal2_month_1_1"));
		ele1.click();
	}

	@Then("Select Valid Tail In Dropdown In Statement View")
	public void Select_Valid_Tail_In_Dropdown_In_Statement_View() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailNo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Click View button In Statement View")
	public void Click_View_button_In_Statement_View() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}

	@And("Click Excel button In Statement View")
	public void Click_Excel_button_In_Statement_View() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}

	@And("Click The Additional Reports button In Reports")
	public void Click_The_Additional_Reports_button_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[7]/a/span"));
		ele1.click();
	}

	@Then("Click Add New button In Additional Reports")
	public void Click_Add_New_button_In_Additional_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click Save button In Additional Reports")
	public void Click_Save_button_In_Additional_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveAddRep")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSaveAddRep"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : "+text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No Alert Message is displayed");
		}
	}

	@And("Click Back button In Additional Reports")
	public void Click_Back_button_In_Additional_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBackAddRep")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBackAddRep"));
		ele.click();
	}

	@Then("Enter Valid Details In Additional Reports")
	public void Enter_Valid_Details_In_Additional_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTail")));
		//Select the tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		//Enter report name
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtRepName"));
		ele1.sendKeys("Testers");
		//Enter Notes
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele2.sendKeys("Testers");
		//Attach the files
		String FilePath="C:\\Users\\thirumaran\\OneDrive\\Desktop\\N109CH.pdf";
		ele2=driver.findElement(By.id("ContentPlaceHolder1_fuFile"));
		ele2.sendKeys(FilePath);
	}

	@And("Click Clear button In Additional Reports")
	public void Click_Clear_button_In_Additional_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClearAddRep")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClearAddRep"));
		ele.click();
	}

	@And("Click The Checkbox In Additional Reports")
	public void Click_The_Checkbox_In_Additional_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_tblForm\"]/tbody/tr[7]/td[2]/label/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tblForm\"]/tbody/tr[7]/td[2]/label/span"));
		if(!ele.isSelected()) {
			ele.click();
		}
		else {
			System.out.println("Checkbox is already selected");
		}
	}

	@Then("Select The Tail In The Dropdown In Additional Reports")
	public void Select_The_Tail_In_The_Dropdown_In_Additional_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlFTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Click Edit button In Additional Reports")
	public void Click_Edit_button_In_Additional_Reports() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvAdditionalReport_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvAdditionalReport_imbEdit_0"));
		ele.click();
	}

	@Then("Modify The Details In Additional Reports")
	public void Modify_The_Details_In_Additional_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtRepName")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtRepName"));
		String ModifiedText = ele.getAttribute("value");
		ele.clear();
		ele.sendKeys(ModifiedText);
	}

	@Then("Click The Delete button In Additional Reports")
	public void Click_The_Delete_button_In_Additional_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvTemp_imbDelete_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvTemp_imbDelete_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@And("Click The Owner Login Report button In Reports")
	public void Click_The_Owner_Login_Report_button_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[10]/a/span"));
		ele1.click();
	}

	@Then("Select The From Date In Owner Login Report")
	public void Select_The_From_Date_In_Owner_Login_Report() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtSchFromDate")));
		//Click The From date
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtSchFromDate"));
		ele.click();
		Thread.sleep(2000);
		//Click The Month 
		ele1=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_title"));
		ele1.click();
		Thread.sleep(2000);
		//Select The Month 
		ele2=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_month_0_0"));
		ele2.click();
		Thread.sleep(2000);
		//Select The Date 
		ele3=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_day_0_1"));
		ele3.click();
	}


	@Then("Select The Tail In Dropdown In Owner Login Report")
	public void Select_The_Tail_In_Dropdown_In_Owner_Login_Report() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(2);
	}

	@And("Click Submit button In Owner Login Report")
	public void Click_Submit_button_In_Owner_Login_Report() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSubmit"));
		ele.click();
	}

	@And("Click The Checkbox In Owner Login Report")
	public void Click_The_Checkbox_In_Owner_Login_Report() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_UpdatePanel1\"]/table[1]/tbody/tr/td[8]/label/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UpdatePanel1\"]/table[1]/tbody/tr/td[8]/label/span"));
		ele.click();
	}

	@Then("Click The Export Excel button In Owner Login Report")
	public void Click_The_Export_Excel_button_In_Owner_Login_Report() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnExport"));
		ele.click();
	}

	@Then("Click The Expand button In Owner Login Report")
	public void Click_The_Expand_button_In_Owner_Login_Report()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgdiv142879")));
		ele=driver.findElement(By.id("imgdiv142879"));
		if(ele.isEnabled()) {
			ele.click();	
			System.out.println("Expand button is working");
		}
		else {
			System.out.println("Expand button is not working");
		}
	}

	@And("Click The Release History button In Reports")
	public void Click_The_Release_History_button_In_Report() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[11]/a/span"));
		ele1.click();
	}

	@Then("Select Valid Month In From Calendar In Release History")
	public void Select_Valid_Month_In_From_Calendar_In_Release_History() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		ele.click();
		ele1=driver.findElement(By.id("cal1_month_0_0"));
		ele1.click();
	}

	@And("Select Valid Month In To Calendar In Release History")
	public void Select_Valid_Month_In_To_Calendar_In_Release_History() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToDate")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtToDate"));
		ele.click();
		ele1=driver.findElement(By.id("cal2_month_1_1"));
		ele1.click();
	}

	@Then("Select Valid Tail In Dropdown In Release History")
	public void Select_Valid_Tail_In_Dropdown_In_Release_History() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailNo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(5);
	}

	@And("Click Submit button In Release History")
	public void Click_Submit_button_In_Release_History() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}

	@Then("Click Excel button In Release History")
	public void Click_Excel_button_In_Release_History() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnExport"));
		ele.click();
	}

	@Then("Click Edit button In Release History")
	public void Click_Edit_button_In_Release_History() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvReleaseHistory_imbHistory_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvReleaseHistory_imbHistory_0"));
		ele.click();
	}

	@And("Click Close button In Release History")
	public void Click_Close_button_In_Release_History() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imgclose")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imgclose"));
		ele.click();
	}

	@And("Click The OP Release Details button In Reports")
	public void Click_The_OP_Release_Details_button_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		ele=driver.findElement(By.xpath("//*[@id=\"RD\"]/a/span"));
		ele.click();
	}

	@Then("Select Valid Month In From Calendar In OP Release Details")
	public void Select_Valid_Month_In_From_Calendar_In_OP_Release_Details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		ele.click();
		ele1=driver.findElement(By.id("cal1_month_0_0"));
		ele1.click();
	}

	@And("Select Valid Month In To Calendar In OP Release Details")
	public void Select_Valid_Month_In_To_Calendar_In_OP_Release_Details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToDate")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtToDate"));
		ele.click();
		ele1=driver.findElement(By.id("cal2_month_1_1"));
		ele1.click();
	}

	@And("Click Submit button In OP Release Details")
	public void Click_Submit_button_In_OP_Release_Details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}

	@Then("Click Edit button In OP Release Details")
	public void Click_Edit_button_In_OP_Release_Details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvSummary_imbHistory_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvSummary_imbHistory_0"));
		ele.click();
	}

	@And("Click Back button In OP Release Details")
	public void Click_Back_button_In_OP_Release_Details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Click The Owner Tracker button In Reports")
	public void Click_The_Owner_Tracker_button_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"OWNTRAC\"]/a/span"));
		ele1.click();
	}

	@Then("Click The View button In Owner Tracker")
	public void Click_The_View_button_In_Owner_Tracker() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvOwnTrackerReport_imbView_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOwnTrackerReport_imbView_0"));
		ele.click();
	}

	@And("Click Back button In Owner Tracker")
	public void Click_Back_button_In_Owner_Tracker() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Click History button In Owner Tracker")
	public void Click_History_button_In_Owner_Tracker() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkShowHistory")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_lnkShowHistory"));
		ele.click();
	}

	@Then("Click Close button In History")
	public void Click_Close_button_In_History() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ImageButton2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ImageButton2"));
		ele.click();
	}

	@And("Click Add New button In Flight Log")
	public void Click_Add_New_button_In_Flight_Log() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddFlightLog")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddFlightLog"));
		ele.click();
	}

	@Then("Click Close button In Flight Log")
	public void Click_Close_button_In_Flight_Log() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imgEditLogClose")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imgEditLogClose"));
		ele.click();
	}

	@Then("Click Save button In Flight Log")
	public void Click_Save_button_In_Flight_Log() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveLog")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSaveLog"));
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

	@Then("Enter Valid Details In Flight Log")
	public void Enter_Valid_Details_In_Flight_Log() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtMonth")));
		Thread.sleep(1000);
		//Enter Month
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtMonth"));
		ele.click();
		Thread.sleep(1000);
		//Select Month
		ele1=driver.findElement(By.id("calendar1_month_1_1"));
		ele1.click();
		Thread.sleep(1000);
		//select date
		ele2=driver.findElement(By.id("calendar1_day_1_4"));
		ele2.click();
		Thread.sleep(1000);
		//Click Date calendar
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtDate"));
		ele3.click();
		Thread.sleep(1000);
		//Select date
		ele4=driver.findElement(By.id("CalendarExtender1_day_1_4"));
		ele4.click();
		Thread.sleep(1000);
		//Enter Flight Hours
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtFH"));
		ele5.sendKeys("1");
		Thread.sleep(1000);
		//Enter Days
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtDays"));
		ele5.sendKeys("1");
		Thread.sleep(1000);
		//Enter Notes
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele5.sendKeys("Test");
	}

	@And("Click Edit button In Flight Log")
	public void Click_Edit_button_In_Flight_Log() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvMFlog_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvMFlog_imbEdit_0"));
		ele.click();
	}

	@Then("Modify The Details In Flight Log")
	public void Modify_The_Details_In_Flight_Log() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFH")));
		//Modify Flight Hours
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtFH"));
		String ModifiedValue = ele5.getAttribute("value");
		ele5.clear();
		ele5.sendKeys(ModifiedValue);
	}

	@Then("Click Go To Setup button In Reports")
	public void Click_Go_To_Setup_button_In_Reports() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkSetup")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_lnkSetup"));
		ele.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@And("Click Add New button In Go To Setup")
	public void Click_Add_New_button_In_Go_To_Setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@Then("Click Save button In Go To Setup")
	public void Click_Save_button_In_Go_To_Setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : "+text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Click Back button In Go To Setup")
	public void Click_Back_button_In_Go_To_Setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnView")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnView"));
		ele.click();
	}

	@Then("Click Add Requester button In Go To Setup")
	public void Click_Add_Requester_button_In_Go_To_Setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddReq")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddReq"));
		ele.click();
	}

	@And("Click Close button In Requesters")
	public void Click_Close_button_In_Requesters() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnReqClose")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnReqClose"));
		ele.click();
	}

	@And("Click Checkbox In Requesters")
	public void Click_Checkbox_In_Requesters() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvChooseReq_chkStatus_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvChooseReq_chkStatus_0"));
		ele.click();
	}

	@Then("Click Submit button In Requesters")
	public void Click_Submit_button_In_Requesters() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAdd")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAdd"));
		ele.click();
	}

	@And("Enter Valid Details In Go To Setup")
	public void Enter_Valid_Details_In_Go_To_Setup() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTail")));
		//Select The Tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		//Enter start date
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtStartDateOfTerm"));
		ele1.click();
		Thread.sleep(2000);
		ele2=driver.findElement(By.id("CalendarExtender1_day_1_4"));
		ele2.click();
		Thread.sleep(2000);
		//Enter End Date
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtEndDateOfTerm"));
		ele3.click();
		Thread.sleep(2000);
		ele4=driver.findElement(By.id("ContentPlaceHolder1_calEndDateOfTerm_day_1_5"));
		ele4.click();
		Thread.sleep(2000);
		//Enter Hours
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtOwnHoursReq"));
		ele5.sendKeys("1");
	}

	@Then("Click Go To Scheduler button In Reports")
	public void Click_Go_To_Scheduler_button_In_Reports() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_lnkScheduler"));
		ele.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("Click Save button In Go To Scheduler")
	public void Click_Save_button_In_Go_To_Scheduler() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : "+text);
			alert.accept();
		}
		catch(NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
			
		}
	}

	@And("Click Back button In Go To Scheduler")
	public void Click_Back_button_In_Go_To_Scheduler() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button4")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Button4"));
		ele.click();
	}

	@And("Click Add Users button In Go To Scheduler")
	public void Click_Add_Users_button_In_Go_To_Scheduler() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddAddress")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddAddress"));
		ele.click();
	}

	@Then("Click Close button In Admin Users")
	public void Click_Close_button_In_Admin_Users() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imgClose")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imgClose"));
		ele.click();
	}

	@Then("Click The Checkbox In Admin Users")
	public void Click_The_Checkbox_In_Admin_Users() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvpAddress_chkStatus_434")));
		WebElement targetElement = driver.findElement(By.id("ContentPlaceHolder1_gvpAddress_chkStatus_434")); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
		Thread.sleep(2000);
		targetElement.click();
	}

	@And("Click Submit button In Admin Users")
	public void Click_Submit_button_In_Admin_Users() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Button2"));
		ele.click();
	}

	@And("Click Add External Users button In Go To Scheduler")
	public void Click_Add_External_Users_button_In_Go_To_Scheduler() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddExtUser"));
		ele.click();
	}

	@Then("Click Close button In Add External Users")
	public void Click_Close_button_In_Add_External_Users() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCloseExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnCloseExtUser"));
		ele.click();
	}

	@Then("Click Save button In Add External Users")
	public void Click_Save_button_In_Add_External_Users() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSaveExtUser"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : " + text);
			alert.accept();
		}
		catch(NoAlertPresentException e){
			System.out.println("No Alert Message is Displayed");
		}
	}

	@And("Enter Valid Details In Add External Users")
	public void Enter_Valid_Details_In_Add_External_Users() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCloseExtUser")));
		//Enter Name
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtName"));
		ele.sendKeys("Tester");
		//Enter Mail ID
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtEmailId"));
		ele1.sendKeys("0211thiru@gmail.com");
		//Enter User Role
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtUserRole"));
		ele2.sendKeys("Tester");
	}

	@Then("Click Clear button In Add External Users")
	public void Click_Clear_button_In_Add_External_Users() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClearExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClearExtUser"));
		ele.click();
	}

	@And("Enter Valid Details In Go To Scheduler")
	public void Enter_Valid_Details_In_Go_To_Scheduler() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblSetupBy_0")));
		Thread.sleep(2000);
		//Start Month
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtStartMonth"));
		ele1.click();
		ele2=driver.findElement(By.id("cal1_month_0_0"));
		ele2.click();
		//Effective Month
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtEffFrom"));
		ele3.click();
		ele4=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender2_day_1_5"));
		ele4.click();
		//Schedule Days
		ele5=driver.findElement(By.id("ContentPlaceHolder1_cblDays_0"));
		ele5.click();
		ele6=driver.findElement(By.id("ContentPlaceHolder1_cblDays_1"));
		ele6.click();
		ele7=driver.findElement(By.id("ContentPlaceHolder1_cblDays_2"));
		ele7.click();
		ele8=driver.findElement(By.id("ContentPlaceHolder1_cblDays_3"));
		ele8.click();
	}
	
	@Then("Click Clear button In Go To Scheduler")
	public void Click_Clear_button_In_Go_To_Scheduler() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}
	
	
	@And("Click Cap Requirement Radio button")
	public void Click_Cap_Requirement_Radio_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblSetupBy_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblSetupBy_1"));
		ele.click();
	}
	
	@Then("Click Add Remainder button")
	public void Click_Add_Remainder_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddRemainder")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddRemainder"));
		ele.click();
	}
	
	@And("Click Close button In Add Remainder")
	public void Click_Close_button_In_Add_Remainder() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnRemClose")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnRemClose"));
		ele.click();
	}
	
	@And("Enter Valid Details In Add Remainder")
	public void Enter_Valid_Details_In_Add_Remainder() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlType")));
		//select the type
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlType"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
		//enter hours
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txxHourDays"));
		ele1.sendKeys("1");
		//Enter message
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtMessage"));
		ele2.sendKeys("Test");
	}
	
	@And("Click Add To List button In Add Remainder")
	public void Click_Add_To_List_button_In_Add_Remainder() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddTOList")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddTOList"));
		ele.click();
	}
	
	@And("Click Choose Tail In Go To Scheduler")
	public void Click_Choose_Tail_In_Go_To_Scheduler() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSchTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlSchTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	
	@Then("Select Email Signature In Go To Scheduler")
	public void Select_Email_Signature_In_Go_To_Scheduler() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSignature")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlSignature"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	
	@And("Click Edit button In Go To Scheduler")
	public void Click_Edit_button_In_Go_To_Scheduler() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvTFScheduler_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvTFScheduler_imbEdit_0"));
		ele.click();
	}
	
	@And("Click Back button In Edit Scheduler")
	public void Click_Back_button_In_Edit_Scheduler() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSchBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSchBack"));
		ele.click();
	}
	
	@And("Click Stop button In Go To Scheduler")
	public void Click_Stop_button_In_Go_To_Scheduler() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnStopScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnStopScheduler"));
		ele.click();
	}
	
	@And("Click Run button In Go To Scheduler")
	public void Click_Run_button_In_Go_To_Scheduler() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnRunScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnRunScheduler"));
		ele.click();
	}
	
	@And("Click Delete button In Email Alerts")
	public void Click_Delete_button_In_Email_Alerts() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvToAddress_imbDel_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvToAddress_imbDel_0"));
		ele.click();
	}
	
	@And("Click Delete button In Add External Users")
	public void Click_Delete_button_In_Add_External_Users() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvExtUser_imbDel_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvExtUser_imbDel_0"));
		ele.click();
	}
	
	@And("Click The AdvantEdge Report button In Reports")
	public void Click_The_AdvantEdge_Report_button_In_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"ADVANTEDGE\"]/a/span"));
		ele1.click();
	}
	
	@Then("Select Valid Tail In Dropdown In AdvantEdge Reports")
	public void Select_Valid_Tail_In_Dropdown_In_AdvantEdge_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlFTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	
	@And("Select Valid AdvantEdge In Dropdown In AdvantEdge Reports")
	public void Select_Valid_AdvantEdge_In_Dropdown_In_AdvantEdge_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlAdvantEdge")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlAdvantEdge"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	
	@Then("Click Submit button In AdvantEdge Reports")
	public void Click_Submit_button_In_AdvantEdge_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSubmit"));
		ele.click();
	}
	
	@And("Click Edit button In AdvantEdge Reports")
	public void Click_Edit_button_In_AdvantEdge_Reports() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvControllTail_imbCTView_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvControllTail_imbCTView_0"));
		ele.click();
	}
	
	@Then("Click Close button In AdvantEdge Reports")
	public void Click_Close_button_In_AdvantEdge_Reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Button2"));
		ele.click();
	}
	
	@And("Click The Scheduling Tracker button In Reports")
	public void Click_The_Scheduling_Tracker_button_In_Reports() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[15]/a/span"));
		ele.click();
	}
	
	@Then("Select Valid From month In Scheduling Tracker")
	public void Select_Valid_From_month_In_Scheduling_Tracker() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//click From month
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		//select the month
		ele1=driver.findElement(By.id("cal2_month_0_1"));
		ele1.click();
	}
	
	@And("Select Valid To month In Scheduling Tracker")
	public void Select_Valid_To_month_In_Scheduling_Tracker() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToMonth")));
		//click From month
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele.click();
		//select the month
		ele1=driver.findElement(By.id("cal1_month_1_1"));
		ele1.click();
	}
	
	@Then("Click Submit button In Scheduling Tracker")
	public void Click_Submit_button_In_Scheduling_Tracker() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnsearch")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnsearch"));
		ele.click();
	}
	
	@And("Click Excel button In Scheduling Tracker")
	public void Click_Excel_button_In_Scheduling_Tracker() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@And("Click The Flight Activity InActive button In Reports")
	public void click_the_flight_activity_in_active_button_in_reports() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/span"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[5]/a/span")));
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[5]/a/span"));
		ele1.click();
	}
	@Then("Click view button in Flight Activity InActive")
	public void click_view_button_in_flight_activity_in_active() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message Displayed Like : "+text);
			alert.accept();
		} catch (Exception e) {
			System.out.println("No Alert Message Is Displayed");
		}
	}
	
	@Then("Select valid from month in Flight Activity InActive")
	public void select_valid_from_month_in_flight_activity_in_active() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cal1_month_0_0")));
		ele1=driver.findElement(By.id("cal1_month_0_0"));
		ele1.click();
		
	}
	@Then("Select valid tail in Flight Activity InActive")
	public void select_valid_tail_in_flight_activity_in_active() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailNo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	@And("Click Trip type radio button in Flight Activity InActive")
	public void click_trip_type_radio_button_in_flight_activity_in_active() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoType_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoType_0"));
		ele.click();
	}
	@Then("Click excel button in Flight Activity InActive")
	public void click_excel_button_in_flight_activity_in_active() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	@And("Click Leg type radio button in Flight Activity InActive")
	public void click_leg_type_radio_button_in_flight_activity_in_active() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoType_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoType_1"));
		ele.click();
	}
	@Then("Click goal setup button in Scheduling Tracker")
	public void click_goal_setup_button_in_scheduling_tracker() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}
	@And("Click back button in Scheduling Tracker")
	public void click_back_button_in_scheduling_tracker() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}
	@Then("Click add new button in Scheduling Tracker")
	public void click_add_new_button_in_scheduling_tracker() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}
	@Then("Click close button in Quarter Goal")
	public void click_close_button_in_quarter_goal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgDenialsClose")));
		ele=driver.findElement(By.id("imgDenialsClose"));
		ele.click();
	}
	@Then("Click save button in Quarter Goal")
	public void click_save_button_in_quarter_goal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message Displayed Like : "+text);
			alert.accept();
		} catch (Exception e) {
			System.out.println("No Alert Message Is Displayed");
		}
	}
	@Then("Select valid tail number in Quarter Goal")
	public void select_valid_tail_number_in_quarter_goal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	@Then("Select valid effective from in Quarter Goal")
	public void select_valid_effective_from_in_quarter_goal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtEftFrom")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtEftFrom"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_CalendarExtender4_day_0_0")));
		ele1=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender4_day_0_0"));
		ele1.click();
	}
	@Then("Enter valid charter value {string} in Quarter Goal")
	public void enter_valid_charter_value_in_quarter_goal(String CharterValue) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtCharter")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtCharter"));
		ele.sendKeys(CharterValue);
	}
	@Then("Enter valid Owner value {string} in Quarter Goal")
	public void enter_valid_owner_value_in_quarter_goal(String OwnerValue) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtOwner")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtOwner"));
		ele.sendKeys(OwnerValue);
	}
	@And("Click edit button in Goal Setup")
	public void click_edit_button_in_goal_setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvScheduler_imbView_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvScheduler_imbView_0"));
		ele.click();
	}
	@And("Modify valid details in Quarter Goal")
	public void modify_valid_details_in_quarter_goal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtCharter")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtCharter"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtCharter"));
		ele1.sendKeys(text);
	}
}
