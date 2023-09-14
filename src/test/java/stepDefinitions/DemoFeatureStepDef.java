package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DemoFeatureStepDef {

	
	WebDriver driver = new ChromeDriver();
	
	//Fill the contact-us form
	
	@Given("Open the xenonstack HomePage")
	public void open_The_Xenonstack() {
		
		driver.manage().window().maximize();
		driver.get("https://www.xenonstack.com/");
		
	   System.out.println("Open the xenonstack HomePage");
	}

	@When("Click on ContactUs")
	public void click_On_Contactus() {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[2]/li[1]/button/a/span")).click();
	    System.out.println("Click on ContactUs");
	}
	
	@Then ("Fill the contactForm")
	public void fill_The_Form() {

		   driver.findElement(By.id("firstname")).sendKeys("haseen");
	        driver.findElement(By.id("lastname")).sendKeys("khan");
	        driver.findElement(By.id("email")).sendKeys("abx");
	        driver.findElement(By.id("companyName")).sendKeys("haseen");
	        driver.findElement(By.id("phone")).sendKeys("8696564612");
	        Select objSelect =new Select(driver.findElement(By.id("jobFunction")));
	        objSelect.selectByVisibleText("Director");
	        driver.findElement(By.id("country")).sendKeys("India");
	        driver.findElement(By.id("industry")).sendKeys("Gaming");
	        
	    System.out.println("Fill the contactForm");
	}

	@Then ("Click on next button")
	public void click_On_Next() {
		WebElement button = driver.findElement(By.id("next-1"));
        button.click();
	    System.out.println("Click on next button");
	    driver.quit();
	}
	 
	
	
	
	//To search things on XenonStack search-bar
	
	
	
	@Given("Open the xenonstackPage")
	public void open_The_Xenonstack_Page() {
		driver.manage().window().maximize();
		driver.get("https://www.xenonstack.com/");
	   System.out.println("Open the xenonstackPage");
	}

	@Given("Click on SearchBar")
	public void click_On_SearchBar() {
		 driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[2]/li[2]/img")).click();
	    System.out.println("Click on SearchBar");
	}

	@When("Entered something")
	public void enter_Something() {
      driver.findElement(By.name("term")).sendKeys("dataops");
      driver.findElement(By.name("term")).sendKeys(Keys.ENTER); 
		
	    System.out.println("Entered something");
	}

	@Then("Result would be appear")
	public void result_Shown() {
	    System.out.println("Result would be appear");
	    
	    driver.quit();
	}
	
	
	
	
	
	// Checking the validation of homePage navigation
	 
	
	@Given("open xenonstack page")
	public void open_Homepage() {
		driver.manage().window().maximize();
		driver.get("https://www.xenonstack.com/");
	    System.out.println("open xenonstack page");
	}

	@When("I click on services")
	public void click_On_Services() {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[2]/div[1]/span")).click();
	    System.out.println("I click on services");
	}

	
	@Then("I click on enterprise data strategy and want to verify i am on right url")
	public void click_On_Field() {
		String expected_Url = "https://www.xenonstack.com/services/big-data-services/";
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[2]/div[3]/div/div/div[2]/div[1]/div/ul/li[1]/a/p")).click();
		String currenturl = driver.getCurrentUrl();
		System.out.println("current url  is : " + currenturl);
		System.out.println("Expected url  is : " + expected_Url);	
		System.out.println("title   is : " + driver.getTitle());	
       Assert.assertEquals(expected_Url,currenturl);
       
	    driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}