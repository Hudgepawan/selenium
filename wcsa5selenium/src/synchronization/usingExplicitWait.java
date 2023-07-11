package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class usingExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//WebDriverWait explicitWait =new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("electronics")).click();
		driver.findElement(By.linkText("Mobiles")).click();
		
	
		
		

	}

}
