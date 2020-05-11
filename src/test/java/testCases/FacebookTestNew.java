package testCases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;

public class FacebookTestNew extends TestBase{
	
	
	@BeforeTest
	@Parameters ({"browser"})
	public void setup(String browser) throws MalformedURLException {
		
		initialize(browser);
		
		System.out.println(browser);
		
	}
	
	
	@Test
	public void validateTitle() {
		
		driver.get("https://facebook.com");
		System.out.print(": "+ driver.getTitle());
		System.out.println();
	}

}
