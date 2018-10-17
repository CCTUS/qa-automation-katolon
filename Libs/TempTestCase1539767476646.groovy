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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DELL\\AppData\\Local\\Temp\\Katalon\\Test Cases\\RetailerAdmin_Login_All_Functionality\\Retailer_Store_managment\\Retailer_store_creation_edit_delete\\20181017_144116\\execution.properties')

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

not_run: WebUI.click(findTestObject('store_object_repo/store_tab'))

not_run: WebUI.click(findTestObject('store_object_repo/store_new_button'))

not_run: WebUI.setText(findTestObject('store_object_repo/store_name'), 'RACreation Store')

not_run: WebUI.setText(findTestObject('store_object_repo/FFL_no'), '1539763730214')

not_run: WebUI.uploadFile(findTestObject('store_object_repo/FFL_doc'), 'D:\\\\sample_doc\\\\sample.pdf', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.uploadFile(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/label_Choose a file'), 'D:\\\\sample_doc\\\\sample.pdf', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('store_object_repo/store_address'), '3/10, New QA Build')

not_run: WebUI.setText(findTestObject('store_object_repo/zip_code'), '24143')

not_run: WebUI.setText(findTestObject('store_object_repo/city_name'), 'Newton Falls')

not_run: WebUI.setText(findTestObject('store_object_repo/state_name'), 'Ohio')

WebUI.dragAndDropToObject(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/span_Default Store_checkmark'), 
    findTestObject('retailer_creation_Storecreation/Page_AppCohesion/span_Default Store_checkmark'))

WebUI.click(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/span_Default Store_checkmark'))

WebUI.click(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/button_ADD STORE'))

WebUI.verifyElementText(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/p_Store created successfully.'), 
    'Store created successfully.', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/h4_SUCCESS'), 'SUCCESS', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/span_OK'))

''', 'Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Store_managment/Retailer_store_creation_edit_delete', new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Store_managment/Retailer_store_creation_edit_delete',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
