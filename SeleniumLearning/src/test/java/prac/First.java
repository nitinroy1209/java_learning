package prac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class First {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


	
	driver = new ChromeDriver();
	driver.get("www.google.com");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	driver.findElement(By.className("gLFyf")).sendKeys("selenium");
	
	//driver.findElement(By.name("q")).clear();

	//driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.linkText("images")).click();

	driver.findElement(By.partialLinkText("ima")).click();

	
	

	
}
}