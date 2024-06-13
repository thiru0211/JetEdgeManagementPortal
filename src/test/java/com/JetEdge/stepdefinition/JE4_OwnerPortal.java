package com.JetEdge.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

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

public class JE4_OwnerPortal {

	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check Owner Portal User is Navigating to JetEdge Signin URL is {string}")
	public void User_is_Navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@And("To Check Owner Portal Enter The Username and Password are {string} and {string}")
	public void Enter_The_Username_and_Password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@Then("Click The SignIn button for Owner Portal Check")
	public void Click_The_SignIn_button_In_SignIn_Page() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}


	@Then("Close The Owner Portal Page")
	public void Close_The_Owner_Portal_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}


	//	@And("Click Save button in Payments Page")
	//	public void Click_Save_button_in_Payments_Page() {
	//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
	//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnSave")));
	//		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
	//		ele.click();
	//		try {
	//			Alert alert = driver.switchTo().alert();
	//			String alertText = alert.getText(); // Get the alert message
	//			System.out.println("Alert message: " + alertText);
	//			alert.accept(); // Accept the alert (optional)
	//		} catch (NoAlertPresentException e) {
	//			System.out.println("No alert present.");
	//		}
	//	}

	@And("Click Certificate Setup button In Owner Portal")
	public void Click_Certificate_Setup_button_In_Owner_Portal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/i")));
		driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/i")).click();
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[1]/a/span"));
		ele.click();
	}

	@Then("Click Add New button In Certificate Setup")
	public void Click_Add_New_button_In_Certificate_Setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		driver.findElement(By.id("ContentPlaceHolder1_btnAddNew")).click();
	}


	@And("Click Back button In Certificate Setup")
	public void Click_Back_button_In_Certificate_Setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnBack")));
		driver.findElement(By.id("ContentPlaceHolder1_btnBack")).click();
	}


	@And("Click Add Tail button In Certificate Setup")
	public void Click_Add_Tail_button_In_Certificate_Setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnAddMap")));
		driver.findElement(By.id("ContentPlaceHolder1_btnAddMap")).click();
	}

	@And("Click Close button In Add Tail Page")
	public void Click_Close_button_In_Add_Tail_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnTailMappingClose")));
		driver.findElement(By.id("btnTailMappingClose")).click();
	}

	@And("Click Add Tail button In Add Tail Page")
	public void Click_Add_Tail_button_In_Add_Tail_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveTail")));
		driver.findElement(By.id("ContentPlaceHolder1_btnSaveTail")).click();
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText(); // Get the alert message
			System.out.println("Alert message: " + alertText);
			alert.accept(); // Accept the alert (optional)
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present.");
		}
	}

	@Then("Enter Valid Details In Add Tail Page")
	public void Enter_Valid_Details_In_Add_Tail_Page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_ddlTail")));
		//Select the tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("228SS");
		Thread.sleep(2000);
		driver.findElement(By.id("ContentPlaceHolder1_ddlTail")).click();
		Thread.sleep(2000);
		//Click The Start Date
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtMSStartMonth"));
		ele1.click();
		//Select the Date
		ele2=driver.findElement(By.id("cal1_day_0_3"));
		ele2.click();
		//Click The end Date
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtMSEndMonth"));
		ele3.click();
		//Select the Date
		ele4=driver.findElement(By.id("cal2_day_2_3"));
		ele4.click();
		//Click The Start Date
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtCertificateDate"));
		ele5.click();
		//Select the Date
		ele6=driver.findElement(By.id("CalendarExtender2_day_2_4"));
		ele6.click();
		//Click The end Date
		ele7=driver.findElement(By.id("ContentPlaceHolder1_txtCertificateEndDate"));
		ele7.click();
		//Select the Date
		ele8=driver.findElement(By.id("CalendarExtender1_day_4_5"));
		ele8.click();


	}

	@And("Select Yes Radio button In Add Tail Page")
	public void Select_Yes_Radio_button_In_Add_Tail_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rblAccountBalance_0")));
		driver.findElement(By.id("ContentPlaceHolder1_rblAccountBalance_0")).click();
	}

	@And("Select No Radio button In Add Tail Page")
	public void Select_No_Radio_button_In_Add_Tail_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_rblAccountBalance_1")));
		driver.findElement(By.id("ContentPlaceHolder1_rblAccountBalance_1")).click();
	}

	@Then("Enter Company Name In Add Tail Page")
	public void Enter_Company_Name_In_Add_Tail_Page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtCompanyName")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtCompanyName"));
		ele.sendKeys("Test");
	}

	@And("Click The Checkbox In Add Tail Page")
	public void Click_The_Checkbox_In_Add_Tail_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_chkActive")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_chkActive"));
		ele.click();
	}

	@Then("Click Clear button In Add Tail Page")
	public void Click_Clear_button_In_Add_Tail_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnClearCertificate")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClearCertificate"));
		ele.click();
	}

	@Then("Click Save button In Add Tail Page")
	public void Click_Save_button_In_Add_Tail_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnSaveCertificate")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSaveCertificate"));
		ele.click();
	}

	@And("Select Valid Tail From The Dropdown")
	public void Select_Valid_Tail_From_The_Dropdown() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_ddlFilterTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFilterTail"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("228SS");
	}

	@Then("Click Edit button In Certificate Setup")
	public void Click_Edit_button_In_Certificate_Setup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvCertificate_imbView_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvCertificate_imbView_1"));
		ele.click();
	}

	@And("Click Edit button In Add Tail")
	public void Click_Edit_button_In_Add_Tail() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvTailMapping_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvTailMapping_imbEdit_0"));
		ele.click();
	}

	@And("Click Delete button In Add Tail")
	public void Click_Delete_button_In_Add_Tail() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvTailMapping_imbDelete_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvTailMapping_imbDelete_0"));
		ele.click();
	}

	@Then("Click Delete button In Certificate Setup")
	public void Click_Delete_button_In_Certificate_Setup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvCertificate_imbDelete_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvCertificate_imbDelete_1"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@And("Click Owner Denials button In Owner Portal")
	public void Click_Owner_Denials_button_In_Owner_Portal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/i")));
		driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/i")).click();
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[7]/a/span"));
		ele.click();
	}

	@Then("Click Add New button In Owner Denials")
	public void Click_Add_New_button_In_Owner_Denials() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click Save button In Owner Denials")
	public void Click_Save_button_In_Owner_Portal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveDenials")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSaveDenials"));
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

	@And("Click Close button In Owner Denials")
	public void Click_Close_button_In_Owner_Portal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgDenialsClose")));
		ele=driver.findElement(By.id("imgDenialsClose"));
		ele.click();


	}

	@And("Enter Valid Details In Owner Denials")
	public void Enter_Valid_Details_In_Owner_Portal() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_ddlTail")));
		//Select the tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		//Enter Quote Number
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtQuoteNo"));
		ele1.sendKeys("123456");
		//Click the start date
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtStartDate"));
		ele2.click();
		//Select the start date
		ele3=driver.findElement(By.id("cal1_day_0_3"));
		ele3.click();

		//Click the end date
		ele4=driver.findElement(By.id("ContentPlaceHolder1_txtEndDate"));
		ele4.click();
		//Select the end date
		ele5=driver.findElement(By.id("CalendarExtender1_day_3_3"));
		ele5.click();
		//Enter notes
		ele6=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele6.sendKeys("Test Notes");
		//Enter routing
		ele7=driver.findElement(By.id("ContentPlaceHolder1_txtRouting"));
		ele7.sendKeys("Test");
		//Enter black hours
		ele8=driver.findElement(By.id("ContentPlaceHolder1_txtBlockHours"));
		ele8.sendKeys("12");
		//enter flight hours
		ele9=driver.findElement(By.id("ContentPlaceHolder1_txtFlightHours"));
		ele9.sendKeys("20");
		//Enter top line revenue
		WebElement	ele10=driver.findElement(By.id("ContentPlaceHolder1_txtRevenue"));
		ele10.sendKeys("12345");

	}

	@And("Click Clear button In Owner Denials")
	public void Click_Clear_button_In_Owner_Portal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClearDenials")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClearDenials"));
		ele.click();
	}

	@Then("Click Edit button In Owner Denials")
	public void Click_Edit_button_In_Owner_Denials() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvOwnerDenials_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOwnerDenials_imbEdit_0"));
		ele.click();
	}

	@Then("Click The Delete button In Owner Portal")
	public void Click_The_Delete_button_In_Owner_Denials() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvOwnerDenials_imbDelete_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOwnerDenials_imbDelete_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@And("Click CHTR Trip ORA button In Owner Portal")
	public void Click_CHTR_Trip_ORA_button_In_Owner_Portal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/i")));
		driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/i")).click();
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[8]/a/span"));
		ele.click();
	}

	@Then("Click Add New button In CHTR Trip ORA")
	public void Click_Add_New_button_In_CHTR_Trip_ORA() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click Save button In CHTR Trip ORA")
	public void Click_Save_button_In_CHTR_Trip_ORA() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveORA")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSaveORA"));
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

	@And("Click Back button In CHTR Trip ORA")
	public void Click_Back_button_In_CHTR_Trip_ORA() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBackORA")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBackORA"));
		ele.click();
	}

	@And("Enter Valid Details In CHTR Trip ORA")
	public void Enter_Valid_Details_In_CHTR_Trip_ORA() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBackORA")));
		//Select the tail
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		//Enter Trip Number
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtTripNo"));
		ele1.sendKeys("101010");
		//Enter Notes
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele1.sendKeys("Test");
		//Upload ORA Agreement
		String ORA_Agreement="C:\\Users\\thirumaran\\OneDrive\\Desktop\\N109CH.pdf";
		ele1=driver.findElement(By.id("ContentPlaceHolder1_fuFile"));
		ele1.sendKeys(ORA_Agreement);
		//Upload Quote Agreement
		String Quote_Agreement="C:\\Users\\thirumaran\\OneDrive\\Desktop\\N109CH.pdf";
		ele1=driver.findElement(By.id("ContentPlaceHolder1_FUQuote"));
		ele1.sendKeys(Quote_Agreement);
	}

	@And("Click Clear button In CHTR Trip ORA")
	public void Click_Clear_button_In_CHTR_Trip_ORA() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClearORA")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClearORA"));
		ele.click();
	}

	@Then("Click Edit button In CHTR Trip ORA")
	public void Click_Edit_button_In_CHTR_Trip_ORA() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvORA_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvORA_imbEdit_0"));
		ele.click();
	}

	@And("Click Update button In CHTR Trip ORA")
	public void Click_Update_button_In_CHTR_Trip_ORA() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveORA")));
		driver.findElement(By.id("ContentPlaceHolder1_btnSaveORA")).click();
	}

	@And("Select The Tail From The Dropdown In CHTR Trip ORA")
	public void Select_The_Tail_From_The_Dropdown_In_CHTR_Trip_ORA() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlFTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Click The Attachment button In CHTR Trip ORA")
	public void Click_The_Attachment_button_In_CHTR_Trip_ORA() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvORA_imbAttach_2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvORA_imbAttach_2"));
		ele.click();
	}

	@And("Click Release to Owner button In Owner Portal")
	public void Click_Release_to_Owner_button_In_Owner_Portal() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/i")));
		driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/i")).click();
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[13]/a/span"));
		ele.click();
	}

	@Then("Click Add New Release button In Release to Owner")
	public void Click_Add_New_Release_button_In_Release_to_Owner() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click Back button In Release to Owner")
	public void Click_Back_button_In_Release_to_Owner() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		//Scroll to top of the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(2000);
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Select The Tail From The Dropdown In Release to Owner")
	public void Select_The_Tail_From_The_Dropdown_In_Release_to_Owner() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_ddlPopUpTail")));
		//Scroll to top of the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(2000);
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlPopUpTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Select The Owner Release Radio button In Release to Owner")
	public void Select_The_Owner_Release_Radio_button_In_Release_to_Owner() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_trReleaseType\"]/label[1]")));
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_trReleaseType\"]/label[1]"));
		if(!(ele.isEnabled())) {
			ele.click();
		}
		else {
			System.out.println("Radio button is already clicked");
		}
	}

	@And("Click The Checkbox In Release to Owner")
	public void Click_The_Checkbox_In_Release_to_Owner() throws InterruptedException  {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_tblFomView\"]/tbody/tr[3]/td[1]/label")));
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_tblFomView\"]/tbody/tr[3]/td[1]/label"));
		ele.click();
	}

	@Then("Select The Due Date In Release to Owner")
	public void Select_The_Due_Date_In_Release_to_Owner() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtPaymentDate")));
		//Click the Due Date
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtPaymentDate"));
		ele.click();
		//Select the Due Date
		ele=driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_day_0_3"));
		ele.click();
	}

	@And("Enter Valid Details In Release to Owner")
	public void Enter_Valid_Details_In_Release_to_Owner() throws InterruptedException  {
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtOwnRepEmail")));
		//Enter the To Address
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtOwnRepEmail"));
		ele.clear();
		Thread.sleep(2000);
		ele.sendKeys("0211thiru@gmail.com");
		//Enter the CC Address
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtAdvisorEmail"));
		ele1.clear();
		Thread.sleep(2000);
		ele1.sendKeys("0211thiru@gmail.com");
		//Enter the Mail Subject
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtMailSubject"));
		ele2.clear();
		Thread.sleep(2000);
		ele2.sendKeys("Test Subject");
	}

	@Then("Click Release to Owner button")
	public void Click_Release_to_Owner_button() throws InterruptedException {
		Thread.sleep(7000);
		//Scroll to top of the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnOwnerRelease")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnOwnerRelease"));
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

	@Then("Select The Soft Release Radio button In Release to Owner")
	public void Select_The_Soft_Release_Radio_button_In_Release_to_Owner() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ContentPlaceHolder1_trReleaseType\"]/label[2]")));
		ele=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_trReleaseType\"]/label[2]"));
		ele.click();
	}

	@Then("Select The Month and Tail In Release to Owner")
	public void Select_The_Month_and_Tail_In_Release_to_Owner() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtFromMonth")));
		//Click The Month
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		//Select the Month
		ele1=driver.findElement(By.id("cal1_month_0_3"));
		ele1.click();
		//Select the Tail
		ele2=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele2);
		sel.selectByIndex(1);
	}

	@Then("Click Edit Release button In Release to Owner")
	public void Click_Edit_Release_button_In_Release_to_Owner() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		//Click the edit button
		ele3=driver.findElement(By.id("ContentPlaceHolder1_gvReleasedTail_imbEdit_2"));
		ele3.click();
	}

	@And("Click RollBack button In Release to Owner")
	public void Click_RollBack_button_In_Release_to_Owner() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnOwnerRollback")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtReleasedNotes"));
		ele.sendKeys("Test");
		Thread.sleep(3000);
		ele1=driver.findElement(By.id("ContentPlaceHolder1_btnOwnerRollback"));
		ele1.click();
	}

	@And("Click Owner Setup button In Owner Portal")
	public void Click_Owner_Setup_button_In_Owner_Portal() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[2]/a/span"));
		ele1.click();
	}

	@Then("Click Add Owner button In Owner Setup")
	public void Click_Add_Owner_button_In_Owner_Setup() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click Back button In Owner Setup")
	public void Click_Back_button_In_Owner_Setup() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Click Save button In Owner Setup")
	public void Click_Save_button_In_Owner_Setup() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
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

	@And("Click Add Tail button In Owner Setup")
	public void Click_Add_Tail_button_In_Owner_Setup() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnAddTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddTail"));
		ele.click();
	}

	@Then("Click Close button In Add Tail")
	public void Click_Close_button_In_Owner_Setup() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnTailMappingClose")));
		ele=driver.findElement(By.id("btnTailMappingClose"));
		ele.click();
	}

	@Then("Click Add Tail button In Tail Mapping Page")
	public void Click_Add_Tail_button_In_Tail_Mapping_Page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAdd")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAdd"));
		ele.click();
	}

	@And("Select Valid Tail In Add Tail Page")
	public void Select_Valid_Tail_In_Add_Tail_Page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Click The Delete Tail button In Owner Setup")
	public void Click_The_Delete_Tail_button_In_Owner_Setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvTailMapping_imbDelete_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvTailMapping_imbDelete_0"));
		ele.click();
	}

	@Then("Enter Valid Details In Owner Setup")
	public void Enter_Valid_Details_In_Owner_Setup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtOFirstName")));
		//First Name
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtOFirstName"));
		ele.sendKeys("Test");
		Thread.sleep(2000);

		//Second Name
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtOLastName"));
		ele1.sendKeys("Test");
		Thread.sleep(2000);

		//Email ID
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtOEmail"));
		ele2.sendKeys("0211thiru@gmail.com");
		Thread.sleep(2000);

		//Select the user type
		ele3=driver.findElement(By.id("ContentPlaceHolder1_ddlUserType"));
		Select sel=new Select(ele3);
		sel.selectByIndex(1);
		Thread.sleep(2000);

		//Click The Checkbox
		ele4=driver.findElement(By.id("ContentPlaceHolder1_cbActiveAgent"));
		if(ele4.isSelected()) {
			System.out.println("Checkbox is already selected");
		}
		else {
			System.out.println("Checkbox is not selected");
			ele4.click();
		}
		Thread.sleep(2000);

		//Enter the notes
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtNewNotes"));
		ele5.sendKeys("Test");
		Thread.sleep(2000);

		//Enter primary phone number
		ele6=driver.findElement(By.id("ContentPlaceHolder1_txtPrimPhone"));
		ele6.sendKeys("Test");
		Thread.sleep(2000);

		//Enter Alternate phone number
		ele7=driver.findElement(By.id("ContentPlaceHolder1_txtOPhone"));
		ele7.sendKeys("Test");
		Thread.sleep(2000);

		//Enter Personal Email
		ele8=driver.findElement(By.id("ContentPlaceHolder1_txtAltEmail"));
		ele8.sendKeys("0211thiru@gmail.com");
		Thread.sleep(2000);

		//Enter the Address
		ele9=driver.findElement(By.id("ContentPlaceHolder1_txtOAddress"));
		ele9.sendKeys("Test");
		Thread.sleep(2000);

		//Enter the City
		WebElement	ele10=driver.findElement(By.id("ContentPlaceHolder1_txtCity"));
		ele10.sendKeys("Test");
		Thread.sleep(2000);

		//Enter the Zipcode
		WebElement	ele11=driver.findElement(By.id("ContentPlaceHolder1_txtZip"));
		ele11.sendKeys("123456");
		Thread.sleep(2000);

		//Select the county
		WebElement	ele12=driver.findElement(By.id("ContentPlaceHolder1_ddlCountry"));
		Select sel1=new Select(ele12);
		sel1.selectByVisibleText("UNITED STATES");
		Thread.sleep(2000);

		//Select the State
		WebElement	ele13=driver.findElement(By.id("ContentPlaceHolder1_ddlState"));
		Select sel2=new Select(ele13);
		sel2.selectByIndex(2);
		Thread.sleep(2000);
	}

	@And("Click Add Bank In Owner Setup")
	public void Click_Add_Bank_In_Owner_Setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lnkbtnBanking")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_lnkbtnBanking"));
		ele.click();
	}

	@Then("Enter Bank Details In Owner Setup")
	public void Enter_Bank_Details_In_Owner_Setup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtAccountHolderName")));
		//Enter Account Holder Name
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtAccountHolderName"));
		ele.sendKeys("Test");

		//Enter Swift Code
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtShiftCode"));
		ele1.sendKeys("Test");
		//Enter Bank Name
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtBankName"));
		ele2.sendKeys("Test");
		//Enter Account Number
		ele3=driver.findElement(By.id("ContentPlaceHolder1_txtAccountNumber"));
		ele3.sendKeys("Test");
		//Enter Bank Routing Number
		ele4=driver.findElement(By.id("ContentPlaceHolder1_txtBankRoutingNo"));
		ele4.sendKeys("Test");
		//Enter Notes
		ele5=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele5.sendKeys("Test");
	}

	@And("Click Clear button In Banking Details")
	public void Click_Clear_button_In_Banking_Details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBankingClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBankingClear"));
		ele.click();
	}

	@And("Click Save button In Banking Details")
	public void Click_Save_button_In_Banking_Details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBankingSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBankingSave"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClose")));
		driver.findElement(By.id("ContentPlaceHolder1_btnClose")).click();
	}

	@Then("Upload Picture In Owner Setup")
	public void Upload_Picture_In_Owner_Setup() throws InterruptedException, AWTException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_GetImage")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_GetImage"));
		ele.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ContentPlaceHolder1_pnlPopup\"]/div/div/div[2]/table/tbody/tr[2]/td")));
		ele1=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_pnlPopup\"]/div/div/div[2]/table/tbody/tr[2]/td"));
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
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnYes")));
		ele2=driver.findElement(By.id("ContentPlaceHolder1_btnYes"));
		ele2.click();
		Thread.sleep(2000);
		driver.findElement(By.id("ContentPlaceHolder1_btnClose")).click();
	}

	@And("Click Clear button In Owner Setup")
	public void Click_Clear_button_In_Owner_Setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}

	@Then("Select Tail and User Type In Owner Setup")
	public void Select_Tail_and_User_Type_In_Owner_Setup() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlFilterTail")));
		//Tail Selection
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFilterTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		//User Type Selection
		ele1=driver.findElement(By.id("ContentPlaceHolder1_ddlFilterUserType"));
		Select sel1=new Select(ele1);
		sel1.selectByIndex(0);
	}

	@Then("Click Edit button In Owner Setup")
	public void Click_Edit_button_In_Owner_Setup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvTail_imbView_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvTail_imbView_0"));
		ele.click();
	}

	@And("Click Owner Ratio Setup button In Owner Portal")
	public void Click_Owner_Ratio_Setup_button_In_Owner_Portal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[3]/a/span"));
		ele1.click();
	}

	@Then("Click Add New button In Owner Ratio Setup")
	public void Click_Add_New_button_In_Owner_Ratio_Setup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@Then("Click Back button In Owner Ratio Setup")
	public void Click_Back_button_In_Owner_Ratio_Setup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnBack")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Select Valid Tail From The Dropdown In Owner Ratio Setup")
	public void Select_Valid_Tail_From_The_Dropdown_In_Owner_Ratio_Setup() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_ddlTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Click Add Owners button In Owner Mapping")
	public void Click_Add_Owners_button_In_Owner_Mapping() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_btnAddOwners")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddOwners"));
		ele.click();
	}

	@And("Click Close button In Owner Mapping")
	public void Click_Close_button_In_Owner_Mapping() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("img1")));
		ele=driver.findElement(By.id("img1"));
		ele.click();
	}

	@And("Click Save button In Owner Mapping")
	public void Click_Save_button_In_Owner_Mapping() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnOwnerSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnOwnerSave"));
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

	@And("Enter Valid Details In Owner Mapping are {string}")
	public void Enter_Valid_Details_In_Owner_Mapping(String OwnerName) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_cbkTripType_5")));
		//Checkbox selection
		ele=driver.findElement(By.id("ContentPlaceHolder1_cbkTripType_5"));
		ele.click();
		//Enter Owner Name
		ele1=driver.findElement(By.id("ContentPlaceHolder1_txtOwnerName"));
		ele1.sendKeys(OwnerName);
		//Enter Notes
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele2.sendKeys("Test");
	}

	@And("Click Edit Owners button In Owner Mapping")
	public void Click_Edit_button_In_Owner_Mapping(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvOWNRevSetup_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOWNRevSetup_imbEdit_0"));
		ele.click();
	}

	@And("Modify Details In Owner Mapping")
	public void Modify_Details_In_Owner_Mapping() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvOwnerMapping_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOwnerMapping_imbEdit_0"));
		ele.click();
		Thread.sleep(2000);
		//Enter Notes
		ele2=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		String NotesText = ele2.getAttribute("value");
		System.out.println(NotesText);
		Thread.sleep(2000);
		ele2.clear();
		Thread.sleep(2000);
		ele2.sendKeys(NotesText);
	}

	@Then("Click Revenue Allocation button In Owner Ratio Setup")
	public void Click_Revenue_Allocation_button_In_Owner_Ratio_Setup(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_aRevenue")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_aRevenue"));
		ele.click();
	}

	@And("Click Edit button In Revenue Allocation Tab")
	public void Click_Edit_button_In_Revenue_Allocation_Tab(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvRevenue_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvRevenue_imbEdit_0"));
		ele.click();
	}

	@And("Click Close button In Revenue Allocation Tab")
	public void Click_Close_button_In_Revenue_Allocation_Tab(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgNationalClose")));
		ele=driver.findElement(By.id("imgNationalClose"));
		ele.click();
	}

	@And("Click Company Level Radio button In Revenue Allocation Tab")
	public void Click_Company_Level_Radio_button_In_Revenue_Allocation_Tab(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoSetupBy_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoSetupBy_0"));
		ele.click();
	}

	@Then("Click Save button In Revenue Allocation Tab")
	public void Click_Save_button_In_Revenue_Allocation_Tab(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnRatioSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnRatioSave"));
		ele.click();
	}

	@And("Click Ratio Radio button In Revenue Allocation Tab")
	public void Click_Ratio_Radio_button_In_Revenue_Allocation_Tab(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoSetupBy_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoSetupBy_1"));
		ele.click();
	}

	@Then("Enter Ratio Value In Revenue Allocation Tab")
	public void Enter_Ratio_Value_In_Revenue_Allocation_Tab(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvOwners_lblValue_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOwners_lblValue_0"));
		ele.sendKeys("100");
	}

	@And("Click Flat Radio button In Revenue Allocation Tab")
	public void Click_Flat_Radio_button_In_Revenue_Allocation_Tab(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoSetupBy_2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoSetupBy_2"));
		ele.click();
	}

	@Then("Click Expense Allocation button In Owner Ratio Setup")
	public void Click_Expense_Allocation_button_In_Owner_Ratio_Setup() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_aExpense")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_aExpense"));
		ele.click();
	}

	@And("Click Edit button In Expense Allocation Tab")
	public void Click_Edit_button_In_Expense_Allocation_Tab(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvCOS_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvCOS_imbEdit_0"));
		ele.click();
	}

	@And("Click Close button In Expense Allocation Tab")
	public void Click_Close_button_In_Expense_Allocation_Tab() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgNationalClose")));
		ele=driver.findElement(By.id("imgNationalClose"));
		ele.click();
	}

	@And("Click Company Level Radio button In Expense Allocation Tab")
	public void Click_Company_Level_Radio_button_In_Expense_Allocation_Tab(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoSetupBy_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoSetupBy_0"));
		ele.click();
	}

	@And("Click Ratio Radio button In Expense Allocation Tab")
	public void Click_Ratio_Radio_button_In_Expense_Allocation_Tab(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoSetupBy_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoSetupBy_1"));
		ele.click();
	}

	@Then("Click Save button In Expense Allocation Tab")
	public void Click_Save_button_In_Expense_Allocation_Tab() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnExpatioSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnExpatioSave"));
		ele.click();
	}

	@Then("Enter Ratio Value In Expense Allocation Tab")
	public void Enter_Ratio_Value_In_Expense_Allocation_Tab() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvOwners_lblValue_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOwners_lblValue_0"));
		ele.sendKeys("100");
	}

	@And("Click Trip Type Radio button In Expense Allocation Tab")
	public void Click_Trip_Type_Radio_button_In_Expense_Allocation_Tab(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoSetupBy_2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoSetupBy_2"));
		ele.click();
	}

	@And("Click Flat Radio button In Expense Allocation Tab")
	public void Click_Flat_Radio_button_In_Expense_Allocation_Tab(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoSetupBy_3")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rdoSetupBy_3"));
		ele.click();
	}

	@And("Click Owner Screen Rights button In Owner Portal")
	public void Click_Owner_Screen_Rights_button_In_Owner_Portal(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[4]/a/span"));
		ele1.click();
	}

	@Then("Click Add OP Rights In Owner Portal")
	public void Click_Add_OP_Rights_In_Owner_Portal() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click Back button In Owner Screen Rights")
	public void Click_Back_button_In_Owner_Screen_Rights(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnback")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnback"));
		ele.click();
	}

	@And("Click Copy Rights button In Owner Screen Rights")
	public void Click_Copy_Rights_button_In_Owner_Screen_Rights(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCopy")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnCopy"));
		ele.click();
	}

	@Then("Click Close button In Owner Screen Rights")
	public void Click_Close_button_In_Owner_Screen_Rights() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_Button1"));
		ele.click();
	}

	@Then("Click Save button In Copy Screen Rights")
	public void Click_Save_button_In_Copy_Screen_Rights() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnsaveCopy")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnsaveCopy"));
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

	@And("Select Valid Tail From In The Dropdown In Owner Screen Rights")
	public void Select_Valid_Tail_From_In_The_Dropdown_In_Owner_Screen_Rights() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCopyTailFrom")));

		//Select tail in From dropdown
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlCopyTailFrom"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Select Copy From In The Dropdown In Owner Screen Rights")
	public void Select_Copy_From_In_The_Dropdown_In_Owner_Screen_Rights() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCopyTailFrom")));
		//Select tail in From dropdown
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlCopyFrom"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Select Valid Tail To In The Dropdown In Owner Screen Rights")
	public void Select_Valid_Tail_To_In_The_Dropdown_In_Owner_Screen_Rights() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCopyTailFrom")));
		//Select tail in From dropdown
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlCopyTailTo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Select Copy To In The Dropdown In Owner Screen Rights")
	public void Select_Copy_To_In_The_Dropdown_In_Owner_Screen_Rights() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCopyTo")));
		//Select tail in From dropdown
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlCopyTo"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Thirumaran Tester [ Representative]");
	}

	@And("Click Save button In Owner Screen Rights")
	public void Click_Save_button_In_Owner_Screen_Rights() throws InterruptedException{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, 0)");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
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

	@And("Select The Tail From Dropdown In Owner Screen Rights")
	public void Select_The_Tail_From_Dropdown_In_Owner_Screen_Rights(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTailNo")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTailNo"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Select The Owner From Dropdown In Owner Screen Rights")
	public void Select_The_Owner_From_Dropdown_In_Owner_Screen_Rights(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddluser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddluser"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Enter The Notes In Owner Screen Rights")
	public void Enter_The_Notes_In_Owner_Screen_Rights(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNotes")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele.sendKeys("Test");
	}

	@Then("Click Active Radio button In Owner Screen Rights")
	public void Click_Active_Radio_button_In_Owner_Screen_Rights() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblactive_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblactive_0"));
		ele.click();
	}

	@Then("Click InActive Radio button In Owner Screen Rights")
	public void Click_InActive_Radio_button_In_Owner_Screen_Rights() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblactive_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblactive_1"));
		ele.click();
	}

	@And("Click The Checkbox In Version In Owner Screen Rights")
	public void Click_The_Checkbox_In_Version_In_Owner_Screen_Rights() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvScreen_ddlVersion_0_0_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvScreen_ddlVersion_0_0_0"));
		if(ele.isSelected()) {
			System.out.println("Checkbox is already selected");
			ele.click();
			Thread.sleep(2000);
			ele.click();
		}
		else {
			ele.click();
		}
	}

	@Then("Click The Show Radio button In Owner Screen Rights")
	public void Click_The_Show_Radio_button_In_Owner_Screen_Rights() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvScreen_rblRights_0_0_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvScreen_rblRights_0_0_0"));
		ele.click();
		By showRadioButtonLocator = By.xpath("//input[@type='radio' and @value='ON']"); // Replace with a suitable locator
		List<WebElement> showRadioButtons = driver.findElements(showRadioButtonLocator);
		// Click each "show" radio button
		for (WebElement radioButton : showRadioButtons) {
			if (!radioButton.isSelected()) {
				radioButton.click();
			}
		}
	}

	@Then("Click The Coming Soon Radio button In Owner Screen Rights")
	public void Click_The_Coming_Soon_Radio_button_In_Owner_Screen_Rights() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvScreen_rblRights_0_2_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvScreen_rblRights_0_2_0"));
		ele.click();
		By showRadioButtonLocator = By.xpath("//input[@type='radio' and @value='CS']"); // Replace with a suitable locator
		List<WebElement> showRadioButtons = driver.findElements(showRadioButtonLocator);
		// Click each "show" radio button
		for (WebElement radioButton : showRadioButtons) {
			if (!radioButton.isSelected()) {
				radioButton.click();
			}
		}
	}

	@Then("Select The Tail In Owner Screen Rights")
	public void Select_The_Tail_In_Owner_Screen_Rights() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlfiltertail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlfiltertail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Select The Status In Active Dropdown In Owner Screen Rights")
	public void Select_The_Status_In_Active_Dropdown_In_Owner_Screen_Rights() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlactive")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlactive"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Enter The Owner Name In Owner Screen Rights")
	public void Enter_The_Owner_Name_In_Owner_Screen_Rights() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtsearch")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtsearch"));
		ele.sendKeys("Tony Russo");
	}

	@And("Click Submit button In Owner Screen Rights")
	public void Click_Submit_button_In_Owner_Screen_Rights(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnsubmit")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnsubmit"));
		ele.click();
	}

	@Then("Click Edit button In Owner Screen Rights")
	public void Click_Edit_button_In_Owner_Screen_Rights() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvOPGrid_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOPGrid_imbEdit_0"));
		ele.click();
	}

	@And("Modify The Details In Owner Screen Rights")
	public void Modify_The_Details_In_Owner_Screen_Rights() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNotes")));
		//Modify The Notes
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		String Notes = ele.getAttribute("value");
		System.out.println(Notes);
		ele.clear();
		Thread.sleep(2000);
		ele.sendKeys(Notes);
	}

	@And("Click The Snapshot Add button In Owner Screen Rights")
	public void Click_The_Snapshot_Add_button_In_Owner_Screen_Rights() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvScreen_imbEdit_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvScreen_imbEdit_0"));
		ele.click();
	}

	@Then("Click Close button In Block Rights In Block Rights")
	public void Click_Close_button_In_Block_Rights_In_Block_Rights() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCloseExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnCloseExtUser"));
		ele.click();
	}

	@Then("Click Show Radio button In Block Rights")
	public void Click_Show_Radio_button_In_Block_Rights() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_0_0_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_0_0_0"));
		ele1=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_1_0_1"));
		ele2=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_2_0_2"));
		ele3=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_3_0_3"));
		ele4=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_4_0_4"));
		if(!ele.isSelected()) {
			Thread.sleep(2000);
			ele.click();
			Thread.sleep(2000);
			ele1.click();
			Thread.sleep(2000);
			ele2.click();
			Thread.sleep(2000);
			ele3.click();
			Thread.sleep(2000);
			ele4.click();
		}
		else {
			System.out.println("Elements are already selected");
		}
	}

	@Then("Click Hide Radio button In Block Rights")
	public void Click_Hide_Radio_button_In_Block_Rights() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_0_0_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_0_1_0"));
		ele1=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_1_1_1"));
		ele2=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_2_1_2"));
		ele3=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_3_1_3"));
		ele4=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_4_1_4"));
		if(!ele.isSelected()) {
			Thread.sleep(2000);
			ele.click();
			Thread.sleep(2000);
			ele1.click();
			Thread.sleep(2000);
			ele2.click();
			Thread.sleep(2000);
			ele3.click();
			Thread.sleep(2000);
			ele4.click();
		}
		else {
			System.out.println("Elements are already selected");
		}
	}

	@And("Click Save button In Block Rights")
	public void Click_Save_button_In_Block_Rights() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSaveExtUser"));
		ele.click();
	}

	@And("Click The Dashboard Add button In Owner Screen Rights")
	public void Click_The_Dashboard_Add_button_In_Owner_Screen_Rights() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvScreen_imbEdit_2")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvScreen_imbEdit_2"));
		ele.click();
	}

	@Then("Click Close button In Block Rights In Dashboard")
	public void Click_Close_button_In_Block_Rights_In_Dashboard(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCloseExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnCloseExtUser"));
		ele.click();
	}

	@Then("Click Show Radio button In Block Rights In Dashboard")
	public void Click_Show_Radio_button_In_Block_Rights_In_Dashboard() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_0_0_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_0_0_0"));
		ele1=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_1_0_1"));
		if(!ele.isSelected()) {
			Thread.sleep(2000);
			ele.click();
			Thread.sleep(2000);
			ele1.click();
		}
		else {
			System.out.println("Elements are already selected");
		}
	}

	@Then("Click Hide Radio button In Block Rights In Dashboard")
	public void Click_Hide_Radio_button_In_Block_Rights_In_Dashboard() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_0_0_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_0_1_0"));
		ele1=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_1_1_1"));
		if(!ele.isSelected()) {
			Thread.sleep(2000);
			ele.click();
			Thread.sleep(2000);
			ele1.click();
		}
		else {
			System.out.println("Elements are already selected");
		}
	}

	@And("Click Save button In Block Rights In Dashboard")
	public void Click_Save_button_In_Block_Rights_In_Dashboard(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSaveExtUser"));
		ele.click();
	}

	@And("Click The Calendar View Add button In Owner Screen Rights")
	public void Click_The_Calendar_View_Add_button_In_Owner_Screen_Rights(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvScreen_imbEdit_3")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvScreen_imbEdit_3"));
		ele.click();
	}

	@Then("Click Close button In Block Rights In Calendar View")
	public void Click_Close_button_In_Block_Rights_In_Calendar_View(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCloseExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnCloseExtUser"));
		ele.click();
	}

	@Then("Click Show Radio button In Block Rights In Calendar View")
	public void Click_Show_Radio_button_In_Block_Rights_In_Calendar_View() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_0_0_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_0_0_0"));
		ele1=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_1_0_1"));
		ele2=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_2_0_2"));
		ele3=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_3_0_3"));
		if(!ele.isSelected()) {
			Thread.sleep(2000);
			ele.click();
			Thread.sleep(2000);
			ele1.click();
			Thread.sleep(2000);
			ele2.click();
			Thread.sleep(2000);
			ele3.click();
		}
		else {
			System.out.println("Elements are already selected");
		}
	}

	@Then("Click Hide Radio button In Block Rights In Calendar View")
	public void Click_Hide_Radio_button_In_Block_Rights_In_Calendar_View() throws InterruptedException{
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_0_0_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_0_1_0"));
		ele1=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_1_1_1"));
		ele2=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_2_1_2"));
		ele3=driver.findElement(By.id("ContentPlaceHolder1_gvblockscreen_rblRights_3_1_3"));
		if(!ele.isSelected()) {
			Thread.sleep(2000);
			ele.click();
			Thread.sleep(2000);
			ele1.click();
			Thread.sleep(2000);
			ele2.click();
			Thread.sleep(2000);
			ele3.click();
		}
		else {
			System.out.println("Elements are already selected");
		}
	}

	@And("Click Save button In Block Rights In Calendar View")
	public void Click_Save_button_In_Block_Rights_In_Calendar_View(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveExtUser")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSaveExtUser"));
		ele.click();
	}

	@And("Click Create Owner Login button In Owner Portal")
	public void Click_Create_Owner_Login_button_In_Owner_Portal(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[5]/a/span"));
		ele1.click();
	}

	@Then("Click Create Login button In Create Owner Login")
	public void Click_Create_Login_button_In_Create_Owner_Login(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click Close button In Create Owner Login")
	public void Click_Close_button_In_Create_Owner_Login(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgMXClose")));
		ele=driver.findElement(By.id("imgMXClose"));
		ele.click();
	}

	@And("Click Submit button In Create Owner Login")
	public void Click_Submit_button_In_Create_Owner_Login(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSend")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnSend"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String AlertText = alert.getText();
			System.out.println("Alert Message is: "+AlertText);
			alert.accept();
		}
		catch(NoAlertPresentException e){
			System.out.println("No alert present.");
	}
	}

	@And("Select Valid Tail and Owner From The Dropdown")
	public void Select_Valid_Tail_and_Owner_From_The_Dropdown() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		Thread.sleep(3000);
		ele1=driver.findElement(By.id("ContentPlaceHolder1_ddlOwner"));
		Select sel1=new Select(ele1);
		sel1.selectByVisibleText("Thirumaran Tester [ thirumaran0828@outlook.com ] ");
	}

	@Then("Click The Set System Radio button In Create Owner Login")
	public void Click_The_Set_System_Radio_button_In_Create_Owner_Login(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblSendEmail_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblSendEmail_0"));
		if(!ele.isSelected()) {
			ele.click();
		}
		else {
			System.out.println("Already Selected the radio button");
		}
	}

	@Then("Click The Let Me Radio button In Create Owner Login")
	public void Click_The_Let_Me_Radio_button_In_Create_Owner_Login(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblSendEmail_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_rblSendEmail_1"));
		if(!ele.isSelected()) {
			ele.click();
		}
		else {
			System.out.println("Already Selected the radio button");
		}
	}

	@And("Enter Valid Password In Password Field are {string}")
	public void Enter_Valid_Password_In_Password_Field_are(String Password){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtPassword")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtPassword"));
		ele.sendKeys(Password);
	}

	@And("Enter Same Password In Confirm Password Field are {string}")
	public void Enter_Same_Password_In_Confirm_Password_Field_are(String ConfirmPassword) throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtConfirmPassword")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtConfirmPassword"));
		ele.sendKeys(ConfirmPassword);
	}

	@And("Select Tail and Status From Dropdown In Create Owner Login")
	public void Select_Tail_and_Status_From_Dropdown_In_Create_Owner_Login() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlFilterTail")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlFilterTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		ele1=driver.findElement(By.id("ContentPlaceHolder1_ddlFilterTail"));
		Select sel1=new Select(ele1);
		sel1.selectByIndex(1);
	}

	@Then("Click Edit button In Create Owner Login")
	public void Click_Edit_button_In_Create_Owner_Login() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvOwnerDetails_imbEdit_1")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvOwnerDetails_imbEdit_1"));
		ele.click();
	}

	@And("Click Delete Owner User button In Owner Portal")
	public void Click_Delete_Owner_User_button_In_Owner_Portal() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span")));
		ele=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span"));
		ele.click();
		ele1=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[6]/a/span"));
		ele1.click();
	}

	@Then("Click Delete Owner button In Delete Owner User")
	public void Click_Delete_Owner_button_In_Delete_Owner_User() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnDelete")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnDelete"));
		ele.click();
	}

	@And("Click Close button In Delete Owner User")
	public void Click_Close_button_In_Delete_Owner_User() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgMXClose")));
		ele=driver.findElement(By.id("imgMXClose"));
		ele.click();
	}

	@And("Click Submit button In Delete Owner User")
	public void Click_Submit_button_In_Delete_Owner_User() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnDeleteConfirm")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_btnDeleteConfirm"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message is : "+text);
			alert.accept();
		}
		catch(NoAlertPresentException e){
			System.out.println("No alert message is present");
		}
	}

	@Then("Select The Owner Name In Delete Owner User")
	public void Select_The_Owner_Name_In_Delete_Owner_User() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlOwnerName")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_ddlOwnerName"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Thirumaran Tester [ Representative ]");
	}

	@And("Enter Notes In Delete Owner User")
	public void Enter_Notes_In_Delete_Owner_User() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtDeleteNotes")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_txtDeleteNotes"));
		ele.sendKeys("Test");
	}

	@Then("Click View button In Delete Owner User")
	public void Click_View_button_In_Delete_Owner_User() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvTail_imgView_0")));
		ele=driver.findElement(By.id("ContentPlaceHolder1_gvTail_imgView_0"));
		ele.click();
	}

}

