package EMS_USER;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;	
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
	
	public class RedirectionUser {
	
		WebDriver driver;
		
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
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
				
				String loginSuccessToast = "ログインしました";
				
				String toastText = driver.findElement(By.id("toast-container")).getText();
				
				if(toastText.contains(loginSuccessToast)) {
					
					System.out.println("Login success");
					
				}
				
				else
				{
					System.out.println("Login failed");
				}
				
					}
			
			@Test
			public void testcasesforRedirection() {
			
				//VerifyhamburgerMenu()
				
				driver.findElement(By.xpath("//button[@class='toggle-button ng-star-inserted']")).click();
				driver.findElement(By.xpath("//button[@class='toggle-button ng-star-inserted']")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
				
				
			
				//verifySaveListButton()
				
				
				driver.findElement(By.xpath("//div/button[2][@class='sidebar-btn']")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
				
				
				
				if(driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-saved-url-list/div/div[1]/button/div")).isDisplayed())
					{
					    
						System.out.println("SaveList Button was successfully clicked.");
			        }
				else
					{
				         System.out.println("SaveList Button  was not clicked.");
				        }
	
					
			
			
				//verifyInventoryControlButton()
				
				
				driver.findElement(By.xpath("//div/button[3][@class='sidebar-btn']")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
				
				
				
				if(driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-inventory/div/div/div/h3")).isDisplayed())
				{
				    
					System.out.println("Inventory Control Button was successfully clicked.");
		        }
			else
				{
			         System.out.println("Inventory Control  Button  was not clicked.");
			        }
				
				
				
				
			
			
				//verifyTopSellerButton()
				
				
				driver.findElement(By.xpath("//div/button[4][@class='sidebar-btn']")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
				
				if(driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-top-selling/div/div/div[1]/button")).isDisplayed())
				{
				    
					System.out.println("Top Seller Button was successfully clicked.");
		        }
			else
				{
			         System.out.println("Top Seller  Button  was not clicked.");
			        }
				
			
			
				//verifySeminarVideoButton()
				
				driver.findElement(By.xpath("//div/button[5][@class='sidebar-btn']")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
			
			
				if(driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-seminar/div/div/div")).isDisplayed())
				{
				    
					System.out.println("Seminar Video Button was successfully clicked.");
		        }
			else
				{
			         System.out.println("Seminar Video Button  was not clicked.");
			        }
				
				
				
				
				
				//verifyMessageButton()
				
				
				driver.findElement(By.xpath("//div/button[6][@class='sidebar-btn']")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
			
			
				if(driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-message/div/div[1]/div[1]/input")).isDisplayed())
				{
				    
					System.out.println("Message Button was successfully clicked.");
		        }
			else
				{
			         System.out.println("Message Button  was not clicked.");
			        }
				
				
				
				
				
			
				//verifySoldItemsButton()
				
			
				driver.findElement(By.xpath("//div/button[7][@class='sidebar-btn']")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
			
			
				if(driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-product-list/div/div/div")).isDisplayed())
				{
				    
					System.out.println("SoldItems Button was successfully clicked.");
		        }
			else
				{
			         System.out.println("SoldItems Button  was not clicked.");
			        }
				
				
				
				
				
				//verifySettingsPageButton()
				
				WebElement itemsPerPageDropDown = driver.findElement(By.xpath("//button[8][@class='sidebar-btn']"));
				
			
			
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("arguments[0].scrollIntoView();", itemsPerPageDropDown);
				
				driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[1]/app-sidebar/div/div/button[8]/div")).click();
				
	
				
				if(driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-main-settings/div/div/div[1]/h3")).isDisplayed())
				{
				    
					System.out.println("Settings Button was successfully clicked.");
		        }
			else
				{
			         System.out.println("Settings Button  was not clicked.");
			        }
				
				
				
				
				
				
				
				driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-main-settings/div/div/div[2]/h3")).click();
				
				driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-main-settings/div/div/div[3]/h3")).click();
				
				driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-main-settings/div/div/div[4]/h3")).click();
				
			
				
				
				
				
				// verifyExtractProductButton
				
			driver.findElement(By.xpath("//button[@class='scrape-button ng-star-inserted']")).click();
				
			
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
				
				

				if(driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input")).isDisplayed())
				{
				    
					System.out.println("Extract Product Button was successfully clicked.");
		        }
			else
				{
			         System.out.println("Extract Product  Button  was not clicked.");
			        }
				
				
		}
		
	}