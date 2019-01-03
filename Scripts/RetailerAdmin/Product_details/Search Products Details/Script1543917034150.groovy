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

WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase - new url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    'RUGER-UCSR7GCZ')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/td_Ruger LC LCP'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/td_Ruger LC LCP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/h2_Ruger LC LCP'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/h2_Ruger LC LCP'), 
    'Ruger LC LCP')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/span_Manufacturer Part Number3'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/strong_3701'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/strong_3701'), 
    '3701')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/span_ManufacturerRuger'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/strong_Ruger'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/strong_Ruger'), 
    'Ruger')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/span_DistributorSS'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/strong_SS'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/strong_SS'), 'SS')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/span_UPC736676037018'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/strong_736676037018'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/strong_736676037018'), 
    '736676037018')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/span_Base Price180.00'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/strong_180.00'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/strong_180.00'), 
    '$180.00')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/span_Retailer Markup0.00'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/strong_0.00'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/strong_0.00'), 
    '12.80%')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/span_Amount Payable180.00'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/Page_AppCohesion/strong_203.04'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/inventory retailer markup repo/Page_AppCohesion/Page_AppCohesion/strong_203.04'), 
    '$203.04')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/h4_Only 25 left in stock'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/h4_Only 25 left in stock'), 
    'Only 25 left in stock!')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/span_25'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/span_25'), '25')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/p_Manufacturer Part 3701UPC 73'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/a_Back to Search'))

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/a_Back to Search'))

