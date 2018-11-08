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

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/button_SIGN IN  SIGN UP'))

WebUI.waitForElementVisible(findTestObject('Page_GoGoCar/div_Log me in'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Page_GoGoCar/div_Log InSign UpLog in with F'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Page_GoGoCar/div_or_auth0-lock-input-wrap a'), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input_or_email'), 
    'testnew@mailinator.com')

WebUI.waitForElementVisible(findTestObject('Page_GoGoCar/div_or_auth0-lock-input-wrap a_1'), 5)

WebUI.setText(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input_or_password'), 
    'asdf')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/a_Dont remember your password'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/span_Log In'))

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/span_Log In'))

WebUI.delay(10)

