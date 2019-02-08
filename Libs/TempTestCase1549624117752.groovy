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


RunConfiguration.setExecutionSettingFile('C:\\Users\\VILVAN~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\LMP\\LMP_Active_Product\\20190208_163837\\execution.properties')

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

not_run: WebUI.callTestCase(findTestCase('Call Test Case/LMP_login'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/a_Listing ManagementListing Ma'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Draft'))

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/input_GSIN_form-control ng-val'), 
    'BRTTA-9G8LWJMB')

not_run: WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/button_Search'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/input_Drafted Date_innerTdChec'))

not_run: WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/button_Publish Now'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Publishing...'))

not_run: WebUI.delay(5)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/td_Storefront Category is requ'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/td_View Listing'))

not_run: WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/span_View Listing'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Fetching shipping profiles'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Storefront Category is req'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/ul_Storefront Category is requ'))

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

WebUI.delay(5)

WebUI.click(findTestObject('LMP_Active Product/Page_AppCohesion/input_Feb 1 2019 111413 AM_inn'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/button_Publish Now'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/h5_Success  Publishing In Prog'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/h5_Fetching drafted listings..'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/h5_Success  Publishing In Prog'))

''', 'Test Cases/LMP/LMP_Active_Product', new TestCaseBinding('Test Cases/LMP/LMP_Active_Product',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
