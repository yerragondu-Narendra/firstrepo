package Selenium_Prog_April;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TCOO1_Fristpro{
public static void main(String[] args) throws Exception {
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(4000);
	driver.close();
}

	
}	
	
	


