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

WebUI.callTestCase(findTestCase('StoreUser/StoreUser Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/i_searching products..._glyphi'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/a_Change Password'))

WebUI.setText(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/input_Old Password_user_old_pa'), 
    'Multstoreuser@123')

WebUI.setText(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/input_New Password_user_new_pa'), 
    'Multstoreuser@123')

WebUI.setText(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/input_Confirm Password_user_co'), 
    'Multstoreuser@123')

WebUI.click(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/button_Change Password'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/span_Your password has been su'))

WebUI.click(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/a_Login now'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/input_User Name_ac_username'), 
    'multstoreuser')

WebUI.setText(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/input_Password_ac_password'), 
    'Multstoreuser@123')

WebUI.click(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/button_Login'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/em_Welcome Mult Store user'))

WebUI.verifyElementText(findTestObject('Object Repository/StoreUser ChangePassword/Page_AppCohesion/em_Welcome Mult Store user'), 
    'Welcome Mult Store user')

WebUI.closeBrowser()

