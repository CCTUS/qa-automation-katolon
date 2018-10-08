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

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_User Name_ac_username'), 'surunewadmin')

WebUI.setText(findTestObject('Object Repository/Retailer creation/Page_AppCohesion/input_Password_ac_password'), '9tlTx3@y')

WebUI.click(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/button_Login Now'))

WebUI.click(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/a_Retailers              Retai'))

WebUI.click(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/a_ADD RETAILER'))

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_RETAILER NAME_retailerNa'), 'NewQARAK')

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_USER NAME_userName'), 'NewQARAK@3_10')

WebUI.setText(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/input_EMAIL ID_emailId'), 'newqarak3_10@getnada.com')

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

WebUI.click(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/p_Congratulations You have suc'))

WebUI.click(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/h4_SUCCESS'))

WebUI.click(findTestObject('Object Repository/add_retailer_auto/Page_AppCohesion/span_OK'))

