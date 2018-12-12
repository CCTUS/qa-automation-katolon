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

WebUI.callTestCase(findTestCase('Call Test Case/Login_Appco_testcase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/a_Retailers              Retai'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/a_ADD RETAILER'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Retailer creation/Page_AppCohesion/select_Appco Retailer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Retailer creation/Page_AppCohesion/select_Appco Retailer'), 'Appco Retailer', 
    true)

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_RETAILER NAME_retailerNa'), findTestData(
        'TDAddRetailer').getValue(1, 1))

int rn_uname

rn_uname = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('add_retailer_gmail/Page_AppCohesion/input_USER NAME_userName'), 'NewRetailerAdmin' + rn_uname)

int rn_email

rn_email = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('add_retailer_gmail/Page_AppCohesion/input_EMAIL ID_emailId'), ('snekalatha.r' + rn_email) + 
    '@iinerds.com')

//WebUI.setText(findTestObject('add_retailer_gmail/Page_AppCohesion/input_USER NAME_userName'), findTestData('TDAddRetailer').getValue(
// 2, rowNum))
//WebUI.setText(findTestObject('add_retailer_gmail/Page_AppCohesion/input_EMAIL ID_emailId'), findTestData('TDAddRetailer').getValue(
// 3, rowNum))
WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_FIRST NAME_firstName'), 'NewRetailer')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_LAST NAME_lastName'), 'New Retailer')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_RETAILER ADDRESS 1_retai'), '9/10, New QA Build11')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_RETAILER ADDRESS 2_retai'), '11/28, New Street lane')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_PHONE NUMBER_phoneNumber'), '(446) 626-2462')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_ZIP CODE_zip'), '75444')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_CITY_city'), 'Golden')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_STATE_state'), 'Texas')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_BANK ROUTING ID_bankId'), '574846848468')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_BANK NAME_bankName'), 'bb bank')

WebUI.setText(findTestObject('Object Repository/add_retailer_gmail/Page_AppCohesion/input_BANK AC NUMBER_accountNu'), '45747467468468')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/select_AppCoSSGreen SupplyDavi'), 
    '1', true)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/h5_Orders'))

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_UserName_inv_input_0_Ord'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_UserName_inv_input_0_Ord'), 
    '99994')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_CustomerNumber_inv_input'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_CustomerNumber_inv_input'), 
    '99994')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_API Endpoint_inv_input_0'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_API Endpoint_inv_input_0'), 
    'http://webservices.theshootingwarehouse.com')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Source_inv_input_0_Order'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Source_inv_input_0_Order'), 
    '44494')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Password_inv_input_0_Ord'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Password_inv_input_0_Ord'), 
    '99998')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_UserName_inv_input_0_Tra'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_UserName_inv_input_0_Tra'), 
    '99994')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_CustomerNumber_inv_input_1'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_CustomerNumber_inv_input_1'), 
    '99994')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_API Endpoint_inv_input_0_1'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_API Endpoint_inv_input_0_1'), 
    'http://webservices.theshootingwarehouse.com')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Source_inv_input_0_Track'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Source_inv_input_0_Track'), 
    '44494')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Password_inv_input_0_Tra'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Password_inv_input_0_Tra'), 
    '99998')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_FTP Host_inv_input_0_Cat'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_FTP Host_inv_input_0_Cat'), 
    'ecomdash-ftp.cloudapp.net')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_UserName_inv_input_0_Cat'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_UserName_inv_input_0_Cat'), 
    'SSAutomation')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Password_inv_input_0_Cat'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Password_inv_input_0_Cat'), 
    'password')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_FTP Host_inv_input_0_Inv'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_FTP Host_inv_input_0_Inv'), 
    'ecomdash-ftp.cloudapp.net')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_UserName_inv_input_0_Inv'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_UserName_inv_input_0_Inv'), 
    'SSAutomation')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Password_inv_input_0_Inv'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Password_inv_input_0_Inv'), 
    'password')

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/button_Add Distributor Invento'))

WebUI.click(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/button_Add Distributor Invento'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/select_AppCoSSGreen SupplyDavi_1'), 
    '2', true)

not_run: WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/h5_Orders'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_FTP Host_inv_input_0_Ord'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_FTP Host_inv_input_0_Ord'), 
    'ftp.drivehq.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_UserName_inv_input_0_Ord'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_UserName_inv_input_0_Ord'), 
    'eenu@getnada.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_Password_inv_input_0_Ord'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_Password_inv_input_0_Ord'), 
    'eenu@getnada.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/h5_Tracking'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_FTP Host_inv_input_0_Tra'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_FTP Host_inv_input_0_Tra'), 
    'ec2-18-188-197-73.us-east-2.compute.amazonaws.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_UserName_inv_input_0_Tra'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_UserName_inv_input_0_Tra'), 
    'ubuntu')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Password_inv_input_0_Tra'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/input_Password_inv_input_0_Tra'), 
    'ubuntu')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/h5_Catalog'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_FTP Host_inv_input_0_Cat'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_FTP Host_inv_input_0_Cat'), 
    'ftp://ftp.dealerease.net')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_UserName_inv_input_0_Cat'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_UserName_inv_input_0_Cat'), 
    'gsdealer')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_Password_inv_input_0_Cat'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_Password_inv_input_0_Cat'), 
    'ftp2pass')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/h5_Inventory'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_FTP Host_inv_input_0_Inv'))

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/green_supply_obj_repo/input_FTP Host_inv_input_0_Inv'), 
    'ftp://ftp.dealerease.net')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_UserName_inv_input_0_Inv'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_UserName_inv_input_0_Inv'), 
    'gsdealer')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_Password_inv_input_0_Inv'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/green_supply_obj_repo/input_Password_inv_input_0_Inv'), 
    'ftp2pass')

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/button_Add Distributor Invento'))

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/button_Add Distributor Invento'))

not_run: WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Retailer creation/inventory_object repo/Page_AppCohesion/select_AppCoSSGreen SupplyDavi_1 - Copy'), 
    '3', true)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/h5_Orders'))

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/davidson_obj_repo/input_CustomerNumber_inv_input'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_CustomerNumber_inv_input'), 
    '027805')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_ReferenceNumber_inv_inpu'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_ReferenceNumber_inv_inpu'), 
    'ID12345')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_API Endpoint_inv_input_0'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_API Endpoint_inv_input_0'), 
    'https://dealernetwork.davidsonsinc.com/testapi/orderservice.asmx?WSDL')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_Token_inv_input_0_Orders'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_Token_inv_input_0_Orders'), 
    'tWUlibp4YoIDteR0AY95TsriJ5CZdHDQdbP4dSZk3pk=')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/h5_Tracking'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_CustomerNumber_inv_input_1'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_CustomerNumber_inv_input_1'), 
    '027805')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_ReferenceNumber_inv_inpu_1'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_ReferenceNumber_inv_inpu_1'), 
    'ID12345')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_API Endpoint_inv_input_0_1'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_API Endpoint_inv_input_0_1'), 
    'https://dealernetwork.davidsonsinc.com/testapi/orderservice.asmx?WSDL')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_Token_inv_input_0_Tracki'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_Token_inv_input_0_Tracki'), 
    'tWUlibp4YoIDteR0AY95TsriJ5CZdHDQdbP4dSZk3pk=')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/h5_Catalog'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_FTP Host_inv_input_0_Cat'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_FTP Host_inv_input_0_Cat'), 
    'ftp.davidsonsinventory.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_UserName_inv_input_0_Cat'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_UserName_inv_input_0_Cat'), 
    'ftp58074930-1')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_Password_inv_input_0_Cat'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_Password_inv_input_0_Cat'), 
    'DavDealerInv')

WebUI.verifyElementVisible(findTestObject('Retailer creation/inventory_object repo/green_supply_obj_repo/h5_Inventory'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_FTP Host_inv_input_0_Inv'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_FTP Host_inv_input_0_Inv'), 
    'ftp.davidsonsinventory.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_UserName_inv_input_0_Inv'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_UserName_inv_input_0_Inv'), 
    'ftp58074930-1')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_Password_inv_input_0_Inv'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_Password_inv_input_0_Inv'), 
    'DavDealerInv')

WebUI.delay(5)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/button_Add Distributor Invento'))

not_run: WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/button_Add Distributor Invento'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/Page_AppCohesion/select_AppCoSSGreen SupplyDavi'), 
    '4', true)

WebUI.click(findTestObject('add_retailer_gmail/Page_AppCohesion/button_Add Retailer'))

WebUI.verifyElementText(findTestObject('Object Repository/Retailer creation/inventory_object repo/h5_Success  Congratulations Yo'), 
    'Success:  Congratulations!! You have successfully added retailer. Email has been sent to his email id!', FailureHandling.CONTINUE_ON_FAILURE)

