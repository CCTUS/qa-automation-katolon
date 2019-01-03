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

WebUI.callTestCase(findTestCase('Call Test Case/Login_Appco_testcase-QA - new url'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/strong_5'))

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/a_Employees              Emplo'))

WebUI.delay(10)

WebUI.click(findTestObject('retailer admin All Repo/employee_obj_repo/pop up emp object/Page_AppCohesion/collapsible-header_Retailer Ad'))

WebUI.click(findTestObject('retailer admin All Repo/employee_obj_repo/employee_listed_first'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_RetailerAdmin'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_RetailerAdmin'), 
    'RetailerAdmin')

not_run: WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_Loading POS Retailer admi'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/employee_obj_repo/pop up emp object/Page_AppCohesion/collapsible-header_Retailer Ad'))

WebUI.delay(5)

WebUI.click(findTestObject('retailer admin All Repo/employee_obj_repo/pop up emp object/Page_AppCohesion/collapsible-header_Store Admin'))

WebUI.click(findTestObject('employee_obj_repo/store admin list first'))

WebUI.delay(3)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_StoreAdmin'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_StoreAdmin'), 
    'StoreAdmin')

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_Loading POS Retailer admi'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/employee_obj_repo/pop up emp object/Page_AppCohesion/collapsible-header_Store Admin'))

WebUI.delay(5)

WebUI.click(findTestObject('retailer admin All Repo/employee_obj_repo/retailer_employeeview/Page_AppCohesion/collapsible-header_Store Users'))

WebUI.click(findTestObject('employee_obj_repo/storeuser_listed_first'))

WebUI.delay(3)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_POSUser'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_POSUser'), 
    'POSUser')

not_run: WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/span_Loading POS Retailer admi'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/employee_obj_repo/pop up emp object/Page_AppCohesion/collapsible-header_Store Users'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Appco Login/employee repo/collapsible-header_POS Retaile'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/employee repo/h5_POSRetailerAdmin'))

not_run: WebUI.dragAndDropToObject(findTestObject('Appco Login/employee repo/li_multepicormultepicormultepi'), findTestObject(
        'Appco Login/employee repo/li_multepicormultepicormultepi'))

WebUI.click(findTestObject('Appco Login/employee repo/li_NewRetailerPOSNew Retailer'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Appco Login/employee repo/span_POSRetailerAdmin'), 'POSRetailerAdmin')

WebUI.click(findTestObject('Appco Login/employee repo/collapsible-header_POS Retaile'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/retailer_employeeview/Page_AppCohesion/a_Dashboard              Dashb'))

