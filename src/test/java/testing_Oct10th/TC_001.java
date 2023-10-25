package testing_Oct10th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_001 {

	WebDriver driver;
//test

	//@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	@AfterClass

	public void close_application() {
		System.out.println("Close the Google Chrome browser");

		driver.quit();
	}

	@Test
	public void do_testing() {
		System.out.println("My First Testng Testscript");
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed());
		//,"Google Logo is not present");
	}
 
	@Test
	public void do_testing_1() {
		System.out.println("My Second Testng Testscript");
	}

	//@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.

	@BeforeClass
	public void launch_application() {

		System.out.println("Launch GoogleChrome browser");

		driver=new ChromeDriver(); //This line is creating ChromeDriver instance storing it into driver variable
		// give url into the browser
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//Maximize the browser window

		driver.manage().window().maximize();


	}






}
