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

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('appco_employee_view_new/retailer_employeeview/Page_AppCohesion/strong_5'))

not_run: WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employee_view/Page_AppCohesion/a_Employees              Emplo'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('appco_employee_view_new/retailer_employeeview/Page_AppCohesion/collapsible-header_Retailer Ad'))

WebUI.verifyElementVisible(findTestObject('Object Repository/appco_employee_view_new/retailer_employee_view/Page_AppCohesion/li_chkemailchkemail'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employee_view/Page_AppCohesion/li_chkemailchkemail'))

WebUI.verifyElementVisible(findTestObject('appco_employee_view_new/Page_AppCohesion/span_RetailerAdmin'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('appco_employee_view_new/Page_AppCohesion/span_RetailerAdmin'), 'RetailerAdmin')

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employee_view/Page_AppCohesion/span_Loading POS Retailer admi'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employee_view/Page_AppCohesion/collapsible-header_Retailer Ad'))

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employee_view/Page_AppCohesion/collapsible-header_Store Admin'))

WebUI.click(findTestObject('appco_employee_view_new/Page_AppCohesion/li_SACreationSACreation'))

WebUI.verifyElementVisible(findTestObject('appco_employee_view_new/retailer_employee_view/Page_AppCohesion/span_StoreAdmin'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('appco_employee_view_new/retailer_employee_view/Page_AppCohesion/span_StoreAdmin'), 
    'StoreAdmin')

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employee_view/Page_AppCohesion/span_Loading POS Retailer admi'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employee_view/Page_AppCohesion/collapsible-header_Store Admin'))

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employee_view/Page_AppCohesion/collapsible-header_Store Users'))

WebUI.waitForPageLoad(30, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('appco_employee_view_new/retailer_employeeview/Page_AppCohesion/li_SUCreationSUCreation'))

WebUI.verifyElementVisible(findTestObject('appco_employee_view_new/retailer_employee_view/Page_AppCohesion/span_POSUser'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('appco_employee_view_new/retailer_employee_view/Page_AppCohesion/span_POSUser'), 
    'POSUser')

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employee_view/Page_AppCohesion/span_Loading POS Retailer admi'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employee_view/Page_AppCohesion/collapsible-header_Store Users'))

WebUI.click(findTestObject('appco_employee_view_new/Page_AppCohesion/dashboard_component'))

