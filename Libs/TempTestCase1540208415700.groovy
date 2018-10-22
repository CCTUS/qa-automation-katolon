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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\RetailerAdmin_Login_All_Functionality\\order_placement_order_details\\Retailer Markup\\20181022_171015\\execution.properties')

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

WebUI.waitForPageLoad(20)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/Inventory_tab'))

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/Inventory_tab'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/choose options'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/choose options'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/div_Inventory'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/div_Inventory'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/inventory options'))

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/inventory options'))

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('retailer admin All Repo/inventory retailer markup repo/searchProduct markup'), 'RUGER-UCSR7GCZ')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/search markup icon'))

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/search markup icon'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/product listed'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/add_markupvalue_input'))

WebUI.setText(findTestObject('retailer admin All Repo/inventory retailer markup repo/add_markupvalue_input'), '12.8')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/add_markup button'))

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/add_markup button'))

WebUI.waitForAlert(10)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/common search product'))

WebUI.setText(findTestObject('retailer admin All Repo/inventory retailer markup repo/common search product'), 'RUGER-UCSR7GCZ')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.verifyMatch('Markup updated successfully.', 'Markup updated successfully.', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForAlert(30)

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/span_OK'), 
    FailureHandling.CONTINUE_ON_FAILURE)

''', 'Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/Retailer Markup', new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/Retailer Markup',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
