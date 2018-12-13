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

WebUI.navigateToUrl('http://app-qa.appcohesion.io/')

WebUI.maximizeWindow()

for (def rowNum = 1; rowNum <= findTestData('TestDataFile').getRowNumbers(); rowNum++) {
    //WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), varUserName)
    WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_User Name_ac_username'), findTestData('TestDataFile').getValue(
            1, rowNum))

    //WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), varPassword)
    WebUI.setText(findTestObject('Login_OR/Page_AppCohesion/input_Password_ac_password'), findTestData('TestDataFile').getValue(
            2, rowNum))

    WebUI.click(findTestObject('Login_OR/Page_AppCohesion/button_Login Now'))

    //WebUI.click(findTestObject('add_pos_retailer/Page_AppCohesion/button_Login Now'))
    WebUI.delay(10)

    WebUI.click(findTestObject('Login_OR/Page_AppCohesion/Page_AppCohesion/img'))

    WebUI.click(findTestObject('Login_OR/Page_AppCohesion/Page_AppCohesion/a_Log Out'))

    Thread.sleep(3000)
}

