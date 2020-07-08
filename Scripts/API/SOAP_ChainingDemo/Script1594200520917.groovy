import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable

resp = WS.sendRequest(findTestObject('API/SOAP/CountryAPI/ListOfCountryNamesByName'))
String xml = resp.getResponseBodyContent()
def dataValue = new XmlSlurper().parseText(xml)
println(' \n\n  data valu is \n\n ' + dataValue)
def value = dataValue.ListOfCountryNamesByNameResult.tCountryCodeAndName[12].sISOCode.text()

//ListOfCountryNamesByCodeResponse.ListOfCountryNamesByCodeResult.tCountryCodeAndName[224].sName
//ListOfCountryNamesByNameResponse.ListOfCountryNamesByNameResult.tCountryCodeAndName[17]
println('  >> value extracted is : ' + value)

GlobalVariable.CountryCode = value
println "  >  GlobalVariable.CountryCode : "+GlobalVariable.CountryCode

WS.sendRequestAndVerify(findTestObject('API/SOAP/CountryAPI/CapitalCity', [('countryCode') : GlobalVariable.CountryCode]))

