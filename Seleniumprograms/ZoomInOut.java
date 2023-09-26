package Seleniumprograms;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInOut {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php/");
		driver.manage().window().maximize();
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,600)"," "); //Scroll Down
		Thread.sleep(3000);
		je.executeScript("arguments[0]", "scrollIntoView(true)",driver.findElement(By.id("subject")));
		Thread.sleep(3000);
	    Robot robot = new Robot();
	    System.out.println("About to zoom in");
	    Thread.sleep(3000);
	    for (int i = 0; i < 10; i++) {
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ADD);
	    robot.keyRelease(KeyEvent.VK_ADD);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    }
	    System.out.println("About to zoom out");
	    Thread.sleep(5000);
	    for (int i = 0; i < 10; i++) {
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_SUBTRACT);
	    robot.keyRelease(KeyEvent.VK_SUBTRACT);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	}
}
