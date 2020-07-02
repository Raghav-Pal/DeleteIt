import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		println " I am inside GIVEN step"
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://orangehrm-demo-6x.orangehrmlive.com/auth/login')
	}
	
	@When("user enters (.*) and (.*)")
	public void user_enters_username_and_password(String username, String password) {
		println " I am inside WHEN step"
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_OrangeHRM Demo_txtUsername'), username)
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_OrangeHRM Demo_txtPassword'), password)
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		println " I am inside AND step"
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_OrangeHRM Demo_Submit'))
	}
	
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		println " I am inside THEN step"
//		WebUI.verifyTextPresent('Dashboard', false)
//	}
	
	@Then("check this (.*) on the screen")
	public void check_this_message_on_the_screen(String message) {
		println " I am inside AND step"
		WebUI.verifyTextPresent(message, false)
		WebUI.closeBrowser()
	}
}