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


public class JE5_OsaView {
	public WebDriver driver;
	public WebElement ele,ele1,ele2;
	
	@Given("To Check OSA View User Is Navigating to JetEdge Signin URL is {string}")
	public void User_Is_Navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@And("To Check OSA View Enter The User Name and Password are {string} and {string}")
	public void Enter_The_User_Name_and_Password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}
	
	@Then("Click The Sign In button for OSA View Check")
	public void Click_The_Sign_In_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}
	
	@And("Click OSA Control Fleet In OSA View")
	public void Click_OSA_Control_Fleet_In_OSA_View() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"A2\"]/span"));
		ele1.click();
	}
	
	@Then("Select The Valid Tail In OSA Control Fleet")
	public void Select_The_Valid_Tail_In_OSA_Control_Fleet() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailNo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	
	@And("Select The Valid Month In OSA Control Fleet")
	public void Select_The_Valid_Month_In_OSA_Control_Fleet(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		ele.click();
		ele1=driver.findElement(By.id("cal1_month_0_0"));
		ele1.click();
	}
	
	@Then("Click The View button In OSA Control Fleet")
	public void Click_The_View_button_In_OSA_Control_Fleet() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}
	
	@And("Click The Excel button In OSA Control Fleet")
	public void Click_The_Excel_button_In_OSA_Control_Fleet() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_imbExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@And("Click OSA AQR In OSA View")
	public void Click_OSA_AQR_In_OSA_View(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"A1\"]/span"));
		ele1.click();
	}
	
	@Then("Select The Valid Tail In OSA AQR")
	public void Select_The_Valid_Tail_In_OSA_AQR() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailNo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	
	@And("Select The Valid Month In OSA AQR")
	public void Select_The_Valid_Month_In_OSA_AQR(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		ele.click();
		ele1=driver.findElement(By.id("cal1_month_0_0"));
		ele1.click();
	}
	
	@Then("Click The View button In OSA AQR")
	public void Click_The_View_button_In_OSA_AQR() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
		ele.click();
	}
	
	@And("Click The Excel button In OSA AQR")
	public void Click_The_Excel_button_In_OSA_AQR() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_imbExport")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_imbExport"));
		ele.click();
	}
	
	@Then("Close The OSA View Page")
	public void Close_The_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}
}
