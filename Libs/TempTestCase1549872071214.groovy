import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\LMP\\LMP_Draft_Product\\20190211_133111\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.callTestCase(findTestCase('LMP/LMP_login'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/a_Listing ManagementListing Ma'))

not_run: WebUI.click(findTestObject('LMP Draft_Product/a_Listing ManagementListing Ma'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/LMP Draft_Product/div_Overview'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/td_BRTTA-9G8LWJMB'))

not_run: WebUI.setText(findTestObject('Object Repository/LMP Draft_Product/input_GSIN_form-control ng-unt'), 'BRTTA-1P8QRBVB')

not_run: WebUI.click(findTestObject('Object Repository/LMP Draft_Product/button_Search'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/LMP Draft_Product/input_Not Listed On_innerTdChe'))

not_run: WebUI.click(findTestObject('Object Repository/LMP Draft_Product/div_Create Draft Listing'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/span_ROHITHS STOREFRONT'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/LMP Draft_Product/span_ROHITHS STOREFRONT'))

not_run: WebUI.delay(3)

not_run: WebUI.selectOptionByIndex(findTestObject('Object Repository/LMP Draft_Product/select_Select ProfileSachins P'), 
    '0', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/LMP Draft_Product/button_Continue'))

not_run: WebUI.delay(3)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/div_Creating Draft Listing...'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/h5_Creating Draft Listing...'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/LMP Draft_Product/h5_Success  Adding to Draft In'), 'Success:  Adding to Draft In progress', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/LMP Draft_Product/select_Select your StorefrontA'), 
    '50', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/LMP Draft_Product/select_Select your Listing Sta'), 
    'DRAFT', true)

not_run: WebUI.setText(findTestObject('Object Repository/LMP Draft_Product/input_GSIN_form-control ng-val'), 'BRTTA-1P8QRBVB')

not_run: WebUI.click(findTestObject('Object Repository/LMP Draft_Product/button_Search'))

not_run: WebUI.selectOptionByValue(findTestObject('LMP Draft_Product/select_Select your StorefrontA'), '50', true)

not_run: WebUI.selectOptionByValue(findTestObject('LMP Draft_Product/select_Select your Listing Sta'), 'All', true)

not_run: WebUI.click(findTestObject('LMP Draft_Product/button_Search'))

not_run: WebUI.click(findTestObject('Object Repository/LMP Draft_Product/input_Drafted Date_innerTdChec'))

WebUI.verifyElementVisible(findTestObject('LMP Draft_Product/button_Delete Listing'))

WebUI.click(findTestObject('LMP Draft_Product/button_Delete Listing'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/div_Confirm Delete'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/div_Do you want to delete the'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP Draft_Product/button_YES'))

WebUI.click(findTestObject('Object Repository/LMP Draft_Product/button_YES'))

''', 'Test Cases/LMP/LMP_Draft_Product', new TestCaseBinding('Test Cases/LMP/LMP_Draft_Product',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
