import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/button_SIGN IN  SIGN UP (1)'))

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/a_Sign Up'))

WebUI.click(findTestObject('gogo user journey/new use case_common search/label_Please provide your ZIP'))

int rn_email

rn_email = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_or_email (1)'), ('sss' + rn_email) + 
    '@getnada.com')

WebUI.setText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_or_password (1)'), 'sss@123')

WebUI.setText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_or_firstname'), 'sss')

WebUI.setText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_or_lastname'), 'sss')

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_I hearby accept the terms'))

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_Sign Up'))

WebUI.delay(10)

