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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DELL\\AppData\\Local\\Temp\\Katalon\\Test Cases\\RetailerAdmin_Login_All_Functionality\\Retailer_Employee_management\\employee_Creation_edit_delete\\20181017_201013\\execution.properties')

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

not_run: WebUI.verifyElementVisible(findTestObject('employee_obj_repo/emp_tab'))

not_run: WebUI.click(findTestObject('employee_obj_repo/emp_tab'))

not_run: WebUI.verifyElementVisible(findTestObject('employee_obj_repo/emp_new_button'))

not_run: WebUI.click(findTestObject('employee_obj_repo/emp_new_button'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/employee_obj_repo/Page_AppCohesion/label_Retailer Admin'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/employee_obj_repo/Page_AppCohesion/label_Retailer Admin'), 
    'Retailer Admin')

not_run: WebUI.click(findTestObject('Object Repository/employee_obj_repo/Page_AppCohesion/label_Retailer Admin'))

WebUI.setText(findTestObject('employee_obj_repo/Emp_firstname'), 'NewRetailerKatalon')

WebUI.setText(findTestObject('employee_obj_repo/emp_lastname'), 'NewRetailerKatalon')

int rn_uname

rn_uname = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('employee_obj_repo/emp_username'), 'NewRetailerKatalon' + rn_uname)

int rn_email

rn_email = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('employee_obj_repo/emp_email'), ('snekalatha.r' + rn_email) + '@iinerds.com')

WebUI.comment('Valid email')

WebUI.setText(findTestObject('employee_obj_repo/emp_phonenumber'), '9894591635')

WebUI.click(findTestObject('employee_obj_repo/add_emp_button'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('employee_obj_repo/retailer_employeeview/Page_AppCohesion/collapsible-header_Retailer Ad'))

WebUI.verifyElementVisible(findTestObject('employee_obj_repo/retailer_first_list'))

WebUI.verifyElementVisible(findTestObject('employee_obj_repo/added_employee'))

WebUI.verifyElementText(findTestObject('employee_obj_repo/added_employee'), 'NewRetailerKatalon')

''', 'Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Employee_management/employee_Creation_edit_delete', new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Employee_management/employee_Creation_edit_delete',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
