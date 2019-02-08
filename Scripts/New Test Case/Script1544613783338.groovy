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

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/a_Listing ManagementListing Ma (1)'))

WebUI.rightClick(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Active'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Active'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Fetching active listings..'))

WebUI.setText(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/input_GSIN_form-control ng-val (1)'), 
    'BRTTA-9G8LWJMB')

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/button_Search (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/td_BRTTA-9G8LWJMB'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/td_Beretta Forest T3x'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/td_11263818'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/div_Listing ID'))

WebUI.click(findTestObject('Object Repository/LMP_Active Product/Page_AppCohesion/a_11263818'))

