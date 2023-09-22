package stepsDefinitionforcontact;

import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsForContactUs {

	WebDriver driver =  new ChromeDriver();
	String regex = "^(.+)@(.+)$";
	String regex2  = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$";
	String regex3=   "^([a-zA-Z '-]+)$";
		//	"[A-Z][a-z]+";
	
	Boolean myArray[] = new Boolean[5];

	
//	Pattern pattern = Pattern.compile(regex2);
//	 Matcher matcher = pattern.matcher(phone);
	@Given("open contactus form")
	public void open_contactus_form() {
		driver.manage().window().maximize();
		driver.get("https://www.xenonstack.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[2]/li[1]/button/a/span")).click();
	    System.out.println("Click on ContactUs");
	    
	}

	
	@When("when you filled all valid input fields")
	public void when_you_filled_all_valid_input_fields() {
		driver.findElement(By.id("firstname")).sendKeys("Haseen");
		String fName= driver.findElement(By.id("firstname")).getAttribute("value");
		myArray[0]=fName.matches(regex3);
		System.out.println("fname is valid :" +myArray[0]);
		
		
		 driver.findElement(By.id("lastname")).sendKeys("khan");
		 String lName= driver.findElement(By.id("lastname")).getAttribute("value");
		myArray[1]=lName.matches(regex3);
		System.out.println("lname is :"+myArray[1]);
		 
		 
		driver.findElement(By.id("email")).sendKeys("abc@enon.com");
	   String email = driver.findElement(By.id("email")).getAttribute("value");
	   System.out.print(email);
	 myArray[2] = email.matches(regex);
	   System.out.println(myArray[2]);
	   
	   driver.findElement(By.id("companyName")).sendKeys("haseen");
	   String company=driver.findElement(By.id("companyName")).getAttribute("value");
	  myArray[3]=company.matches(regex3);
	  System.out.println("company name is :" +myArray[3]);
	  
	  driver.findElement(By.id("phone")).sendKeys("+918696564612");
	  String phone= driver.findElement(By.id("phone")).getAttribute("value");

	  myArray[4] = phone.matches(regex2);
	  System.out.println("phone is valid: "+myArray[4]);
	  
      Select objSelect =new Select(driver.findElement(By.id("jobFunction")));
      objSelect.selectByVisibleText("Director");
      driver.findElement(By.id("country")).sendKeys("India");
      driver.findElement(By.id("industry")).sendKeys("Gaming");
      
      for (int i=0;i<5;i++) {
    	  if (myArray[i]==false) {
    		  fail("Please enter correct input fields");
//    		  System.out.println("Please enter correct input fields ");
//    		  driver.navigate().refresh();
    	  }
      }
	}

	@Then("click on next button")
	public void click_on_next_button() {
		WebElement button = driver.findElement(By.id("next-1"));
	      button.click();
	}

	@When("fill all fields on next page")
	public void fill_all_fields_on_next_page() {
		driver.findElement(By.id("whatStage")).sendKeys("Startup");
	      
	      driver.findElement(By.id("cloudService")).sendKeys("AWS");
	      
	      driver.findElement(By.id("cloudPlatform")).sendKeys("Databricks");
	      
	      driver.findElement(By.id("dataTool")).sendKeys("Other");
	      
	      driver.findElement(By.id("businessUsecase")).sendKeys("Others");
	      
	      driver.findElement(By.id("checkbox1")).click();
	      
	      
	      
	try{
	Thread.sleep(15000);
	}
	catch(InterruptedException ie){
	}

	WebElement captcha= driver.findElement(By.id("textBox"));
		     
		       String c1 = captcha.getAttribute("value");
		 
		        System.out.println("captcha is : " + c1);
	      
			  
		}
		
	

	@Then("click on submit button")
	public void click_on_submit_button() {
	   
		  driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[2]/form/div[2]/div[9]/input")).click();
		  driver.close(); 
	}
	

	
	
}
