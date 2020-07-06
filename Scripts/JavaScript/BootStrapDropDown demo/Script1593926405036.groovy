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

WebUI.navigateToUrl('https://www.w3schools.com/bootstrap/bootstrap_ref_js_dropdown.asp')

WebUI.click(findTestObject('Object Repository/Page_Bootstrap JS Dropdown Reference/a_Try it'))

WebUI.switchToWindowTitle('Tryit Editor v3.6')

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/button_Tutorials'))

WebUI.selectOptionByValue(findTestObject('Page_Tryit Editor v36/button_Tutorials'), 'CSS', false)

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/a_CSS'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Bootstrap JS Dropdown Reference')

WebUI.click(findTestObject('Object Repository/Page_Bootstrap JS Dropdown Reference/a_Try it'))

WebUI.switchToWindowTitle('Tryit Editor v3.6')

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/button_Tutorials'))

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/a_JavaScript'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Bootstrap JS Dropdown Reference')

WebUI.click(findTestObject('Object Repository/Page_Bootstrap JS Dropdown Reference/a_Try it_1'))

WebUI.switchToWindowTitle('Tryit Editor v3.6')

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/button_Tutorials'))

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/a_CSS'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Bootstrap JS Dropdown Reference')

WebUI.click(findTestObject('Object Repository/Page_Bootstrap JS Dropdown Reference/a_Try it_1_2'))

WebUI.switchToWindowTitle('Tryit Editor v3.6')

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/button_Tutorials'))

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/a_JavaScript'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Bootstrap JS Dropdown Reference')

WebUI.click(findTestObject('Object Repository/Page_Bootstrap JS Dropdown Reference/a_Try it_1_2_3'))

WebUI.switchToWindowTitle('Tryit Editor v3.6')

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/button_Tutorials'))

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/a_JavaScript'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Bootstrap JS Dropdown Reference')

WebUI.click(findTestObject('Object Repository/Page_Bootstrap JS Dropdown Reference/a_Try it_1_2_3_4'))

WebUI.switchToWindowTitle('Tryit Editor v3.6')

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/button_Tutorials'))

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/a_CSS'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Bootstrap JS Dropdown Reference')

WebUI.click(findTestObject('Object Repository/Page_Bootstrap JS Dropdown Reference/a_Try it_1_2_3_4_5'))

WebUI.switchToWindowTitle('Tryit Editor v3.6')

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/button_Tutorials'))

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/a_HTML'))

WebUI.delay(2)

WebUI.closeBrowser()

