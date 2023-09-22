package stepDefinitions;

import static org.junit.Assert.fail;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DemoFeatureStepDef {

	
	WebDriver driver = new ChromeDriver();
	Actions act = new Actions(driver);
	
	@Before
	public void beforeScenario() {
		driver.manage().window().maximize();
		driver.get("https://www.xenonstack.com/");
		
		
	}
	
	@After
	public void afterScenario() {
		
		driver.close();
	}
	
	
	
	
	
	//logo should be clickable



	@When("click on xenonlogo")
	public void click_on_xenonlogo() {
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[1]/a/img")).click();
	   
	}

	@Then("go to homepage")
	public void go_to_homepage() {
		
	   String expTitle ="Real Time Data and AI Company";
	   Assert.assertEquals(expTitle, driver.getTitle());

	}
	
	
	
	//To search things on XenonStack search-bar
	
	
	@When("Click on seaarch bar and Entered something")
	public void click_on_seaarch_bar_and_entered_something() {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[2]/li[2]/img")).click();
	    System.out.println("Clicked on SearchBar");
  driver.findElement(By.name("term")).sendKeys("dataops");
  driver.findElement(By.name("term")).sendKeys(Keys.ENTER); 
	
    System.out.println("Entered something");
	    
	}
	
	
	@Then("Result would be appear")
	public void result_Shown() {
	    System.out.println("Result would be appear");
	    

	}
	
	
	
	
	
	// Checking the validation of homePage navigation
	 

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
    
	}
	
	
	
	
	// hovering
	
	
	
	@When("click on services")
	public void click_on_services() {
		WebElement service = driver.findElement(By.id("what-we-do"));
		act.moveToElement(service).perform();
	    
	}

	@When("click on accelerators")
	public void click_on_accelerators() {
		WebElement accelerators = driver.findElement(By.id("solutions"));
		act.moveToElement(accelerators).perform();
	}

	@When("click on industies")
	public void click_on_industies() {
		WebElement industies = driver.findElement(By.id("industries-id"));
		act.moveToElement(industies).perform();
	}

	@When("click on resources")
	public void click_on_resources() {
		WebElement resources = driver.findElement(By.id("resources"));
		act.moveToElement(resources).perform();
	}

	@Then("click on company")
	public void click_on_company() {
		WebElement company = driver.findElement(By.id("company"));
		act.moveToElement(company).perform();
	}

	

//brokenlinks
	
	@When("find all links")
	public void find_all_links() {
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println("Total links are "+links.size());
	  for(WebElement link: links) {
		  String url =link.getAttribute("href");
		  verifyLink(url);
		  System.out.println(url);
	  }
		
	}
	int cl=0;
    int bl=0;
	private void verifyLink(String linkUrl) {
	
		try
        { 
        
            URL url = new URL(linkUrl);

           
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {bl++;
            	//System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
            
            }    
       
            //Fetching and Printing the response code obtained
            else{
            	cl++;
              //  System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }catch (Exception e) {
      }
	
}

	@Then("verify all links are working")
	public void verify_all_links_are_working() {
		
		System.out.println("broken link is: " +bl);
		System.out.println("correct link is: " +cl);

		
	}



	

}