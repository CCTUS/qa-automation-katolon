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

WebUI.openBrowser('http://app-qa.appcohesion.io/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Retailer creation/Page_AppCohesion/input_User Name_ac_username'), 'surunewadmin')

WebUI.setText(findTestObject('Object Repository/Retailer creation/Page_AppCohesion/input_Password_ac_password'), '9tlTx3@y')

WebUI.click(findTestObject('Retailer creation/Page_AppCohesion/button_Login Now'))

WebUI.verifyElementPresent(findTestObject('RA_Creation/retailertab'), 30)

WebUI.click(findTestObject('RA_Creation/retailertab'))

WebUI.waitForElementPresent(findTestObject('Retailer creation/Page_AppCohesion/a_ADD RETAILER'), 30)

WebUI.click(findTestObject('addretailer/Page_AppCohesion/a_ADD RETAILER'))

WebUI.waitForElementPresent(findTestObject('Retailer creation/Page_AppCohesion/select_Appco Retailer'), 30)

WebUI.selectOptionByLabel(findTestObject('Retailer creation/Page_AppCohesion/select_Appco Retailer'), 'Appco Retailer', 
    true)

WebUI.setText(findTestObject('Retailer creation/Page_AppCohesion/input_RETAILER NAME_retailerNa'), 'qanewretaileradmin')

WebUI.setText(findTestObject('Retailer creation/Page_AppCohesion/input_USER NAME_userName'), 'qanewretaileradmin@26_9')

WebUI.setText(findTestObject('Retailer creation/Page_AppCohesion/input_EMAIL ID_emailId'), 'qanewretaileradmin26_9@getnada.com')

WebUI.setText(findTestObject('Retailer creation/Page_AppCohesion/input_FIRST NAME_firstName'), 'qanewretaileradmin')

WebUI.setText(findTestObject('Retailer creation/Page_AppCohesion/input_LAST NAME_lastName'), 'qanewretaileradmin')

WebUI.setText(findTestObject('Retailer creation/Page_AppCohesion/input_RETAILER ADDRESS 1_retai'), '26/7, New QA Build')

WebUI.setText(findTestObject('Retailer creation/Page_AppCohesion/input_RETAILER ADDRESS 2_retai'), '1/36, New Street lane')

WebUI.setText(findTestObject('Object Repository/Retailer creation/Page_AppCohesion/input_PHONE NUMBER_phoneNumber'), '(735) 735-7357')

WebUI.setText(findTestObject('Object Repository/Retailer creation/Page_AppCohesion/input_ZIP CODE_zip'), '53344')

WebUI.setText(findTestObject('Object Repository/Retailer creation/Page_AppCohesion/input_CITY_city'), 'West Portsmouth')

WebUI.setText(findTestObject('Retailer creation/Page_AppCohesion/input_STATE_state'), 'Ohio')

WebUI.setText(findTestObject('Retailer creation/Page_AppCohesion/input_BANK ROUTING ID_bankId'), '5745747468468')

WebUI.setText(findTestObject('Retailer creation/Page_AppCohesion/input_BANK NAME_bankName'), 'bb bank')

WebUI.setText(findTestObject('Retailer creation/Page_AppCohesion/input_BANK AC NUMBER_accountNu'), '574748484684')

WebUI.selectOptionByValue(findTestObject('Retailer creation/Page_AppCohesion/select_Appco Default Inventory'), '1', true)

WebUI.click(findTestObject('Retailer creation/Page_AppCohesion/button_Add Retailer'))

WebUI.click(findTestObject('Page_AppCohesion/div_OK_successImgIcon'))

not_run: if (WebUI.verifyElementText(findTestObject('Page_AppCohesion/h4_SORRY'), '') && WebUI.verifyElementText(findTestObject(
        'Page_AppCohesion/p_Username already exist. '), '')) {
    webUI.notify('unable to create user')

    WebUI.takeScreenshot('D:\\screenshot\\retailercreation1.png')
} else {
    webUI.notify('User creation Successfull')

    WebUI.takeScreenshot('D:\\screenshot\\retailercreation2.png')
}

