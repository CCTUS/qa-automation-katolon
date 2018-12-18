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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/i_Settings_glyphicon glyphicon'), 
    30)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/common search product'))

WebUI.setText(findTestObject('retailer admin All Repo/inventory retailer markup repo/common search product'), 'HCKLR-IHMFX7Z1')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/i_Settings_glyphicon glyphicon'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_GSIN_form-control ng-unt'), 
    'HCKLR-IHMFX7Z1')

not_run: WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_UPC_form-control ng-unto'), 
    '642230250857')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_Search'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_Search'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/tr_Green Supply'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/tr_Green Supply'), 
    'Green Supply', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/div_Heckler  Koch VP VP9'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/div_Heckler  Koch VP VP9'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/strong_534.20'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/strong_534.20'), 
    '$534.20')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_176'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_176'), 
    '176', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/h4_Only 176 left in stock'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/h4_Only 176 left in stock'), 
    'Only 176 left in stock!')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_ADD TO CART'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_ADD TO CART'))

WebUI.delay(12)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/img'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/increasequantity_cartlist'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/increasequantity_cartlist'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_View Cart'))

WebUI.verifyElementClickable(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_Quantity_decreasequatit'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_Quantity_decreasequatit'))

WebUI.delay(5)

not_run: WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_Shopping Cart_sizecb'), 
    30)

not_run: WebUI.check(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_Shopping Cart_sizecb'))

not_run: WebUI.waitForElementClickable(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_Shopping Cart_sizecb'), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.check(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_Shopping Cart_sizecb'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/h5_Heckler  Koch VP VP9'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/a_Back to Cart'))

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_534.20'), 
    10)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_534.20'), 
    '$534.20')

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_25.00'), 
    10)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_25.00'), 
    '$25.00')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/em_Item selected 1'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/em_Item selected 1'), 
    'Item selected 1')

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_CHECKOUT'))

WebUI.delay(10)

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_FIRST NAME_firstName'), 
    'order HCKLR-IHMFX7Z1')

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_EMAIL_email'), 'snekalatha.r@iinerds.com')

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/select store'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_534.20'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_534.20'), 
    '$534.20')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_25'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_25'), '$25')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_559.20'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_559.20'), 
    '$559.20')

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_Confirm Order'))

WebUI.waitForAlert(5)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/order_status_button'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/order_status_button'), 
    'VIEW ORDERS')

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/order_status_button'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/a_Dashboard              Dashb'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/order_tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/i__glyphicon glyphicon-search'), 
    10)

WebUI.check(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/i__glyphicon glyphicon-search'))

not_run: WebUI.dragAndDropToObject(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    'order HCKLR-IHMFX7Z1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    Keys.chord(Keys.ENTER), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/tr_order HCKLR-IHMFX7Z1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/tr_order HCKLR-IHMFX7Z1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_Order Total      559.20'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_696'), 
    '696', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_559.20'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_559.20'), 
    '$559.20', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_Name      order HCKLR-IHM'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_order HCKLR-IHMFX7Z1'), 
    'order HCKLR-IHMFX7Z1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/span_Email      snekalatha.rii'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_snekalatha.riinerds.com'), 
    'snekalatha.r@iinerds.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/th_QUANTITY'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/td_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/td_1'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/td_Green Supply'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/td_Green Supply'), 
    'Green Supply', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/td_Completed'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/td_Completed'), 
    'Completed', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_RACreation_close_order_de'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_RACreation_close_order_de'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.clearText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

WebUI.check(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/i__glyphicon glyphicon-search'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/a_Dashboard              Dashb'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/a_Dashboard              Dashb'), 
    FailureHandling.CONTINUE_ON_FAILURE)

