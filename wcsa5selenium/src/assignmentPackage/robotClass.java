package assignmentPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.KeyPair;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		
		Thread.sleep(2000);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_P);
	    
	    Thread.sleep(2000);
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(2000);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    
		
		
		

	}

}
