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


RunConfiguration.setExecutionSettingFile('C:\\Users\\user\\AppData\\Local\\Temp\\Katalon\\20181214_155234\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.callTestCase(findTestCase(\'Call Test Case/StoreAdmin Login\'), [:], FailureHandling.STOP_ON_FAILURE)\n\nWebUI.click(findTestObject(\'Page_AppCohesion/i_Employees\'))\n\nWebUI.click(findTestObject(\'Page_AppCohesion/button_ADD EMPLOYEE\'))\n\nWebUI.delay(10)\n\nWebUI.setText(findTestObject(\'Page_AppCohesion/input_FIRST NAME_firstName\'), \'Katalon\')\n\nWebUI.setText(findTestObject(\'Page_AppCohesion/input_LAST NAME_lastName\'), \'Store user\')\n\nWebUI.setText(findTestObject(\'Page_AppCohesion/input_USER NAME_userName\'), \'katalonstoreuser\')\n\nWebUI.setText(findTestObject(\'Page_AppCohesion/input_EMAIL ID_emailId\'), \'katalonstoreuser@getnada.com\')\n\nWebUI.setText(findTestObject(\'Page_AppCohesion/input_PHONE NUMBER_phoneNumber\'), \'(798) 798-7987\')\n\nWebUI.selectOptionByValue(findTestObject(\'Page_AppCohesion/select_2018-11-29T101243.035Z\'), \'621\', true)\n\nWebUI.delay(4)\n\nWebUI.click(findTestObject(\'Page_AppCohesion/button_ADD EMPLOYEE_1\'))\n\nWebUI.verifyElementVisible(findTestObject(\'Page_AppCohesion/h5_Success  Congratulations Yo\'))\n\nWebUI.delay(10)\n\n', FailureHandling.STOP_ON_FAILURE, true)

