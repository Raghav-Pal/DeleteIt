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

Mobile.startApplication('kobiton-store:68838', true)

Mobile.tap(findTestObject('android.widget.TextView0 - No account yet Create one'), 10)

Mobile.setText(findTestObject('android.widget.EditText0'), 'Raghav', 10)

Mobile.setText(findTestObject('android.widget.EditText0 (1)'), 'MyCity', 10)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('android.widget.EditText0 (2)'), 'abc@def.com', 10)

Mobile.setText(findTestObject('android.widget.EditText0 (3)'), '123-456-7890', 10)

Mobile.setText(findTestObject('android.widget.EditText0 (4)'), '1234', 10)

Mobile.setText(findTestObject('android.widget.EditText0 (5)'), '1234', 10)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('android.widget.EditText0 (5)'), 10)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.Button0 - Create Account'), 10)

Mobile.pressBack()

Mobile.closeApplication()

