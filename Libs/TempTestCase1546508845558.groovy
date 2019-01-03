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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\RetailerAdmin\\Menu list\\rule_search_distributor\\20190103_151725\\execution.properties')

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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase - new url'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h3_NewRetailerKatalonAuto New'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/img'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/a_Rule'))

not_run: WebUI.delay(10)

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Preferred Distributor'))

not_run: WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Preferred Distributor'))

not_run: WebUI.delay(10)

not_run: WebUI.check(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_SS'))

not_run: WebUI.check(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Green Supply'))

/*TestObject object1 = findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Ellet')

TestObject object2 = findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Davidson')
if (WebUI.verifyElementChecked(findTestObject(object1), 10)==true)
 {
    WebUI.uncheck(object1)
} else {
    WebUI.check(object1)
}*/
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

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/rule object repo/Page_AppCohesion/h5_Success  Search rules updat'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/retailer admin All Repo/rule object repo/Page_AppCohesion/h5_Success  Search rules updat'), 
    'Success: Search rules updated successfully', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/a_Dashboard              Dashb'))

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    'a')

not_run: WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Object Repository/retailer admin All Repo/rule object repo/Page_AppCohesion/Page_AppCohesion/i__search_data'))

not_run: WebUI.setText(findTestObject('Object Repository/retailer admin All Repo/rule object repo/Page_AppCohesion/Page_AppCohesion/input_Series_input_1'), 
    'Ellett Brothers')

not_run: WebUI.setText(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/Page_AppCohesion/input_Series_input_1'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/retailer admin All Repo/rule object repo/Page_AppCohesion/div_No search results found'))

WebUI.delay(10)

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/img'))

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/a_Rule'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Preferred Distributor'))

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/h4_Preferred Distributor'))

WebUI.delay(10)

not_run: WebUI.check(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_SS'))

not_run: WebUI.check(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Green Supply'))

/*TestObject object1 = findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Ellet')

TestObject object2 = findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Davidson')
if (WebUI.verifyElementChecked(findTestObject(object1), 10)==true)
 {
    WebUI.uncheck(object1)
} else {
    WebUI.check(object1)
}*/
WebUI.delay(2)

WebUI.check(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Ellet'))

WebUI.delay(3)

WebUI.check(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/label_Davidson'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/button_UPDATE RULE'))

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/button_UPDATE RULE'))

WebUI.verifyElementText(findTestObject('Object Repository/retailer admin All Repo/rule object repo/Page_AppCohesion/h5_Success  Search rules updat'), 
    'Success:  Search rules updated successfully', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/a_Dashboard              Dashb'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/input_Settings_searchproduct'), 
    'a')

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/Search Products Details/Page_AppCohesion/button_Settings_searchbutton'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/retailer admin All Repo/rule object repo/Page_AppCohesion/Page_AppCohesion/i__search_data'))

WebUI.setText(findTestObject('Object Repository/retailer admin All Repo/rule object repo/Page_AppCohesion/Page_AppCohesion/input_Series_input_1'), 
    'ellet')

WebUI.setText(findTestObject('retailer admin All Repo/rule object repo/Page_AppCohesion/Page_AppCohesion/input_Series_input_1'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/td_Ruger LC LCP'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/td_Ruger LC LCP'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/distributor_header'))

WebUI.verifyElementVisible(findTestObject('retailer admin All Repo/rule object repo/distributorname_id'))

WebUI.verifyElementText(findTestObject('retailer admin All Repo/rule object repo/distributorname_id'), 'Ellet')

WebUI.delay(5)

WebUI.click(findTestObject('retailer admin All Repo/rule object repo/a_Dashboard              Dashb'))

''', 'Test Cases/RetailerAdmin/Menu list/rule_search_distributor', new TestCaseBinding('Test Cases/RetailerAdmin/Menu list/rule_search_distributor',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
