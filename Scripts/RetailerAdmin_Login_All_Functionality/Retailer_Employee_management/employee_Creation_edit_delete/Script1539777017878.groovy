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

WebUI.verifyElementVisible(findTestObject('employee_obj_repo/emp_tab'))

WebUI.click(findTestObject('employee_obj_repo/emp_tab'))

WebUI.verifyElementVisible(findTestObject('employee_obj_repo/emp_new_button'))

WebUI.click(findTestObject('employee_obj_repo/emp_new_button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/employee_obj_repo/Page_AppCohesion/label_Retailer Admin'))

WebUI.verifyElementText(findTestObject('Object Repository/employee_obj_repo/Page_AppCohesion/label_Retailer Admin'), 'Retailer Admin')

WebUI.click(findTestObject('Object Repository/employee_obj_repo/Page_AppCohesion/label_Retailer Admin'))

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

WebUI.waitForAlert(10)

WebUI.waitForPageLoad(20)

WebUI.click(findTestObject('employee_obj_repo/retailer_employeeview/Page_AppCohesion/collapsible-header_Retailer Ad'))

WebUI.verifyElementVisible(findTestObject('employee_obj_repo/retailer_first_list'))

WebUI.verifyElementVisible(findTestObject('employee_obj_repo/Page_AppCohesion/li_NewRetailerKatalonNewRetail'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('employee_obj_repo/Page_AppCohesion/h4_NewRetailerKatalonNewRetail'), 'NewRetailerKatalonNewRetailerKatalon', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('employee_obj_repo/Page_AppCohesion/h5_RetailerAdmin'), 'RetailerAdmin')

WebUI.verifyElementText(findTestObject('employee_obj_repo/Page_AppCohesion/h5_snekalatha.r340iinerds.com'), 'snekalatha.r340@iinerds.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('employee_obj_repo/Page_AppCohesion/h5_9894591635'), '9894591635')

WebUI.waitForElementVisible(findTestObject('employee_obj_repo/retailer_first_list'), 30)

WebUI.click(findTestObject('employee_obj_repo/retailer_first_list'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('employee_obj_repo/emp_edit_button'))

WebUI.click(findTestObject('employee_obj_repo/emp_edit_button'))

WebUI.setText(findTestObject('employee_obj_repo/Emp_firstname'), 'EditRetailerKatalon')

WebUI.setText(findTestObject('employee_obj_repo/emp_lastname'), 'EditRetailerKatalon')

WebUI.setText(findTestObject('employee_obj_repo/emp_phonenumber'), '9443225554')

WebUI.click(findTestObject('employee_obj_repo/emp_update_button'))

WebUI.waitForAlert(0)

WebUI.click(findTestObject('employee_obj_repo/retailer_employeeview/Page_AppCohesion/collapsible-header_Retailer Ad'))

WebUI.verifyElementVisible(findTestObject('employee_obj_repo/retailer_first_list'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('employee_obj_repo/retailer_first_list'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('employee_obj_repo/emp_delete_button'), 30, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('employee_obj_repo/emp_delete_button'))

WebUI.click(findTestObject('employee_obj_repo/delete_yes_button'))

WebUI.waitForAlert(0)

WebUI.click(findTestObject('employee_obj_repo/retailer_employeeview/Page_AppCohesion/a_Dashboard              Dashb'))

