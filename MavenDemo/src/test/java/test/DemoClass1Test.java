package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass1Test {
	@Test
	public void sumTest()
	{
		System.out.println("Sum");
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
