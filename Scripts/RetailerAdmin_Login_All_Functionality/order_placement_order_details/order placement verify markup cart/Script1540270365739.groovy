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

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/common search product'))

WebUI.setText(findTestObject('retailer admin All Repo/inventory retailer markup repo/common search product'), 'HCKLR-IHMFX7Z1')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/td_Heckler  Koch VP VP9'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/td_Heckler  Koch VP VP9'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/h2_Heckler  Koch VP VP9'), 
    'Heckler & Koch VP VP9')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_Manufacturer Part NumberM'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/strong_M700009A5'), 
    'M700009A5')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_ManufacturerHeckler  Koch'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/strong_Heckler  Koch'), 
    'Heckler & Koch')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_DistributorGreen Supply'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/strong_Green Supply'), 
    'Green Supply')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_UPC642230250857'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/strong_642230250857'), 
    '642230250857')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/strong_534.20'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/strong_534.20'), 
    '$534.20')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_176'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_176'), '176')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/h4_Only 176 left in stock'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/h4_Only 176 left in stock'), 
    'Only 176 left in stock!')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_ADD TO CART'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_ADD TO CART'))

WebUI.delay(20)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/img'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/img'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_534.20'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_534.20'), 
    '$534.20')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/Inventory_tab'))

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/Inventory_tab'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/choose options'))

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/choose options'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/input__markup_searchproduct'))

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/input__markup_searchproduct'), 
    'HCKLR-IHMFX7Z1')

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/img__markupsearch_icon'))

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/input_Pistols_markup0'), 
    '15.8')

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/button_AddUpdate'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/h5_Success  Markup updated suc'), 
    'Success: Markup updated successfully.')

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/img'), 30)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/img'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_UNIT PRICE'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_618.60'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_618.60'), 
    '$618.60')

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/button_View Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/h5_Heckler  Koch VP VP9'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_Price'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/h6_618.60'), 
    '$618.60')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_Sub Total'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/h6_618.60'), 
    '$618.60')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/h3_Order Summary'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/h3_Order Summary'), 
    'Order Summary')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_Shipping Cost'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_Shipping Cost'), 
    'Shipping Cost')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_25.00'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_25.00'), 
    '$25.00')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_618.60'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_618.60'), 
    '$618.60')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_25.00'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_25.00'), 
    '$25.00')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/em_Item selected 1'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/em_Item selected 1'), 
    'Item selected 1')

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_CHECKOUT'))

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_FIRST NAME_firstName'), 
    'order HCKLR-IHMFX7Z1')

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_EMAIL_email'), 'snekalatha.r@iinerds.com')

WebUI.selectOptionByValue(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/select_Please Select Any Store'), 
    '391', true)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_618.60'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_618.60'), 
    '$534.20')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_25'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_25'), '$25')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_643.60'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_643.60'), 
    '$643.60')

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_Confirm Order'))

WebUI.waitForAlert(30)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_VIEW ORDERS'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_VIEW ORDERS'), 
    'VIEW ORDERS')

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_VIEW ORDERS'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/i__glyphicon glyphicon-search'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/i__glyphicon glyphicon-search'))

WebUI.dragAndDropToObject(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    findTestObject('retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'))

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    'order HCKLR-IHMFX7Z1')

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    30)

WebUI.sendKeys(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/tr_order HCKLR-IHMFX7Z1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/tr_order HCKLR-IHMFX7Z1'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/span_Order Total      559.20'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_696'), 
    '696')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_559.20'))

WebUI.verifyElementText(findTestObject('retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_559.20'), '$559.20')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/span_Name      order HCKLR-IHM'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_order HCKLR-IHMFX7Z1'), 
    'order HCKLR-IHMFX7Z1')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/span_Email      snekalatha.rii'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_snekalatha.riinerds.com'), 
    'snekalatha.r@iinerds.com')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/th_QUANTITY'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/td_1'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/td_1'), '1')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/td_Green Supply'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/td_Green Supply'), 
    'Green Supply')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/td_Completed'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/td_Completed'), 
    'Completed')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/span_RACreation_close_order_de'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/span_RACreation_close_order_de'))

WebUI.dragAndDropToObject(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/close_search_icon'), 
    findTestObject('retailer_order_placement/key_press_orderList/Page_AppCohesion/close_search_icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/close_search_icon'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/close_search_icon'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/a_Dashboard              Dashb'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/a_Dashboard              Dashb'))

