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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\RetailerAdmin\\order_placement_order_details\\Retailer  add Markup order placement\\20190103_161612\\execution.properties')

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

not_run: WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase_markup - new url'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(10)

not_run: WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input_Invoice_common_searchpro'), 
    'SGSAR-2YH5ZDI7')

not_run: WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_Invoice_searchbutton'))

not_run: WebUI.delay(10)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/td_Series_addtocart_0'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/td_Series_addtocart_0'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/td_SS'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/td_SS'))

not_run: WebUI.delay(5)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h2_Sig Sauer Nitron Full Size'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h2_Sig Sauer Nitron Full Size'), 
    'Sig Sauer Nitron Full Size E2022')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Manufacturer Part NumberE'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_E2022-40-B'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_E2022-40-B'), 
    'E2022-40-B')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_ManufacturerSig Sauer'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_Sig Sauer'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_Sig Sauer'), 
    'Sig Sauer')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_DistributorSS'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_SS'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_UPC798681306633'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_798681306633'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_798681306633'), 
    '798681306633')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Base Price424.99'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_424.99'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_424.99'), 
    '$424.99', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Retailer Markup0.00'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_0.00'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Amount Payable424.99'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_424.99_1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_424.99_1'), 
    '$424.99', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_ADD TO CART'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h4_Only 23 left in stock'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_23'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/a_Product Specifications'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/p_Manufacturer Part Number E20'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Manufacturer Part Number E'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/a_Inventory              Inven'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Sports South'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h4_Sports South'))

not_run: WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Sports South'))

not_run: WebUI.setText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input__markup_searchproduct'), 
    'SGSAR-2YH5ZDI7')

not_run: WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/img__markupsearch_icon'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/td_Sig Sauer P2022 E2022'))

not_run: WebUI.setText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input_Pistols_markup0'), 
    '34.56')

not_run: WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_AddUpdate'))

not_run: WebUI.delay(5)

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Success  Markup updated suc'), 
    'Success:  Markup updated successfully.', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(5)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/img'))

not_run: WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/img'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Sig Sauer Nitron Full Size'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_UNIT PRICE'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_571.87'))

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_571.87'), 
    '$571.87')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_View Cart'))

not_run: WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_View Cart'))

not_run: WebUI.delay(5)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input_Shopping Cart_sizecb'))

not_run: WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input_Shopping Cart_sizecb'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Order Summary'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h3_Order Summary'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_1                Item(s)'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Shipping Cost'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Item selected 1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_CHECKOUT'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Sig Sauer Nitron Full Size _1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Sig Sauer Nitron Full Size'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Price                  571'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Price'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h6_571.87'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Sub Total'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Sub Total'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h6_571.87'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Sig Sauer Nitron Full Size _2'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Retailer Markup34.56'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_34.56'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_34.56'), 
    '34.56%')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Amount Payable571.87'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_571.87'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/a_Back to Cart'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/a_Back to Cart'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_571.87_cart-item-removeBut'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_CHECKOUT'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_CHECKOUT'))

WebUI.delay(5)

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input_FIRST NAME_firstName'), 
    'order SGSAR-2YH5ZDI7')

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input_EMAIL_email'), 
    'snekalatha.r@iinerds.com')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Order Summary      Order I'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Sig Sauer(1item) x 571.87'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Shipping Cost25'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Amount Payable            5'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Shipping Info'))

WebUI.selectOptionByValue(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/select_Please Select Any Store'), 
    '652', true)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_Confirm Order'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_VIEW ORDERS'))

WebUI.delay(10)

''', 'Test Cases/RetailerAdmin/order_placement_order_details/Retailer  add Markup order placement', new TestCaseBinding('Test Cases/RetailerAdmin/order_placement_order_details/Retailer  add Markup order placement',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
