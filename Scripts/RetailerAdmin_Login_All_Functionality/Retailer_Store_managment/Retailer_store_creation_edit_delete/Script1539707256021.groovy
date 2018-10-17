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

WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('store_object_repo/store_tab'))

WebUI.click(findTestObject('store_object_repo/store_new_button'))

WebUI.setText(findTestObject('store_object_repo/store_name'), 'RACreation Store')

String ts = System.currentTimeMillis().toString()

WebUI.setText(findTestObject('store_object_repo/FFL_no'), ts)

WebUI.uploadFile(findTestObject('store_object_repo/FFL_doc'), 'D:\\sample_doc\\sample.pdf', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('store_object_repo/store_address'), '3/10, New QA Build')

WebUI.setText(findTestObject('store_object_repo/zip_code'), '24143')

WebUI.setText(findTestObject('store_object_repo/city_name'), 'Newton Falls')

WebUI.setText(findTestObject('store_object_repo/state_name'), 'Ohio')

WebUI.verifyElementVisible(findTestObject('store_object_repo/check_default_store'))

WebUI.check(findTestObject('store_object_repo/check_default_store'))

WebUI.verifyElementVisible(findTestObject('store_object_repo/add_store_button'))

WebUI.click(findTestObject('store_object_repo/add_store_button'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/p_Store created successfully.'), 
    'Store created successfully.', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/h4_SUCCESS'), 'SUCCESS', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/span_OK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer_creation_Storecreation/Page_AppCohesion/a_Dashboard              Dashb'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('store_object_repo/store_tab'))

WebUI.verifyElementVisible(findTestObject('store_object_repo/store_container'))

WebUI.click(findTestObject('store_object_repo/store_container'))

WebUI.verifyElementVisible(findTestObject('store_object_repo/storeeditbutton'))

WebUI.click(findTestObject('store_object_repo/storeeditbutton'))

WebUI.setText(findTestObject('store_object_repo/store_name'), 'New Store creation')

String ts1 = System.currentTimeMillis().toString()

WebUI.setText(findTestObject('store_object_repo/FFL_no'), ts1)

WebUI.uploadFile(findTestObject('store_object_repo/FFL_doc'), 'D:\\sample_doc\\sample.pdf', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('store_object_repo/store_address'), '3/10, New QA Build')

WebUI.setText(findTestObject('store_object_repo/zip_code'), '24143')

WebUI.setText(findTestObject('store_object_repo/city_name'), 'Newton Falls')

WebUI.setText(findTestObject('store_object_repo/state_name'), 'Ohio')

WebUI.verifyElementVisible(findTestObject('store_object_repo/store_update_button'))

WebUI.click(findTestObject('store_object_repo/store_update_button'))

WebUI.waitForAlert(10)

WebUI.verifyElementVisible(findTestObject('store_object_repo/store_container'))

WebUI.click(findTestObject('store_object_repo/store_container'))

WebUI.verifyElementVisible(findTestObject('store_object_repo/store_delete_button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('store_object_repo/store_delete_button'))

WebUI.verifyElementVisible(findTestObject('store_object_repo/a_Dashboard              Dashb'))

WebUI.click(findTestObject('store_object_repo/a_Dashboard              Dashb'))

