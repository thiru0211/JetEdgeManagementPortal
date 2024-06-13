package com.JetEdge.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
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


public class JEM_EditLedger {
	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5;
	
	@Given("To Check Edit Ledger User Is Navigating to JetEdge Signin URL is {string}")
	public void User_Is_Navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@And("To Check Edit Ledger Enter The User Name and Password are {string} and {string}")
	public void Enter_The_User_Name_and_Password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}
	
	@Then("Click The Sign In button for Edit Ledger Check")
	public void Click_The_Sign_In_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}
	
	@And("Click Edit Ledger button")
	public void Click_Edit_Ledger_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Ledger\"]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"Ledger\"]/a/span"));
		ele.click();
	}
	
	@Then("Select The Valid Date In From Tab In Edit Ledger")
	public void Select_The_Valid_Date_In_From_Tab_In_Edit_Ledger(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		ele.sendKeys("01/01/2022");
//		ele1=driver.findElement(By.id("calendar1_title"));
//		ele1.click();
//		ele2=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
//		ele2.click();
//		ele3=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
//		ele3.click();
	}
	
	@And("Select The Valid Tail In Edit Ledger")
	public void Select_The_Valid_Tail_In_Edit_Ledger(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlFTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	
	@Then("Click View button In Edit Ledger")
	public void Click_View_button_In_Edit_Ledger(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}
	
	@Then("Enter Valid GL Code In Edit Ledger")
	public void Enter_Valid_GL_Code_In_Edit_Ledger(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtGLCODE")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtGLCODE"));
		ele.sendKeys("40000");
	}
	
	@And("Enter Both Radio button In Edit Ledger")
	public void Enter_Both_Radio_button_In_Edit_Ledger(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoAccount_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoAccount_0"));
		ele.click();
	}
	
	@Then("Click Clear button In Edit Ledger")
	public void Click_Clear_button_In_Edit_Ledger(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}
	
	@And("Enter 10 Radio button In Edit Ledger")
	public void Enter_10_Radio_button_In_Edit_Ledger(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoAccount_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoAccount_1"));
		ele.click();
	}
	
	@And("Enter 20 Radio button In Edit Ledger")
	public void Enter_20_Radio_button_In_Edit_Ledger(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoAccount_2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoAccount_2"));
		ele.click();
	}
	
	@Then("Close The Edit Ledger Page")
	public void Close_The_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}
}
