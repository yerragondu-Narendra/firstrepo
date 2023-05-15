package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Frames {
public static void main(String[] args) throws Exception {
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	Thread.sleep(3000);
	//Enter into frame
	driver.switchTo().frame("rightMenu");
	// click on add button
	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
	driver.findElement(By.name("txtEmpLastName")).sendKeys("selenium");
	driver.findElement(By.id("btnEdit")).click();
	Thread.sleep(3000);
	System.out.println("new emp added");
	//Exit freme
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
	
}
}
