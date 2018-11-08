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

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/td_Ruger LC LCP'))

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/a_Back to Search'))

WebUI.setText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    'RUGER-UCSR7GCZ')

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/td_Ruger'))

