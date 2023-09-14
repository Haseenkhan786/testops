package com.first_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;



//public class First_class {
//
//
//	public static void main(String[] args) {
//		
//		System.out.println("Hello Haseen");
//		
//	
//	WebDriver driver = new ChromeDriver();
////		
//     driver.manage().window().maximize();
	     
//	     //open xenonstack website
//	     
//      driver.get("https://www.xenonstack.com/");
//        
//        
//        
//        //check services
//        
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[2]/div[1]/span")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[2]/div[3]/div/div/div[2]/div[1]/div/ul/li[2]")).click();
//        driver.navigate().back();
//        
//        
//        //check Accelerators
//        
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[3]/div[1]/span")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[3]/div[3]/div/div/div[2]/div[1]/div/ul/li[1]/a/p")).click();
//        driver.navigate().back();
//        
//        
//      //check Industries
//        
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[4]/div[1]/span")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[4]/div[3]/div/div/div/div[2]/div/div/div[2]/ul/li[1]/a/p")).click();
//        driver.navigate().back();
//        
//        
//        
//        //check for Resources
//        
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[5]/div[1]/span")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[5]/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/ul/li[2]/a/p")).click();
//        driver.navigate().back();
//        
//        
//        
//        
//        //check for Company
//        
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[6]/div[1]/span")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[6]/div[3]/div/div/div/div[1]/div/div[2]/ul/li[1]/a/p")).click();
//        driver.navigate().back();
//    
//        
//        //  Search bar to search dataops 
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[2]/li[2]/img")).click();
//        driver.findElement(By.name("term")).sendKeys("dataops");
//        driver.findElement(By.name("term")).sendKeys(Keys.ENTER); 
//        driver.navigate().back();
//        
        
        
        
        


	//	fun();
		
		
//        String PageSource = driver.getPageSource();
//        System.out.println("The page title is : " +PageSource);
//   

//        
//        
//     
        
        
//        List<WebElement> elements = driver.findElements(By.id("country"));
//
//        for (WebElement element : elements) {
//            System.out.println("Paragraph text:" + element.getText());
//        }
      
        
//        String title = driver.getTitle();
//        System.out.println("The page title is : " +title);
//        driver.navigate().back();
      // driver.get("https://www.xenonstack.com/contact-us");
        
        
 //driver.findElement(By.id("firstname")).sendKeys("Haseen khan");
//        
//        String url= driver.getCurrentUrl();
//        System.out.println("The page title is : " +url);
        
//  driver.quit();

//	}
	
	
//	public static void fun(){
//		
//		
//		WebDriver driver = new ChromeDriver();
//		
//	     driver.manage().window().maximize();
//		
//		driver.get("https://www.xenonstack.com/");
//		
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[2]/li[1]/button/a/span")).click();
//
//		   driver.findElement(By.id("firstname")).sendKeys("haseen");
//	        driver.findElement(By.id("lastname")).sendKeys("khan");
//	        driver.findElement(By.id("email")).sendKeys("abc@xenonstack.com");
//	        driver.findElement(By.id("companyName")).sendKeys("haseen");
//	        driver.findElement(By.id("phone")).sendKeys("8696564612");
//	        Select objSelect =new Select(driver.findElement(By.id("jobFunction")));
//	        objSelect.selectByVisibleText("Director");
//	        driver.findElement(By.id("country")).sendKeys("India");
//	        driver.findElement(By.id("industry")).sendKeys("Gaming");
//	        WebElement button = driver.findElement(By.id("next-1"));
//	        button.click();
//		
//		
//	}

//}
