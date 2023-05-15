package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_KeyBoard_WebDriver {
public static void main(String[] args) throws Exception {
	WebDriver driver = new FirefoxDriver();
 driver.navigate().to("https://www.google.com/");
 Thread.sleep(2000);
 driver.findElement(By.name("q")).sendKeys("selenium");
 Thread.sleep(2000);
 driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
 Thread.sleep(2000);
 driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
 Thread.sleep(2000);
 driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
 Thread.sleep(2000);
 driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
 Thread.sleep(2000);
 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
 Thread.sleep(2000);
 driver.close();
}
}
