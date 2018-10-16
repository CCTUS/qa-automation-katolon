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

for (def rowNum = 1; rowNum <= findTestData('productdetailsdata').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
        findTestData('productdetailsdata').getValue(1, rowNum))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/button_Settings_searchbutton'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

    WebUI.waitForPageLoad(50)

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/product_details_rowid'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Search Products Details/Page_AppCohesion/created_id/product_details_rowid'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/product_title'))

    WebUI.verifyElementText(findTestObject('Search Products Details/Page_AppCohesion/created_id/product_title'), findTestData(
            'productdetailsdata').getValue(2, rowNum))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/manufaturer_header'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/manufacture_partno_id'))

    WebUI.verifyElementText(findTestObject('Search Products Details/Page_AppCohesion/created_id/manufacture_partno_id'), 
        findTestData('productdetailsdata').getValue(3, rowNum))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/manufacture_name_header'))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/manufacture_name'))

    WebUI.verifyElementText(findTestObject('Search Products Details/Page_AppCohesion/created_id/manufacture_name'), findTestData(
            'productdetailsdata').getValue(4, rowNum))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/distributor_header'))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/distributorname_id'))

    WebUI.verifyElementText(findTestObject('Search Products Details/Page_AppCohesion/created_id/distributorname_id'), findTestData(
            'productdetailsdata').getValue(5, rowNum))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/upc_header'))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/upc_noid'))

    WebUI.verifyElementText(findTestObject('Search Products Details/Page_AppCohesion/upc_noid'), findTestData('productdetailsdata').getValue(
            6, rowNum))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/baseprice_header'))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/baseprice_id'))

    WebUI.verifyElementText(findTestObject('Search Products Details/Page_AppCohesion/created_id/baseprice_id'), findTestData(
            'productdetailsdata').getValue(7, rowNum))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/markup_header'))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/markup_id'))

    WebUI.verifyElementText(findTestObject('Search Products Details/Page_AppCohesion/created_id/markup_id'), findTestData(
            'productdetailsdata').getValue(8, rowNum))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/amtpay_header'))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/amtpay_id'))

    WebUI.verifyElementText(findTestObject('Search Products Details/Page_AppCohesion/created_id/amtpay_id'), findTestData(
            'productdetailsdata').getValue(9, rowNum))

    not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/h4_Only 25 left in stock'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    not_run: WebUI.verifyElementText(findTestObject('Object Repository/Search Products Details/Page_AppCohesion/h4_Only 25 left in stock'), 
        'Only 25 left in stock!', FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/quantity_id'))

    WebUI.verifyElementText(findTestObject('Search Products Details/Page_AppCohesion/created_id/quantity_id'), findTestData(
            'productdetailsdata').getValue(10, rowNum))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/created_id/product_specification'))

    WebUI.verifyElementVisible(findTestObject('Search Products Details/Page_AppCohesion/a_Back to Search'))

    WebUI.click(findTestObject('Search Products Details/Page_AppCohesion/a_Back to Search'))

    WebUI.click(findTestObject('retailer_order_placement/key_press_orderList/Page_AppCohesion/a_Dashboard              Dashb'))

    WebUI.verifyElementVisible(findTestObject('retailer_order_placement/key_press_orderList/Page_AppCohesion/a_Dashboard              Dashb'))

    Thread.sleep(5000)
}

