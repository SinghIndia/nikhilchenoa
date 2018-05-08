package flipkart;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class LaunchLogin {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		//Lunch website
		//System.setProperty("webdriver.chrome.driver", "C:\Users\Puji\Downloads\chromedriver_win32");
	   driver = new FirefoxDriver();
       driver.get("http://Flipkart.com");
       driver.manage().window().maximize();
          //Weight
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
     WebElement about = driver.findElement(By.linkText("Sign In"));
        about.click();
	// login functionality
   WebElement id = driver.findElement(By.xpath("_2zrpKA"));
       WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
      WebElement button = driver.findElement(By.xpath("_2AkmmA _1LctnI _7UHT_c"));         
           
      /*WebElement id = driver.findElement(By.name("Enter Email/ Mobile number"));
      WebElement pass = driver.findElement(By.name("Enter Password"));
      WebElement button = driver.findElement(By.xpath("_2AkmmA _1LctnI _7UHT_c"));
      */
    id.sendKeys("pujasingh304@gmail.com");
    pass.sendKeys("india1234");
    button.submit();		
           
         //Close the browser.
    driver.quit();
	}
}
