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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\New Test Case\\20181212_153845\\execution.properties')

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

not_run: WebUI.callTestCase(findTestCase('Call Test Case/Login_Appco_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer Edit/a_Dashboard              Dashb'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer Edit/a_Retailers              Retai'))

not_run: WebUI.click(findTestObject('Object Repository/retailer Edit/a_Retailers              Retai'))

not_run: WebUI.delay(5)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer Edit/div_Inventory'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer Edit/h4_AAA RA MD'))

not_run: WebUI.click(findTestObject('Object Repository/retailer Edit/div_Inventory'))

not_run: WebUI.delay(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer Edit/button_Edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/retailer Edit/button_Edit'))

WebUI.setText(findTestObject('Object Repository/retailer Edit/input_RETAILER NAME_retailerNa'), 'AAA RA MD new')

WebUI.setText(findTestObject('Object Repository/retailer Edit/input_RETAILER ADDRESS 1_retai'), '9/10, New QA Build edit')

WebUI.setText(findTestObject('Object Repository/retailer Edit/input_RETAILER ADDRESS 2_retai'), '11/28, New Street lane new')

WebUI.setText(findTestObject('Object Repository/retailer Edit/input_ZIP CODE_zip'), '45733')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer Edit/h4_Inventory Info'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer Edit/select_AppCoSSGreen SupplyDavi'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer Edit/button_Remove'))

''', 'Test Cases/New Test Case', new TestCaseBinding('Test Cases/New Test Case',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
