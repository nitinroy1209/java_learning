package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:/Users/nitin/eclipse-workspace/SeleniumWithoutDriver/driver/chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Use the driver to interact with the browser
        driver.get("https://www.google.com"); // Replace with the desired URL
        // Add more interactions or tests as needed...

        // Close the browser when done
        driver.quit();
    }
}
