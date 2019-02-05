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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase_markup'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/input_Settings_common_searchpr'), 
    'ruger')

WebUI.sendKeys(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/input_Settings_common_searchpr'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/td_Ruger Lower Receiver AR'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/div_Ruger Lower Receiver AR'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/button_ADD TO CART'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/span_Base Price75.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/span_Amount Payable75.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/div_ManufacturerRuger'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/button_ADD TO CART'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/ol_Home   Product Detail'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/a_Back to Search'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/a_Back to Search'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/input_Settings_common_searchpr'), 
    'sig')

WebUI.sendKeys(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/input_Settings_common_searchpr'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/i__search_data'))

WebUI.setText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/input_Series_input_1'), 
    'davidson')

WebUI.sendKeys(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/input_Series_input_1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/td_Sig Sauer Nitron Full Size'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/div_Sig Sauer Nitron Full Size'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/span_Base Price424.99'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/span_Amount Payable424.99'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/button_ADD TO CART'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/a_Back to Search'))

WebUI.setText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/input_Settings_common_searchpr'), 
    '%')

WebUI.sendKeys(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/input_Settings_common_searchpr'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/i__search_data'))

WebUI.setText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/input_Series_input_1'), 
    'Ellett')

WebUI.sendKeys(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/input_Series_input_1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/td_Beretta 380 Pico'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/div_At only 18mm wide the Pico'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/p_At only 18mm wide the Pico i'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/ul_Product Specifications'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/button_ADD TO CART'))

