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

WebUI.rightClick(findTestObject('Object Repository/store_delet/Page_AppCohesion/input_User Name_ac_username'))

WebUI.setText(findTestObject('Object Repository/store_delet/Page_AppCohesion/input_User Name_ac_username'), 'NewRetailerB@7_9')

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), 'NewRetailerB@7_9')

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/button_Login Now'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/a_Stores              Stores'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/div_FFL                      N'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/button_Delete'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/p_You have selected default st'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/span_OK'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/input_Not Available_myRadioBut'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/div_New Retailer'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/span_Store Address_placeMyOrde'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/div_New Retailer'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/button_Delete'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/button_YES'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/h4_SUCCESS'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/p_Store has been deleted succe'))

WebUI.click(findTestObject('Object Repository/store_delet/Page_AppCohesion/span_OK'))

