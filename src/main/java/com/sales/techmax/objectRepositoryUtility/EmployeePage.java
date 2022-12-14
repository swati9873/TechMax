package com.sales.techmax.objectRepositoryUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sales.techmax.genericUtility.WebDriverUtility;

public class EmployeePage {

	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private WebElement AddEmployeeicon;
	
	
	@FindBy(xpath="//div[@id='employeeModal']/descendant::input[@name='firstname']")
	private WebElement firstNameTextfield;
	@FindBy(xpath="//div[@id='employeeModal']/descendant::input[@name='lastname']")
	private WebElement lastNameTextfield;
	@FindBy(xpath="//div[@id='employeeModal']/descendant::select[@name='gender']")
	private WebElement selectGender;
	@FindBy(xpath="//div[@id='employeeModal']/descendant::input[@name='email']")
	private WebElement emailTextfield;
	@FindBy(xpath="//div[@id='employeeModal']/descendant::input[@name='phonenumber']")
	private WebElement PhoneNumberTextfield;
	@FindBy(xpath="//div[@id='employeeModal']/descendant::select[@name='jobs']")
	private WebElement selectJob;
	@FindBy(xpath="//div[@id='employeeModal']/descendant::input[@id='FromDate']")
	private WebElement HireDate;
	@FindBy(xpath="//div[@id='employeeModal']/descendant::select[@name='province']")
	private WebElement selectProvince;
	@FindBy(xpath="//div[@id='employeeModal']/descendant::select[@name='city']")
	private WebElement selectCity;
	@FindBy(xpath="//div[@id='employeeModal']/descendant::button[@class='btn btn-success']")
	private WebElement CreateEmployeeSaveButton;
	@FindBy(xpath="//div[@id='employeeModal']/descendant::button[@class='btn btn-danger']")
	private WebElement CreateEmployeeResetButton;
	
	WebDriver driver;
	public EmployeePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public WebElement getAddEmployeeicon() {
		return AddEmployeeicon;
	}
	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}
	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}
	public WebElement getSelectGender() {
		return selectGender;
	}
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}
	public WebElement getPhoneNumberTextfield() {
		return PhoneNumberTextfield;
	}
	public WebElement getselectJob() {
		return selectJob;
	}
	public WebElement getHireDate() {
		return HireDate;
	}
	public WebElement getSelectProvince() {
		return selectProvince;
	}
	public WebElement getSelectCity() {
		return selectCity;
	}
	public WebElement getCreateEmployeeSaveButton() {
		return CreateEmployeeSaveButton;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void createEmployee(String employeeFirstName,String employeeLastName,String employeeGender,String employeeEmail,String employeePhoneNumber,String employeeJob,String employeeProvince,String employeeCity) throws AWTException {
		WebDriverUtility wLib=new WebDriverUtility();
		firstNameTextfield.sendKeys(employeeFirstName);
		lastNameTextfield.sendKeys(employeeLastName);
		wLib.select(selectGender,employeeGender);
		emailTextfield.sendKeys(employeeEmail);
		PhoneNumberTextfield.sendKeys(employeePhoneNumber);
		selectJob.sendKeys(employeeJob);
		HireDate.click();
		Robot robot=new Robot();
		HireDate.sendKeys(Keys.NUMPAD2);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		HireDate.sendKeys(Keys.NUMPAD1);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		HireDate.sendKeys(Keys.NUMPAD2);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		wLib.select(selectProvince,employeeProvince);
		wLib.select(selectCity,employeeCity);
		CreateEmployeeSaveButton.click();

}
}
