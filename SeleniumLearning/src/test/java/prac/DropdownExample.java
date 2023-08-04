package prac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownExample {
    public static void main(String[] args) {
        // Set up the WebDriver and open the website
        WebDriver driver = new ChromeDriver();
        driver.get("URL_OF_YOUR_WEBSITE");

        // Explicit wait with a maximum timeout of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Locate the dropdown element
        By dropdownLocator = By.id("ctl00_mainContent_ddl_originStation1");

        // Wait for the dropdown to be visible and interactable
        wait.until(ExpectedConditions.elementToBeClickable(dropdownLocator));

        // Create a Select object to interact with the dropdown
        Select sel = new Select(driver.findElement(dropdownLocator));

        // Now, you can select options from the dropdown as needed
        sel.selectByVisibleText("Option 1");
        
        // Close the WebDriver
        driver.quit();
    }
}
