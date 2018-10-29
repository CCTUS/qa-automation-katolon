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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.gogocar.com/')

WebUI.maximizeWindow()

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/span_GOT IT'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/a_BUILD YOUR DREAM CAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/li_I know what I want'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_GOT IT_navigation-overlay'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Add   Choose       Make'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Dodge_selection_img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/span_43983 Cars'))

WebUI.verifyElementText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/span_43983 Cars'), '43983 Cars')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Ford  43983 Cars'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Ford  43983 Cars'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Edge  3890 Cars'))

WebUI.verifyElementText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Edge  3890 Cars'), 'Edge  3890 Cars')

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Edge  3890 Cars'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_2017  1131 Cars'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_2017  1131 Cars'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('gogocar_obj_repo/Page_GoGoCar/Page_GoGoCar/div_SELECT  CONTINUE'))

WebUI.click(findTestObject('gogocar_obj_repo/Page_GoGoCar/Page_GoGoCar/div_SELECT  CONTINUE'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_SELECT  CONTINUE'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_2017 Ford Edge SE  Lorenzo'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_2017 Ford Edge SE  Lorenzo'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_2017  Ford Edge SE    Buil'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/span_2017  Ford Edge SE    Bui'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Lorenzo Ford FL  8953 mi_c'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/p_VIN 2FMPK3G99HBB77957'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/p_VIN 2FMPK3G99HBB77957'), 'VIN# 2FMPK3G99HBB77957')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/p_STOCK HBB77957'))

WebUI.verifyElementText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/p_STOCK HBB77957'), 'STOCK# HBB77957')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_21886  GoGoCar Price'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/p_GoGoCar Price'))

WebUI.verifyElementText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/p_GoGoCar Price'), 'GoGoCar Price')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/h2_21886'))

WebUI.verifyElementText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/h2_21886'), ' $21886 ')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_8154  You Save         37'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/h3_8154'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/h3_8154'), ' $8154')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_30040   MSRP Price'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/h4_30040'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/h4_30040'), ' $30040 ')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_MSRP Price'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_EXPLORE FURTHER'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_EXPLORE FURTHER'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Continue  as Guest'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Continue  as Guest'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Proceed_ngsb-thumb-pos'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Proceed Skip Tradein'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Proceed Skip Tradein'))

WebUI.setText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/input_Please provide your ZIP'), '11210')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/button_Please provide your ZIP'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/span_Go with Pay in Cash'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/span_Go with Pay in Cash'))

WebUI.delay(0)

WebUI.setText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/input__UserFirstName'), 'John')

WebUI.setText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/input__UserLastName'), 'Fremid')

WebUI.setText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/input_(optional)_UserEmail'), 'snekalatha.r@iinerds.com')

WebUI.setText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/input__streetnumber'), '123')

WebUI.setText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/input__Address'), 'New Mark avenue')

WebUI.selectOptionByValue(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/select_ALAKAZARCACOCTDEFLGAHII'), 
    'NY', true)

WebUI.setText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/input__userCity'), 'Brooklyn')

WebUI.setText(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/input__zipcode'), '11210')

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_CONTINUE'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/li_2017FordEdgeSE  Lorenzo For'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_ 21886'))

WebUI.rightClick(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/span_VIN 2FMPK3G99HBB77957'))

WebUI.rightClick(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/a_2017FordEdgeSE  Lorenzo Ford'))

WebUI.rightClick(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/span_GoGoCar Savings       37'))

WebUI.rightClick(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_ 8154'))

WebUI.rightClick(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/span_GoGoCar Grand Total'))

WebUI.rightClick(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_ 21886'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_How long do you plan on ke'))

WebUI.selectOptionByValue(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/select_Less than 5 years More'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_How many miles per year do'))

WebUI.selectOptionByValue(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/select_Less than 10000  More t'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Where do you plan on havin'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Where do you plan on havin_4'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_How do you plan on using t'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_How do you plan on using t_1'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_How often do you plan on h'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_How often do you plan on h_1'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Do you have any service or'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_Do you have any service or_1'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/div_CONTINUE'))

WebUI.click(findTestObject('Object Repository/gogocar_obj_repo/Page_GoGoCar/b_Options'))

