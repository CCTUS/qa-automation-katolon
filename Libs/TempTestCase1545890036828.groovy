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


RunConfiguration.setExecutionSettingFile('C:\\Users\\user\\AppData\\Local\\Temp\\Katalon\\20181227_112356\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.callTestCase(findTestCase(\'Call Test Case/StoreAdmin Login\'), [:], FailureHandling.STOP_ON_FAILURE)\n\nWebUI.delay(4)\n\nWebUI.setText(findTestObject(\'Page_AppCohesion/input_Invoice_common_searchpro (1)\'), \'Ruger Lower Receiver AR\')\n\nWebUI.delay(5)\n\nWebUI.sendKeys(findTestObject(\'Page_AppCohesion/input_Invoice_common_searchpro (1)\'), Keys.chord(Keys.ENTER))\n\nnot_run: WebUI.click(findTestObject(\'Page_AppCohesion/i_Invoice_glyphicon glyphicon-\'))\n\nWebUI.verifyElementVisible(findTestObject(\'Page_AppCohesion/div_Ruger Lower Receiver AR (1)\'))\n\nWebUI.click(findTestObject(\'Page_AppCohesion/div_Ruger Lower Receiver AR (1)\'))\n\nWebUI.delay(4)\n\nWebUI.click(findTestObject(\'Page_AppCohesion/button_ADD TO CART (1)\'))\n\nWebUI.delay(5)\n\nWebUI.verifyElementVisible(findTestObject(\'Page_AppCohesion/span_Added to Cart (1)\'))\n\nWebUI.click(findTestObject(\'Page_AppCohesion/img (1)\'))\n\nWebUI.verifyElementVisible(findTestObject(\'Page_AppCohesion/h5_Ruger Lower Receiver AR (1)\'))\n\nWebUI.click(findTestObject(\'Page_AppCohesion/button_View Cart (1)\'))\n\nWebUI.verifyElementVisible(findTestObject(\'Page_AppCohesion/h5_Ruger Lower Receiver AR    _1 (1)\'))\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

