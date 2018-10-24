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

WebUI.doubleClick(findTestObject('pop up emp object/h5_Success  Congratulations Yo'))

WebUI.click(findTestObject('pop up emp object/h5_Success  User details succe'))

WebUI.verifyElementText(findTestObject('pop up emp object/h5_Success  User details succe'), 'Success: User details successfully Updated.')

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/employee_obj_repo/pop up emp object/button_Delete'))

WebUI.click(findTestObject('pop up emp object/button_YES'))

WebUI.verifyElementText(findTestObject('pop up emp object/h5_Success  User details has b'), 'Success: User details has been deleted successfully.')

WebUI.click(findTestObject('pop up emp object/div_OK_defaultmsgPopContentIco'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app-qa.appcohesion.io/')

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/employee_obj_repo/pop up emp object/Page_AppCohesion/collapsible-header_Retailer Ad'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/employee_obj_repo/pop up emp object/Page_AppCohesion/collapsible-header_Store Admin'))

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/employee_obj_repo/pop up emp object/Page_AppCohesion/collapsible-header_Store Users'))

