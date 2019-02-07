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

WebUI.callTestCase(findTestCase('Call Test Case/StoreUser Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

not_run: WebUI.setText(findTestObject('Object Repository/AddToCartStoreAdmin/Page_AppCohesion/input_Invoice_common_searchpro (1)'), 
    'Ruger Lower Receiver AR')

WebUI.setText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    'Ruger Lower Receiver AR')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.delay(5)

not_run: WebUI.sendKeys(findTestObject('Object Repository/AddToCartStoreAdmin/Page_AppCohesion/input_Invoice_common_searchpro (1)'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('Page_AppCohesion/i_Invoice_glyphicon glyphicon-'))

WebUI.verifyElementVisible(findTestObject('AddToCartStoreAdmin/Page_AppCohesion/div_Ruger Lower Receiver AR (1)'))

WebUI.click(findTestObject('AddToCartStoreAdmin/Page_AppCohesion/button_ADD TO CART (1)'))

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('AddToCartStoreAdmin/Page_AppCohesion/button_ADD TO CART (1)'))

not_run: WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/AddToCartStoreAdmin/Page_AppCohesion/span_Added to Cart (1)'))

WebUI.click(findTestObject('Object Repository/AddToCartStoreAdmin/Page_AppCohesion/img (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/AddToCartStoreAdmin/Page_AppCohesion/h5_Ruger Lower Receiver AR (1)'))

WebUI.click(findTestObject('Object Repository/AddToCartStoreAdmin/Page_AppCohesion/button_View Cart (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/AddToCartStoreAdmin/Page_AppCohesion/h5_Ruger Lower Receiver AR    _1 (1)'))

