import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\RetailerAdmin_Login_All_Functionality\\order_placement_order_details\\order placement verify markup cart\\20181024_140041\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/common search product'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/inventory retailer markup repo/common search product'), 'HCKLR-IHMFX7Z1')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/td_Heckler  Koch VP VP9'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/td_Heckler  Koch VP VP9'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/h2_Heckler  Koch VP VP9'), 
    'Heckler & Koch VP VP9')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_Manufacturer Part NumberM'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/strong_M700009A5'), 
    'M700009A5')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_ManufacturerHeckler  Koch'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/strong_Heckler  Koch'), 
    'Heckler & Koch')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_DistributorGreen Supply'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/strong_Green Supply'), 
    'Green Supply')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_UPC642230250857'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/strong_642230250857'), 
    '642230250857')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/strong_534.20'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/strong_534.20'), 
    '$534.20')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_176'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_176'), 
    '176')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/h4_Only 176 left in stock'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/h4_Only 176 left in stock'), 
    'Only 176 left in stock!')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_ADD TO CART'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_ADD TO CART'))

not_run: WebUI.delay(20)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/img'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/img'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_534.20'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_534.20'), 
    '$534.20')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/Inventory_tab'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/Inventory_tab'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/choose options'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/choose options'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/input__markup_searchproduct'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/input__markup_searchproduct'), 
    'HCKLR-IHMFX7Z1')

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/img__markupsearch_icon'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/input_Pistols_markup0'), 
    '15.8')

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/button_AddUpdate'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/h5_Success  Markup updated suc'), 
    'Success: Markup updated successfully.')

not_run: WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/img'), 
    30)

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/img'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_UNIT PRICE'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_618.60'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_618.60'), 
    '$618.60')

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/button_View Cart'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/h5_Heckler  Koch VP VP9'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_Price'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/h6_618.60'), 
    '$618.60')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_Sub Total'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/h6_618.60'), 
    '$618.60')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/h3_Order Summary'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/h3_Order Summary'), 
    'Order Summary')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_Shipping Cost'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_Shipping Cost'), 
    'Shipping Cost')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_25.00'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_25.00'), 
    '$25.00')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_618.60'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/span_618.60'), 
    '$618.60')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_25.00'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/span_25.00'), 
    '$25.00')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/em_Item selected 1'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/ordersummary_repo/em_Item selected 1'), 
    'Item selected 1')

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_CHECKOUT'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_FIRST NAME_firstName'), 
    'order HCKLR-IHMFX7Z1')

not_run: WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_EMAIL_email'), 
    'snekalatha.r@iinerds.com')

not_run: WebUI.selectOptionByIndex(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/select_Please Select Any Store'), 
    '1', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_Confirm Order'))

not_run: WebUI.waitForAlert(30)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/order_status_button'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/order_status_button'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/i__glyphicon glyphicon-search'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/i__glyphicon glyphicon-search'))

not_run: WebUI.dragAndDropToObject(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    'order HCKLR-IHMFX7Z1')

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    30)

WebUI.sendKeys(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/tr_order HCKLR-IHMFX7Z1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/tr_order HCKLR-IHMFX7Z1'))

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

''', 'Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/order placement verify markup cart', new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/order placement verify markup cart',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
