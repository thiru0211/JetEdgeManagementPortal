package com.JetEdge.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JE1_Login {

	public WebDriver driver;
	public WebElement ele,ele1;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));

	@Given("user is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@When("invalid username and valid password are {string} and {string}")
	public void invalid_username_and_valid_password_are_and(String InvalidUserName, String ValidPassword) {
		driver.findElement(By.id("txtUserName")).sendKeys(InvalidUserName);
		driver.findElement(By.id("txtPassword")).sendKeys(ValidPassword);
		System.out.println("Username and password entered");
	}

	@When("valid username and invalid password are {string} and {string}")
	public void valid_username_and_invalid_password_are_and(String ValidUserName, String InvalidPassword) {
		driver.findElement(By.id("txtUserName")).sendKeys(ValidUserName);
		driver.findElement(By.id("txtPassword")).sendKeys(InvalidPassword);
		System.out.println("Username and password entered");
	}

	@When("invalid username and invalid password are {string} and {string}")
	public void invalid_username_and_invalid_password_are_and(String InValidUserName, String InvalidPassword) {
		driver.findElement(By.id("txtUserName")).sendKeys(InValidUserName);
		driver.findElement(By.id("txtPassword")).sendKeys(InvalidPassword);
		System.out.println("Username and password entered");
	}

	@And("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@Then("click the checkbox")
	public void click_the_checkbox() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
	}

	@Then("display the user home page")
	public void display_the_user_home_page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lblMainHeader")));
		boolean status = driver.findElement(By.id("lblMainHeader")).isDisplayed();
		System.out.println(status);
		}

	@Then("check the toast message")
	public void check_the_toast_message() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lblInvalidLogin")));
		boolean status = driver.findElement(By.id("lblInvalidLogin")).isDisplayed();
		System.out.println(status);
		}

	@And("click the user logo button")
	public void click_the_user_logo_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"kt_header\"]/div[2]/div[5]/div[1]/div")));
		driver.findElement(By.xpath("//*[@id=\"kt_header\"]/div[2]/div[5]/div[1]/div")).click();
	}

	@And("enter valid username are {string}")
	public void enter_valid_username_are(String ValidUserName) {
		driver.findElement(By.id("txtUserName")).sendKeys(ValidUserName);
	}

	@Then("click the signout button")
	public void click_the_signout_button() {
		driver.findElement(By.id("btnLogout")).click();
		}

	@Then("click the Ok button in alert message")
	public void click_the_Ok_button_in_alert_message() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
		}

	@And("close the application")
	public void close_the_application() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@When("Click Forget password button")
	public void Click_Forget_password_button() throws InterruptedException {
		WebElement button = driver.findElement(By.id("lbForgotPassword"));
		button.click();
		Thread.sleep(2000);
		try {
		  String alertMessage = driver.switchTo().alert().getText();
		  System.out.println("Alert message: " + alertMessage);
		  driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
		  System.out.println("No alert message found.");
		}
}

	@Then("Click Exit button")
	public void click_the_Exit_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("btnExit")).click();
		Thread.sleep(2000);
		//Check sign in page is show or not
		ele=driver.findElement(By.xpath("//*[@id=\"UpdatePanel1\"]/div[1]/div/div[1]/div[2]/h3"));
		String text = ele.getText();
		System.out.println("Page navigates to: "+text);
		}

	@Then("click the Continue button")
	public void click_the_Continue_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(2000);

		//Check registered mail id and password sent mail id is same or not
		ele=driver.findElement(By.id("lblEmailAddress"));
		String text = ele.getText();
		if(text.equals("txtUserName")) {
			System.out.println("Both Email Address is same");
		}
		else {
			System.out.println("Both Email Address are not same");
		}
		}

	@Then("click the Continue and exit button")
	public void click_the_Continue_and_exit_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnExit")).click();
		Thread.sleep(2000);
		//Check sign in page is show or not
		ele=driver.findElement(By.xpath("//*[@id=\"UpdatePanel1\"]/div[1]/div/div[1]/div[2]/h3"));
		String text = ele.getText();
		System.out.println("Page navigates to: "+text);
		}


	@Then("Enter Temporary Passoword are {string}")
	public void enter_temporary_passoword_are(String TempPass) {
		driver.findElement(By.id("txtPassword")).sendKeys(TempPass);
	}

	@And("Check Reset Password page")
	public void Check_Reset_Password_page() {
		ele=driver.findElement(By.xpath("//*[@id=\"trchange\"]/td/table/tbody/tr[2]/th"));
		if(ele.isDisplayed()) {
			System.out.println("Page Lands to : "+ele.getText());
		}
		else {
			System.out.println("Page doesnot Lands to : "+ele.getText());
		}
	}

	@Then("Enter New Password and Confirm Password are {string}")
	public void enter_new_password_and_confirm_password_are(String NewPass) {
		driver.findElement(By.id("txtNewPwd")).sendKeys(NewPass);
		driver.findElement(By.id("txtConPwd")).sendKeys(NewPass);
	}

	@And("Click Clear button")
	public void click_clear_button() {
		driver.findElement(By.id("btnClear")).click();
	}

	@And("Click Cancel button")
	public void click_Cancel_button() {
		driver.findElement(By.id("btnClose")).click();
	}

	@And("Enter Old Passwords in New and Confirm Password {string}")
	public void Enter_Old_Passwords_in_New_and_Confirm_Password(String Password) {
		driver.findElement(By.id("txtNewPwd")).sendKeys(Password);
		driver.findElement(By.id("txtConPwd")).sendKeys(Password);
	}

	@Then("Check SignIn Page is show or not")
	public void Check_SignIn_Page_is_show_or_not() {
//		ele=driver.findElement(By.xpath("//*[@id=\"UpdatePanel1\"]/div[1]/div/div[1]/div[2]/h3"));
//		String text = ele.getText();
//		System.out.println("Page Landed in : "+text);
		String SignInPageURL="https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx";
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.equals(SignInPageURL)) {
			System.out.println("Page landed to Sign In page");
		}
		else {
			System.out.println("Page is not landed to Sign In page");
		}
	}

	@When("Enter new username and new password are {string} and {string}")
	public void Enter_username_and_new_password_are_(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@Then("Click the Here button")
	public void Click_the_Here_button() {
		driver.findElement(By.id("lblEmailAddress")).click();
	}
}