package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsPrac {
	@BeforeClass
	public void m9()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void m10()
	{
		System.out.println("After class");
	}
	@BeforeSuite
	public void m7()
	{
		System.out.println("Before suite");
	}
	@BeforeTest
	public void m1() {
		System.out.println("Before test");
	}

	@Test(priority=1)
	public void m2() {
		System.out.println("test1");
	}

	@Test(priority=0)
	public void m6() {
		System.out.println("test2 ");
	}

	@AfterTest
	public void m3() {
		System.out.println("After test");
	}

	@BeforeMethod
	public void m4() {
		System.out.println("Before method");
	}

	@AfterMethod
	public void m5() {
		System.out.println("After method");
	}
	@AfterSuite
	public void m8()
	{
		System.out.println("After suite");
	}
}
