import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

response1 = WS.sendRequest(findTestObject('API/REST/GetCustomerDetails'))

def slurper = new groovy.json.JsonSlurper()
def result = slurper.parseText(response1.getResponseBodyContent())
def value = result.data[5].first_name

println '  value is :'+value

GlobalVariable.FirstName = value
	
WS.sendRequestAndVerify(findTestObject('API/REST/UpdateUser', [('username') : GlobalVariable.FirstName]))

