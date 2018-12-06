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

WebUI.callTestCase(findTestCase('Call Test Case/StoreAdmin Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Storeadmin Profiledit/Page_AppCohesion/em_Welcome Mult Store admin'))

WebUI.click(findTestObject('Object Repository/Storeadmin Profiledit/Page_AppCohesion/i_searching products..._glyphi'))

WebUI.click(findTestObject('Object Repository/Storeadmin Profiledit/Page_AppCohesion/a_My Profile'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Storeadmin Profiledit/Page_AppCohesion/button_EDIT PROFILE'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Storeadmin Profiledit/Page_AppCohesion/input_multstoreadmingetnada.co'), 
    '(974) 760-1000')

WebUI.click(findTestObject('Object Repository/Storeadmin Profiledit/Page_AppCohesion/button_UPDATE PROFILE'))

WebUI.delay(4)

WebUI.verifyElementVisible(findTestObject('Object Repository/Storeadmin Profiledit/Page_AppCohesion/h5_Success  User details succe'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Storeadmin Profiledit/Page_AppCohesion/div_Success  User details succ'))

