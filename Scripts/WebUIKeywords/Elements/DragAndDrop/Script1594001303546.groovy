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

WebUI.navigateToUrl('https://www.w3schools.com/html/html5_draganddrop.asp')

WebUI.click(findTestObject('Object Repository/Page_HTML Drag and Drop API/img_Example_drag1'))

WebUI.click(findTestObject('Object Repository/Page_HTML Drag and Drop API/div_Example_div2'))

WebUI.dragAndDropToObject(findTestObject('Page_HTML Drag and Drop API/img_Example_drag1'), findTestObject('Page_HTML Drag and Drop API/div_Example_div2'))

not_run: WebUI.click(findTestObject('Object Repository/Page_HTML Drag and Drop API/div_HTML Drag and Drop API PreviousNext In _1b112c'))

WebUI.delay(2)

not_run: WebUI.closeBrowser()

