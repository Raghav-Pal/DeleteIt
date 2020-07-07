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

Mobile.startApplication('bs://412ccb4f972202ef73d49356456be4bda723c99a', true)

Mobile.tap(findTestObject('RecordedAtBrowserstackDevice/android.widget.TextView0 - No account yet Create one'), 10)

Mobile.setText(findTestObject('RecordedAtBrowserstackDevice/android.widget.EditText0'), 'MyName', 10)

Mobile.setText(findTestObject('RecordedAtBrowserstackDevice/android.widget.EditText1'), 'MyAddress', 10)

Mobile.setText(findTestObject('RecordedAtBrowserstackDevice/android.widget.EditText2'), '123-456-7890', 10)

Mobile.clearText(findTestObject('RecordedAtBrowserstackDevice/android.widget.EditText2 - 123-456-7890'), 10)

Mobile.setText(findTestObject('RecordedAtBrowserstackDevice/android.widget.EditText2 (1)'), 'abcd@efgh.com', 10)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('RecordedAtBrowserstackDevice/android.widget.EditText3'), '123-456-7890', 10)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('RecordedAtBrowserstackDevice/android.widget.EditText4'), '1234', 10)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('RecordedAtBrowserstackDevice/android.widget.EditText5'), '1234', 10)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('RecordedAtBrowserstackDevice/android.widget.Button0 - CREATE ACCOUNT'), 10)

def textValue = Mobile.getText(findTestObject('RecordedAtBrowserstackDevice/android.widget.TextView1 - Hello world'), 10)

println "  >>  >>  Text Value is : "+textValue

Mobile.pressBack()

Mobile.closeApplication()

