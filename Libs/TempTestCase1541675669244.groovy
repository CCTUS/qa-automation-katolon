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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\gogo car\\gogocar_usecase_common search\\20181108_164429\\execution.properties')

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

not_run: WebUI.navigateToUrl('https://qa.gogocar.com/')

not_run: WebUI.maximizeWindow()

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/span_GOT IT (1)'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/span_GOT IT (1)'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/div_Cars_md-thumb md-ink-rippl'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/div_Cars_md-thumb md-ink-rippl'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/button_SIGN IN  SIGN UP'))

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_Log me in'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_Log InSign UpLog in with F'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_or_auth0-lock-input-wrap a'), 
    3, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_or_email'), 'sss@getnada.com')

not_run: WebUI.waitForElementVisible(findTestObject('Page_GoGoCar/div_or_auth0-lock-input-wrap a_1'), 5)

not_run: WebUI.setText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_or_password'), 'sss@123')

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/a_Dont remember your password'))

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_Log In'))

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_Log In'))

not_run: WebUI.delay(10)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/Page_GoGoCar/a_BUILD YOUR DREAM CAR (1)'), 10)

not_run: WebUI.dragAndDropToObject(findTestObject('gogo user journey/Page_GoGoCar/a_BUILD YOUR DREAM CAR (1)'), findTestObject(
        'gogo user journey/Page_GoGoCar/a_BUILD YOUR DREAM CAR (1)'))

not_run: WebUI.waitForElementPresent(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/li_Search'), 
    10)

not_run: WebUI.dragAndDropToObject(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/li_Search'), 
    findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/li_Search'))

not_run: WebUI.delay(5)

not_run: WebUI.dragAndDropToObject(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_World Volkswagen of Nept'), 
    findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_World Volkswagen of Nept'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(10)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_Search_search_bar_input'), 
    1)

not_run: WebUI.delay(13)

not_run: WebUI.focus(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input_Search_search_bar_input'), 
    FailureHandling.STOP_ON_FAILURE)

//WebUiBuiltInKeywords.sendKeys(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_Search_search_bar_input'), 
// 'Acura ILX 2017')
not_run: WebUI.sendKeys(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/input_Search_search_bar_input'), 
    'Acura ILX 2017')

not_run: WebUI.setText(findTestObject('Object Repository/gogo user journey/new use case_common search/input_SIGN IN  SIGN UP_search_'), 
    'Acura ILX 2017')

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/div_Acura ILX  New car Starts'))

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/div_2018 Acura ILX wSpecial Ed'))

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_Acura ILX  New car Starts'), 
    10)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_Acura ILX  New car Starts'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(5)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_2019 Acura ILX wTech  Acur'), 
    5)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_2019 Acura ILX wTech  Acur'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_2019  Acura ILX wTech'), 
    3)

not_run: WebUI.waitForElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/h2_Acura of Brooklyn NY  7853'), 
    0)

not_run: WebUI.waitForElementPresent(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/p_VIN 19UDE2F77KA000076'), 
    2)

not_run: WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/p_VIN 19UDE2F77KA000076'), 
    'VIN# 19UDE2F77KA000076')

not_run: WebUI.waitForElementPresent(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/p_STOCK 429348'), 
    2)

not_run: WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/p_STOCK 429348'), 
    'STOCK# 429348')

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/p_GoGoCar Price'), 
    2)

not_run: WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/h2_30545'), '$30545', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_MSRP Price'))

not_run: WebUI.verifyElementText(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/h4_30545'), '$30545', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/div_EXPLORE FURTHER'), 
    3)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/div_EXPLORE FURTHER'))

not_run: WebUI.delay(10)

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/div_Continue  as Guest'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/div_Continue  as Guest'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(5)

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/div_Proceed Skip Tradein'), 
    5)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/div_Proceed Skip Tradein'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(3)

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Please provide your ZIP'), 
    5)

not_run: WebUI.setText(findTestObject('gogo user journey/new use case_common search/input_Please provide your ZIP'), '47150')

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/button_Please provide your ZIP'), 
    3)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/button_Please provide your ZIP'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(10)

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/b_Pay in Cash'), 3)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/b_Pay in Cash'))

not_run: WebUI.delay(15)

not_run: WebUI.clearText(findTestObject('gogo user journey/new use case_common search/input__UserFirstName'))

not_run: WebUI.clearText(findTestObject('gogo user journey/new use case_common search/input__UserLastName'))

not_run: WebUI.clearText(findTestObject('gogo user journey/new use case_common search/input__userCity'))

not_run: WebUI.clearText(findTestObject('gogo user journey/new use case_common search/input__zipcode'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_First Name'), 1)

not_run: WebUI.sendKeys(findTestObject('gogo user journey/new use case_common search/input__UserFirstName'), 'AAA')

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Last Name'), 1)

not_run: WebUI.sendKeys(findTestObject('gogo user journey/new use case_common search/input__UserLastName'), 'BBB')

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Email (optional)'), 
    2)

not_run: WebUI.setText(findTestObject('gogo user journey/new use case_common search/input_(optional)_UserEmail'), 'testnew@mailinator.com')

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Street Number'), 
    2)

not_run: WebUI.setText(findTestObject('gogo user journey/new use case_common search/input__streetnumber'), '3111')

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Present Address'), 
    2)

not_run: WebUI.setText(findTestObject('gogo user journey/new use case_common search/input__Address'), '3111  Heliport Loop')

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Present State'), 
    2)

not_run: WebUI.selectOptionByValue(findTestObject('gogo user journey/new use case_common search/select_ALAKAZARCACOCTDEFLGAHII'), 
    'NY', true)

not_run: WebUI.delay(10)

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Present City'), 2)

not_run: WebUI.setText(findTestObject('gogo user journey/new use case_common search/input__userCity'), 'Brooklyn')

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/label_Present Zip'), 2)

not_run: WebUI.setText(findTestObject('gogo user journey/new use case_common search/input__zipcode'), '11210')

not_run: WebUI.delay(10)

not_run: WebUI.verifyElementPresent(findTestObject('gogo user journey/new use case_common search/div_CONTINUE'), 2)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/div_CONTINUE'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(10)

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/a_2019AcuraILXwTech  Acura of'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_ 30545'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_ 30545'))

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/span_GoGoCar Grand Total'))

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_ 30545'))

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_How long do you plan on ke'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/select_Less than 5 years More'), 
    '1', true, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/select_Less than 5 years More'), 
    '0', true)

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_How many miles per year do'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/select_Less than 10000  More t'), 
    '1', true, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_Where do you plan on havin'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/md-radio-button_ Your own mech'))

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_How do you plan on using t'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/md-radio-button_ Personal'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_How do you plan on using t_4'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_How often do you plan on h'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/md-radio-button_ Yearly'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_Do you have any service or'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/md-radio-button_ Yes'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(10)

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_CONTINUE'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_CONTINUE'))

not_run: WebUI.delay(10)

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_CONTINUE (1)'))

not_run: WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/div_CONTINUE (1)'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_Pickup Appointment     No'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/a_Schedule'))

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/a_Schedule'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_Pick-up Date'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input_Pick-up Date_pickdate'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input_Pick-up Date_pickdate'), 
    '11-23-2018')

not_run: WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/i_Close_glyphicon glyphicon-ca'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/i_Close_glyphicon glyphicon-ca'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_Pick-up Time'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/i_Time required_glyphicon glyp_1'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/button_Time required_btn btn-d'))

WebUI.click(findTestObject('gogo user journey/new use case_common search/Page_GoGoCar/i_Time required_glyphicon glyp_1'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input_Pick-up Time_form-contro'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.clearText(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input_Pick-up Time_form-contro'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input_Pick-up Time_form-contro'), 
    '11')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input__form-control text-cente'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.clearText(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input__form-control text-cente'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/input__form-control text-cente'), 
    '00')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/button_PM'))

WebUI.click(findTestObject('Page_GoGoCar/button_PM'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_OK'))

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_OK'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_CONTINUE'))

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_CONTINUE'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/h3_2019 Acura ILX wTech'))

WebUI.verifyElementText(findTestObject('Page_GoGoCar/h3_2019 Acura ILX wTech'), '')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/span_VIN 19UDE2F77KA000076'))

WebUI.verifyElementText(findTestObject('Page_GoGoCar/span_VIN 19UDE2F77KA000076'), '')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/span_STOCK 429348'))

WebUI.verifyElementText(findTestObject('Page_GoGoCar/span_STOCK 429348'), '')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/h2_30545 (1)'))

WebUI.verifyElementText(findTestObject('Page_GoGoCar/h2_30545'), '')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/span_Type'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/h4_Sedan'))

WebUI.verifyElementText(findTestObject('Page_GoGoCar/h4_Sedan'), '')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/button_Complete'))

WebUI.click(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/button_Complete'))

WebUI.waitForElementVisible(findTestObject('Page_GoGoCar/div_Thank you'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/new use case_common search/Page_GoGoCar/div_Thank you'))

WebUI.verifyElementText(findTestObject('Page_GoGoCar/div_Thank you'), '')

''', 'Test Cases/gogo car/gogocar_usecase_common search', new TestCaseBinding('Test Cases/gogo car/gogocar_usecase_common search',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
