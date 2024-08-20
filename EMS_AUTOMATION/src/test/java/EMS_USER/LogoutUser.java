package EMS_USER;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
	public class LogoutUser {
	
	WebDriver driver;
	
	 WebDriverWait wait ;
	
	
	
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
		
		@BeforeMethod
		public void setup() {
	
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
			driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
			
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Password@123");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		}
	
		
		@Test(priority=1)
		
		public void verifyLoginandthenLogout()  {
			
			
			
			
	       driver.findElement(By.xpath("//div[@class='user-detail']/div/img")).click();
	      
			 driver.findElement(By.xpath("//h3[@class='log-out']")).click();
			
			
			
		}
		
		
	}











