package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

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
				
				//Add an implicit wait to ensure the web page elements are fully loaded 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Click on the Login Button. 
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Click on the CRM/SFA Link.
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click on the Leads Button.
				driver.findElement(By.linkText("Leads")).click();
				
				//Click "Find leads." 
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Click on the "Phone" tab.
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				
				//Enter the phone number
				driver.findElement(By.name("phoneNumber")).sendKeys("9888888888");
				
				//Click the "Find leads" button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				//wait for the first lead to appear and get its ID
			    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				WebElement leadLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
			
				//Capture the lead ID of the first resulting lead
				//WebElement LeadElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']"));
				String ID = leadLink.getText();
				System.out.println("FirstLeadID:"+ID);
				
				//Click the first resulting lead
				leadLink.click();
			
				
				//Click the "Delete" button.
				driver.findElement(By.className("subMenuButtonDangerous")).click();
				
				//Click "Find leads" again.
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Enter the captured lead ID
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(ID);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				//wait for to find the text no record found
				WebDriverWait Lwait=new WebDriverWait(driver,Duration.ofSeconds(10));
				boolean noRecordDisplayed = Lwait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("x-paging-info"),"No records to display"));
			
				
				//WebElement noRecordDisplayed = driver.findElement(By.xpath("//div[text()='No records to display']"));
				System.out.println(noRecordDisplayed);
				
				//WebElement element1 = driver.findElement(By.xpath("//div[text()='No records to display']"));
				
				if(noRecordDisplayed)
				{
					System.out.println("Record Deleted Successfully");
				}
				
				else
					
				{
					System.out.println("Record is not deleted");
				}

	}

}
