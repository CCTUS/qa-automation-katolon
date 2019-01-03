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

WebUI.callTestCase(findTestCase('Call Test Case/Login_Appco_testcase-QA - new url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer Edit/a_Dashboard              Dashb'))

WebUI.verifyElementVisible(findTestObject('retailer Edit/a_Retailers              Retai'))

WebUI.click(findTestObject('retailer Edit/a_Retailers              Retai'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('retailer Edit/div_Inventory'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer Edit/div_Inventory'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('retailer Edit/button_Edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer Edit/button_Edit'))

WebUI.delay(5)

WebUI.setText(findTestObject('retailer Edit/input_RETAILER NAME_retailerNa'), 'AAA RA MD new')

WebUI.setText(findTestObject('retailer Edit/input_RETAILER ADDRESS 1_retai'), '9/10, New QA Build edit')

WebUI.setText(findTestObject('retailer Edit/input_RETAILER ADDRESS 2_retai'), '11/28, New Street lane new')

WebUI.setText(findTestObject('retailer Edit/input_ZIP CODE_zip'), '45733')

WebUI.verifyElementVisible(findTestObject('retailer Edit/h4_Inventory Info'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer Edit/select_AppCoSSGreen SupplyDavi'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer Edit/button_Remove'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer Edit/button_Update Retailer'))

WebUI.click(findTestObject('Object Repository/retailer Edit/button_Update Retailer'))

WebUI.delay(1)

not_run: Mobile.verifyElementVisible(findTestObject('retailer_edit/Page_AppCohesion/div_OK_successImgIcon'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/retailer Edit/h5_Success  Retailer details s'), 'Success: Retailer details successfully Updated.')

