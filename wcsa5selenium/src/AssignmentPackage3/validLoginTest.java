package AssignmentPackage3;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataDrivenFramework.Flib;

public class validLoginTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-o2habh3/login.do");
		
		Flib flib = new Flib();
		String validUsername = flib.readExcelData("./data/ACTI.xlsx","validcred", 1, 0);
		String validPassword = flib.readExcelData("./data/ACTI.xlsx","validcred",1,1);
		
	     driver.findElement(By.name("username")).sendKeys(validUsername);
	     driver.findElement(By.name("pwd")).sendKeys(validPassword);
	     Thread.sleep(1000);
	     driver.findElement(By.id("loginButton")).click();
	
		

	}

}
