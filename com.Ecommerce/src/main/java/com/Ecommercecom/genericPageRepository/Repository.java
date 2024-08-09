package com.Ecommercecom.genericPageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.GenericLibrery.BaseClass;

public class Repository extends BaseClass {  		
	
	public Repository(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "name")
	private WebElement name;

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "mobile")
	private WebElement mobile;

	@FindBy(xpath = "//input[@type='datetime-local']")
	private WebElement dob;

	@FindBy(id = "male")
	private WebElement maleRadioButton;

	@FindBy(id = "female")
	private WebElement femlale;

	@FindBy(id = "others")
	private WebElement others;

	@FindBy(id = "goa")
	private WebElement goa;

	@FindBy(id = "manali")
	private WebElement manali;

	@FindBy(id = "bangalore")
	private WebElement bangalore;

	@FindBy(id = "Kerala")
	private WebElement kerala;

	@FindBy(name = "country1")
	private WebElement country1;

	@FindBy(name = "country2")
	private WebElement country2;

	@FindBy(id = "feedback")
	private WebElement feedback;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement fileUpload;

	@FindBy(xpath = "//input[@value='Register']")
	private WebElement registerButton;

	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUs;

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemlale() {
		return femlale;
	}

	public WebElement getOthers() {
		return others;
	}

	public WebElement getGoa() {
		return goa;
	}

	public WebElement getManali() {
		return manali;
	}

	public WebElement getBangalore() {
		return bangalore;
	}

	public WebElement getKerala() {
		return kerala;
	}

	public WebElement getCountry1() {
		return country1;
	}

	public WebElement getCountry2() {
		return country2;
	}

	public WebElement getFeedback() {
		return feedback;
	}

	public WebElement getFileUpload() {
		return fileUpload;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getContactUs() {
		return contactUs;
	}
}
