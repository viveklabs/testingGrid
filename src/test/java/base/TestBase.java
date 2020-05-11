package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {
	
	public WebDriver driver;

	public void initialize(String browser) throws MalformedURLException {
		

		if (browser.equals("chrome")){
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("chrome");
			
			ChromeOptions opt = new ChromeOptions();
			opt.merge(cap);
			
			
			String hubAddress = "http://192.168.56.1:4444/wd/hub";
			driver = new RemoteWebDriver(new URL(hubAddress), opt);
			
		} else {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("internet explorer");
			
			InternetExplorerOptions opt = new InternetExplorerOptions();
			opt.merge(cap);
			
			
			String hubAddress = "http://192.168.56.1:4444/wd/hub";
			driver = new RemoteWebDriver(new URL(hubAddress), opt);
			
		}	
		
		
		
	}

}
