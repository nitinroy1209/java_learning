package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigatecommand1 {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com");

        // Click the element using Actions class with an offset
        WebElement element = driver.findElement(By.xpath("//div[@class='category-cards']/div[1]/div"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();

        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);

        driver.quit();
    }
}
