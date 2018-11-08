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

not_run: WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(20)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/Inventory_tab'))

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/Inventory_tab'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/choose options'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/choose options'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/div_Inventory'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/div_Inventory'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/inventory options'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/inventory options'))

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('retailer admin All Repo/inventory retailer markup repo/searchProduct markup'), 'RUGER-UCSR7GCZ')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/search markup icon'))

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/search markup icon'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/product listed'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/add_markupvalue_input'))

WebUI.setText(findTestObject('retailer admin All Repo/inventory retailer markup repo/add_markupvalue_input'), '12.8')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/add_markup button'))

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/add_markup button'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/h5_Success  Markup updated suc'), 
    'Success: Markup updated successfully.')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/common search product'))

WebUI.setText(findTestObject('retailer admin All Repo/inventory retailer markup repo/common search product'), 'RUGER-UCSR7GCZ')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/td_Ruger LC LCP'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/td_Ruger LC LCP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/h2_Ruger LC LCP'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/h2_Ruger LC LCP'), 
    'Ruger LC LCP')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/Page_AppCohesion/span_Base Price180.00'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/Page_AppCohesion/strong_180.00'), 
    '$180.00')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/Page_AppCohesion/strong_12.80'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/Page_AppCohesion/strong_12.80'), 
    '12.80%')

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/Page_AppCohesion/span_Amount Payable203.04'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/Page_AppCohesion/strong_203.04'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/Page_AppCohesion/strong_203.04'), 
    '$203.04')

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/Page_AppCohesion/h4_Only 25 left in stock'))

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/Page_AppCohesion/span_25'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/Page_AppCohesion/span_25'), 
    '25')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/a_Back to Search'))

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/a_Back to Search'))

WebUI.waitForPageLoad(20)

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/a_Dashboard              Dashb'), 
    30)

WebUI.click(findTestObject('retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/a_Dashboard              Dashb'))

