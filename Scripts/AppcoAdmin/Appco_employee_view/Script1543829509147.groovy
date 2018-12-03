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

WebUI.callTestCase(findTestCase('Call Test Case/Login_Appco_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/Page_AppCohesion/a_Employees              Emplo'))

WebUI.waitForPageLoad(50)

WebUI.click(findTestObject('retaileradminview'))

WebUI.verifyElementText(findTestObject('employee_view_roletype'), 'RetailerAdmin')

WebUI.click(findTestObject('close_employee_drawer'))

WebUI.waitForPageLoad(50)

not_run: WebUI.click(findTestObject('retaileradminview'))

WebUI.dragAndDropToObject(findTestObject('appco_employee_view_new/Page_AppCohesion/collapsible-header_Store Admin (1)'), 
    findTestObject('appco_employee_view_new/Page_AppCohesion/collapsible-header_Store Admin (1)'))

WebUI.click(findTestObject('appco_employee_view_new/Page_AppCohesion/collapsible-header_Store Admin (1)'))

WebUI.waitForPageLoad(50)

WebUI.dragAndDropToObject(findTestObject('appco_employee_view_new/Page_AppCohesion/collapsible-header_Store Users'), findTestObject(
        'appco_employee_view_new/Page_AppCohesion/collapsible-header_Store Users'))

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/Page_AppCohesion/collapsible-header_Store Users'))

WebUI.waitForPageLoad(50)

WebUI.dragAndDropToObject(findTestObject('appco_employee_view_new/Page_AppCohesion/collapsible-header_POS Retaile'), findTestObject(
        'appco_employee_view_new/Page_AppCohesion/collapsible-header_POS Retaile'))

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/Page_AppCohesion/collapsible-header_POS Retaile'))

WebUI.waitForPageLoad(50)

WebUI.dragAndDropToObject(findTestObject('appco_employee_view_new/Page_AppCohesion/collapsible-header_POS System'), findTestObject(
        'appco_employee_view_new/Page_AppCohesion/collapsible-header_POS System'))

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/Page_AppCohesion/collapsible-header_POS System'))

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/appco_employee_view_new/Page_AppCohesion/a_Log Out'))

WebUI.closeBrowser()

