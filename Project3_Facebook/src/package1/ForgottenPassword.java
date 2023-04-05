package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgottenPassword {

	public static void main(String[] args) throws InterruptedException {

		// TO fix ConnectionFailedException
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");

		// launch browser
		WebDriver driver = new ChromeDriver(ops);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Asus\\Desktop\\Velocity_Notes\\Tools_1" + "\\chromedriver_win32\\chromedriver.exe");

		// launch url
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		// forgotten password
		WebElement forgotPassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgotPassword.click();
		Thread.sleep(2000);

		// text message
		WebElement textMessage = driver.findElement(By.xpath("//table//div"));

		String text = textMessage.getText();
		System.out.println(text);

		// email
		WebElement emailOrMobNum = driver.findElement(By.xpath("//input[@id='identify_email']"));
		emailOrMobNum.sendKeys("abc.xyz@gmail.com");
		Thread.sleep(2000);

		// cancel button
		WebElement cancel = driver.findElement(By.xpath("//a[contains(text(),'Cancel')]"));
		cancel.click();
		Thread.sleep(2000);
		
		// search button
//		WebElement searchButton = driver.findElement(By.xpath("//button[@id='did_submit']"));
//		searchButton.click();
		
	} // main method ends

} // class ends
