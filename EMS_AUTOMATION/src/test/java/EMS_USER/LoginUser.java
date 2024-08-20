package EMS_USER;
	
	import org.testng.annotations.Test;
	import org.testng.annotations.Test;
	import java.time.Duration;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	
	public class LoginUser {
		
		WebDriver driver;
		
		@AfterMethod
		public void teardown() {
			
			driver.quit();
		}
		
		@BeforeMethod
		public void setup() {
			
			String browserName = "chrome";
			
			if(browserName.equals("chrome"))
				
			{
				driver = new ChromeDriver();
				
			}
			else if(browserName.equals("firefox"))
			{
				driver = new FirefoxDriver();
				
			}
			
			else if(browserName.equals("safari"))
			{
				driver = new SafariDriver();
			}
			
			
			
	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
			driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
			
			}
		
		
		@Test(priority=1)
		
			public void verifyLoginWithValidInputs() {
				
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
			
		@Test(priority=2)
		
		public void verifyLoginwithvalidUsernameInvalidPassword() {
			
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subh@123");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));	
			
			String invalidLoginToast = "メールアドレスかパスワードが間違っています";
			
			String toastText1 = driver.findElement(By.id("toast-container")).getText();
			
			if(toastText1.contains(invalidLoginToast)) {
				
				System.out.println("Invalid credentials");
				
			}
			
			else
			{
				System.out.println("Login success");
			}
			
			
		}
	
		
		@Test(priority=3)
		public void verifyLoginwithInvalidUsernameValidPassword() {
		
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@123");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			
			
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));	
			
			
			String invalidLoginToast1 = "メールアドレスかパスワードが間違っています";
			
			String toastText2 = driver.findElement(By.id("toast-container")).getText();
			
			if(toastText2.contains(invalidLoginToast1)) {
				
				System.out.println("Invalid credentials");
				
			}
			
			else
			{
				System.out.println("Login success");
			}
			
			}
		
	@Test(priority=4)
		public void verifyLoginwithInvalidUsernameInvalidPassword() {
		
		
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan@gmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@243");
			driver.findElement(By.xpath("//button[@class='submit-button']")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));	
			
			String invalidLoginToast2 = "メールアドレスかパスワードが間違っています";
			
			String toastText3 = driver.findElement(By.id("toast-container")).getText();
			
			if(toastText3.contains(invalidLoginToast2)) {
				
				System.out.println("Invalid credentials");
				
			}
			
			else
			{
				System.out.println("Login success");
			}
			
		
	}
	
	@Test(priority=5)
	
	public void verifyLoginwithNoInputs()  {
	
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));	
	
	
	
	String invalidLoginToast3 = "メールアドレスとパスワードを入力してください";
	
	String toastText4 = driver.findElement(By.id("toast-container")).getText();
	
	if(toastText4.contains(invalidLoginToast3)) {
	
		System.out.println("No credentials entered");
	
	}
	
	else
	{
		System.out.println("Login success");
	}
	
	
	
	}
}