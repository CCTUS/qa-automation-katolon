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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SNEKAL~1\\AppData\\Local\\Temp\\Katalon\\20181026_161937\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://gogocar.com/\')\n\nWebUI.click(findTestObject(\'Page_GoGoCar/span_GOT IT\'))\n\nWebUI.click(findTestObject(\'Page_GoGoCar/a_BUILD YOUR DREAM CAR\'))\n\nWebUI.click(findTestObject(\'Page_GoGoCar/div_Add   Choose       Make\'))\n\nWebUI.click(findTestObject(\'Page_GoGoCar/div_Acura  2959 Cars\'))\n\nWebUI.click(findTestObject(\'Page_GoGoCar/div_ILX  94 Cars\'))\n\nWebUI.click(findTestObject(\'Page_GoGoCar/div_2018  83 Cars\'))\n\nWebUI.click(findTestObject(\'Page_GoGoCar/div_ 27640\'))\n\nWebUI.click(findTestObject(\'Page_GoGoCar/div_SELECT  CONTINUE\'))\n\nWebUI.click(findTestObject(\'Page_GoGoCar/div_GOT IT_navigation-overlay\'))\n\nWebUI.click(findTestObject(\'Page_GoGoCar/div_\'))\n\nWebUI.click(findTestObject(\'Page_GoGoCar/div_Assistance_md-bar\'))\n\nWebUI.click(findTestObject(\'Page_GoGoCar/div_EXPLORE FURTHER\'))\n\nWebUI.click(findTestObject(\'Page_GoGoCar/div_Continue  as Guest\'))\n\nWebUI.closeBrowser()\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

