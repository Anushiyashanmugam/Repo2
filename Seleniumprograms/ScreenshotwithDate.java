package Seleniumprograms;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotwithDate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("C:\\Users\\1555g\\Desktop\\Software Testing- Anu\\Resume");
			driver.manage().window().maximize();
			takesnapshot(driver,"C:\\Users\\1555g\\Desktop\\Software Testing- Anu\\screenshot2date");
			
		}

		private static void takesnapshot(WebDriver driver, String path) throws IOException {
			// TODO Auto-generated method stub
			
			Date d= new Date();
			String changedate = d.toString().replace(":","_").replace(" ","_")+".PNG";
			System.out.println("changedate");
			TakesScreenshot obj = (TakesScreenshot)driver;
			File srcfile = obj.getScreenshotAs(OutputType.FILE);
			File Destfile = new File(path+changedate);
			FileUtils.copyFile(srcfile, Destfile);
			driver.close();
	}

}
