import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://compendiumdev.co.uk/selenium/testpages/search.php')

WebUI.clearText(findTestObject('Page_Selenium Simplified Search Engine/input_Type in a search_q'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Selenium Simplified Search Engine/input_Type in a search_q'), 'abcd')

//WebUI.convertWebElementToTestObject(xpath)
not_run: WebUI.convertWebElementToTestObject(org.openqa.selenium.WebElement)

WebUI.sendKeys(findTestObject('Object Repository/Page_Selenium Simplified Search Engine/input_Type in a search_q'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_abcd - Selenium Simplified Search Engine/form_Type in a search        docsseleniumhq_5e5477'))

WebUI.setText(findTestObject('Object Repository/Page_abcd - Selenium Simplified Search Engine/input_Type in a search_q'), 
    'google')

WebUI.sendKeys(findTestObject('Object Repository/Page_abcd - Selenium Simplified Search Engine/input_Type in a search_q'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_google - Selenium Simplified Search Engine/input_Type in a search_btnG'))

WebUI.click(findTestObject('Object Repository/Page_google - Selenium Simplified Search Engine/input_Type in a search_q'))

WebUI.rightClick(findTestObject('Object Repository/Page_google - Selenium Simplified Search Engine/input_Type in a search_q'))

WebUI.closeBrowser()

