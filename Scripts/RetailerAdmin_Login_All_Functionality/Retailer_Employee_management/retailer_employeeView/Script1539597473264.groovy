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

WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/strong_5'))

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/a_Employees              Emplo'))

WebUI.verifyElementVisible(findTestObject('appco_employee_view_new/retailer_employeeview/Page_AppCohesion/collapsible-header_Retailer Ad'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/collapsible-header_Retailer Ad'))

WebUI.click(findTestObject('retailer admin All Repo/employee_obj_repo/employee_listed_first'))

WebUI.waitForElementVisible(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_RetailerAdmin'), 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_RetailerAdmin'), 
    'RetailerAdmin')

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_Loading POS Retailer admi'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/collapsible-header_Retailer Ad'))

WebUI.click(findTestObject('employee_obj_repo/retailer_employeeview/Page_AppCohesion/collapsible-header_Store Admin'))

WebUI.click(findTestObject('employee_obj_repo/store admin list first'))

WebUI.waitForElementVisible(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_StoreAdmin'), 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_StoreAdmin'), 
    'StoreAdmin')

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_Loading POS Retailer admi'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/collapsible-header_Store Admin'))

WebUI.click(findTestObject('retailer admin All Repo/employee_obj_repo/store user collapsible'))

WebUI.click(findTestObject('employee_obj_repo/storeuser_listed_first'))

WebUI.waitForElementVisible(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_POSUser'), 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_POSUser'), 
    'POSUser')

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_Loading POS Retailer admi'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/collapsible-header_Store Users'))

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/a_Dashboard              Dashb'))

