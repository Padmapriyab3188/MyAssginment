package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch browser & enter user name & password
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter Username and Password
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link.
	    
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the "Accounts" tab. 
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter an account name
	    driver.findElement(By.id("accountName")).sendKeys("PriyaSelenium");
	    
	    //Enter a description as "Selenium Automation Tester." 
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    
	    //handling the dropdown
	    //Select "ComputerSoftware" as the industry
	    //find the element
	    WebElement sourceElement= driver.findElement(By.name("industryEnumId"));
	   
	    //Create Object for select class
	    Select dropdown=new Select(sourceElement);
	    
	    //Use the method to handle
	    //Select "ComputerSoftware" as the industry
	    dropdown.selectByVisibleText("Computer Software");
	    
	    //Select "S-Corporation" as ownership using SelectByVisibleText
	    Select ownership=new Select(driver.findElement(By.name("ownershipEnumId")));
	    ownership.selectByVisibleText("S-Corporation");
	    
	    //Select "Employee" as the source using SelectByValue
	    Select source=new Select(driver.findElement(By.id("dataSourceId")));
	    source.selectByValue("LEAD_EMPLOYEE");
	    
	    //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
	    Select market=new Select(driver.findElement(By.id("marketingCampaignId")));
	    market.selectByIndex(5);
	    
	    //Select "Texas" as the state/province using SelectByValue
	    Select state=new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
	    state.selectByValue("TX");
	    
	    //Click the "Create Account" button
	    driver.findElement(By.className("smallSubmit")).click();
	    //driver.findElement(By.xpath("//input[@class='smallSubmit']"));
	    
	    //Verify that the account name is displayed correctly
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	    if(title.equals("Account Details | opentaps CRM"))
	    {
	    	System.out.println("Account Title Matched successfully");
	    }
	    
	    else
	    {
	    	System.out.println("Account title not matched");
	    }
	    
	    //Close the browser window
	    driver.close();
	    
	    
	   
	    
		
		
		
		

	}

}
