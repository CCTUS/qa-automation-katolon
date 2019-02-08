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

WebUI.callTestCase(findTestCase('Call Test Case/LMP_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/a_Listing ManagementListing Ma'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Draft'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/input_GSIN_form-control ng-val'), 'BRTTA-9G8LWJMB')

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/button_Search'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/input_Drafted Date_innerTdChec'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/button_Publish Now'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Publishing...'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/td_Storefront Category is requ'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/td_View Listing'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/span_View Listing'))

WebUI.delay(5)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Fetching shipping profiles'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Storefront Category is req'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/ul_Storefront Category is requ'))

WebUI.setText(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/input_Serial Number_serialNumb'), '11111')

WebUI.setText(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/input_Listing Title_productNam'), 'Beretta Forest T3x Product')

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/textarea_Listing Description_p'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Storefront Category Firear'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/span_Air Guns'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/span_Air Pistols'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/select_Select your List Durati'), 
    '30', true)

WebUI.setText(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/input_Selling Price_sellingPri'), '800')

WebUI.selectOptionByValue(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/select_Select Shipping Profile'), 
    '49', true)

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/input_Who Pays for Shipping_wi'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/span_Select payment methods_dr'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_COD'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Pay Pal'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Discover'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Visa Mastercard'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Select All'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/span_x_dropdown-up'))

WebUI.setText(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/input_SubTitle_subtitle'), 'beretta product')

WebUI.selectOptionByValue(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/select_Select country codeUS'), 
    'US', true)

WebUI.setText(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/input_Postal Code_postalCode'), '44444')

WebUI.setText(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/input_Standard Text ID_form-co'), '40')

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/button_Save'))

WebUI.delay(10)

WebUI.click(findTestObject('LMP_Active Product/Page_AppCohesion/input_Feb 1 2019 111413 AM_inn'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/button_Publish Now'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/h5_Success  Publishing In Prog'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/h5_Fetching drafted listings..'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/h5_Success  Publishing In Prog'))

