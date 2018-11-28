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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app-qa.appcohesion.io/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('sampletest case store creation/Page_AppCohesion/input_User Name_ac_username'), 'NewRAAutomation@15_14')

WebUI.setText(findTestObject('sampletest case store creation/Page_AppCohesion/input_Password_ac_password'), 'NewRAAutomation@15_14')

WebUI.click(findTestObject('Object Repository/sampletest case store creation/Page_AppCohesion/button_Login'))

WebUI.delay(10)

WebUI.click(findTestObject('sampletest case store creation/Page_AppCohesion/a_Stores              Stores'))

WebUI.delay(5)

WebUI.click(findTestObject('sampletest case store creation/Page_AppCohesion/a_ADD STORE'))

WebUI.setText(findTestObject('Object Repository/sampletest case store creation/Page_AppCohesion/input_STORE NAME_name'), 
    'ttt')

WebUI.setText(findTestObject('Object Repository/sampletest case store creation/Page_AppCohesion/input_STORE ADDRESS_address'), 
    '12/45, new store')

WebUI.setText(findTestObject('Object Repository/sampletest case store creation/Page_AppCohesion/input_ZIP CODE_zip'), '54744')

WebUI.setText(findTestObject('Object Repository/sampletest case store creation/Page_AppCohesion/input_CITY_city'), 'Newton Falls')

WebUI.setText(findTestObject('Object Repository/sampletest case store creation/Page_AppCohesion/input_STATE_state'), 'Ohio')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/sampletest case store creation/Page_AppCohesion/span_Default Store_onoffswitch'))

WebUI.click(findTestObject('Object Repository/sampletest case store creation/Page_AppCohesion/button_ADD STORE'))

WebUI.closeBrowser()

