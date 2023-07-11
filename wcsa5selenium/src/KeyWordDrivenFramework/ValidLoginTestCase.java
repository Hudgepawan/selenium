package KeyWordDrivenFramework;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;

import AssignmentPackage3.BaseTest1;
import AssignmentPackage3.flib1;

public class ValidLoginTestCase extends BaseTest{
            
	public static void main(String[] args) throws IOException {
		
		BaseTest1 base = new BaseTest1();
		base.openBrowser();
		
		flib1 fl = new flib1();
		driver.findElement(By.name("username")).sendKeys(fl.readPropertyData(PROP_PATH, "Username"));
		driver.findElement(By.name("pwd")).sendKeys(fl.readPropertyData(PROP_PATH, "Password"));
		driver.findElement(By.id("loginButton")).click();
		
	}
	
		
		

	}


