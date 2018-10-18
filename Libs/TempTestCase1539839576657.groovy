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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\RetailerAdmin_Login_All_Functionality\\order_placement_order_details\\Retailer Markup\\20181018_104256\\execution.properties')

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

not_run: WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('retailer_markup_add/Page_AppCohesion/i_Inventory by Distributor'))

WebUI.click(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/div_Inventory'))

WebUI.setText(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/input__productname'), 'RUGER-UCSR7GCZ')

WebUI.click(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/img__searchproduct'))

WebUI.getText(findTestObject('retailer_markup_add/Page_AppCohesion/input_Pistols_markup0'))

WebUI.verifyNotEqual('', false)

WebUI.setText(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/input_Pistols_markup0'), '12.8')

WebUI.click(findTestObject('Object Repository/retailer_markup_add/Page_AppCohesion/button_AddUpdate'))

WebUI.verifyMatch('SUCCESS', 'SUCCESS', true)

WebUI.verifyMatch('Markup updated successfully.', 'Markup updated successfully.', true)

WebUI.waitForAlert(30)

WebUI.click(findTestObject('retailer_markup_add/Page_AppCohesion/span_OK'))

''', 'Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/Retailer Markup', new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/Retailer Markup',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
