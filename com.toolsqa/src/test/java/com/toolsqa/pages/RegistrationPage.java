package com.toolsqa.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class RegistrationPage {

	private WebDriver driver;

	public RegistrationPage() {
		this.driver = Driver.getInstance();
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(css = "h1.entry-title")
	public WebElement pageTitle;

	@FindBy(id = "name_3_firstname")
	public WebElement firstName;

	@FindBy(id = "name_3_lastname")
	public WebElement lastName;

	@FindBy(xpath = "//*[@value='married']")
	public WebElement marriedStatus;

	@FindBy(xpath = "//*[@value='cricket ']")
	public WebElement hobbyCricket;

	@FindBy(xpath = "//*[@id='dropdown_7']")
	public WebElement country;

	@FindBy(xpath = "//*[@id='mm_date_8']")
	public WebElement month;

	@FindBy(xpath = "//*[@id='dd_date_8']")
	public WebElement day;

	@FindBy(xpath = "//*[@id='yy_date_8']")
	public WebElement year;

	@FindBy(id = "phone_9")
	public WebElement phoneNumber;

	@FindBy(id = "username")
	public WebElement username;

	@FindBy(id = "email_1")
	public WebElement eMail;

	@FindBy(xpath = "//*[@id='profile_pic_10']")
	public WebElement chooseFile;

	@FindBy(xpath = "//*[@id='description']")
	public WebElement aboutYourSelf;

	@FindBy(id = "password_2")
	public WebElement password;

	@FindBy(id = "confirm_password_password_2")
	public WebElement confirmPassword;

	@FindBy(id = "piereg_passwordStrength")
	public WebElement warningMessage;

	@FindBy(xpath = "//div[@class='legend_txt']/span")
	public WebElement invalidPassword;

	@FindBy(xpath = "//*[@name='pie_submit']")
	public WebElement submitButton;

	@FindBy(css = ".piereg_message")
	public WebElement successMessage;

	public void successMessageTest() {
		assertTrue(successMessage.isDisplayed());
		System.out.println("You succsessfully regestered!");

	}

}
