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

WebUI.navigateToUrl('https://www.w3schools.com/react/showreact.asp?filename=demo2_react_forms_select')

WebUI.verifyElementPresent(findTestObject('JS_Dropdown/Page_Tryit Editor v36 - Show React/select_Ford  Volvo  Fiat'), 
    5)

WebUI.verifyOptionsPresent(findTestObject('JS_Dropdown/Page_Tryit Editor v36 - Show React/select_Ford  Volvo  Fiat'), 
    ['Fiat', 'Volvo', 'Ford'])

WebUI.selectOptionByValue(findTestObject('JS_Dropdown/Page_Tryit Editor v36 - Show React/select_Ford  Volvo  Fiat'), 
    'Fiat', true)

WebUI.selectOptionByValue(findTestObject('JS_Dropdown/Page_Tryit Editor v36 - Show React/select_Ford  Volvo  Fiat'), 
    'Ford', true)

WebUI.selectOptionByValue(findTestObject('JS_Dropdown/Page_Tryit Editor v36 - Show React/select_Ford  Volvo  Fiat'), 
    'Volvo', true)

WebUI.selectOptionByIndex(findTestObject('JS_Dropdown/Page_Tryit Editor v36 - Show React/select_Ford  Volvo  Fiat'), 
    '1')

WebUI.delay(2)

WebUI.closeBrowser()

