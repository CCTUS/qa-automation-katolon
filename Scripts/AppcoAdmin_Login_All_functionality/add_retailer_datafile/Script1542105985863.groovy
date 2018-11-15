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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_User Name_ac_username'), 'surunewadmin')

WebUI.setText(findTestObject('Object Repository/Retailer creation/Page_AppCohesion/input_Password_ac_password'), '9tlTx3@y')

WebUI.click(findTestObject('Login_OR/Page_AppCohesion/button_Login Now'))

WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/a_Retailers              Retai'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/a_ADD RETAILER'), FailureHandling.STOP_ON_FAILURE)

for (def rowNum = 1; rowNum <= findTestData('TDAddRetailer').getRowNumbers(); rowNum++) {
    not_run: WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/a_ADD RETAILER'))

    WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_RETAILER NAME_retailerNa'), 
        findTestData('TDAddRetailer').getValue(1, rowNum))

    WebUI.setText(findTestObject('add_retailer_gmail/Page_AppCohesion/input_USER NAME_userName'), findTestData('TDAddRetailer').getValue(
            2, rowNum))

    WebUI.setText(findTestObject('add_retailer_gmail/Page_AppCohesion/input_EMAIL ID_emailId'), findTestData('TDAddRetailer').getValue(
            3, rowNum))

    WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_FIRST NAME_firstName'), 'SamRetailer')

    WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_LAST NAME_lastName'), 'Sam Retailer')

    WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_RETAILER ADDRESS 1_retai'), 
        '9/10, New QA Build11')

    WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_RETAILER ADDRESS 2_retai'), 
        '11/28, New Street lane')

    WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_PHONE NUMBER_phoneNumber'), 
        '(446) 626-2462')

    WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_ZIP CODE_zip'), '75444')

    WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_CITY_city'), 'Golden')

    WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_STATE_state'), 'Texas')

    WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_BANK ROUTING ID_bankId'), 
        '574846848468')

    WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_BANK NAME_bankName'), 'bb bank')

    WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_BANK AC NUMBER_accountNu'), 
        '45747467468468')

    WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/button_Add Retailer'))

    not_run: WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/h4_SUCCESS'))

    not_run: WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/p_Congratulations You have suc'))

    WebUI.verifyMatch('Congratulations!! You have successfully added retailer. Email has been sent to his email id!', 'Congratulations!! You have successfully added retailer. Email has been sent to his email id!', 
        true)

    WebUI.verifyMatch('SUCCESS', 'SUCCESS', true)

    WebUI.click(findTestObject('add_retailer_gmail/Page_AppCohesion/span_OK'))
}

