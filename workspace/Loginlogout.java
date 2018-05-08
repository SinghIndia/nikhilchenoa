package tatacliq;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Loginlogout {
    static WebDriver driver;
	public static void main(String[] args)throws InterruptedException{
		//Lunch website
	   driver = new FirefoxDriver();
       driver.get("https://www.tatacliq.com/");
       driver.manage().window().maximize();
          //Weight
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
     WebElement about = driver.findElement(By.xpath("socialLogin"));
        about.click();
	// login functionality
       WebElement id = driver.findElement(By.xpath("j_username_login"));
       WebElement pass = driver.findElement(By.xpath("j_password_login"));
       WebElement button = driver.findElement(By.xpath("accountLoginButton"));         
           
    id.sendKeys("pujasingh304@gmail.com");
    pass.sendKeys("advika@30");
    button.submit();		
           
         //Close the browser.
        // driver.quit();
    
    //Search by dropdown lists
    
    List<WebElement> option = dropdown.findElements(By.tagName("option"));
	
	for (WebElement abc : option) {
		if(abc.getText().equalsIgnoreCase("Mar")){
			abc.click();
	
    WebElement electronics = driver.findElement(By.xpath("//*[@id='leftNavMenuRevamp']/div[1]/div[2]/ul/li[3]/a/span[2]"));
	
	WebElement tv = driver.findElement(By.xpath("//*[@id='category3Data']/div[1]/div/div/p[3]/a/span"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(electronics).build().perform();
	act.click(tv).build().perform();
	}
}