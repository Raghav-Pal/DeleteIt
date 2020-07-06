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

WebUI.navigateToUrl('https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple')

not_run: WebUI.selectOptionByValue(findTestObject('Page_Tryit Editor v36/select_cars'), 'volvo', true)

not_run: WebUI.selectOptionByValue(findTestObject('Page_Tryit Editor v36/select_cars'), 'saab', true)

not_run: WebUI.selectOptionByValue(findTestObject('Page_Tryit Editor v36/select_cars'), 'saab', true)

not_run: WebUI.selectOptionByValue(findTestObject('Page_Tryit Editor v36/select_cars'), 'opel', true)

not_run: WebUI.selectOptionByValue(findTestObject('Page_Tryit Editor v36/select_cars'), 'opel', true)

not_run: WebUI.selectOptionByValue(findTestObject('Page_Tryit Editor v36/select_cars'), 'audi', true)

not_run: WebUI.selectOptionByValue(findTestObject('Page_Tryit Editor v36/select_cars'), 'audi', true)

not_run: WebUI.selectOptionByValue(findTestObject('Page_Tryit Editor v36/select_cars'), 'opel', true)

not_run: WebUI.selectAllOption(findTestObject('Page_Tryit Editor v36/select_cars'))

not_run: WebUI.delay(2)

WebUI.deselectAllOption(findTestObject('Page_Tryit Editor v36/select_cars'))

WebUI.selectOptionByIndex(findTestObject('Page_Tryit Editor v36/select_cars'), '1')

WebUI.deselectAllOption(findTestObject('Page_Tryit Editor v36/select_cars'))

WebUI.selectOptionByValue(findTestObject('Page_Tryit Editor v36/select_cars'), 'volvo', false)

WebUI.deselectAllOption(findTestObject('Page_Tryit Editor v36/select_cars'))

WebUI.selectOptionByLabel(findTestObject('Page_Tryit Editor v36/select_cars'), 'Opel', false)

WebUI.deselectAllOption(findTestObject('Page_Tryit Editor v36/select_cars'))

WebUI.selectAllOption(findTestObject('Page_Tryit Editor v36/select_cars'))

output1 = WebUI.getNumberOfSelectedOption(findTestObject('Page_Tryit Editor v36/select_cars'))

output2 = WebUI.getNumberOfTotalOption(findTestObject('Page_Tryit Editor v36/select_cars'))

println(' Number of Selected Options : ' + output1)

println(' Number of Total Options : ' + output2)

WebUI.verifyOptionSelectedByIndex(findTestObject('Page_Tryit Editor v36/select_cars'), '2', 0)

WebUI.deselectAllOption(findTestObject('Page_Tryit Editor v36/select_cars'))

WebUI.verifyOptionsPresent(findTestObject('Page_Tryit Editor v36/select_cars'), ['Volvo', 'Saab', 'Opel', 'Audi'])

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_Tryit Editor v36/input'))

not_run: WebUI.click(findTestObject('Page_Tryit Editor v36/h2_Your input was received as'))

WebUI.closeBrowser()

