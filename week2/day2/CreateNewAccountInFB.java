package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccountInFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize ChromeDriver 
		//Load the URL https://en-gb.facebook.com/
		//Maximize the browser window  
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("SelFBUser");
		
		// Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("Student");
		
		//Enter the Mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("testleaf.2023@gmail.com");
		
		//Enter the New password
		driver.findElement(By.id("password_step_input")).sendKeys("Tuna@321");
		
		//Handle all three dropdowns in Date of birth 
		//find the elements
		WebElement SourceElement = driver.findElement(By.id("day"));
		
		//Create object for select class
		Select dropdown=new Select(SourceElement);
		
		//Use the method to handle
		//Day
		dropdown.selectByIndex(0);
		
		//Month
		Select Month=new Select(driver.findElement(By.id("month")));
		Month.selectByValue("3");
		
		//Year
		Select Year=new Select(driver.findElement(By.id("year")));
		Year.selectByVisibleText("1988");
		
		//Select the radio button in Gender
		driver.findElement(By.id("sex")).click();
		
		

	}

}
