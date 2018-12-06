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

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/h5_Orders'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_CustomerNumber_inv_input'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_ReferenceNumber_inv_inpu'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_API Endpoint_inv_input_0'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_Token_inv_input_0_Orders'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/h5_Tracking'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_CustomerNumber_inv_input_1'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_ReferenceNumber_inv_inpu_1'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_API Endpoint_inv_input_0_1'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_Token_inv_input_0_Tracki'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/h5_Catalog'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_FTP Host_inv_input_0_Cat'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_UserName_inv_input_0_Cat'))

WebUI.setEncryptedText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_Password_inv_input_0_Cat'), 
    '9NLz+4tGZcQ=')

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_FTP Host_inv_input_0_Inv'))

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_UserName_inv_input_0_Inv'))

WebUI.setEncryptedText(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/input_Password_inv_input_0_Inv'), 
    '9NLz+4tGZcQ=')

WebUI.rightClick(findTestObject('Object Repository/Retailer creation/inventory_object repo/davidson_obj_repo/button_Add Distributor Invento'))

