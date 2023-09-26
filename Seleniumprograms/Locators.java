package Seleniumprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php/");
		driver.manage().window().maximize();
		driver.findElement(By.id("subject")).sendKeys("Selenium Assignment");
	//	driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();//send to
		//input[@type='checkbox' and @value='2']
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anushiyashanmugam");// email address
		driver.findElement(By.xpath("//input[contains(@id,'q1') and contains(@style,'font')]")).sendKeys("anu");
	}

}
