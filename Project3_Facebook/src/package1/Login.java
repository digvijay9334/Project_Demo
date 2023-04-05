package package1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//facebook
// https://in.pinterest.com/
//https://www.youtube.com/
// twitter , // Quora

//Verify login.
public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		//TO fix ConnectionFailedException
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		//launch browser
		WebDriver driver = new ChromeDriver(ops);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\Velocity_Notes\\Tools_1"
				+ "\\chromedriver_win32\\chromedriver.exe");
		
		
		
//		WebDriver driver = new ChromeDriver();
		
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//launch URL
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//find uName 
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("digvijay");
		Thread.sleep(2000);
		
		//password 
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("123456");
		Thread.sleep(2000);
		
		//login button
//		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
//		loginButton.click();
		
		//forgotten password 
//		WebElement forgotPassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		//create new acct button 
		WebElement createNewAcc = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		createNewAcc.click();
		
	}// main method ends

} // classs ends
