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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\retaileradmin_order_placement\\20181016_111939\\execution.properties')

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

not_run: WebUI.verifyElementVisible(findTestObject('retailer_order_placement/Page_AppCohesion/i_Settings_glyphicon glyphicon'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('retailer_order_placement/Page_AppCohesion/i_Settings_glyphicon glyphicon'))

WebUI.setText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_GSIN_form-control ng-unt'), 
    'HCKLR-IHMFX7Z1')

WebUI.setText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_UPC_form-control ng-unto'), 
    '642230250857')

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/button_Search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/tr_Green Supply'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/tr_Green Supply'), 'Green Supply')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/div_Heckler  Koch VP VP9'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/div_Heckler  Koch VP VP9'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('retailer_order_placement/Page_AppCohesion/strong_534.20'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('retailer_order_placement/Page_AppCohesion/strong_534.20'), '$534.20')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_176'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_176'), 
    '176')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/h4_Only 176 left in stock'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/h4_Only 176 left in stock'), 
    'Only 176 left in stock!')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/button_ADD TO CART'))

not_run: WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/button_ADD TO CART'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/img'))

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

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_534.20'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_534.20'), '$534.20')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_25'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_25'), '$25')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_559.20'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_559.20'), '$559.20')

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/button_Confirm Order'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_VIEW ORDERS'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_VIEW ORDERS'), 
    'VIEW ORDERS')

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_VIEW ORDERS'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/i__glyphicon glyphicon-search'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/i__glyphicon glyphicon-search'))

WebUI.setText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    'order HCKLR-IHMFX7Z1')

WebUI.sendKeys(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/tr_order HCKLR-IHMFX7Z1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_Order Total      559.20'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_Order Total      559.20'), 
    'Order Total $559.20')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_Name      order HCKLR-IHM'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_Name      order HCKLR-IHM'), 
    'Name order HCKLR-IHMFX7Z1')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_Email      snekalatha.rii'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_Email      snekalatha.rii'), 
    'Email snekalatha.r@iinerds.com')

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/th_QUANTITY'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/td_1'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/td_1'), '1')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/td_Completed'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/td_Completed'), 'Completed')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_RACreation_close_order_de'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/span_RACreation_close_order_de'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/i__glyphicon glyphicon-search (1)'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/i__glyphicon glyphicon-search (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/a_Dashboard              Dashb'))

WebUI.click(findTestObject('Object Repository/retailer_order_placement/Page_AppCohesion/a_Dashboard              Dashb'))

''', 'Test Cases/retaileradmin_order_placement', new TestCaseBinding('Test Cases/retaileradmin_order_placement',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
