package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Firefox {
public static void main(String[] args) throws Exception {
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("application opened");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	Thread.sleep(2000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(2000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	Thread.sleep(2000);
	driver.close();
	
}

}
	

