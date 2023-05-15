package Selenium_Prog_April;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TC_LoginLogout {
public static void main(String[] args) throws Exception {
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Application Openened");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	Thread.sleep(1000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(1000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(1000);
	System.out.println("Login completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	Thread.sleep(1000);
	driver.close();
}
}

