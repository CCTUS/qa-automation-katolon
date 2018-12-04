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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://app-qa.appcohesion.io/')

WebUI.setText(findTestObject('Object Repository/Appco Login/Page_AppCohesion/input_User Name_ac_username'), 'multstoreuser')

WebUI.setText(findTestObject('Object Repository/Appco Login/Page_AppCohesion/input_Password_ac_password'), 'Multstoreuser@123')

WebUI.click(findTestObject('Object Repository/Appco Login/Page_AppCohesion/button_Login'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('StoreUser login/Page_AppCohesion/em_Welcome Mult Store user'))

WebUI.verifyElementText(findTestObject('StoreUser login/Page_AppCohesion/em_Welcome Mult Store user'), 'Welcome Mult Store user')

