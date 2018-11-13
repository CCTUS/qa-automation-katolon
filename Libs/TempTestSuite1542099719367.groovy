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



RunConfiguration.setExecutionSettingFile("C:\\Users\\Snekalatha R\\git\\qa-automation-katolon-1\\Reports\\Retailer_test_suite\\20181113_143159\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Retailer_test_suite', suiteProperties, [new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Employee_management/retailer_employeeView', 'Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Employee_management/retailer_employeeView',  null), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/retaileradmin_order_placement', 'Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/retaileradmin_order_placement',  null), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Product_details/search_products_details_datafile - Iteration 1', 'Test Cases/RetailerAdmin_Login_All_Functionality/Product_details/search_products_details_datafile',  [ 'gsin' : 'RUGER-UCSR7GCZ' , 'quantity' : '25' , 'description' : 'Ruger LC LCP' , 'baseprice' : '$180.00' , 'manufacturerpartno' : '3701' , 'amt' : '$203.04' , 'distributor' : 'SS' , 'upc' : '736676037018' , 'retailermarkup' : '12.80%' , 'manufacturer' : 'Ruger' ,  ]), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Product_details/search_products_details_datafile - Iteration 2', 'Test Cases/RetailerAdmin_Login_All_Functionality/Product_details/search_products_details_datafile',  [ 'gsin' : 'THMPS-TUIPSIUJ' , 'quantity' : '1' , 'description' : 'Thompson Center Compass' , 'baseprice' : '$305.91' , 'manufacturerpartno' : '10072' , 'amt' : '$305.91' , 'distributor' : 'Green Supply' , 'upc' : '90161447936' , 'retailermarkup' : '0.00%' , 'manufacturer' : 'Thompson Center' ,  ]), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Product_details/search_products_details_datafile - Iteration 3', 'Test Cases/RetailerAdmin_Login_All_Functionality/Product_details/search_products_details_datafile',  [ 'gsin' : 'SGSAR-T678CLPI' , 'quantity' : '88' , 'description' : 'Sig Sauer P938 P938' , 'baseprice' : '$209.00' , 'manufacturerpartno' : '9389BRGAMBI' , 'amt' : '$209.00' , 'distributor' : 'Ellet' , 'upc' : '798681443352' , 'retailermarkup' : '0.00%' , 'manufacturer' : 'Sig Sauer' ,  ]), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Product_details/search_products_details_datafile - Iteration 4', 'Test Cases/RetailerAdmin_Login_All_Functionality/Product_details/search_products_details_datafile',  [ 'gsin' : 'BNDRM-3TJZ4D5G' , 'quantity' : '9' , 'description' : 'Bond Arms Defender Texas Defender' , 'baseprice' : '$389.99' , 'manufacturerpartno' : 'BATD45410' , 'amt' : '$389.99' , 'distributor' : 'Davidson' , 'upc' : '855959001017' , 'retailermarkup' : '0.00%' , 'manufacturer' : 'Bond Arms' ,  ]), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Product_details/Search Products Details', 'Test Cases/RetailerAdmin_Login_All_Functionality/Product_details/Search Products Details',  null), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Store_managment/Retailer_store_creation_edit_delete', 'Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Store_managment/Retailer_store_creation_edit_delete',  null), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Employee_management/employee_Creation_edit_delete', 'Test Cases/RetailerAdmin_Login_All_Functionality/Retailer_Employee_management/employee_Creation_edit_delete',  null), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/Retailer Add Markup', 'Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/Retailer Add Markup',  null), new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Menu list/Menu_profile_rule_change_pwd', 'Test Cases/RetailerAdmin_Login_All_Functionality/Menu list/Menu_profile_rule_change_pwd',  null)])
