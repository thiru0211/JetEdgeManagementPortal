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


public class JE8_AR_Report {
	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9,ele10,
	ele11,ele12,ele13,ele14,ele15,ele16,ele17,ele18,ele19,ele20,
	ele21,ele22,ele23,ele24,ele25,ele26,ele27,ele28,ele29,ele30;

	@Given("To Check AR Report User Is Navigating To JetEdge Signin URL is {string}")
	public void user_is_navigating_to_jet_edge_signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@And("To Check AR Report Enter User Name and Password are {string} and {string}")
	public void enter_the_user_name_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@Then("Click SignIn button for AR Reports Check")
	public void click_the_sign_in_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@Then("Close AR Report Page")
	public void close_the_owner_portal_page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@And("Click AR Report button In AR Report")
	public void Click_AR_Report_button_In_AR_Report(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[8]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[8]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[8]/div/ul/li[2]/a/span"));
		ele1.click();
	}
	
	@Then("Select Valid Month In AR Report")
	public void Select_Valid_Month_In_AR_Report(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele1=driver.findElement(By.id("cal2_month_0_0"));
		ele1.click();
	}

	@And("Click Excel button In AR Report")
	public void Click_Excel_button_In_AR_Report() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@And("Select Valid Company Name In AR Report")
	public void Select_Valid_Company_Name_In_AR_Report(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompany")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlCompany"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	
	@Then("Select Valid Tail Show In AR Report")
	public void Select_Valid_Tail_Show_In_AR_Report(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlFilterBy")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFilterBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	
	@And("Click Edit button In AR Report")
	public void Click_Edit_button_In_AR_Report(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvOTJ_imbSubsequent_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOTJ_imbSubsequent_0"));
		ele.click();
	}
	
	@Then("Click Close button In AR Report")
	public void Click_Close_button_In_AR_Report(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele=driver.findElement(By.id("btnClose"));
		ele.click();
	}
	
	@And("Click JetEdge To Owner In AR Report")
	public void Click_JetEdge_To_Owner_In_AR_Report() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_COPM")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_COPM"));
		ele.click();
	}
	
	@And("Click Edit button In JetEdge To Owner In AR Report")
	public void Click_Edit_button_In_JetEdge_To_Owner_In_AR_Report(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvJTO_imbSubsequent_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvJTO_imbSubsequent_0"));
		ele.click();
	}
	
	@And("Click AR Report V1 button In AR Report")
	public void Click_AR_Report_V1_button_In_AR_Report(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[8]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[8]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[8]/div/ul/li[3]/a/span"));
		ele1.click();
	}
	
	@Then("Select Valid Month In AR Report V1")
	public void Select_Valid_Month_In_AR_Report_V1(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		ele1=driver.findElement(By.id("cal2_month_0_0"));
		ele1.click();
	}

	@And("Click Excel button In AR Report V1")
	public void Click_Excel_button_In_AR_Report_V1() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_imbExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@And("Select Valid Company Name In AR Report V1")
	public void Select_Valid_Company_Name_In_AR_Report_V1(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompany")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlCompany"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	
	@Then("Select Valid Tail Show In AR Report V1")
	public void Select_Valid_Tail_Show_In_AR_Report_V1(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlFilterBy")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFilterBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	
	@And("Click Edit button In AR Report V1")
	public void Click_Edit_button_In_AR_Report_V1(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvOTJ_imbSubsequent_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOTJ_imbSubsequent_0"));
		ele.click();
	}
	
	@Then("Click Close button In AR Report V1")
	public void Click_Close_button_In_AR_Report_V1(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele=driver.findElement(By.id("btnClose"));
		ele.click();
	}
	
	@And("Click JetEdge To Owner In AR Report V1")
	public void Click_JetEdge_To_Owner_In_AR_Report_V1() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_COPM")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_COPM"));
		ele.click();
	}
	
	@And("Click Edit button In JetEdge To Owner In AR Report V1")
	public void Click_Edit_button_In_JetEdge_To_Owner_In_AR_Report_V1(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvJTO_imbSubsequent_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvJTO_imbSubsequent_0"));
		ele.click();
	}
	
	@And("Click Scheduler Setup button In AR Report")
	public void Click_Scheduler_Setup_button_In_AR_Report(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[8]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[8]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[8]/div/ul/li[4]/a/span"));
		ele1.click();
	}
	
	@Then("Click Add Scheduler button In Scheduler Setup In AR Report")
	public void Click_Add_Scheduler_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddScheduler"));
		ele.click();
	}
	
	@And("Click Save button In Scheduler Setup In AR Report")
	public void Click_Save_button_In_Scheduler_Setup(){
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
	
	@And("Click Back button In Scheduler Setup In AR Report")
	public void Click_Back_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}
	
	@And("Click Add Users button In Scheduler Setup In AR Report")
	public void Click_Add_Users_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddAddress")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddAddress"));
		ele.click();
	}
	
	@Then("Click Close button In Add Users")
	public void Click_Close_button_In_Add_Users(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Image1123")));
		ele=driver.findElement(By.id("Image1123"));
		ele.click();
	}
	
	@Then("Select The Checkbox In Add Users")
	public void Select_The_Checkbox_In_Add_Users(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[436]/td[5]/label/span")));
		ele=driver.findElement(By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[436]/td[5]/label/span"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		ele.click();
	}
	
	@And("Click Submit button In Add Users")
	public void Click_Submit_button_In_Add_Users(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAdd")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAdd"));
		ele.click();
	}
	
	@Then("Click Delete button In Scheduler Setup In AR Report")
	public void Click_Delete_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvToAddress_imbDel_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvToAddress_imbDel_0"));
		ele.click();
	}
	
	@And("Enter Valid Details In Scheduler Setup In AR Report")
	public void Enter_Valid_Details_In_Scheduler_Setup()throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtEffFrom")));
		//Effective From
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtEffFrom"));
		ele.click();
		ele1=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender2_day_5_1"));
		ele1.click();
		Thread.sleep(2000);
		//Email Signature
		ele2=driver.findElement(By.id("ContentPlaceHolder1_ddlSignature"));
		Select sel=new Select(ele2);
		sel.selectByIndex(1);
	}
	
	@And("Click Clear button In Scheduler Setup In AR Report")
	public void Click_Clear_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}
	
	@Then("Click Edit button In Scheduler Setup In AR Report")
	public void Click_Edit_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvScheduler_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvScheduler_imbEdit_0"));
		ele.click();
	}
	
	@And("Click Stop button In Scheduler Setup In AR Report")
	public void Click_Stop_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnStopScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnStopScheduler"));
		ele.click();
	}
	
	@And("Click Run button In Scheduler Setup In AR Report")
	public void Click_Run_button_In_Scheduler_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnRunScheduler")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnRunScheduler"));
		ele.click();
	}
}

