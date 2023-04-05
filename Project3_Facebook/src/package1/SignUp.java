package package1;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
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
		
		//login page
		
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
		Thread.sleep(2000);
		
//************signUp popUp*************
		
		//firstName 
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("Abc");
		Thread.sleep(2000);
		
		//surname 
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.sendKeys("Xyz");
		Thread.sleep(2000);
		
		//uName 
		WebElement uname = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		uname.sendKeys("abc123");
		Thread.sleep(2000);
		
		//NewPass 
		WebElement newPass = driver.findElement(By.xpath("//input[@aria-label='New password']"));
		newPass.sendKeys("Abc@123");
		Thread.sleep(2000);
		
		//DOB - select dropdown
		
		//day 
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select select = new Select(day);
		select.selectByVisibleText("11");
		Thread.sleep(2000);
		
		//month 
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		select = new Select(month);
		select.selectByVisibleText("Mar");
		Thread.sleep(2000);
		
		//year 
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		select = new Select(year);
		select.selectByVisibleText("2000");
		Thread.sleep(2000);
		
		//Gender 
		
		//male 
		WebElement male = driver.findElement(By.xpath("//label[text() = 'Male']"));
		male.click();
		Thread.sleep(2000);
		
		//female 
		WebElement female = driver.findElement(By.xpath("//label[text() = 'Female']"));
		female.click();
		Thread.sleep(2000);
		
		//custom 
		WebElement custom = driver.findElement(By.xpath("//label[text() = 'Custom']"));
		custom.click();
		Thread.sleep(2000);
		
		//select pronoun 
		WebElement selectPronoun = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		
		select = new Select(selectPronoun);
		select.selectByValue("6");
		Thread.sleep(2000);
		
		//gender optional 
		WebElement genderOptional = driver.findElement(By.xpath("//input[@aria-label='Gender (optional)']"));
		genderOptional.sendKeys("pqrs");
		Thread.sleep(2000);
		
		//signUp button 
		WebElement signUpButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signUpButton.click();
		Thread.sleep(2000);
		
		//Take screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		for(int i = 1; i <= 3; i++)
		{
			File dest = new File("C:\\Users\\Asus\\Desktop\\Velocity_Notes\\Screenshot\\Test"+i+".jpg");
			FileHandler.copy(src, dest);
			Thread.sleep(1);
		}
		
	} // main method ends
	
} // signUp class ends
