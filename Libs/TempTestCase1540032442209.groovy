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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DELL\\AppData\\Local\\Temp\\Katalon\\Test Cases\\RetailerAdmin_Login_All_Functionality\\Menu list\\My profile\\20181020_161722\\execution.properties')

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

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/menu list/menuopen'))

not_run: WebUI.click(findTestObject('Object Repository/menu list/menuopen'))

WebUI.verifyElementVisible(findTestObject('Object Repository/menu list/Edit profile'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/menu list/Edit profile'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AppCohesion/label_ROLE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AppCohesion/h4_RACreation RACreation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AppCohesion/h4_RETAILER ADMIN'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_AppCohesion/h4_RETAILER ADMIN'), 'RETAILER ADMIN')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AppCohesion/label_RETAILER NAME'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_AppCohesion/input_EDIT PROFILE_fname'), 'RACreationnew')

WebUI.setText(findTestObject('Object Repository/Page_AppCohesion/input_EDIT PROFILE_usr_lastnam'), 'RACreationnew')

WebUI.setText(findTestObject('Object Repository/Page_AppCohesion/input_racreation10_9getnada.co'), '(346) 363-5735')

WebUI.click(findTestObject('Object Repository/Page_AppCohesion/button_UPDATE PROFILE'))

WebUI.click(findTestObject('Object Repository/Page_AppCohesion/span_OK_addRetailerCloseDrawer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/menu list/menuopen'))

WebUI.click(findTestObject('Object Repository/menu list/menuopen'))

WebUI.verifyElementVisible(findTestObject('menu list/Rule'))

WebUI.click(findTestObject('menu list/Rule'))

WebUI.verifyElementVisible(findTestObject('menu list/Preferred Distributor'))

WebUI.click(findTestObject('menu list/Preferred Distributor'))

WebUI.verifyElementVisible(findTestObject('menu list/check appco'))

WebUI.click(findTestObject('menu list/check appco'))

WebUI.verifyElementVisible(findTestObject('menu list/Preferred Distributor'))

WebUI.click(findTestObject('menu list/Preferred Distributor'))

WebUI.verifyElementVisible(findTestObject('menu list/distance'))

WebUI.click(findTestObject('menu list/distance'))

WebUI.verifyElementVisible(findTestObject('menu list/opt check distance'))

WebUI.check(findTestObject('menu list/opt check distance'))

WebUI.verifyElementVisible(findTestObject('menu list/distance'))

WebUI.click(findTestObject('menu list/distance'))

WebUI.verifyElementVisible(findTestObject('menu list/shipping cost'))

WebUI.click(findTestObject('menu list/shipping cost'))

WebUI.verifyElementVisible(findTestObject('menu list/FFL cost'))

WebUI.setText(findTestObject('menu list/FFL cost'), '150')

WebUI.verifyElementVisible(findTestObject('menu list/Non FFL cost'))

WebUI.setText(findTestObject('menu list/Non FFL cost'), '250')

WebUI.verifyElementVisible(findTestObject('menu list/update rule button'))

WebUI.click(findTestObject('menu list/update rule button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/menu list/menuopen'))

WebUI.click(findTestObject('Object Repository/menu list/menuopen'))

WebUI.verifyElementVisible(findTestObject('menu list/change password'))

WebUI.click(findTestObject('menu list/change password'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('menu list/old password'))

WebUI.setText(findTestObject('menu list/old password'), 'RACreation@10_9')

''', 'Test Cases/RetailerAdmin_Login_All_Functionality/Menu list/My profile', new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Menu list/My profile',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
