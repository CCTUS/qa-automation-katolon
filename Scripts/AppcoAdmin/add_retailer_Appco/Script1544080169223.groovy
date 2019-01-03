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

WebUI.callTestCase(findTestCase('Call Test Case/Login_Appco_testcase-QA - new url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/a_Retailers              Retai'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/a_ADD RETAILER'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Retailer creation/Page_AppCohesion/select_Appco Retailer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Retailer creation/Page_AppCohesion/select_Appco Retailer'), 'Appco Retailer', 
    true)

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_RETAILER NAME_retailerNa'), findTestData(
        'TDAddRetailer').getValue(1, 1))

int rn_uname

rn_uname = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('add_retailer_gmail/Page_AppCohesion/input_USER NAME_userName'), 'NewRetailerAdmin' + rn_uname)

int rn_email

rn_email = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('add_retailer_gmail/Page_AppCohesion/input_EMAIL ID_emailId'), ('snekalatha.r' + rn_email) + 
    '@iinerds.com')

//WebUI.setText(findTestObject('add_retailer_gmail/Page_AppCohesion/input_USER NAME_userName'), findTestData('TDAddRetailer').getValue(
// 2, rowNum))
//WebUI.setText(findTestObject('add_retailer_gmail/Page_AppCohesion/input_EMAIL ID_emailId'), findTestData('TDAddRetailer').getValue(
// 3, rowNum))
WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_FIRST NAME_firstName'), 'NewRetailer')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_LAST NAME_lastName'), 'New Retailer')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_RETAILER ADDRESS 1_retai'), '9/10, New QA Build11')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_RETAILER ADDRESS 2_retai'), '11/28, New Street lane')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_PHONE NUMBER_phoneNumber'), '(446) 626-2462')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_ZIP CODE_zip'), '75444')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_CITY_city'), 'Golden')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_STATE_state'), 'Texas')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_BANK ROUTING ID_bankId'), '574846848468')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_BANK NAME_bankName'), 'bb bank')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_BANK AC NUMBER_accountNu'), '45747467468468')

WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/Page_AppCohesion/select_AppCoSSGreen SupplyDavi'), 
    '0', true)

WebUI.delay(10)

WebUI.click(findTestObject('add_retailer_gmail/Page_AppCohesion/button_Add Retailer'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Retailer creation/inventory_object repo/h5_Success  Congratulations Yo'), 'Success: Congratulations!! You have successfully added retailer. Email has been sent to his email id!', 
    FailureHandling.CONTINUE_ON_FAILURE)

