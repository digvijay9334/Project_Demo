package package_amazon;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyByeNowButton {
	
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
		
//		//switching to new child page/window
		ArrayList<String> addrs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addrs.get(1));
				
		//buy now
		WebElement buyNow = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		buyNow.click();
		
		
	} // main method ends
	
} //classs ends
