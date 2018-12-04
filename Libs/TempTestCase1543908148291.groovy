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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\New Test Case (1)\\20181204_125228\\execution.properties')

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

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h3_NewRetailerKatalonAuto New'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/img'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/a_Rule'))

not_run: WebUI.delay(10)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Preferred Distributor'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Preferred Distributor'))

not_run: WebUI.delay(5)

not_run: WebUI.check(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_SS'))

not_run: WebUI.check(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Green Supply'))

not_run: WebUI.delay(2)

not_run: WebUI.check(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Ellet'))

not_run: WebUI.delay(3)

not_run: WebUI.check(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Davidson'))

not_run: WebUI.delay(5)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Distance'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Distance'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/input_Distance_radiogroup'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Shipping Cost'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Shipping Cost'))

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/input_FFL Price_ffl'), 
    '555')

not_run: WebUI.setText(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/input_NON FFL Price_nonffl'), 
    '777')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/button_UPDATE RULE'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/button_UPDATE RULE'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/a_Dashboard              Dashb'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    'ruger')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Object Repository/retailer admin All Repo/rule object repo/Page_AppCohesion/Page_AppCohesion/i__search_data'))

not_run: WebUI.setText(findTestObject('Object Repository/retailer admin All Repo/rule object repo/Page_AppCohesion/Page_AppCohesion/input_Series_input_1'), 
    'ellet')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/retailer admin All Repo/rule object repo/Page_AppCohesion/Page_AppCohesion/input_Series_input_1'), 
    Keys.chord(Keys.RETURN))

WebUI.delay(5)

''', 'Test Cases/New Test Case (1)', new TestCaseBinding('Test Cases/New Test Case (1)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
