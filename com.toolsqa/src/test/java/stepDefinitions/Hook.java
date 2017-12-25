package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Driver;

public class Hook {

	 @Before
	 public void setUp(){
		 Driver.getInstance().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 Driver.getInstance().manage().window().maximize();
	 
	 }

	@After
	public void tearDown(Scenario scenario) {
		// this is the method for taking a screenshot using cucumber
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		//Driver.closeDriver();
	}
}


