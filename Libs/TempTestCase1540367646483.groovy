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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\RetailerAdmin_Login_All_Functionality\\order_placement_order_details\\retaileradmin_order_placement\\20181024_132406\\execution.properties')

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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/i_Settings_glyphicon glyphicon'), 
    30)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/common search product'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/inventory retailer markup repo/common search product'), 'HCKLR-IHMFX7Z1')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

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
    'Green Supply')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/div_Heckler  Koch VP VP9'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/div_Heckler  Koch VP VP9'), 
    FailureHandling.CONTINUE_ON_FAILURE)

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

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/img'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/img'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/increasequantity_cartlist'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/increasequantity_cartlist'))

not_run: WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_View Cart'))

not_run: WebUI.verifyElementClickable(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_Quantity_decreasequatit'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_Quantity_decreasequatit'))

not_run: WebUI.delay(5)

not_run: WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_Shopping Cart_sizecb'), 
    30)

not_run: WebUI.check(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_Shopping Cart_sizecb'))

not_run: WebUI.waitForElementClickable(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_Shopping Cart_sizecb'), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.check(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_Shopping Cart_sizecb'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/h5_Heckler  Koch VP VP9'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/a_Back to Cart'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_534.20'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_534.20'), 
    '$534.20')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_25.00'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_25.00'), 
    '$25.00')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/em_Item selected 1'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/em_Item selected 1'), 
    'Item selected 1')

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_CHECKOUT'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_FIRST NAME_firstName'), 
    'order HCKLR-IHMFX7Z1')

not_run: WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_EMAIL_email'), 
    'snekalatha.r@iinerds.com')

WebUI.selectOptionByValue(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/select_Please Select Any Store'), 
    '391', true)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_534.20'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_534.20'), 
    '$534.20')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_25'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_25'), '$25')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_559.20'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_559.20'), 
    '$559.20')

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/button_Confirm Order'))

WebUI.waitForAlert(30)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_VIEW ORDERS'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_VIEW ORDERS'), 
    'VIEW ORDERS')

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_VIEW ORDERS'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/i__glyphicon glyphicon-search'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/i__glyphicon glyphicon-search'))

WebUI.dragAndDropToObject(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    findTestObject('retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'))

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    'order HCKLR-IHMFX7Z1')

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    30)

WebUI.sendKeys(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/tr_order HCKLR-IHMFX7Z1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/tr_order HCKLR-IHMFX7Z1'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_Order Total      559.20'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_696'), 
    '696')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_559.20'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/h5_559.20'), 
    '$559.20')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_Name      order HCKLR-IHM'))

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

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_RACreation_close_order_de'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_RACreation_close_order_de'))

WebUI.dragAndDropToObject(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/close_search_icon'), 
    findTestObject('retailer_order_placement/key_press_orderList/Page_AppCohesion/close_search_icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/close_search_icon'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/close_search_icon'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/a_Dashboard              Dashb'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/a_Dashboard              Dashb'))

''', 'Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/retaileradmin_order_placement', new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/order_placement_order_details/retaileradmin_order_placement',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
