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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app-qa.appcohesion.io/')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/a_SettingsSettings'))

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/a_Distributor  Inventory Sourc'))

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/button_Add Distributor Setting'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/select_AppCoSports SouthGreen'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_0_Ord'), 
    '99994')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input'), 
    '99994')

not_run: WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_UserNameCustomerNumberAPI'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_0'), 
    'http://webservices.theshootingwarehouse.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Source_inv_input_0_Order'), 
    '44494')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_0_Ord'), 
    'Hn+eoDA1lfc=')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_0_Tra'), 
    '99994')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_1'), 
    '99994')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_2'), 
    '99994')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_UserNameCustomerNumberAPI'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_0_1'), 
    'http://webservices.theshootingwarehouse.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_0_2'), 
    'http://webservices.theshootingwarehouse.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Source_inv_input_0_Track'), 
    '44494')

WebUI.setEncryptedText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_0_Tra'), 
    'Hn+eoDA1lfc=')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_0_Cat'), 
    '99994')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_3'), 
    '99994')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_4'), 
    '99994')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_UserNameCustomerNumberAPI'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_0_3'), 
    'http://webservices.theshootingwarehouse.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_0_4'), 
    'http://webservices.theshootingwarehouse.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Source_inv_input_0_Catal'), 
    '44494')

WebUI.setEncryptedText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_0_Cat'), 
    'Hn+eoDA1lfc=')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_0_Inv'), 
    '99994')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_5'), 
    '99994')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_6'), 
    '99994')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_UserNameCustomerNumberAPI'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_0_5'), 
    'http://webservices.theshootingwarehouse.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_0_6'), 
    'http://webservices.theshootingwarehouse.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Source_inv_input_0_Inven'), 
    '44494')

WebUI.setEncryptedText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_0_Inv'), 
    'Hn+eoDA1lfc=')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/button_Add Distributor Setting'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/select_AppCoSports SouthGreen _1'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_APP COHESIONDashboardDashb'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_FTP Host_inv_input_1_Cat'), 
    'ftp.drivehq.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_1_Ord'), 
    'eenu@getnada.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_1_Ord'), 
    'WmurgoS75WXxsu6z04las0MhZns+GheY')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_OrdersFTP HostUserNamePass'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_FTP Host_inv_input_1_Tra'), 
    'ec2-18-188-197-73.us-east-2.compute.amazonaws.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_1_Tra'), 
    'ubuntu')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_1_Tra'), 
    'bQCaafMJnyk=')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_FTP Host_inv_input_1_Cat'), 
    'ftp://ftp.dealerease.net')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_1_Cat'), 
    'gsdealer')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_1_Cat'), 
    'PMuesL9gUlc+m3muDeCpcQ==')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_FTP Host_inv_input_1_Inv'), 
    'ftp://ftp.dealerease.net')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_1_Inv'), 
    'gsdealer')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_1_Inv'), 
    'PMuesL9gUlc+m3muDeCpcQ==')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/button_Add Distributor Setting'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/select_AppCoSports SouthGreen _2'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_7'), 
    '027805')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_8'), 
    '027805')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_ReferenceNumber_inv_inpu'), 
    'ID12345')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_CustomerNumberReferenceNum'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_2'), 
    'https://dealernetwork.davidsonsinc.com/testapi/orderservice.asmx?WSDL')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Token_inv_input_2_Orders'), 
    'tWUlibp4YoIDteR0AY95TsriJ5CZdHDQdbP4dSZk3pk=')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_9'), 
    '027805')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_10'), 
    '027805')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_ReferenceNumber_inv_inpu_1'), 
    'ID12345')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_ReferenceNumber_inv_inpu_2'), 
    'ID12345')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_API Endpoint'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_2_1'), 
    'https://dealernetwork.davidsonsinc.com/testapi/orderservice.asmx?WSDL')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_2_2'), 
    'https://dealernetwork.davidsonsinc.com/testapi/orderservice.asmx?WSDL')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Token_inv_input_2_Tracki'), 
    'tWUlibp4YoIDteR0AY95TsriJ5CZdHDQdbP4dSZk3pk=')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_APP COHESIONDashboardDashb_1'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_FTP Host_inv_input_2_Cat'), 
    'ftp.davidsonsinventory.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_2_Cat'), 
    'ftp58074930-1')

WebUI.setEncryptedText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_2_Cat'), 
    'C5CXEcGDlQGtfqbwXQSURw==')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_APP COHESIONDashboardDashb_2'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_FTP Host_inv_input_2_Inv'), 
    'ftp.davidsonsinventory.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_2_Inv'), 
    'ftp58074930-1')

WebUI.setEncryptedText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_2_Inv'), 
    'C5CXEcGDlQGtfqbwXQSURw==')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/button_Add Distributor Setting'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/select_AppCoSports SouthGreen _3'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_APP COHESIONDashboardDashb_3'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_FTP Host_inv_input_3_Ord'), 
    'ftp.unitedsportingco.com')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_FTP HostSourceCodeUserName'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_SourceCode_inv_input_3_O'), 
    'EF')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_3_Ord'), 
    'Broker')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_11'), 
    '19929685')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_CustomerNumber_inv_input_12'), 
    '19929685')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_AddrCode_inv_input_3_Ord'), 
    '0000001')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_WhseID_inv_input_3_Order'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_DealerName_inv_input_3_O'), 
    'Outdoor Liquidators')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_3_Ord'), 
    'LVqfR/qiBaXrkZ1BGQsorA==')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_FTP Host_inv_input_3_Tra'), 
    'ftp.unitedsportingco.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_3_Tra'), 
    'Broker')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_3_Tra'), 
    'LVqfR/qiBaXrkZ1BGQsorA==')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_FTP Host_inv_input_3_Cat'), 
    'ftp.unitedsportingco.com')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_FTP HostUserNamePassword'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_3_Cat'), 
    'Broker')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_3_Cat'), 
    'LVqfR/qiBaXrkZ1BGQsorA==')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/div_APP COHESIONDashboardDashb_6'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_FTP Host_inv_input_3_Inv'), 
    'ftp.unitedsportingco.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_UserName_inv_input_3_Inv'), 
    'Broker')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_3_Inv'), 
    'LVqfR/qiBaXrkZ1BGQsorA==')

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/button_Add Distributor Setting'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/select_AppCoSports SouthGreen _4'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/h5_Orders'))

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Email_inv_input_4_Orders'), 
    'tim@lcatactical.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_4'), 
    'http://demo1411313.mockable.io/lipseytestapi')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_4_Ord'), 
    'SSxfD1NlaJYUvUiLgit/AQ==')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Email_inv_input_4_Tracki'), 
    'tim@lcatactical.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_4_1'), 
    'http://demo1411313.mockable.io/lipseytestapi')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_API Endpoint_inv_input_4_2'), 
    'http://demo1411313.mockable.io/lipseytestapi')

WebUI.setEncryptedText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_4_Tra'), 
    'SSxfD1NlaJYUvUiLgit/AQ==')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_FTP Host_inv_input_4_Cat'), 
    'https://www.lipseys.com/API/catalog.ashx')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Email_inv_input_4_Catalo'), 
    'tim@lcatactical.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_4_Cat'), 
    'SSxfD1NlaJYUvUiLgit/AQ==')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_FTP Host_inv_input_4_Inv'), 
    'ftp.unitedsportingco.com')

WebUI.setText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Email_inv_input_4_Invent'), 
    'tim@lcatactical.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Retailer creation/inventory_object repo/new inventory repo2/input_Password_inv_input_4_Inv'), 
    'SSxfD1NlaJYUvUiLgit/AQ==')

