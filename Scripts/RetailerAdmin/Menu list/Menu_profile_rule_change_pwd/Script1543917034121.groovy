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

WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase - new url'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('retailer admin All Repo/menu list/menuopen (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/My profile option'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/menu list/Edit profile button'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('retailer admin All Repo/menu list/Edit profile button'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/Edit profile button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/h4_RETAILER ADMIN'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/h4_RETAILER ADMIN'), 'RETAILER ADMIN', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/label_RETAILER NAME'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/input_EDIT PROFILE_fname'), 'RACreationnew', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/input_EDIT PROFILE_usr_lastnam'), 'RACreationnew', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/input_racreation10_9getnada.co'), '3456363677', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/button_UPDATE PROFILE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/span_OK_addRetailerCloseDrawer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/menuopen (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('retailer admin All Repo/menu list/menuopen'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/Page_AppCohesion/a_Rule'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.focus(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/menu list/check appco'), 3)

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/check appco'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.dragAndDropToObject(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'), findTestObject(
        'retailer admin All Repo/menu list/Preferred Distributor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/distance'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/distance'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/menu list/opt check distance'), 2)

WebUI.check(findTestObject('retailer admin All Repo/menu list/opt check distance'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/Page_AppCohesion/h4_Shipping Cost'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/Page_AppCohesion/h4_Shipping Cost'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('retailer admin All Repo/menu list/FFL cost'), '150', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/menu list/Non FFL cost'), '250', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/update rule button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/update rule button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(7)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/menuopen'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/menuopen'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/change password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/change password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/old password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/menu list/old password'), 'RACreation@10_9', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/new password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/menu list/new password'), 'RACreation@10_9', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/confirm password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/menu list/confirm password'), 'RACreation@10_9', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/change pwd button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/change pwd button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/login now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/login now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_User Name_ac_username'), 'RACreation@10_9', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), 'RACreation@10_9', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Login_OR/Page_AppCohesion/button_Login Now'), FailureHandling.CONTINUE_ON_FAILURE)

