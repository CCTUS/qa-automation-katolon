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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\New Test Case (2)\\20181026_164657\\execution.properties')

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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://gogocar.com/')

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/span_GOT IT'))

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/a_BUILD YOUR DREAM CAR'))

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_Add   Choose       Make'))

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_Connect_wheel_slide_popup_'))

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_Add   Choose       Make'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_Acura  2959 Cars'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_ILX  94 Cars'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_2018  83 Cars'))

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_2018 Base FWD  Base 3 cars'))

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_2018 Base FWD  Base 3 cars'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_Connect_wheel_slide_popup_'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_Add   Choose     Trim'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_wPremium wA-SPEC_clearfix'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_SELECT  CONTINUE'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/span_GOT IT'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_EXPLORE FURTHER'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_Continue  as Guest'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_Proceed Skip Tradein'))

WebUI.setText(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/input_Please provide your ZIP'), '11210')

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/span_Please provide your ZIP c'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/a_Go with Pay in Cash'))

WebUI.setText(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/input__UserFirstName'), 'test')

WebUI.setText(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/input__UserLastName'), 's')

WebUI.setText(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/input__streetnumber'), '11213')

WebUI.setText(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/input__Address'), 'dfdg')

WebUI.selectOptionByValue(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/select_ALAKAZARCACOCTDEFLGAHII'), 
    'AZ', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/select_ALAKAZARCACOCTDEFLGAHII'), 
    'NY', true)

WebUI.setText(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/input__userCity'), 'brooklyn')

WebUI.setText(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/input__zipcode'), '11210')

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_First Name    User First N'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div__md-container md-ink-rippl'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_CONTINUE'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div__md-container md-ink-rippl_1'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_CONTINUE'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_View More_wheel_slide_popu'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/a_Go with Pay in Cash'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/span_Pay in Cash_icn_fl'))

WebUI.setText(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/input__streetnumber'), '5435465465')

WebUI.setText(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/input__Address'), 'gfhhfgh')

WebUI.selectOptionByValue(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/select_ALAKAZARCACOCTDEFLGAHII'), 
    'NY', true)

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_PREQUALIFICATION APPLICATI'))

WebUI.click(findTestObject('Object Repository/gogo user journey/Page_GoGoCar/div_PREQUALIFICATION APPLICATI_1'))

WebUI.closeBrowser()

''', 'Test Cases/New Test Case (2)', new TestCaseBinding('Test Cases/New Test Case (2)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
