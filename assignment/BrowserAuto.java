package assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BrowserAuto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kaplan.co.uk/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@type,'button') and contains(@data-cookiefirst-action,'accept')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Courses']")).click();
		driver.findElement(By.xpath("//a[@title='Accountancy & Tax']")).click();
		driver.findElement(By.xpath("//a[@title='Association of Accounting Technicians']")).click();
		driver.findElement(By.xpath("//a[@title='AAT Level 2 Certificate']")).click();
		JavascriptExecutor je=((JavascriptExecutor)driver);
		je.executeScript("window.scrollBy(0,600)", "");
		je.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[text()='Select your subject(s)']")));
		driver.findElement(By.xpath("//label[@class='checkbox-label' and @for='subjects-chk-0']")).click();
		driver.findElement(By.xpath("//button[text()='Choose study options']")).click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Introduction to Bookkeeping  (ITBK)']")));
		je.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[text()='Introduction to Bookkeeping  (ITBK)']")));
		driver.findElement(By.xpath("//button[text()='Choose study method']")).click();
	}

}
