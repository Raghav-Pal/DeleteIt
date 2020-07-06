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

WebUI.openBrowser('https://jqueryui.com/droppable/')

def obj1 = findTestObject('Page_Droppable  jQuery UI/div_Drag me to my target')
def obj2 = findTestObject('Page_Droppable  jQuery UI/div_Drop here')

WebUI.dragAndDropToObject(obj1, obj2)
//'Drag \'Drop me to target\' div and drop it to \'Drop here\' div'
//WebUI.dragAndDropToObject(findTestObject('Page_jQuery_Droppable/div_draggable'), findTestObject('Page_jQuery_Droppable/div_droppable'))

WebUI.delay(2)

//WebUI.closeBrowser()
//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://jqueryui.com/droppable/')
//
//WebUI.click(findTestObject('Page_Droppable  jQuery UI/div_Drag me to my target'))
//
//WebUI.click(findTestObject('Page_Droppable  jQuery UI/p_Drag me to my target'))
//
//WebUI.click(findTestObject('Page_Droppable  jQuery UI/div_Drop here'))
//
//WebUI.click(findTestObject('Page_Droppable  jQuery UI/p_Drag me to my target'))
//
//WebUI.closeBrowser()
//
