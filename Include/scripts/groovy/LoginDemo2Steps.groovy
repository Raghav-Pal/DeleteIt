import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


public class LoginDemo2Steps {
	
	
	@Given("user is on login page demo")
	public void user_is_on_login_page_demo() {
		println "In Given"
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://orangehrm-demo-6x.orangehrmlive.com/auth/login')
	}
	
	@When("user adds username and password")
	public void user_adds_username_and_password() {
		println "In When"
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_OrangeHRM Demo_txtUsername'), 'admin')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_OrangeHRM Demo_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')
	}
	
	@And("click on login butoon")
	public void click_on_login_butoon() {
		println "In And"
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_OrangeHRM Demo_Submit'))
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		println "In Then"
		WebUI.verifyTextPresent('Dashboard', false)
		WebUI.closeBrowser()
	}
}
