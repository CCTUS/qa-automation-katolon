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

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/a_Schedule'))

WebUI.setText(findTestObject('Object Repository/gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/input_Pick-up Date_pickdate'), 
    '11-23-2018')

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/button_Time required_btn btn-d'))

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/input_Pick-up Time_form-contro'))

WebUI.setText(findTestObject('Object Repository/gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/input_Pick-up Time_form-contro'), 
    '11')

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/input__form-control text-cente'))

WebUI.setText(findTestObject('Object Repository/gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/input__form-control text-cente'), 
    '00')

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/button_PM'))

WebUI.waitForElementVisible(findTestObject('Page_GoGoCar/div_OK'), 0)

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/div_OK'))

WebUI.waitForElementVisible(findTestObject('Page_GoGoCar/div_CONTINUE'), 0)

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/div_CONTINUE'))

WebUI.waitForElementVisible(findTestObject('Page_GoGoCar/button_Complete'), 0)

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/oppointment_schedule/Page_GoGoCar/button_Complete'))

