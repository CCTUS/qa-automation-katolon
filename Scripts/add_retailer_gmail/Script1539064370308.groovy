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

WebUI.navigateToUrl('http://app-qa.appcohesion.io/')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_User Name_ac_username'), 'surunewadmin')

WebUI.setText(findTestObject('Object Repository/Retailer creation/Page_AppCohesion/input_Password_ac_password'), '9tlTx3@y')

WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/button_Login Now'))

WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/a_Retailers              Retai'))

WebUI.rightClick(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/a_ADD RETAILER'))

WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/a_ADD RETAILER'))

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_RETAILER NAME_retailerNa'), 'NewRetailersample')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_USER NAME_userName'), 'NewRetailersample@7_9')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_EMAIL ID_emailId'), 'snekalatha.r+7@iinerds.com')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_FIRST NAME_firstName'), 'NewRetailersample')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_LAST NAME_lastName'), 'NewRetailersample')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_RETAILER ADDRESS 1_retai'), '10/10, New QA Build')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_RETAILER ADDRESS 2_retai'), '03/34, New Street lane')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_PHONE NUMBER_phoneNumber'), '(446) 626-2462')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_ZIP CODE_zip'), '75444')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_CITY_city'), 'Golden')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_STATE_state'), 'Texas')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_BANK ROUTING ID_bankId'), '574846848468')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_BANK NAME_bankName'), 'bb bank')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_BANK AC NUMBER_accountNu'), '45747467468468')

WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/button_Add Retailer'))

not_run: WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/h4_SUCCESS'))

not_run: WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/p_Congratulations You have suc'))

WebUI.verifyElementText(findTestObject('add_retailer_gmail/Page_AppCohesion/p_Congratulations You have suc'), 'Congratulations!! You have successfully added retailer. Email has been sent to his email id!', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer_markup_add/Page_AppCohesion/h4_SUCCESS'), 'SUCCESS', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('add_retailer_gmail/Page_AppCohesion/span_OK'))

