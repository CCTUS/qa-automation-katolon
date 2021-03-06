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

WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase_markup - new url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input_Invoice_common_searchpro'), 
    'SGSAR-2YH5ZDI7')

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_Invoice_searchbutton'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/td_Series_addtocart_0'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/td_Series_addtocart_0'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/td_SS'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/td_SS'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h2_Sig Sauer Nitron Full Size'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h2_Sig Sauer Nitron Full Size'), 
    'Sig Sauer Nitron Full Size E2022')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Manufacturer Part NumberE'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_E2022-40-B'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_E2022-40-B'), 
    'E2022-40-B')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_ManufacturerSig Sauer'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_Sig Sauer'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_Sig Sauer'), 
    'Sig Sauer')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_DistributorSS'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_SS'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_UPC798681306633'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_798681306633'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_798681306633'), 
    '798681306633')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Base Price424.99'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_424.99'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_424.99'), 
    '$424.99', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Retailer Markup0.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_0.00'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Amount Payable424.99'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_424.99_1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/strong_424.99_1'), 
    '$424.99', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_ADD TO CART'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h4_Only 23 left in stock'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_23'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/a_Product Specifications'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/p_Manufacturer Part Number E20'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Manufacturer Part Number E'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/a_Inventory              Inven'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Sports South'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h4_Sports South'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Sports South'))

WebUI.setText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input__markup_searchproduct'), 
    'SGSAR-2YH5ZDI7')

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/img__markupsearch_icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/td_Sig Sauer P2022 E2022'))

WebUI.setText(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input_Pistols_markup0'), 
    '34.56')

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_AddUpdate'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Success  Markup updated suc'), 
    'Success:  Markup updated successfully.', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/img'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Sig Sauer Nitron Full Size'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_UNIT PRICE'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_571.87'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_571.87'), 
    '$571.87')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_View Cart'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_View Cart'))

WebUI.delay(5)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input_Shopping Cart_sizecb'))

not_run: WebUI.click(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input_Shopping Cart_sizecb'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Order Summary'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h3_Order Summary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_1                Item(s)'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Shipping Cost'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Item selected 1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_CHECKOUT'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Sig Sauer Nitron Full Size _1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Sig Sauer Nitron Full Size'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Price                  571'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Price'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h6_571.87'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Sub Total'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/span_Sub Total'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h6_571.87'))

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

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_571.87_cart-item-removeBut'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_CHECKOUT'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_CHECKOUT'))

WebUI.delay(5)

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input_FIRST NAME_firstName'), 
    'order SGSAR-2YH5ZDI7')

WebUI.setText(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/input_EMAIL_email'), 
    'snekalatha.r@iinerds.com')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Order Summary      Order I'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Sig Sauer(1item) x 571.87'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Shipping Cost25'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/h5_Amount Payable            5'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/div_Shipping Info'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/select_Please Select Any Store'), 
    '652', true)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_Confirm Order'))

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Retailer markup and Order placement/button_VIEW ORDERS'))

WebUI.delay(10)

