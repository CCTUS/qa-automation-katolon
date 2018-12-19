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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Call Test Case/Login_Appco_testcase-QA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/a_Dashboard              Dashb'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/key_press_orderList/order_tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

not_run: WebUI.waitForElementVisible(findTestObject('Appco Login/order listing/i__glyphicon glyphicon-search'), 10)

WebUI.check(findTestObject('Appco Login/order listing/i__glyphicon glyphicon-search'))

not_run: WebUI.dragAndDropToObject(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/input_RETAILER NAME_searchInpu'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Appco Login/order listing/input_ORDER STATUS_input_2'), 'wallmart', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Appco Login/order listing/input_ORDER STATUS_input_2'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/tr_order HCKLR-IHMFX7Z1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/tr_order HCKLR-IHMFX7Z1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/order listing/span_Order       882'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/order listing/h5_882'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Appco Login/order listing/h5_882'), '882', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/order listing/span_Order Total      1113.50'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/order listing/p_Order Total'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/order listing/span_Ordered on      03122018'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/order listing/th_PRODUCT'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/order listing/td_Remington Versa Max Versa M'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/order listing/th_QUANTITY'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/order listing/td_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/order listing/th_DISTRIBUTOR'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/order listing/th_TRACKING'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/order listing/th_STATUS'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_RACreation_close_order_de'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/Page_AppCohesion/span_RACreation_close_order_de'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.clearText(findTestObject('Appco Login/order listing/input_ORDER STATUS_input_2'))

WebUI.delay(3)

WebUI.check(findTestObject('Appco Login/order listing/i__clear_data - Copy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/a_Dashboard              Dashb'))

