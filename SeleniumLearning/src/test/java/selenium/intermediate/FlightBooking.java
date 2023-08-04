package selenium.intermediate;
import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FlightBooking {
	
	
	public static void main(String[] args) throws InterruptedException   
		{
	        WebDriver driver = new ChromeDriver();

	        String url = "https://rahulshettyacademy.com/seleniumPractise/#/"; 
	        driver.get(url);
	        
          driver.manage().window().maximize();
          
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		 
			
			String parentWindow=driver.getWindowHandle();
	        
	        
	        WebElement flightBookingElement = driver.findElement(By.xpath("//a[text()='Flight Booking']"));
	        flightBookingElement.click();
	        flightBookingElement.getText();
	        

			Set<String> allWindows=driver.getWindowHandles(); //it will return all the window handles opened by the driver instance. In this case, it will return 2 window handles
			
			for (String childWindow:allWindows)
			{
				if(! (parentWindow.equalsIgnoreCase(childWindow)))
				{
					driver.switchTo().window(childWindow);
				}
			}
	     
	        
	       
			WebElement  dropdownLocator = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
			
	       dropdownLocator.click();
			
			Select sel = new Select(driver.findElement((By) dropdownLocator));
			
			//sel.selectByVisibleText("Jammu (IXJ)");
			
			sel.selectByIndex(3); 

	        
			 
			 
	    }

	    }
	