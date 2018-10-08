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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/input_User Name_ac_username'), 'NewRetailerB@7_9')

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), 'NewRetailerB@7_9')

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/button_Login Now'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/a_Dashboard              Dashb'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/td_Ruger'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/div_Ruger LC LCP'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/span_Base Price180.00'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/button_ADD TO CART'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/span_180.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/a_Inventory by Distributor'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/div_Inventory'))

WebUI.setText(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/input__productname'), 'RUGER-UCSR7GCZ')

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/img__searchproduct'))

WebUI.setText(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/input_Pistols_markup0'), '12.8')

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/button_AddUpdate'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/div_SUCCESS    Markup updated'))

WebUI.waitForAlert(30)

WebUI.click(findTestObject('Orderplaced_RM/Page_AppCohesion/span_OK'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/button_View Cart'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/h5_Ruger LC LCP'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/span_Retailer Markup12.80'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/span_Amount Payable203.04'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/a_Back to Cart'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/span_Quantity_glyphicon glyphi'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/div_2                Item(s)'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/span_2'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/div_Sub Total'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/div_Shipping Cost'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/button_CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/input_FIRST NAME_firstName'), 'order RUGER-UCSR7GCZ RM')

WebUI.setText(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/input_EMAIL_email'), 'snekalatha.r@iinerds.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/select_Please Select Any Store'), 
    '445', true)

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/button_Confirm Order'))

WebUI.click(findTestObject('Object Repository/Orderplaced_RM/Page_AppCohesion/span_OK'))

