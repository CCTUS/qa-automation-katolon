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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.gogocar.com/')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('gogo user journey/Page_GoGoCar/span_GOT IT (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('gogo user journey/Page_GoGoCar/span_GOT IT (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('gogo user journey/Page_GoGoCar/div_Cars_md-thumb md-ink-rippl'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('gogo user journey/Page_GoGoCar/div_Cars_md-thumb md-ink-rippl'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('gogo user journey/Page_GoGoCar/a_BUILD YOUR DREAM CAR (1)'), 3)

WebUI.dragAndDropToObject(findTestObject('gogo user journey/Page_GoGoCar/a_BUILD YOUR DREAM CAR (1)'), findTestObject('gogo user journey/Page_GoGoCar/a_BUILD YOUR DREAM CAR (1)'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('gogo user journey/Page_GoGoCar/a_BUILD YOUR DREAM CAR (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('gogo user journey/recent_acura/div_Add   Choose       Make'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('gogo user journey/recent_acura/Page_GoGoCar/div_     Acura  5788 Cars'), 3)

WebUI.click(findTestObject('gogo user journey/recent_acura/Page_GoGoCar/div_     Acura  5788 Cars'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('gogo user journey/recent_acura/Page_GoGoCar/div_ILX  370 Cars'), 3)

WebUI.click(findTestObject('gogo user journey/recent_acura/Page_GoGoCar/div_ILX  370 Cars'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('gogo user journey/recent_acura/Page_GoGoCar/div_2017  96 Cars'))

WebUI.click(findTestObject('Object Repository/gogo user journey/recent_acura/Page_GoGoCar/div_2017  96 Cars'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/select obj2/div_Price Range  27680 -  2894'), 
    5)

WebUI.click(findTestObject('Object Repository/gogo user journey/recent_acura/select obj2/div_Price Range  27680 -  2894'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)
//WebUI.click(findTestObject('Album detail screen/buttonListen', [('ButtonPosition'): IdexForButton]))


WebUI.scrollToElement(findTestObject('gogo user journey/recent_acura/select_obj/div_SELECT  CONTINUE (1)'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('gogo user journey/recent_acura/select_obj/div_SELECT  CONTINUE (1)'), 3 //(findTestObject('gogo user journey/recent_acura/select_obj/div_SELECT  CONTINUE'))
    )

WebUI.click(findTestObject('gogo user journey/recent_acura/select_obj/div_SELECT  CONTINUE (1)',[('div_SELECT  CONTINUE (1)'):1]), FailureHandling.CONTINUE_ON_FAILURE)

not_run: CustomKeywords.'element_visible.select_element_visible.clickUsingJS'(findTestObject('gogo user journey/recent_acura/select_obj/div_SELECT  CONTINUE'))

not_run: WebUI.verifyElementPresent(findTestObject('null'), 10)

not_run: WebUI.click(findTestObject('null'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/Page_GoGoCar/div_2017 Acura ILX Base  Rick'), 
    5)

WebUI.click(findTestObject('Object Repository/gogo user journey/recent_acura/Page_GoGoCar/div_2017 Acura ILX Base  Rick'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/h2_Rick Case Acura FL  8904 mi'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/gogo user journey/recent_acura/h2_Rick Case Acura FL  8904 mi'), 
    'Rick Case Acura, FL | 8904 mi')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/p_VIN 19UDE2F38HA014154'))

WebUI.verifyElementText(findTestObject('Object Repository/gogo user journey/recent_acura/p_VIN 19UDE2F38HA014154'), 'VIN# 19UDE2F38HA014154')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/p_STOCK AHA014154'))

WebUI.verifyElementText(findTestObject('Object Repository/gogo user journey/recent_acura/p_STOCK AHA014154'), 'STOCK# AHA014154')

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/div_27680  GoGoCar Price'))

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/p_GoGoCar Price'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/gogo user journey/recent_acura/p_GoGoCar Price'), 'GoGoCar Price')

WebUI.waitForElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/h2_27680'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/gogo user journey/recent_acura/h2_27680'), '$27680')

WebUI.waitForElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/div_1260  You Save         14'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/h3_1260'))

WebUI.verifyElementText(findTestObject('Object Repository/gogo user journey/recent_acura/h3_1260'), ' $1260')

WebUI.waitForElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/div_28940   MSRP Price'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/h4_28940'), 3)

WebUI.verifyElementText(findTestObject('Object Repository/gogo user journey/recent_acura/h4_28940'), '$28940', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/div_EXPLORE FURTHER'), 2)

WebUI.click(findTestObject('Object Repository/gogo user journey/recent_acura/div_EXPLORE FURTHER'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/gogo user journey/recent_acura/div_Continue  as Guest'), 2)

WebUI.click(findTestObject('Object Repository/gogo user journey/recent_acura/div_Continue  as Guest'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/gogo user journey/recent_acura/div_Proceed Skip Tradein'))

WebUI.setText(findTestObject('Object Repository/gogo user journey/recent_acura/input_Please provide your ZIP'), '11210')

WebUI.click(findTestObject('Object Repository/gogo user journey/recent_acura/button_Please provide your ZIP'))

WebUI.click(findTestObject('Object Repository/gogo user journey/recent_acura/div_Go with Pay in Cash'))

WebUI.click(findTestObject('Object Repository/gogo user journey/recent_acura/span_Go with Pay in Cash'))

WebUI.setText(findTestObject('Object Repository/gogo user journey/recent_acura/input__UserFirstName'), 'ggg')

WebUI.setText(findTestObject('Object Repository/gogo user journey/recent_acura/input__UserLastName'), 'jjj')

WebUI.setText(findTestObject('Object Repository/gogo user journey/recent_acura/input_(optional)_UserEmail'), 'snekalatha.r@iinerds.com')

WebUI.setText(findTestObject('Object Repository/gogo user journey/recent_acura/input__streetnumber'), '44')

WebUI.setText(findTestObject('Object Repository/gogo user journey/recent_acura/input__Address'), 'eee')

WebUI.selectOptionByValue(findTestObject('Object Repository/gogo user journey/recent_acura/select_ALAKAZARCACOCTDEFLGAHII'), 
    'NY', true)

WebUI.setText(findTestObject('Object Repository/gogo user journey/recent_acura/input__userCity'), 'Brooklyn')

WebUI.setText(findTestObject('Object Repository/gogo user journey/recent_acura/input__zipcode'), '11210')

WebUI.click(findTestObject('Object Repository/gogo user journey/recent_acura/div_CONTINUE'))

WebUI.delay(3)

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

