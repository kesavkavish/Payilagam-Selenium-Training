package seleniumDemoScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumScript {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	Select sel = new Select(day);
	sel.selectByVisibleText("20");
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select sel1 = new Select(month);
	sel1.selectByValue("9");
	
	WebElement year = driver.findElement(By.xpath(".//*[@id='year']"));
	Select sel2 = new Select(year);
	sel2.selectByIndex(15);
	}
}
