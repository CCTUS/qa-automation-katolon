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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\RetailerAdmin\\Add Inventory\\20190606_124736\\execution.properties')

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
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
//import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

not_run: System.setProperty('webdriver.chrome.driver', 'D:\\\\chromedriver.exe')

//WebDriver driver = new ChromeDriver()
//DriverFactory.changeWebDriver(driver)
not_run: WebUI.openBrowser('https://app-qa.appcohesion.io/')

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_User Name_ac_username'), 
    'NewRetailerAuto@3_6')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_ac_password'), 
    'NewRetailerAuto@3_6')

not_run: WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/button_Login Now'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/a_SettingsSettings'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/a_Distributor  Inventory Sourc'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Retailer creation/inventory_object repo/new inventory object Repo/button_Add Distributor Setting'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/div_INVENTORY'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h4_Inventory Settings'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.selectOptionByLabel(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/select_AppCoSSGreen SupplyDavi'), 
    'Sports South', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/select_AppCoSSGreen SupplyDavi'), 
    '1', true)

not_run: WebUI.delay(5)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Orders'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_0_Ord'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_0_Ord'), 
    '99994')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_CustomerNumber_inv_input'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_CustomerNumber_inv_input'), 
    '99994')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_API Endpoint_inv_input_0'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_API Endpoint_inv_input_0'), 
    'http://webservices.theshootingwarehouse.com')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Source_inv_input_0_Order'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Source_inv_input_0_Order'), 
    '44494')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_inv_input_0_Ord'), 
    '99998')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Tracking'))

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_0_Tra'), 
    '99994')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_CustomerNumber_inv_input_1'), 
    '99994')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_CustomerNumber_inv_input_2'), 
    '99994')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_API Endpoint_inv_input_0_1'), 
    'http://webservices.theshootingwarehouse.com')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_API Endpoint_inv_input_0_2'), 
    'http://webservices.theshootingwarehouse.com')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Source_inv_input_0_Track'), 
    '44494')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_inv_input_0_Tra'), 
    '99998')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Catalog'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_0_Cat'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_0_Cat'), 
    '99994')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_3'), 
    '99994')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_0_5'), 
    'http://webservices.theshootingwarehouse.com')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Source_inv_input_0_Catal'), 
    '44494')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_0_Cat'), 
    '99998')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Inventory'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_0_Inv'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_0_Inv'), 
    '99994')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_5'), 
    '99994')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_0_5'), 
    'http://webservices.theshootingwarehouse.com')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Source_inv_input_0_Inven'), 
    '44494')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_0_Inv'), 
    '99998')

not_run: WebUI.scrollToPosition(0, 0)

//WebUI.dragAndDropByOffset(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/button_Save Distributor Settin'), 
//1114, -400)
//WebElement element = driver.findElement(By.id('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/button_Save Distributor Settin'))
not_run: WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/button_Save Distributor Settin'), 
    30)

//JavascriptExecutor jse2 = ((driver) as JavascriptExecutor)
not_run: JavascriptExecutor jse1 = ((driver) as JavascriptExecutor)

not_run: jse1.executeScript('window.scrollTo(0,0)', element)

//jse1.executeScript("scroll(250, 0)");
not_run: WebUI.dragAndDropToObject(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/button_Save Distributor Settin'), 
    findTestObject('Retailer creation/inventory_object repo/new inventory object Repo/button_Save Distributor Settin'))

not_run: WebUI.dragAndDropByOffset(findTestObject('Retailer creation/inventory_object repo/new inventory object Repo/button_Save Distributor Settin'), 
    1209, 15)

not_run: WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/button_Save Distributor Settin'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Retailer creation/inventory_object repo/new inventory object Repo/button_Add Distributor Setting'))

not_run: WebUI.selectOptionByLabel(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/select_AppCoSSGreen SupplyDavi_1'), 
    'Green Supply', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/select_AppCoSSGreen SupplyDavi_1'), 
    '2', true)

not_run: WebUI.delay(5)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Orders'))

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_FTP Host_inv_input_1_Ord'), 
    'ftp.drivehq.com')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_1_Ord'), 
    'eenu@getnada.com')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_inv_input_1_Ord'), 
    'eenu@getnada.com')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Tracking'))

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_FTP Host_inv_input_1_Tra'), 
    'ec2-18-188-197-73.us-east-2.compute.amazonaws.com')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_1_Tra'), 
    'ubuntu')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_inv_input_1_Tra'), 
    'ubuntu')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Catalog'))

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_FTP Host_inv_input_1_Cat'), 
    'ftp://ftp.dealerease.net')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_1_Cat'), 
    'gsdealer')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_inv_input_1_Cat'), 
    'ftp2pass')

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Inventory'))

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_FTP Host_inv_input_1_Inv'), 
    'ftp://ftp.dealerease.net')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_1_Inv'), 
    'gsdealer')

not_run: WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_inv_input_1_Inv'), 
    'ftp2pass')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/button_Save Distributor Settin'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Retailer creation/inventory_object repo/new inventory object Repo/button_Add Distributor Setting'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/select_AppCoSSGreen SupplyDavi_2'), 
    'Davidson', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/select_AppCoSSGreen SupplyDavi_2'), 
    '3', true)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Orders'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_CustomerNumber_inv_input_3'), 
    '027805')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_CustomerNumber_inv_input_4'), 
    '027805')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_ReferenceNumber_inv_inpu'), 
    'ID12345')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_API Endpoint_inv_input_2'), 
    'https://dealernetwork.davidsonsinc.com/testapi/orderservice.asmx?WSDL')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Token_inv_input_2_Orders'), 
    'tWUlibp4YoIDteR0AY95TsriJ5CZdHDQdbP4dSZk3pk=')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Tracking'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_CustomerNumber_inv_input_5'), 
    '027805')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_CustomerNumber_inv_input_6'), 
    '027805')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_ReferenceNumber_inv_inpu_1'), 
    'ID12345')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_ReferenceNumber_inv_inpu_2'), 
    'ID12345')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_API Endpoint_inv_input_2_1'), 
    'https://dealernetwork.davidsonsinc.com/testapi/orderservice.asmx?WSDL')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_API Endpoint_inv_input_2_2'), 
    'https://dealernetwork.davidsonsinc.com/testapi/orderservice.asmx?WSDL')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Token_inv_input_2_Tracki'), 
    'tWUlibp4YoIDteR0AY95TsriJ5CZdHDQdbP4dSZk3pk=')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Catalog'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_FTP Host_inv_input_2_Cat'), 
    'ftp.davidsonsinventory.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_2_Cat'), 
    'ftp58074930-1')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_inv_input_2_Cat'), 
    'DavDealerInv')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Inventory'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_FTP Host_inv_input_2_Inv'), 
    'ftp.davidsonsinventory.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_2_Inv'), 
    'ftp58074930-1')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_inv_input_2_Inv'), 
    'DavDealerInv')

WebUI.delay(5)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/button_Save Distributor Settin'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Retailer creation/inventory_object repo/new inventory object Repo/button_Add Distributor Setting'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/select_AppCoSSGreen SupplyDavi_3'), 
    'Ellett Brothers', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/select_AppCoSSGreen SupplyDavi_3'), 
    '4', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Orders'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_FTP Host_inv_input_3_Ord'), 
    'ftp.unitedsportingco.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_SourceCode_inv_input_3_O'), 
    'EF')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_3_Ord'), 
    'Broker')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_CustomerNumber_inv_input_7'), 
    '19929685')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_CustomerNumber_inv_input_8'), 
    '19929685')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_AddrCode_inv_input_3_Ord'), 
    '0000001')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_WhseID_inv_input_3_Order'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_DealerName_inv_input_3_O'), 
    'Outdoor Liquidators')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_inv_input_3_Ord'), 
    '4AoN8KUK')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Tracking'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_FTP Host_inv_input_3_Tra'), 
    'ftp.unitedsportingco.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_3_Tra'), 
    'Broker')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_inv_input_3_Tra'), 
    '4AoN8KUK')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Catalog'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_FTP Host_inv_input_3_Cat'), 
    'ftp.unitedsportingco.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_3_Cat'), 
    'Broker')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_inv_input_3_Cat'), 
    '4AoN8KUK')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h5_Inventory'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_FTP Host_inv_input_3_Inv'), 
    'ftp.unitedsportingco.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_UserName_inv_input_3_Inv'), 
    'Broker')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/input_Password_inv_input_3_Inv'), 
    '4AoN8KUK')

WebUI.delay(5)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/button_Save Distributor Settin'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Retailer creation/inventory_object repo/new inventory object Repo/button_Add Distributor Setting'))

not_run: WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/h4_Inventory Settings'))

not_run: WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory object Repo/div_Saving Inventory details..'))

''', 'Test Cases/RetailerAdmin/Add Inventory', new TestCaseBinding('Test Cases/RetailerAdmin/Add Inventory',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
