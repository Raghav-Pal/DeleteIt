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

WebUI.navigateToUrl('http://text-mask.github.io/text-mask/')

WebUI.setMaskedText(findTestObject('Object Repository/Page_Text Mask Conform user input to a string mask/input_Masked input_maskedInput'), 
    '(123) 456-7890')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Text Mask Conform user input to a string mask/select_US phone numberUS phone number with _649aa6'), 
    'Date', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Text Mask Conform user input to a string mask/select_u2000 (white space)_ (underscore)'), 
    '_', true)

WebUI.takeScreenshot('C:/Users/Administrator/Desktop/screen.jpg')

String path = WebUI.takeScreenshot()

System.err.println(path)

WebUI.closeBrowser()

