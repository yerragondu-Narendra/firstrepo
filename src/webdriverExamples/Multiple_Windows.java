package webdriverExamples;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Windows {
public static void main(String[] args)throws Exception {
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("file:///C:/Users/91939/Downloads/multiplewindows%20(1).html");
	Thread.sleep(1000);
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(1000);
	ArrayList<String> Windowinfo = new ArrayList<String>(driver.getWindowHandles());
	Thread.sleep(1000);
	driver.switchTo().window(Windowinfo.get(1));
	Thread.sleep(1000);
	driver.quit();
}
}
