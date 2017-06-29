package automationFramework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Please download Chrome Driver and provide location of unzipped folder
		String exePath = "E:\\Setups\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
		
		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Creating a Javascript driver
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
        //Launch the Website
		driver.get("https://m.kss.com.au/boxshop/");
         System.out.println("Successfully opened the website https://m.kss.com.au/boxshop/");
 
		//Wait for 5 Sec
		Thread.sleep(5000);
		
		//Doing some logic here
		int numberOfChildren = 0;
		String numberString = js.executeScript("return document.getElementsByClassName(\"boxshop-items grid\")[0].childElementCount").toString();
		numberOfChildren = Integer.parseInt(numberString);
		System.out.println("children--"+numberOfChildren);
		
        // Close the driver
        driver.quit();

	}

}
