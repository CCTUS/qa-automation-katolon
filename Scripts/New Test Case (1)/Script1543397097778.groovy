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

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h3_NewRetailerKatalonAuto New'))

WebUI.delay(10)

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/img'))

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/a_Rule'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Preferred Distributor'))

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Preferred Distributor'))

WebUI.delay(5)

not_run: WebUI.check(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_SS'))

WebUI.check(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Green Supply'))

WebUI.delay(2)

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Ellet'))

WebUI.delay(3)

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Davidson'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Distance'))

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Distance'))

WebUI.delay(5)

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/input_Distance_radiogroup'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Shipping Cost'))

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Shipping Cost'))

WebUI.delay(5)

WebUI.setText(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/input_FFL Price_ffl'), '555')

WebUI.setText(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/input_NON FFL Price_nonffl'), '777')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/button_UPDATE RULE'))

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/button_UPDATE RULE'))

WebUI.delay(10)

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/a_Dashboard              Dashb'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    'ruger')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.delay(10)

WebUI.check(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/Page_AppCohesion/i__glyphicon glyphicon-search'))

WebUI.setText(findTestObject('retailer admin All Repo/rule object repo/input_RETAILER NAME_searchInpu'), 'green supply', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('retailer admin All Repo/rule object repo/input_RETAILER NAME_searchInpu'), Keys.chord(Keys.ENTER), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

