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

'Open the selected browser and navigate to our AUT website.'
WebUI.openBrowser('http://jqueryui.com/droppable/#default').Use the dragAndDropObjectToObject keyword to perform the drag and drop action.

WebUI.dragAndDropToObject(findTestObject('Page_Droppable jQuery UI/div_draggable'), findTestObject('Page_Droppable jQuery UI/div_droppable')).Get the text content of our droppable object.

droppable_text = WebUI.getText(findTestObject('Page_Droppable jQuery UI/div_droppable')).Verify if it is actually changed to "Dropped!" because of the drag and drop action.

WebUI.verifyEqual(droppable_text, 'Dropped!').Clean up the testing environment by closing the browser.

WebUI.closeBrowser()



