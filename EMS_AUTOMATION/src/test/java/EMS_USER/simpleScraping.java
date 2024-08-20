package EMS_USER;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
public class simpleScraping {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
		driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Password@123");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		
		driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/app-header/div/div[2]/button")).click();	//extract button
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		
		}
	
	@Test()
	public void switchlocators() throws InterruptedException {
	
	 By iconLocator0 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[1]");
     By iconLocator1 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[2]");
     By iconLocator2 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[3]");
     By iconLocator3 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[5]");
     By iconLocator4 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[6]");
     By iconLocator5 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[7]");
     By iconLocator6 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[8]");
     By iconLocator7 = By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[9]");
     // Identify the icon elements
     WebElement iconElement0 = driver.findElement(iconLocator0);
     WebElement iconElement1 = driver.findElement(iconLocator1);
     WebElement iconElement2 = driver.findElement(iconLocator2);
     WebElement iconElement3 = driver.findElement(iconLocator3);
     WebElement iconElement4 = driver.findElement(iconLocator4);
     WebElement iconElement5 = driver.findElement(iconLocator5);
     WebElement iconElement6 = driver.findElement(iconLocator6);
     WebElement iconElement7 = driver.findElement(iconLocator7);
     String iconClicked = "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[6]";

switch (iconClicked) {
     //2nd street
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[1]":
             iconElement0.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
     		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow0 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow0)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput0 =	driver.findElement(By.id("headSearchInput"));
     	searchInput0.sendKeys("T shirt");
     	searchInput0.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL0 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL0);
     	
     	Thread.sleep(3000);
     	
     	driver.switchTo().window(mainWindow0);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput0 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput0.sendKeys(sourceWebsiteURL0);
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("8");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
             break;
             
// rakuten
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[2]":
             iconElement1.click();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
      		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow1 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow1)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput1 =	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[1]/div/div/div/form"));
     	searchInput1.sendKeys("T shirt");
     	searchInput1.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL1 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL1);
     	
     	Thread.sleep(3000);
     	
     	driver.switchTo().window(mainWindow1);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput1 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput1.sendKeys(sourceWebsiteURL1);
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("8");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
             break;
             //paypay
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[3]":
             iconElement2.click();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
      		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow2 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow2)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput2 =	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/div/div[3]/form/div/input"));
     	searchInput2.sendKeys("T shirt");
     	searchInput2.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL2 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL2);
     	
     	Thread.sleep(3000);
     	
     	driver.switchTo().window(mainWindow2);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput2 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput2.sendKeys(sourceWebsiteURL2);
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("8");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
             break;
            //mercari
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[5]":
             iconElement3.click();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
      		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow3 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow3)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput3 =	driver.findElement(By.name("query"));
     	searchInput3.sendKeys("T shirt");
     	searchInput3.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL3 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL3);
     	
     	Thread.sleep(3000);
     	
     	driver.switchTo().window(mainWindow3);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput3 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput3.sendKeys(sourceWebsiteURL3);
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("8");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
             break;
             
             
             
             
//auctions
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[6]":
             iconElement4.click();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
      		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow4 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow4)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput4 =	driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div/div/div[4]/div[1]/form/div/div[1]/div/input"));
     	searchInput4.sendKeys("mobile");
     	searchInput4.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL4 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL4);
     	
     	Thread.sleep(3000);
     	
     	driver.switchTo().window(mainWindow4);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput4 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput4.sendKeys(sourceWebsiteURL4);
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("8");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
             break;
             //Digimart
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[7]":
             iconElement5.click();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
      		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow5 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow5)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput5 =	driver.findElement(By.className("keyword"));
     	searchInput5.sendKeys("T shirt");
     	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[4]/div/div/div[2]/div/input")).click();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL5 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL5);
     	
     	Thread.sleep(3000);
     	
     	driver.switchTo().window(mainWindow5);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput5 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
         urlInput5.sendKeys(sourceWebsiteURL5);
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("8");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
             break;
             //net mall
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[8]":
             iconElement6.click();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
      		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6000));
     		
     		
     		//switch to new tab
     		
     		String mainWindow6 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow6)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput6 =	driver.findElement(By.className("searchbox__input"));
     	searchInput6.sendKeys("T shirt");
     	searchInput6.submit();
     	Thread.sleep(3000);
     	
     	String sourceWebsiteURL6 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL6);
     	
     	Thread.sleep(3000);
     	
     	driver.switchTo().window(mainWindow6);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput6 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput6.sendKeys(sourceWebsiteURL6);
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("8");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
             break;

             
             
             
             
             
//...rakuten mobile
         case "/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/div[1]/div[1]/div[9]":
             iconElement7.click();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
      		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6000));
     		
     		//switch to new tab
     		
     		String mainWindow7 = driver.getWindowHandle();
     		for (String handle : driver.getWindowHandles())
     		{
     			if(!handle.equals(mainWindow7)) {
     				driver.switchTo().window(handle);
     				break;
     			}
     		}
     		
     		
     		Thread.sleep(3000);
     		
     	WebElement searchInput7 =	driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div[1]/div/div/form/div/input"));
     	searchInput7.sendKeys("T shirt");
     	searchInput7.submit();
     //	driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/div/div/form/div/a")).click();
     	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
     	
     	String sourceWebsiteURL7 = driver.getCurrentUrl();
     	Thread.sleep(3000);
     	
     	System.out.println("Current URL: " + sourceWebsiteURL7);
     	
     	Thread.sleep(3000);
     	
     	driver.switchTo().window(mainWindow7);
     	Thread.sleep(3000);
     	
     	 WebElement urlInput7 = driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[1]/div/input"));
             urlInput7.sendKeys(sourceWebsiteURL7);
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("8");
             driver.findElement(By.xpath("/html/body/app-root/app-user/div/div[2]/div/app-scraping-screen/div/div/form/div/div[1]/div[2]/div/button")).click();
     	
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
             break;
         default:
             System.out.println("Icon not found.");
     	}
     driver.quit();
     }
	
}











