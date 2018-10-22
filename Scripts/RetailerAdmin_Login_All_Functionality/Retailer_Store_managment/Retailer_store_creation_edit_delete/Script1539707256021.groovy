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

WebUI.click(findTestObject('retailer admin All Repo/store_object_repo/store_tab'))

WebUI.click(findTestObject('retailer admin All Repo/store_object_repo/store_new_button'))

WebUI.setText(findTestObject('retailer admin All Repo/store_object_repo/store_name'), 'Store Automation')

String ts = System.currentTimeMillis().toString()

//'D:\\sample_doc\\sample.pdf'
//'D:\\datafile\\sampleFFLdoc.pdf'
WebUI.uploadFile(findTestObject('retailer admin All Repo/store_object_repo/FFL_doc'), 'D:\\sample_doc\\sample.pdf', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/store_object_repo/store_address'), '3/10, New QA Build')

WebUI.setText(findTestObject('retailer admin All Repo/store_object_repo/zip_code'), '24143')

WebUI.setText(findTestObject('retailer admin All Repo/store_object_repo/city_name'), 'Newton Falls')

WebUI.setText(findTestObject('retailer admin All Repo/store_object_repo/state_name'), 'Ohio')

WebUI.setText(findTestObject('retailer admin All Repo/store_object_repo/FFL_no'), ts)

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/store_object_repo/check_default_store'), 100)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/store_object_repo/check_default_store'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('retailer admin All Repo/store_object_repo/check_default_store'))

WebUI.waitForElementPresent(findTestObject('retailer admin All Repo/store_object_repo/add_store_button'), 100)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/store_object_repo/add_store_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/store_object_repo/add_store_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(10)

WebUI.waitForPageLoad(30)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/p_Store created successfully.'), 
    'Store created successfully.', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/h4_SUCCESS'), 'SUCCESS', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/store_object_repo/Page_AppCohesion/span_OK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/store_object_repo/default store container'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/store_object_repo/store_container0'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/store_object_repo/store_container0'))

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/store_object_repo/storeeditbutton'), 20)

WebUI.click(findTestObject('retailer admin All Repo/store_object_repo/storeeditbutton'))

WebUI.setText(findTestObject('retailer admin All Repo/store_object_repo/store_name'), 'edit Store automation')

String ts1 = System.currentTimeMillis().toString()

WebUI.setText(findTestObject('retailer admin All Repo/store_object_repo/FFL_no'), ts1)

not_run: WebUI.uploadFile(findTestObject('retailer admin All Repo/store_object_repo/FFL_doc'), 'D:\\datafile\\sampleFFLdoc.pdf', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/store_object_repo/store_address'), '3/10, New QA Build')

WebUI.setText(findTestObject('retailer admin All Repo/store_object_repo/zip_code'), '24143')

WebUI.setText(findTestObject('retailer admin All Repo/store_object_repo/city_name'), 'Newton Falls')

WebUI.setText(findTestObject('retailer admin All Repo/store_object_repo/state_name'), 'Ohio')

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/store_object_repo/store_update_button'), 10)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/store_object_repo/store_update_button'))

WebUI.click(findTestObject('retailer admin All Repo/store_object_repo/store_update_button'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/store_object_repo/alert_proceed'))

WebUI.click(findTestObject('retailer admin All Repo/store_object_repo/alert_proceed'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/store_object_repo/store_container0'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/store_object_repo/default store container'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/store_object_repo/store_container1'))

WebUI.check(findTestObject('retailer admin All Repo/store_object_repo/change_default_store'))

WebUI.waitForAlert(20)

WebUI.click(findTestObject('retailer admin All Repo/store_object_repo/store_container0'))

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/store_object_repo/store_delete_button'), 30)

WebUI.click(findTestObject('retailer admin All Repo/store_object_repo/store_delete_button'))

WebUI.waitForAlert(10)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/store_object_repo/delete_yes_button'))

WebUI.click(findTestObject('retailer admin All Repo/store_object_repo/delete_yes_button'))

WebUI.waitForAlert(10)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/store_object_repo/a_Dashboard              Dashb'))

WebUI.click(findTestObject('retailer admin All Repo/store_object_repo/a_Dashboard              Dashb'))

