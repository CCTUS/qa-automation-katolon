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

WebUI.setText(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/input_User Name_ac_username'), 
    'NewRetailerB@7_9')

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), 'NewRetailerB@7_9')

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_Login Now'))

WebUI.click(findTestObject('Retailer_markup_order_placement/Page_AppCohesion/td_Ruger'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/td_Series_addtocart_0'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/span_Ruger LC LCP_glyphicon gl'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/div_Ruger LC LCP'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.doubleClick(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_Ruger LC LCP_decreasequ'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_View Cart'))

WebUI.click(findTestObject('Inventory_Obj_repo/Page_AppCohesion/a_Inventory by Distributor'))

WebUI.click(findTestObject('Inventory_Obj_repo/Page_AppCohesion/div_Inventory'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_View Cart'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/div_Ruger LC LCP (1)'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/a_Back to Cart'))

WebUI.click(findTestObject('Inventory_Obj_repo/Page_AppCohesion/a_Inventory by Distributor'))

WebUI.click(findTestObject('Inventory_Obj_repo/Page_AppCohesion/div_Inventory'))

WebUI.setText(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/input__productname'), 'RUGER-UCSR7GCZ')

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img__searchproduct'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.setText(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/input_Pistols_markup0'), 
    '12.8')

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_AddUpdate'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/p_Markup updated successfully.'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/h4_SUCCESS'))

WebUI.waitForAlert(30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Retailer_markup_order_placement/Page_AppCohesion/span_OK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/span_203.04'))

WebUI.setText(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/input_Pistols_markup0'), 
    '0')

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/div_Ruger LC LCP              _1'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/div_Ruger LC LCP              _2'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_AddUpdate'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/span_OK'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/span_180.00'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/span_UNIT PRICE'))

WebUI.setText(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/input_Pistols_markup0'), 
    '12.8')

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/div_Ruger LC LCP              _3'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_AddUpdate'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/p_Markup updated successfully.'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/h4_SUCCESS'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/span_OK'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_View Cart'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/span_203.04'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/span_UNIT PRICE'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/input_Shopping Cart_sizecb'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/input_Shopping Cart_sizecb'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_Quantity_increasequanti'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_Quantity_decreasequatit'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/input_FIRST NAME_firstName'), 
    'order RUGER-UCSR7GCZ')

WebUI.setText(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/input_EMAIL_email'), 'snekalatha.r@iinerds.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/select_Please Select Any Store'), 
    '385', true)

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/button_Confirm Order'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/div_STORE'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/p_Sorry Order not placed Pleas'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/h4_ERROR'))

WebUI.click(findTestObject('Object Repository/Retailer_markup_order_placement/Page_AppCohesion/span_OK'))

