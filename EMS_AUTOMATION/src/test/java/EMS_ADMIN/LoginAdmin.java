package EMS_ADMIN;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LoginAdmin {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver = new ChromeDriver();
		driver.get("http://admin-panel-staging-ebay.s3-website-ap-northeast-1.amazonaws.com/auth/home");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	
	public void testcase1()  {
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("rosemary@stunntech.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("ebayweb@login");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		//toast message handling
		String successMessage = "ログインしました";
		
		String loginStatus1 = driver.findElement(By.id("toast-container")).getText();
		if (successMessage.equals(loginStatus1)) {
			
			System.out.println("Login Success : "+ loginStatus1);
			
		}
		else {
			System.out.println("Login Failed : "+ loginStatus1);
			
		}
		
		
		driver.quit();
	}
	
	//invalid username and invalid password
	
	@Test(priority=2)
	
	public void testcase2()  {
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("rosemary@stunntec.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("ebay@login");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		String errorMessage = "メールアドレスかパスワードが間違っています";
		
		String loginStatus1 = driver.findElement(By.id("toast-container")).getText();
		if (errorMessage.equals(loginStatus1)) {
			
			System.out.println("Invalid credentials");
			
		}
		else {
			System.out.println("Login Success");
			
		}
		
		driver.quit();
		
	}
	
	// valid username and invalid password
	
	@Test(priority=3)
	
	public void testcase3() {
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("rosemary@stunntech.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("ebay@login");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		
		String errorMessage = "メールアドレスかパスワードが間違っています";
		
		String loginStatus1 = driver.findElement(By.id("toast-container")).getText();
		if (errorMessage.equals(loginStatus1)) {
			
			System.out.println("Invalid credentials");
			
		}
		else {
			System.out.println("Login Success");
			
		}
		
		
		
		driver.quit();
		
	}
	
	//invalid username and valid password
	
	@Test(priority=4)
	
	public void testcase4() {
	
	driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("rosemary@stunntech.c");
	driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("ebayweb@login");
	driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	
	
	String errorMessage = "メールアドレスかパスワードが間違っています";
	
	String loginStatus1 = driver.findElement(By.id("toast-container")).getText();
	if (errorMessage.equals(loginStatus1)) {
		
		System.out.println("Invalid credentials");
		
	}
	else {
		System.out.println("Login Success");
		
	}
	
	
	driver.quit();
	
	
	}
	
	//without providing any credentials
	
	@Test(priority=5)
	public void testcase5() {
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login/div/div/div[2]/div/div/form/div/div[4]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		String errorMessage = "メールアドレスとパスワードを入力してください";
		
		String loginStatus1 = driver.findElement(By.id("toast-container")).getText();
		if (errorMessage.equals(loginStatus1)) {
			
			System.out.println("No credentials entered");
			
		}
		else {
			System.out.println("Login Success");
			
		}
		
		
		driver.quit();
	}
	
	
}