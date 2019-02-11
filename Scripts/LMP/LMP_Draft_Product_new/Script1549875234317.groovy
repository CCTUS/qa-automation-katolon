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

WebUI.callTestCase(findTestCase('LMP/LMP_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/a_Listing ManagementListing Ma'))

WebUI.click(findTestObject('LMP Draft_Product/a_Listing ManagementListing Ma'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/LMP Draft_Product/div_Overview'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/td_BRTTA-9G8LWJMB'))

WebUI.setText(findTestObject('Object Repository/LMP Draft_Product/input_GSIN_form-control ng-unt'), 'BRTTA-1P8QRBVB')

WebUI.click(findTestObject('Object Repository/LMP Draft_Product/button_Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/LMP Draft_Product/input_Not Listed On_innerTdChe'))

WebUI.click(findTestObject('Object Repository/LMP Draft_Product/div_Create Draft Listing'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/span_ROHITHS STOREFRONT'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/LMP Draft_Product/span_ROHITHS STOREFRONT'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Object Repository/LMP Draft_Product/select_Select ProfileSachins P'), '0', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/LMP Draft_Product/button_Continue'))

not_run: WebUI.delay(3)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/div_Creating Draft Listing...'))

WebUI.verifyElementVisible(findTestObject('LMP Draft_Product/h5_Creating Draft Listing...'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/LMP Draft_Product/h5_Success  Adding to Draft In'), 'Success:  Adding to Draft In progress', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/LMP Draft_Product/select_Select your StorefrontA'), '50', true)

WebUI.selectOptionByValue(findTestObject('LMP Draft_Product/select_Select your Listing Sta'), 'All', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/LMP Draft_Product/select_Select your Listing Sta'), 
    'DRAFT', true)

WebUI.setText(findTestObject('Object Repository/LMP Draft_Product/input_GSIN_form-control ng-val'), 'BRTTA-1P8QRBVB')

WebUI.click(findTestObject('Object Repository/LMP Draft_Product/button_Search'))

WebUI.delay(5)

not_run: WebUI.selectOptionByValue(findTestObject('LMP Draft_Product/select_Select your StorefrontA'), '50', true)

not_run: WebUI.click(findTestObject('LMP Draft_Product/button_Search'))

WebUI.click(findTestObject('Object Repository/LMP Draft_Product/input_Drafted Date_innerTdChec'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('LMP Draft_Product/button_Delete Listing'))

WebUI.click(findTestObject('LMP Draft_Product/button_Delete Listing'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/div_Confirm Delete'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/div_Do you want to delete the'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/button_YES'))

WebUI.click(findTestObject('Object Repository/LMP Draft_Product/button_YES'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/div_Success  Delete Listing Su'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/h5_Success  Delete Listing Suc'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('LMP Draft_Product/h5_Success  Delete Listing Suc'), 'Success:  Delete Listing Successful', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('LMP Draft_Product/span_No results found'))

