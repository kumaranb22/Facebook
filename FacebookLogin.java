package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yethi\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
        driver.get("https://www.facebook.com/");  // Enter URL
		
		driver.findElement(By.id("email")).sendKeys("kumaran.b22@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("test@123");
		
	 
	   driver.findElement(By.xpath("//input[@type='submit']")).click(); // Customize Xpath
	   
	    driver.findElement(By.name("proceed")).click();
		Alert pop = driver.switchTo().alert();
		System.out.println(pop.getText());
		
		pop.accept();
		//pop.dismiss();
	          
		

	
	}
}
