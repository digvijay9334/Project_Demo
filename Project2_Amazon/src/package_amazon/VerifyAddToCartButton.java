package package_amazon;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyAddToCartButton {

	public static void main(String[] args) throws InterruptedException {
		
		//to resolve connectionFailedException
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		//launch browser
		WebDriver driver = new ChromeDriver(ops);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Desktop\\Velocity_Notes\\Tools_1"
				+ "\\chromedriver_win32\\chromedriver.exe");
		
		//launch URL
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//sign in 
		WebElement helloSignIn = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		helloSignIn.click();
		
		//mobileNoInputBox 
		WebElement mobileNoInputBox = driver.findElement(By.xpath("//input[@type='email']"));
		mobileNoInputBox.sendKeys("8983167367");
		
		//continueButton 
		WebElement continueButton = driver.findElement(By.xpath("//input[@id = 'continue']"));
		continueButton.click();
		
		//password 
		WebElement password = driver.findElement(By.xpath("//input[@type = 'password']"));
		password.sendKeys("8983167367");
		
		//signInButton  
		WebElement signInButton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signInButton.click();
		
		//enterOTP //input[@type='tel']
		
		//otpSignIn //input[@id='auth-signin-button']
		
		//search bar 
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBar.sendKeys("5000 + Daily Use English Sentences | Kanchan Keshari");
		Thread.sleep(2000);
		
		//search icon
		WebElement clickSearchIcon = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickSearchIcon.click();
		Thread.sleep(2000);
		
		//book
		WebElement book = driver.findElement(By.xpath("(//span[text() = '5000 + Daily Use English Sentences | Kanchan Keshari'])[2]"));
		book.click();
		Thread.sleep(2000);
		
		//switching to new child window
		ArrayList<String> addrs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addrs.get(1));
		
		//add to cart
		WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addToCart.click();
		Thread.sleep(2000);
		
		//go to cart  
		WebElement goToCart = driver.findElement(By.xpath("(//a[contains(text(), 'Go to Cart')])[2]"));
		goToCart.click();
		
	} // main method ends
	
} // class ends
