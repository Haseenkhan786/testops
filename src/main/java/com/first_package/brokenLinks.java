package com.first_package;




import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 

	
	public static void main(String[] args)  {
		//Instantiating FirefoxDriver
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Environment\\Drivers\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To launch softwaretestingmaterial.com
		driver.get("https://www.xenonstack.com");
		//Wait for 5 seconds
		Thread.sleep(5000);
		//Used tagName method to collect the list of items with tagName "a"
		//findElements - to find all the elements with in the current page. It returns a list of all webelements or an empty list if nothing matches
		List<WebElement> links = driver.findElements(By.tagName("a"));	
		//To print the total number of links
		System.out.println("Total links are "+links.size());	
		//used for loop to 
		for(int i=0; i<links.size(); i++) {
			WebElement element = links.get(i);
		
			String url=element.getAttribute("href");
			
			verifyLink(url);			
		}	
	}
	
	// The below function verifyLink(String urlLink) verifies any broken links and return the server status. 
	public static void verifyLink(String urlLink) {
		
		
		
        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
        try {
			//Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
			URL link = new URL(urlLink);
			// Create a connection using URL object (i.e., link)
			HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			//Set the timeout for 2 seconds
			httpConn.setConnectTimeout(2000);
			//connect using connect method
			httpConn.connect();
			//use getResponseCode() to get the response code. 
				if(httpConn.getResponseCode()== 200) {	
					System.out.println(urlLink+" - "+httpConn.getResponseMessage());
				}
				if(httpConn.getResponseCode()== 404) {
					System.out.println(urlLink+" - "+httpConn.getResponseMessage());
				}
			}
			//getResponseCode method returns = IOException - if an error occurred connecting to the server. 
		catch (Exception e) {
			//e.printStackTrace();
		}
    } 






	














package org.arpit.java2blog;

//Java program to check phone 
//is valid as per E123 
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class ValidatePhoneNumberMain { 
	
   public static boolean isValidE123(String s) 
   { 
       Pattern p = Pattern.compile("^\\+(?:[0-9] ?){6,14}[0-9]$"); 

       Matcher m = p.matcher(s); 
       return (m.find() && m.group().equals(s)); 
   } 

   public static void main(String[] args) 
   { 
       String phone1 = "+91 3423 546443"; 
       String phone2 = "+44 343 2324";
       String phone3 = "91 4354 3454";
       String[] phoneNumbers= {phone1,phone2,phone3};

       for (int i = 0; i < phoneNumbers.length; i++) {
           String phoneNumber=phoneNumbers[i];
           if (isValidE123(phoneNumber)) 
               System.out.print(phoneNumber+" is valid phone number"); 
           else
               System.out.print(phoneNumber+" is invalid Phone number"); 

           System.out.println();
       }    
   } 
} 



















