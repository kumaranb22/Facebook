package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yethi\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch chrome
		
		driver.manage().window().maximize(); // Maximize window
		driver.manage().deleteAllCookies();  // Delete all the cookies
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
        driver.get("https://www.facebook.com/");  // URL
		
		driver.findElement(By.name("firstname")).sendKeys("Seenu");
		driver.findElement(By.name("lastname")).sendKeys("Venkat");
		driver.findElement(By.name("reg_email__")).sendKeys("kumaran.b22@yahoo.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kumaran.b22@yahoo.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test@123");
		
		
		Select day = new Select(driver.findElement(By.id("day")));  // Handle Drop Box
		day.selectByVisibleText("12");
		   Select month = new Select(driver.findElement(By.id("month"))); 
		   month.selectByVisibleText("Jun");
	          Select year = new Select(driver.findElement(By.id("year"))); 
	          year.selectByVisibleText("1993");
	  
	   
	     driver.findElement(By.id("u_0_a")).click();
	     driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']")).click();
	          
		

	}

}
