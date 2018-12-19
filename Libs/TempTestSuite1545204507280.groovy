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


suiteProperties.put('id', 'Test Suites/Appco_test_suite')

suiteProperties.put('name', 'Appco_test_suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Snekalatha R\\git\\QA-KatalonNew\\Reports\\Appco_test_suite\\20181219_125827\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Appco_test_suite', suiteProperties, [new TestCaseBinding('Test Cases/AppcoAdmin/add_RA_MultipleDistributor', 'Test Cases/AppcoAdmin/add_RA_MultipleDistributor',  null), new TestCaseBinding('Test Cases/AppcoAdmin/add_retailer_Appco', 'Test Cases/AppcoAdmin/add_retailer_Appco',  null), new TestCaseBinding('Test Cases/AppcoAdmin/Appco Login', 'Test Cases/AppcoAdmin/Appco Login',  null), new TestCaseBinding('Test Cases/AppcoAdmin/Appco_employeeView', 'Test Cases/AppcoAdmin/Appco_employeeView',  null), new TestCaseBinding('Test Cases/AppcoAdmin/Appco_employee_Creation_edit_delete', 'Test Cases/AppcoAdmin/Appco_employee_Creation_edit_delete',  null), new TestCaseBinding('Test Cases/AppcoAdmin/retailer edit', 'Test Cases/AppcoAdmin/retailer edit',  null), new TestCaseBinding('Test Cases/AppcoAdmin/Appco_store_creation_edit_delete', 'Test Cases/AppcoAdmin/Appco_store_creation_edit_delete',  null), new TestCaseBinding('Test Cases/AppcoAdmin/delete_retailer', 'Test Cases/AppcoAdmin/delete_retailer',  null), new TestCaseBinding('Test Cases/AppcoAdmin/Order listing_details', 'Test Cases/AppcoAdmin/Order listing_details',  null), new TestCaseBinding('Test Cases/AppcoAdmin/Appco_markup', 'Test Cases/AppcoAdmin/Appco_markup',  null)])