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

WebUI.callTestCase(findTestCase('Call Test Case/Login_Appco_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('retailer_edit/Page_AppCohesion/a_Retailers              Retai'))

WebUI.scrollToPosition(2000, 2000)

WebUI.scrollToElement(findTestObject('retailer_edit/Page_AppCohesion/div_Inventory (1)'), 50, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer_edit/Page_AppCohesion/div_Inventory (1)'))

WebUI.click(findTestObject('Object Repository/retailer_edit/Page_AppCohesion/button_Edit'))

WebUI.setText(findTestObject('retailer_edit/Page_AppCohesion/input_RETAILER NAME_retailerNa'), 'New RA Appco edit')

WebUI.setText(findTestObject('Object Repository/retailer_edit/Page_AppCohesion/textarea_RETAILER ADDRESS_reta'), '12/6, New Edit value')

WebUI.setText(findTestObject('Object Repository/retailer_edit/Page_AppCohesion/textarea_RETAILER ADDRESS_reta_26'), '12/50, New crosscut road')

WebUI.setText(findTestObject('Object Repository/retailer_edit/Page_AppCohesion/input_ZIP CODE_zip'), '45745')

WebUI.setText(findTestObject('Object Repository/retailer_edit/Page_AppCohesion/input_CITY_city'), 'Russell Springs')

WebUI.setText(findTestObject('Object Repository/retailer_edit/Page_AppCohesion/input_STATE_state'), 'South Dakota')

WebUI.setText(findTestObject('Object Repository/retailer_edit/Page_AppCohesion/input_PHONE_phoneNumber'), '(746) 846-8468')

WebUI.selectOptionByValue(findTestObject('Object Repository/retailer_edit/Page_AppCohesion/select_Appco Default Inventory'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/retailer_edit/Page_AppCohesion/button_Update'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_edit/Page_AppCohesion/div_OK_successImgIcon'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer_edit/Page_AppCohesion/p_Retailer details updated'), 'Retailer details updated')

WebUI.click(findTestObject('Object Repository/retailer_edit/Page_AppCohesion/span_OK'))

