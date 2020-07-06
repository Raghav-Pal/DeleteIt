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

WebUI.navigateToUrl('http://www.tinyupload.com/')

not_run: WebUI.click(findTestObject('Object Repository/Page_TinyUploadcom - best file hosting solu_c58805/img'))

WebUI.setText(findTestObject('Object Repository/Page_TinyUploadcom - best file hosting solu_c58805/textarea_File to upload  File description (_142e78'), 
    'abcd\nefgh')

WebUI.uploadFile(findTestObject('Page_TinyUploadcom - best file hosting solution with no limits totaly free/input_File to upload  File description (optional)_uploaded_file'), 
    'C:\\Users\\Administrator\\Desktop\\yourImage.jpg')

WebUI.delay(2)

WebUI.click(findTestObject('Page_TinyUploadcom - best file hosting solution with no limits totaly free/img'))

winTitle = WebUI.getWindowTitle()

println(' Title of windows is : ' + winTitle)

WebUI.switchToWindowIndex(1)

winTitle2 = WebUI.getWindowTitle()

println(' Title of windows is : ' + winTitle2)

WebUI.verifyElementPresent(findTestObject('Page_File upload progress/a_Close'), 0)

WebUI.click(findTestObject('Page_File upload progress/a_Close'))

WebUI.closeBrowser()

not_run: WebUI.switchToWindowTitle('TinyUpload.com - best file hosting solution, with no limits, totaly free')

WebUI.closeBrowser()

