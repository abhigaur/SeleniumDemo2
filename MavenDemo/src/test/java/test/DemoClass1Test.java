package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass1Test {
	@Test
	public void sumTest()
	{
		System.out.println("Sum");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//main//resources//executables//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-form/");
	}
	@Test
	public void SubstractTest()
	{
		System.out.println("Substract");
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void divTest()
	{
		System.out.println("div");
	}
	@Test
	public void multiTest()
	{
		System.out.println("multi");
		Assert.assertEquals(true, true);
	}

}
