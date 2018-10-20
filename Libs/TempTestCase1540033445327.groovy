import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\DELL\\AppData\\Local\\Temp\\Katalon\\Test Cases\\RetailerAdmin_Login_All_Functionality\\Menu list\\My profile\\20181020_163405\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/menuopen (1)'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/menuopen (1)'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Edit profile (1)'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/Edit profile (1)'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AppCohesion/label_ROLE'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AppCohesion/h4_RACreation RACreation'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AppCohesion/h4_RETAILER ADMIN'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page_AppCohesion/h4_RETAILER ADMIN'), 'RETAILER ADMIN')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AppCohesion/label_RETAILER NAME'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/Page_AppCohesion/input_EDIT PROFILE_fname'), 'RACreationnew')

not_run: WebUI.setText(findTestObject('Object Repository/Page_AppCohesion/input_EDIT PROFILE_usr_lastnam'), 'RACreationnew')

not_run: WebUI.setText(findTestObject('Object Repository/Page_AppCohesion/input_racreation10_9getnada.co'), '(346) 363-5735')

not_run: WebUI.click(findTestObject('Object Repository/Page_AppCohesion/button_UPDATE PROFILE'))

not_run: WebUI.click(findTestObject('Object Repository/Page_AppCohesion/span_OK_addRetailerCloseDrawer'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/menuopen (1)'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/menuopen (1)'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Rule'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/Rule'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/check appco'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/check appco'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/distance'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/distance'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/opt check distance'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.check(findTestObject('retailer admin All Repo/menu list/opt check distance'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/distance'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/distance'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/shipping cost'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/shipping cost'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/FFL cost'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/menu list/FFL cost'), '150')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Non FFL cost'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/menu list/Non FFL cost'), '250')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/update rule button'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/update rule button'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/menuopen'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/menuopen'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/change password'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/change password'))

not_run: WebUI.waitForPageLoad(0)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/old password'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/menu list/old password'), 'RACreation@10_9')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/new password'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/menu list/new password'), 'RAChange@10_9')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/confirm password'))

not_run: WebUI.setText(findTestObject('retailer admin All Repo/menu list/confirm password'), 'RAChange@10_9')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/change pwd button'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/change pwd button'))

''', 'Test Cases/RetailerAdmin_Login_All_Functionality/Menu list/My profile', new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Menu list/My profile',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
