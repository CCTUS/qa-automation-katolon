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

WebUI.verifyElementVisible(findTestObject('Appco Login/Appco_Markup/div_Inventory'))

WebUI.verifyElementVisible(findTestObject('Appco Login/Appco_Markup/span_Inventory'))

WebUI.click(findTestObject('Appco Login/Appco_Markup/span_Inventory'))

WebUI.verifyElementVisible(findTestObject('Appco Login/Appco_Markup/a_Inventory'))

WebUI.click(findTestObject('Appco Login/Appco_Markup/a_Inventory'))

WebUI.delay(3)

WebUI.setText(findTestObject('Appco Login/Appco_Markup/input__markup_searchproduct'), 'RUGER-UCSR7GCZ')

WebUI.click(findTestObject('Appco Login/Appco_Markup/img__markupsearch_icon'))

WebUI.delay(5)

WebUI.setText(findTestObject('Appco Login/Appco_Markup/input_Pistols_markup0'), '123.67')

WebUI.click(findTestObject('Appco Login/Appco_Markup/button_AddUpdate'))

WebUI.verifyElementVisible(findTestObject('Appco Login/Appco_Markup/h3_Store Tester'))

WebUI.click(findTestObject('Page_AppCohesion/h3_Store Tester'))

WebUI.click(findTestObject('Appco Login/Appco_Markup/a_Log Out'))

WebUI.delay(5)

WebUI.setText(findTestObject('Appco Login/Appco_Markup/input_User Name_ac_username'), 'AAARetailerMD@17_12')

WebUI.setText(findTestObject('Page_AppCohesion/input_Password_ac_password'), 'AAARetailerMD@17_12')

WebUI.click(findTestObject('Appco Login/Appco_Markup/button_Login'))

WebUI.setText(findTestObject('Appco Login/Appco_Markup/input_Invoice_common_searchpro'), 'RUGER-UCSR7GCZ')

WebUI.click(findTestObject('Appco Login/Appco_Markup/i_Invoice_glyphicon glyphicon-'))

