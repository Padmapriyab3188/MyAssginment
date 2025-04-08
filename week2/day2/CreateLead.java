package week2.day2;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Enter Username and Password
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link.
	    
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the "Leads" tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the "Create Lead" button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter a FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PadmaPriya1");
		
		//Enter a LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Basker1");
		
		//Enter a CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		//Enter a Title 
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SeleniumBasicPGM");
		
		//Click the "Create Lead" button
		driver.findElement(By.name("submitButton")).click();
		
        //Verify that the Title is displayed correctly
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title is verified successfully");
		}
		
		else
		{
			System.out.println("Title not matched");
		}
		//Close the browser window
		driver.close();

	}

}
