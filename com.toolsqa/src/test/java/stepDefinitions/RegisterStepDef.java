package stepDefinitions;

import static org.junit.Assert.*;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.toolsqa.pages.RegistrationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Config;
import utilities.Driver;

public class RegisterStepDef {

	RegistrationPage reg = new RegistrationPage();
	WebDriver driver = Driver.getInstance();

	WebElement country = reg.country;
	WebElement month = reg.month;
	WebElement day = reg.day;
	WebElement year = reg.year;
	WebElement file = reg.chooseFile;

	@Given("^the user is on the signup page$")
	public void the_user_is_on_the_signup_page() throws Throwable {

		driver.get(Config.getProperty("url"));
		if (reg.pageTitle.isDisplayed()) {
			System.out.println("Page Title is: " + reg.pageTitle.getText());
		} else {
			System.out.println("DID NOT GET THE PAGE TITLE!!!");
		}
	}

	@When("^the user enters first name with \"([^\"]*)\" and last name with \"([^\"]*)\"$")
	public void the_user_enters_first_name_with_and_last_name_with(String firstName, String lastName) throws Throwable {
		reg.firstName.sendKeys(firstName);
		reg.lastName.sendKeys(lastName);
	}

	@And("^the user chooses maritual status as married and hobby as cricket$")

	public void the_user_chooses_maritual_status_as_married_and_hobby_as_cricket() throws Throwable {
		reg.marriedStatus.click();
		reg.hobbyCricket.click();
	}

	@And("^the user chooses country as United States$")

	public void the_user_chooses_country_as_United_States() throws Throwable {
		country.click();
		Select sel = new Select(country);
		sel.selectByVisibleText("United States");
		System.out.println("Country has been chosen!");
	}

	@Then("^the user enters his date of birth$")

	public void the_user_enters_his_date_of_birth() throws Throwable {

		Select sel1 = new Select(month);
		month.click();
		sel1.selectByVisibleText("8");

		Select sel2 = new Select(day);
		day.click();
		sel2.selectByVisibleText("12");

		Select sel3 = new Select(year);
		year.click();
		sel3.selectByVisibleText("1980");
		System.out.println("DOB has been set up!");
	}

	@And("^the user provides his phone number$")

	public void the_user_provides_his_phone_number() throws Throwable {
		reg.phoneNumber.sendKeys("2405600088");
	}

	@And("^the user enters username and email$")

	public void the_user_enters_username_and_email() throws Throwable {
		reg.username.sendKeys(RandomStringUtils.randomAlphabetic(8));
		reg.eMail.sendKeys(RandomStringUtils.randomAlphabetic(8)+"@gmail.com");
	}

	@And("^the user chooses profile picture$")

	public void the_user_chooses_profile_picture() throws Throwable {
		file.click();
		String profPicture = System.getProperty("user.dir") + "/src/test/resources/test_data/goodJob.jpeg";
		file.sendKeys(profPicture);
//		Thread.sleep(2000);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(555);
		
	}

	@Then("^the user describes about himself$")

	public void the_user_describes_about_himself() throws Throwable {
		reg.aboutYourSelf.sendKeys("Hi! My name is John Smith.");
	}

	@And("^the user enters password and confirms it$")
	public void the_user_enters_password_and_confirms_it() throws Throwable {
		reg.password.sendKeys("Johnsmith12389");
		reg.confirmPassword.sendKeys("Johnsmith12389");
	}
	
	
	@Then("^the user enters following passwords and system displays password level message:$")
	public void the_user_enters_following_passwords_and_system_displays_password_level_message(Map<String,String> passwords) throws Throwable {
	   
		
		enterPassword(passwords.get("Invalid"));
		assertEquals("* Minimum 8 characters required", reg.invalidPassword.getText());
		
		enterPassword(passwords.get("Weak"));
		assertEquals("Weak", reg.warningMessage.getText());
		
		enterPassword(passwords.get("Medium"));
		assertEquals("Medium", reg.warningMessage.getText());
		
		enterPassword(passwords.get("Strong"));
		assertEquals("Strong", reg.warningMessage.getText());
		
	}

	private void enterPassword(String password) throws InterruptedException {
		reg.password.clear();
		reg.confirmPassword.clear();
		reg.password.sendKeys(password);
		reg.confirmPassword.sendKeys(password);
		Thread.sleep(1000);
	}
	
	
	 @Then("^the user submits the application$")
	 public void the_user_submits_the_application() throws Throwable {
		 
		 reg.submitButton.click();
		 Thread.sleep(2000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			
			Thread.sleep(2000);

		reg.submitButton.click();
	 }
	
	 @And("^the user should see the approval message$")
	 public void the_user_should_see_the_aproval_message() throws Throwable {
		 reg.successMessageTest();

	 }
	
	}

