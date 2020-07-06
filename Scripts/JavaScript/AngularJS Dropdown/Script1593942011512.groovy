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

WebUI.navigateToUrl('https://material.angular.io/components/select/examples')

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/div_Toppings'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/mat-pseudo-checkbox_Extra cheese_mat-pseudo_fe7acb'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/div_Edit Select with 2-way value binding ex_46f48e'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/span_'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/span_Option 3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Select  Angular Material/select_VolvoSaabMercedesAudi'), 
    'mercedes', true)

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/div_Disable selectmat-selectOption 3Choose _da0119'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/div_Valid option'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/span_Invalid option'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Select  Angular Material/select_Valid optionInvalid option'), 
    'invalid', true)

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/span_'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/span_Pizza'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Select  Angular Material/select_Volvo  Saab  Mercedes'), 
    'volvo', true)

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/span_'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/span_Cat'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Select  Angular Material/select_SaabMercedesAudi'), 'mercedes', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Select  Angular Material/select_FordChevroletDodge'), 'chevrolet', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/span_'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/span_Sausage'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/div_Edit Select with 2-way value binding ex_46f48e'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/div_Select an option'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/span_Option 2'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/div_mat-selectPokemonnative html selectvolv_55b57c'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/span_'))

WebUI.click(findTestObject('Object Repository/Page_Select  Angular Material/span_Bulbasaur'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Select  Angular Material/select_volvoSaabMercedesAudi (1)'), 
    'audi', true)

WebUI.closeBrowser()

