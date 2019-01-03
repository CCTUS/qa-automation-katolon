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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\AppcoAdmin\\Appco_markup\\20190103_134018\\execution.properties')

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

not_run: WebUI.callTestCase(findTestCase('Call Test Case/Login_Appco_testcase-QA - new url'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/a_Retailers              Retai'))

not_run: WebUI.delay(5)

not_run: WebUI.verifyElementVisible(findTestObject('Appco Login/Appco_Markup/div_Inventory'))

not_run: WebUI.verifyElementVisible(findTestObject('Appco Login/Appco_Markup/span_Inventory'))

not_run: WebUI.click(findTestObject('Appco Login/Appco_Markup/span_Inventory'))

not_run: WebUI.verifyElementVisible(findTestObject('Appco Login/Appco_Markup/a_Inventory'))

not_run: WebUI.click(findTestObject('Appco Login/Appco_Markup/a_Inventory'))

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('Appco Login/Appco_Markup/input__markup_searchproduct'), 'RUGER-UCSR7GCZ')

not_run: WebUI.click(findTestObject('Appco Login/Appco_Markup/img__markupsearch_icon'))

not_run: WebUI.delay(5)

WebUI.setText(findTestObject('Appco Login/Appco_Markup/input_Pistols_markup0'), '123.67')

WebUI.click(findTestObject('Appco Login/Appco_Markup/button_AddUpdate'))

not_run: WebUI.delay(1)

WebUI.verifyElementText(findTestObject('retailer admin All Repo/retailer_order_placement/order_placement_verifymarkup/Page_AppCohesion/h5_Success  Markup updated suc'), 
    'Success: Markup updated successfully.')

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Appco Login/Appco_Markup/h3_Store Tester'))

WebUI.click(findTestObject('Appco Login/Appco_Markup/h3_Store Tester'))

WebUI.click(findTestObject('Appco Login/Appco_Markup/a_Log Out'))

WebUI.delay(5)

WebUI.callTestCase(findTestCase('Call Test Case/Login_retailer_testcase_markup'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Appco Login/Appco_Markup/input_Invoice_common_searchpro'), 'RUGER-UCSR7GCZ')

WebUI.click(findTestObject('Object Repository/Appco Login/Appco_Markup/button_Invoice_searchbutton'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/td_SS'))

WebUI.click(findTestObject('Appco Login/Appco_Markup/td_SS'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/h2_Ruger Standard LCP'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/span_Manufacturer Part Number3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/strong_3701'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/span_DistributorSS'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/strong_SS'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/span_UPC736676037018'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/strong_736676037018'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/span_Base Price416.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/strong_416.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/span_Retailer Markup0.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/strong_0.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/span_Amount Payable416.00'))

WebUI.verifyElementVisible(findTestObject('Appco Login/Appco_Markup/strong_416.00'))

WebUI.verifyElementText(findTestObject('Appco Login/Appco_Markup/strong_416.00'), '$416.00')

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/button_ADD TO CART'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/h4_Only 25 left in stock'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/a_Product Specifications'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/p_Manufacturer Part Number 370'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/div_Manufacturer Part Number 3'))

WebUI.click(findTestObject('Object Repository/Appco Login/Appco_Markup/button_ADD TO CART'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/span_Added to Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/img'))

WebUI.click(findTestObject('Object Repository/Appco Login/Appco_Markup/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/div_Ruger Standard LCP'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/span_UNIT PRICE'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/span_416.00'))

WebUI.verifyElementText(findTestObject('Object Repository/Appco Login/Appco_Markup/span_416.00'), '$416.00')

WebUI.verifyElementVisible(findTestObject('Object Repository/Appco Login/Appco_Markup/button_View Cart'))

WebUI.click(findTestObject('Object Repository/Appco Login/Appco_Markup/button_View Cart'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('delete_added _products/Page_AppCohesion/div_406.08_cart-item-removeBut'))

WebUI.click(findTestObject('delete_added _products/Page_AppCohesion/div_406.08_cart-item-removeBut'))

WebUI.verifyElementVisible(findTestObject('delete_added _products/Page_AppCohesion/h4_SorryNo Items inside cart'))

WebUI.verifyElementText(findTestObject('delete_added _products/Page_AppCohesion/h4_SorryNo Items inside cart'), 'Sorry!No Items inside cart')

WebUI.delay(5)

WebUI.check(findTestObject('retailer admin All Repo/menu list/menuopen (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Appco Login/Appco_Markup/a_Log Out'))

''', 'Test Cases/AppcoAdmin/Appco_markup', new TestCaseBinding('Test Cases/AppcoAdmin/Appco_markup',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
