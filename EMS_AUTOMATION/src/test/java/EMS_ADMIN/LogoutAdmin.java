package EMS_ADMIN;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
public class LogoutAdmin {
	
		WebDriver driver;
			
			@BeforeMethod
			
			public void setup() {
				
				driver = new ChromeDriver();
				driver.get("http://admin-panel-staging-ebay.s3-website-ap-northeast-1.amazonaws.com/auth/home");
				driver.manage().window().maximize();
				
			}
			
			@Test
			
			public void logOut()  {
				
				
				//login
				
				driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("rosemary@stunntech.com");
				driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("ebayweb@login");
				driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
				
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
				
				String successMessage = "ログインしました";
				
				String loginStatus2 = driver.findElement(By.id("toast-container")).getText();
				if (successMessage.equals(loginStatus2)) {
					
					System.out.println("Login Success"+loginStatus2);
					
				}
				else {
					System.out.println("Login Failed"+loginStatus2);
					
				}
				
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
				
				//logout
				
				driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/div/app-dashboard/div/div/div[1]/div/img")).click();
				
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/button")).click();	
				
				
				driver.quit();
			}
		}
