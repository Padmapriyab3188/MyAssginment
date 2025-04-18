package week3.day2;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize the WebDriver
		EdgeDriver driver=new EdgeDriver();
		
		//Load the URL and maximize the window
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		//Enter Username and Password
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on the Login Button. 
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRM/SFA Link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the Leads Button.
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead.
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id=\'createLeadForm_companyName\']")).sendKeys("HCL");
		
		//Enter the forename Field Using Xpath
		driver.findElement(By.xpath("//input[ @id='createLeadForm_firstName']")).sendKeys("Pri");
		
		//enter the surname
		driver.findElement(By.xpath("//input[ @id='createLeadForm_lastName']")).sendKeys("Basker");
		
		//Enter the FirstName(local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Padma");
		
		//Enter the LastName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("Priya");
		
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSC");
		
		//Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Assignment");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test1@gmail.com");
		
		//phonenumber
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9888888888");
		
		//Select State/Province as NewYork Using Visible Text
		WebElement SourceElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select dropdown=new Select(SourceElement);
		dropdown.selectByVisibleText("New York");
		
		//Click on the Create Button
		driver.findElement(By.name("submitButton")).click();
		
		//Click on the edit button.
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear the Description Field
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//Fill the Important Note Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("Test Notes");
		
		//Click on the update button
		driver.findElement(By.name("submitButton")).click();
		
		//Get the Title of the Resulting Page
		
		String title=driver.getTitle();
	    System.out.println(title);
	    
	    if(title.equals("View Lead | opentaps CRM"))
	    {
	    	System.out.println("View Lead Title matched successfully");
	    }
	    
	    else
	    {
	    	System.out.println("Update Lead title not matched");
	    }
		
		
	  //Close the browser window
	    driver.close();
	    

	}

}
