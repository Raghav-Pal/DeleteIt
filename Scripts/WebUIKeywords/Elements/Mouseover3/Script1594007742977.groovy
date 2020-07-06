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

WebUI.navigateToUrl('https://mdbootstrap.com/docs/jquery/css/hover-effects/')

not_run: WebUI.acceptAlert()

WebUI.waitForElementClickable(findTestObject('Page_Bootstrap Hover Effects - examples  tu_ca26e5/div_Strong overlay'), 5)

WebUI.mouseOver(findTestObject('Object Repository/Page_Bootstrap Hover Effects - examples  tu_ca26e5/div_Strong overlay'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Bootstrap Hover Effects - examples  tu_ca26e5/div_Light overlay'), 5)

WebUI.mouseOver(findTestObject('Object Repository/Page_Bootstrap Hover Effects - examples  tu_ca26e5/div_Light overlay'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Bootstrap Hover Effects - examples  tu_ca26e5/div_Super light overlay'), 
    5)

WebUI.mouseOver(findTestObject('Object Repository/Page_Bootstrap Hover Effects - examples  tu_ca26e5/div_Super light overlay'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Object Repository/Page_Bootstrap Hover Effects - examples  tu_ca26e5/div_Zoom effect'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Object Repository/Page_Bootstrap Hover Effects - examples  tu_ca26e5/img_Shadow effect_img-fluid rounded-circle _d55241'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Object Repository/Page_Bootstrap Hover Effects - examples  tu_ca26e5/h5_Strong red overlay'))

WebUI.delay(2)

WebUI.closeBrowser()

