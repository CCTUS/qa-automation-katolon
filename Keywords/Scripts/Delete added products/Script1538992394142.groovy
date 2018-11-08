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

WebUI.setText(findTestObject('Object Repository/delete_added _products/Page_AppCohesion/input_User Name_ac_username'), 'NewRetailerB@7_9')

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), 'NewRetailerB@7_9')

WebUI.click(findTestObject('Object Repository/delete_added _products/Page_AppCohesion/button_Login Now'))

WebUI.click(findTestObject('Object Repository/delete_added _products/Page_AppCohesion/span_1'))

WebUI.click(findTestObject('Object Repository/delete_added _products/Page_AppCohesion/button_View Cart'))

WebUI.click(findTestObject('Object Repository/delete_added _products/Page_AppCohesion/input_Shopping Cart_sizecb'))

WebUI.click(findTestObject('Object Repository/delete_added _products/Page_AppCohesion/div_406.08_cart-item-removeBut'))

WebUI.click(findTestObject('Object Repository/delete_added _products/Page_AppCohesion/h4_SorryNo Items inside cart'))

WebUI.click(findTestObject('Object Repository/delete_added _products/Page_AppCohesion/a_Log Out'))

WebUI.closeBrowser()

