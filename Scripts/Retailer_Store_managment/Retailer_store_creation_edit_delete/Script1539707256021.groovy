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

WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/a_Stores              Stores'))

WebUI.click(findTestObject('retailer_creation_Storecreation/Page_AppCohesion/i_'))

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_STORE NAME_name'), 
    findTestData('storename').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_STORE ADDRESS_address'), 
    '3/10, New QA Build')

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_STORE ADDRESS_address2'), 
    '2/56, New Street lane')

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_ZIP CODE_zip'), '24143')

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_CITY_city'), 'Newton Falls')

WebUI.setText(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/input_STATE_state'), 'Ohio')

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/span_Default Store_checkmark'))

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/button_ADD STORE'))

WebUI.verifyElementText(findTestObject('retailer_creation_Storecreation/Page_AppCohesion/p_Store created successfully.'), 
    'Store created successfully.', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer_creation_Storecreation/Page_AppCohesion/h4_SUCCESS'), 'SUCCESS', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/retailer_creation_Storecreation/Page_AppCohesion/span_OK'))

