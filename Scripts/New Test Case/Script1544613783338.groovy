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

WebUI.selectOptionByValue(findTestObject('Object Repository/Appco Login/Appco_Markup/select_Appco Retailer'), 'POS Retailer', 
    true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Appco Login/Appco_Markup/select_Select POS'), '1', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Appco Login/Appco_Markup/select_Select POS'), '2', true)

WebUI.click(findTestObject('Page_AppCohesion/collapsible-header_POS Retaile (1)'))

WebUI.rightClick(findTestObject('Object Repository/Appco Login/Appco_Markup/li_NewRetailerPOSNew Retailer'))

WebUI.rightClick(findTestObject('Page_AppCohesion/a_NewRetailerPOSNew Retailer P'))

WebUI.click(findTestObject('Page_AppCohesion/li_NewRetailerPOSNew Retailer '))

WebUI.rightClick(findTestObject('Page_AppCohesion/div_Role TypePOSRetailerAdmin'))

WebUI.rightClick(findTestObject('Page_AppCohesion/span_POSRetailerAdmin (1)'))

WebUI.click(findTestObject('Object Repository/Appco Login/Appco_Markup/h5_Success  Markup updated suc'))

WebUI.rightClick(findTestObject('Object Repository/Appco Login/Appco_Markup/h5_Success  Markup updated suc'))

WebUI.click(findTestObject('Object Repository/Appco Login/Appco_Markup/button_AddUpdate (1)'))

WebUI.click(findTestObject('Object Repository/Appco Login/Appco_Markup/div_Success  Markup updated su'))

