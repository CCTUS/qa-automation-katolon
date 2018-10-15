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

WebUI.verifyElementVisible(findTestObject('retailer_order_placement/Page_AppCohesion/i_Settings_glyphicon glyphicon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer_order_placement/Page_AppCohesion/i_Settings_glyphicon glyphicon'))

WebUI.setText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_GSIN_form-control ng-unt'), 
    'HCKLR-IHMFX7Z1')

WebUI.setText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_UPC_form-control ng-unto'), 
    '642230250857')

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/button_Search'))

WebUI.rightClick(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/tr_Green Supply'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/div_Heckler  Koch VP VP9'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/strong_534.20'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_Amount Payable534.20'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_176'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/h4_Only 176 left in stock'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/button_View Cart'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/button_Quantity_decreasequatit'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_Shopping Cart_sizecb'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_Shopping Cart_sizecb'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/h5_Heckler  Koch VP VP9'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/a_Back to Cart'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_534.20'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_25.00'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/em_Item selected 1'))

WebUI.rightClick(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_Quantity_quant1'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/button_CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_FIRST NAME_firstName'), 
    'order HCKLR-IHMFX7Z1')

WebUI.setText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_EMAIL_email'), 'snekalatha.r@iinerds.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/select_Please Select Any Store'), 
    '391', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/select_Please Select Any Store'), 
    '397', true)

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/button_Confirm Order'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_534.20'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_25'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_559.20'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_VIEW ORDERS'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/i__glyphicon glyphicon-search'))

WebUI.setText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    'order HCKLR-IHMFX7Z1')

WebUI.sendKeys(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/tr_order HCKLR-IHMFX7Z1'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/h5_559.20'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_Order Total      559.20'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/h5_order HCKLR-IHMFX7Z1'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_Email      snekalatha.rii'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_Name      order HCKLR-IHM'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/th_QUANTITY'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/td_1'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/td_Completed'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_RACreation_close_order_de'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/i__glyphicon glyphicon-search (1)'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/a_Dashboard              Dashb'))

