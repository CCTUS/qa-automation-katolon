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

WebUI.openBrowser('http://app-qa.appcohesion.io/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_User Name_ac_username'), 'NewRetailerB@7_9')

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), 'NewRetailerB@7_9')

WebUI.click(findTestObject('Login_OR/Page_AppCohesion/button_Login Now'))

WebUI.verifyElementText(findTestObject('Login_OR/Page_AppCohesion/span_RETAILER ADMIN'), 'RETAILER ADMIN')

WebUI.verifyElementText(findTestObject('Login_OR/Page_AppCohesion/h3_NewRetailerR New RetailerP'), 'NewRetailerR New RetailerP')

WebUI.click(findTestObject('Login_OR/Page_AppCohesion/strong_3', [('id') : 'container0']))

WebUI.click(findTestObject('Login_OR/Page_AppCohesion/collapsible-header_Retailer Ad', [('id') : 'retadminview']))

WebUI.verifyElementPresent(findTestObject('Login_OR/Page_AppCohesion/li_NewRetailerRNew RetailerP', [('id') : 'retailer0']), 
    0)

WebUI.takeScreenshot('D:\\screenshot\\retaileradmin1.png')

WebUI.waitForElementPresent(findTestObject('Login_OR/Page_AppCohesion/collapsible-header_Store Admin', [('id') : 'storeadminview']), 
    0)

WebUI.click(findTestObject('Login_OR/Page_AppCohesion/collapsible-header_Store Admin', [('id') : 'storeadminview']))

WebUI.verifyElementPresent(findTestObject('Login_OR/Page_AppCohesion/li_NewSABNewSAB', [('id') : 'storeadmin0']), 0)

WebUI.takeScreenshot('D:\\screenshot\\storeadmin2.png')

WebUI.waitForElementPresent(findTestObject('Login_OR/Page_AppCohesion/collapsible-header_Store Users', [('id') : 'storeuserview']), 
    0)

WebUI.click(findTestObject('Login_OR/Page_AppCohesion/collapsible-header_Store Users', [('id') : 'storeuserview']))

WebUI.verifyElementPresent(findTestObject('Login_OR/Page_AppCohesion/li_NewSUBNewSUB', [('id') : 'storeuser0']), 0)

WebUI.takeScreenshot('D:\\screenshot\\storeuser3.png')

