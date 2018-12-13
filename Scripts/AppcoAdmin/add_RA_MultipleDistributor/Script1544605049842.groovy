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

WebUI.setText(findTestObject('add_retailer_gmail/Page_AppCohesion/input_EMAIL ID_emailId'), ('NewRetailerAdmin' + rn_email) + 
    '@getnada.com')

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

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/div_INVENTORY'))

WebUI.selectOptionByLabel(findTestObject('Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/select_AppCoSSGreen SupplyDavi'), 
    'SS', true)

not_run: WebUI.selectOptionByValue(findTestObject('Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/select_AppCoSSGreen SupplyDavi'), 
    '1', true)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Orders'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_0_Ord'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_0_Ord'), 
    '99994')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_CustomerNumber_inv_input'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_CustomerNumber_inv_input'), 
    '99994')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_API Endpoint_inv_input_0'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_API Endpoint_inv_input_0'), 
    'http://webservices.theshootingwarehouse.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Source_inv_input_0_Order'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Source_inv_input_0_Order'), 
    '44494')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_0_Ord'), 
    '99998')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Tracking'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_0_Tra'), 
    '99994')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_CustomerNumber_inv_input_1'), 
    '99994')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_CustomerNumber_inv_input_2'), 
    '99994')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_API Endpoint_inv_input_0_1'), 
    'http://webservices.theshootingwarehouse.com')

WebUI.setText(findTestObject('Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_API Endpoint_inv_input_0_2'), 
    'http://webservices.theshootingwarehouse.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Source_inv_input_0_Track'), 
    '44494')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_0_Tra'), 
    '99998')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Catalog'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_FTP Host_inv_input_0_Cat'), 
    'ecomdash-ftp.cloudapp.net')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_0_Cat'), 
    'SSAutomation')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_0_Cat'), 
    'password')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Inventory'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_FTP Host_inv_input_0_Inv'), 
    'ecomdash-ftp.cloudapp.net')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_0_Inv'), 
    'SSAutomation')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_0_Inv'), 
    'password')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/button_Add Distributor Invento'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/select_AppCoSSGreen SupplyDavi_1'), 
    'Green Supply', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/select_AppCoSSGreen SupplyDavi_1'), 
    '2', true)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Orders'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_FTP Host_inv_input_1_Ord'), 
    'ftp.drivehq.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_1_Ord'), 
    'eenu@getnada.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_1_Ord'), 
    'eenu@getnada.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Tracking'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_FTP Host_inv_input_1_Tra'), 
    'ec2-18-188-197-73.us-east-2.compute.amazonaws.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_1_Tra'), 
    'ubuntu')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_1_Tra'), 
    'ubuntu')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Catalog'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_FTP Host_inv_input_1_Cat'), 
    'ftp://ftp.dealerease.net')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_1_Cat'), 
    'gsdealer')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_1_Cat'), 
    'ftp2pass')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Inventory'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_FTP Host_inv_input_1_Inv'), 
    'ftp://ftp.dealerease.net')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_1_Inv'), 
    'gsdealer')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_1_Inv'), 
    'ftp2pass')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/button_Add Distributor Invento'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/select_AppCoSSGreen SupplyDavi_2'), 
    'Davidson', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/select_AppCoSSGreen SupplyDavi_2'), 
    '3', true)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Orders'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_CustomerNumber_inv_input_3'), 
    '027805')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_CustomerNumber_inv_input_4'), 
    '027805')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_ReferenceNumber_inv_inpu'), 
    'ID12345')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_API Endpoint_inv_input_2'), 
    'https://dealernetwork.davidsonsinc.com/testapi/orderservice.asmx?WSDL')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Token_inv_input_2_Orders'), 
    'tWUlibp4YoIDteR0AY95TsriJ5CZdHDQdbP4dSZk3pk=')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Tracking'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_CustomerNumber_inv_input_5'), 
    '027805')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_CustomerNumber_inv_input_6'), 
    '027805')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_ReferenceNumber_inv_inpu_1'), 
    'ID12345')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_ReferenceNumber_inv_inpu_2'), 
    'ID12345')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_API Endpoint_inv_input_2_1'), 
    'https://dealernetwork.davidsonsinc.com/testapi/orderservice.asmx?WSDL')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_API Endpoint_inv_input_2_2'), 
    'https://dealernetwork.davidsonsinc.com/testapi/orderservice.asmx?WSDL')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Token_inv_input_2_Tracki'), 
    'tWUlibp4YoIDteR0AY95TsriJ5CZdHDQdbP4dSZk3pk=')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Catalog'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_FTP Host_inv_input_2_Cat'), 
    'ftp.davidsonsinventory.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_2_Cat'), 
    'ftp58074930-1')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_2_Cat'), 
    'DavDealerInv')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Inventory'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_FTP Host_inv_input_2_Inv'), 
    'ftp.davidsonsinventory.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_2_Inv'), 
    'ftp58074930-1')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_2_Inv'), 
    'DavDealerInv')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/button_Add Distributor Invento'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/select_AppCoSSGreen SupplyDavi_3'), 
    'Ellet', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/select_AppCoSSGreen SupplyDavi_3'), 
    '4', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Orders'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_FTP Host_inv_input_3_Ord'), 
    'ftp.unitedsportingco.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_SourceCode_inv_input_3_O'), 
    'EF')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_3_Ord'), 
    'Broker')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_CustomerNumber_inv_input_7'), 
    '19929685')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_CustomerNumber_inv_input_8'), 
    '19929685')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_AddrCode_inv_input_3_Ord'), 
    '0000001')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_WhseID_inv_input_3_Order'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_DealerName_inv_input_3_O'), 
    'Outdoor Liquidators')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_3_Ord'), 
    '4AoN8KUK')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Tracking'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_FTP Host_inv_input_3_Tra'), 
    'ftp.unitedsportingco.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_3_Tra'), 
    'Broker')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_3_Tra'), 
    '4AoN8KUK')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Catalog'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_FTP Host_inv_input_3_Cat'), 
    'ftp.unitedsportingco.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_3_Cat'), 
    'Broker')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_3_Cat'), 
    '4AoN8KUK')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/h5_Inventory'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_FTP Host_inv_input_3_Inv'), 
    'ftp.unitedsportingco.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_UserName_inv_input_3_Inv'), 
    'Broker')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/input_Password_inv_input_3_Inv'), 
    '4AoN8KUK')

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/button_Add Retailer'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/all_distributor_RA_MD_creation/button_Add Retailer'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Retailer creation/inventory_object repo/h5_Success  Congratulations Yo'), 
    'Success:  Congratulations!! You have successfully added retailer. Email has been sent to his email id!', FailureHandling.CONTINUE_ON_FAILURE)

