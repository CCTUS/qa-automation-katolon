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

WebUI.openBrowser('')

WebUI.click(findTestObject('Page_GoGoCar/span_23 (1)'))

WebUI.click(findTestObject('Page_GoGoCar/i_Close_glyphicon glyphicon-ca (1)'))

WebUI.click(findTestObject('Page_GoGoCar/button_Time required_btn btn-d (1)'))

WebUI.click(findTestObject('Page_GoGoCar/i_Time required_glyphicon glyp'))

WebUI.click(findTestObject('Page_GoGoCar/button_Pick-up Time_btn btn-de (1)'))

