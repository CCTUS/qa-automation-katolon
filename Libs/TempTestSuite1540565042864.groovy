import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Retailer_test_suite')

suiteProperties.put('name', 'Retailer_test_suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("G:\\automation_katalon\\qa-automation-katolon_new26_10\\Reports\\Retailer_test_suite\\20181026_201402\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Retailer_test_suite', suiteProperties, [new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Employee_management/retailer_employeeView', 'Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Employee_management/retailer_employeeView',  null), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/retaileradmin_order_placement', 'Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/retaileradmin_order_placement',  null), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Product_details/Search Products Details', 'Test Cases/RetailerAdmin_Login_All_Functionality/Product_details/Search Products Details',  null), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Store_managment/Retailer_store_creation_edit_delete', 'Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Store_managment/Retailer_store_creation_edit_delete',  null), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Employee_management/employee_Creation_edit_delete', 'Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Employee_management/employee_Creation_edit_delete',  null), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/Retailer Add Markup', 'Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/Retailer Add Markup',  null)])
