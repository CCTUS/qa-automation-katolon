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

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_User Name_ac_username'), 'surunewadmin')

WebUI.setText(findTestObject('Object Repository/Retailer creation/Page_AppCohesion/input_Password_ac_password'), '9tlTx3@y')

WebUI.click(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/button_Login Now'))

WebUI.click(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/a_Retailers              Retai'))

WebUI.click(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/a_ADD RETAILER'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/select_Appco Retailer'), 'POS Retailer', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/select_Select POS'), '1', 
    true)

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_RETAILER NAME_retailerNa'), 'NewQAPOSK')

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_USER NAME_userName'), 'NewQAPOSK@3_10')

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_EMAIL ID_emailId'), 'newqaposk@getnada.com')

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_FIRST NAME_firstName'), 'NewQAPOSK')

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_LAST NAME_lastName'), 'New QAPOSK')

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_RETAILER ADDRESS 1_retai'), '3/10, New QA Build')

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_RETAILER ADDRESS 2_retai'), '1/03, New Street lane')

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_PHONE NUMBER_phoneNumber'), '(426) 246-2462')

WebUI.setText(findTestObject('Page_AppCohesion/input_ZIP CODE_zip'), '24124')

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_CITY_city'), 'Narrows')

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_STATE_state'), 'Virginia')

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_BANK ROUTING ID_bankId'), '686586585')

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_BANK NAME_bankName'), 'new bank')

WebUI.setText(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/input_BANK AC NUMBER_accountNu'), '5754746467464')

WebUI.click(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/button_Add Retailer'))

WebUI.click(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/p_Congratulations You have suc'))

WebUI.click(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/h4_SUCCESS'))

WebUI.click(findTestObject('Object Repository/add_pos_retailer/Page_AppCohesion/span_OK'))

WebUI.closeBrowser()

