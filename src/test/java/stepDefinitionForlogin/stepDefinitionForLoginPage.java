package stepDefinitionForlogin;
import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitionForLoginPage {

	
	WebDriver driver = new ChromeDriver();
	
	
	
	
	
	@Before("@checkForPlaceholder or @onboardingLoginPage")
	public void open_onboardwebpage() {
		driver.manage().window().maximize();
	   driver.get("https://careers.xenonstack.com/onboarding/login");
	    
	}
	
	@After
	public void afterScenario() {
		driver.close();
		
	}
	
//checkPlaceholdersFor_Email_And_Password
	
	@When("email and password are showing placeholders")
	public void email_and_password_are_showing_placeholders() {
		System.out.println("showing placeholders");
		
	}

	@Then("verify email and password have placeholders")
	public void verify_email_and_password_have_placeholders() {
		WebElement emailPlaceholder= driver.findElement(By.name("email"));
		WebElement passwordPlaceholder= driver.findElement(By.name("password"));
		if( !emailPlaceholder.getAttribute("placeholder").equals("Email Address"))
		{
			fail("Placeholder is different for email");
		}
		if( !passwordPlaceholder.getAttribute("placeholder").equals("Password"))
		{
			fail("Placeholder is different for Password");
		}
	}
	
	
	// onboarding site
	
	@When("i click on {string} and {string}")
	public void i_click_on_and(String email, String password) {
	    driver.findElement(By.id("email")).sendKeys(email);
	    driver.findElement(By.id("password")).sendKeys(password);
	    
	   
	}

	@Then("click on login and validate {string}")
	public void click_on_login_and_validate(String output) {
		 driver.findElement(By.id("send-invite")).click();
		 if(!output.equals("valid")) {
			 fail("wrong inputs");
		 }
		 
	   
	}
	

}
