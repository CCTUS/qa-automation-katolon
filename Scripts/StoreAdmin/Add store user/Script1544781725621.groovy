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

WebUI.callTestCase(findTestCase('Call Test Case/StoreAdmin Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/i_Employees'))

WebUI.click(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/button_ADD EMPLOYEE'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/input_FIRST NAME_firstName'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/input_LAST NAME_lastName'), 'Store user')

WebUI.setText(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/input_USER NAME_userName'), 'katalonstoreuser')

WebUI.setText(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/input_EMAIL ID_emailId'), 'katalonstoreuser@getnada.com')

WebUI.setText(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/input_PHONE NUMBER_phoneNumber'), 
    '(798) 798-7987')

WebUI.selectOptionByValue(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/select_2018-11-29T101243.035Z'), 
    '621', true)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/button_ADD EMPLOYEE_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/h5_Success  Congratulations Yo'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/collapsible-header_Store Users'))

WebUI.click(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/a_KatalonStore user'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/button_Edit'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/input_LAST NAME_lastName'), 'Store user edit')

WebUI.click(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/button_Update'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/div_Success  User details succ'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/collapsible-header_Store Users'))

WebUI.click(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/a_KatalonStore user edit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/button_Delete'))

WebUI.click(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/button_YES'))

WebUI.verifyElementVisible(findTestObject('Object Repository/StoreUser AddEditDelete/Page_AppCohesion/div_Success  User details has'))

