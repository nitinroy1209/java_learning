package prac;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("first books");
        searchBox.submit();
        
        Thread.sleep(2000);
        
        WebElement firstSearchResult = driver.findElement(By.cssSelector(".tF2Cxc:first-child a"));
        firstSearchResult.click();
        
        Thread.sleep(3000);
        
       

        driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().to("https:///www.google.com");
		Thread.sleep(2000);
		
		driver.quit();
	}





}
