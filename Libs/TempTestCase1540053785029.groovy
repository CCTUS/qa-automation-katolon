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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DELL\\AppData\\Local\\Temp\\Katalon\\Test Cases\\RetailerAdmin_Login_All_Functionality\\Menu list\\My profile\\20181020_221305\\execution.properties')

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

not_run: WebUI.waitForPageLoad(30)

not_run: WebUI.check(findTestObject('retailer admin All Repo/menu list/menuopen (1)'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/My profile option'))

not_run: WebUI.waitForPageLoad(50)

not_run: WebUI.waitForElementVisible(findTestObject('retailer admin All Repo/menu list/Edit profile button'), 30, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('retailer admin All Repo/menu list/Edit profile button'), 30)

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/Edit profile button'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/h4_RETAILER ADMIN'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/h4_RETAILER ADMIN'), 
    'RETAILER ADMIN')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Page_AppCohesion/label_RETAILER NAME'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/input_EDIT PROFILE_fname'), 'RACreation')

not_run: WebUI.setText(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/input_EDIT PROFILE_usr_lastnam'), 
    'RACreation')

not_run: WebUI.setText(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/input_racreation10_9getnada.co'), 
    '(346) 363-5735')

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/button_UPDATE PROFILE'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/menu list/Page_AppCohesion/span_OK_addRetailerCloseDrawer'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(90)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/menuopen (1)'))

WebUI.check(findTestObject('retailer admin All Repo/menu list/menuopen'))

WebUI.selectOptionByLabel(findTestObject('retailer admin All Repo/menu list/Rule'), 'Rule', true)

WebUI.waitForPageLoad(90)

WebUI.verifyElementPresent(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'), 50)

not_run: WebUI.dragAndDropToObject(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'), findTestObject(
        'retailer admin All Repo/menu list/Preferred Distributor'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/check appco'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/menu list/check appco'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/Preferred Distributor'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/distance'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/distance'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/opt check distance'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('retailer admin All Repo/menu list/opt check distance'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/distance'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/distance'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/shipping cost'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/shipping cost'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/FFL cost'))

WebUI.setText(findTestObject('retailer admin All Repo/menu list/FFL cost'), '150')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/Non FFL cost'))

WebUI.setText(findTestObject('retailer admin All Repo/menu list/Non FFL cost'), '250')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/update rule button'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/update rule button'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/menuopen'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/menuopen'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/change password'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/change password'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/old password'))

WebUI.setText(findTestObject('retailer admin All Repo/menu list/old password'), 'RACreation@10_9')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/new password'))

WebUI.setText(findTestObject('retailer admin All Repo/menu list/new password'), 'RAChange@10_9')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/confirm password'))

WebUI.setText(findTestObject('retailer admin All Repo/menu list/confirm password'), 'RAChange@10_9')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/change pwd button'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/change pwd button'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/menu list/login now'))

WebUI.click(findTestObject('retailer admin All Repo/menu list/login now'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_User Name_ac_username'), 'RACreation@10_9')

WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), 'RAChange@10_9')

WebUI.click(findTestObject('Login_OR/Page_AppCohesion/button_Login Now'))

WebUI.waitForPageLoad(30)

''', 'Test Cases/RetailerAdmin_Login_All_Functionality/Menu list/My profile', new TestCaseBinding('Test Cases/RetailerAdmin_Login_All_Functionality/Menu list/My profile',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
