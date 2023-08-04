package com.selenium.basics;
//WebDriver IS AN INTERFACE in selenium AND driver is an object
//ChromeDriver class is extending many classes
//Chromium driver is extending many clases
//ChromeDriver.SafariDriver  etc are the implementing class
//to go into selenium implementation need to import jar files
//how to import
//open declaration of webdriver then browse path
//then import jar file selenium api sources.jar (have information about the classes)
//only for the first time do if you want to see the implementation
//ChromeDriver is a class and it is extended chromiumdriver class 
// and chromiumdriver class extends remotewebdriver class
//remotewebdriver class has implemented the webdriver Interface
//webdriver is a route interface here
//webdriver interface has all the methods for interacting with the browser and so implememnting class will have all the  methods
//WebDriver is a route interface and chromedriver is a class which is implemmenting the interface so chromedriver will have all the methods that are present in the webdriver and aparrt from that chrome driver can have its own method
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		//Ecodriver  was for Firefox but from selenium4.6 it is FirefoxDriver
		//ChromeDriver driver =new ChromeDriver(); we acn write like this also
//driver object is for the chrome browser overe here
		driver.get("https://www.google.com/");
// driver is the object and to oen the browser in selenium use get method to load the url
		driver.manage().window().maximize();//for maximizing the windows to maxium size on screen
		//Options is an Interface
//driver.close(); it will launch the browser and maximize and then finally close
	//there are two methods to close the driver  one is quit  and other is close 
		//quit is more efficient
		
Thread.sleep(2000);
		driver.quit();

	}




}

