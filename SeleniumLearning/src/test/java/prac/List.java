package prac;



	



	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class List {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver driver = new ChromeDriver();

	        driver.get("https://www.google.com");

	        driver.manage().window().maximize();

	        WebElement sb=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	        sb.sendKeys("Selenium IDE");
	        sb.submit();
}
	}
