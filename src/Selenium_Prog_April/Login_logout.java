package Selenium_Prog_April;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_logout {
public static void main(String[] args) throws Exception {
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(1000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	Thread.sleep(1000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(1000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Logout"));
	Thread.sleep(1000);
	driver.close();
	
	
}

}


