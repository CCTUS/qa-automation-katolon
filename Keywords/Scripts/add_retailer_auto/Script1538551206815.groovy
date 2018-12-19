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

WebUI.callTestCase(findTestCase('Call Test Case/Login_Appco_testcase-QA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/a_Retailers              Retai'))

WebUI.click(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/a_ADD RETAILER'))

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_RETAILER NAME_retailerNa'), findTestData(
        'TDAddRetailer').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_USER NAME_userName'), findTestData(
        'TDAddRetailer').getValue(2, 1))

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_EMAIL ID_emailId'), findTestData(
        'TDAddRetailer').getValue(3, 1))

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_FIRST NAME_firstName'), 'NewQARAK')

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_LAST NAME_lastName'), 'NewQARAK')

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_RETAILER ADDRESS 1_retai'), '3/10, New QA Build')

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_RETAILER ADDRESS 2_retai'), '12/52, New street lane')

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_PHONE NUMBER_phoneNumber'), '(315) 243-5246')

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_ZIP CODE_zip'), '34433')

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_CITY_city'), 'Newton Falls')

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_STATE_state'), 'Ohio')

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_BANK ROUTING ID_bankId'), '4634637357357')

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_BANK NAME_bankName'), 'new bank')

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_BANK AC NUMBER_accountNu'), '4637557357357357')

WebUI.click(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/button_Add Retailer'))

WebUI.verifyElementText(findTestObject('add_retailer_gmail/Page_AppCohesion/p_Congratulations You have suc'), 'Congratulations!! You have successfully added retailer. Email has been sent to his email id!', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer_markup_add/Page_AppCohesion/h4_SUCCESS'), 'SUCCESS', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('add_retailer_gmail/Page_AppCohesion/span_OK'))

WebUI.callTestCase(findTestCase('AppcoAdmin/edit retailer'), [:], FailureHandling.STOP_ON_FAILURE)

