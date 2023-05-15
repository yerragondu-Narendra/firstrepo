package webdriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown_pro {
public static void main(String[] args) throws Exception {
	WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
Thread.sleep(2000);
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(2000);
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(2000);
//Enter into frame
driver.switchTo().frame("rightMenu");
//Retriver all the data from search by dropdown 
  Select st = new 
	Select(driver.findElement(By.name("loc_code")));
  List<WebElement> dropval = st.getOptions();
  for(WebElement dpv:dropval) {
	  System.out.println(dpv.getText());
	  Thread.sleep(2000);
  }
  driver.switchTo().defaultContent();
  driver.findElement(By.linkText("Logout")).click();
  driver.close();
  }

}
	

