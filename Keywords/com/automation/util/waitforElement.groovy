package com.automation.util

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.WebDriverWait
import java.util.concurrent.TimeUnit




public class waithelper {

	public void waitForElement(By locator){
		WebDriver driver = DriverFactory.getWebDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.ignoring(ElementNotFoundException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}


/*def clickElement(TestObject to) {
 try {
 WebElement element = WebUiBuiltInKeywords.findWebElement(to)
 KeywordUtil.logInfo("Clicking element")
 element.click()
 KeywordUtil.markPassed("Element has been clicked")
 }
 catch (WebElementNotFoundException e) {
 KeywordUtil.markFailed("Element not found")
 } catch (Exception e) {
 KeywordUtil.markFailed("Fail to click on element")
 }
 }
 def waitForElement(TestObject elementName)
 {
 boolean isElementAvailable = false
 boolean isElementEnabled = false
 while (!isElementAvailable || !isElementEnabled)
 {
 try {
 // System.out.println(String.format("%s - isElementAvailable =
 // %s , isElementEnabled = %s", elementName, isElementAvailable,
 // isElementEnabled));
 isElementAvailable = WebUI.waitForElementPresent(elementName,20)
 // To handle special cases like file object
 isElementEnabled = WebUI.waitForElementVisible(elementName,20)
 System.out.println(String.format("%s - isElementAvailable = %s , isElementEnabled = %s", elementName,
 isElementAvailable, isElementEnabled))
 Thread.sleep(1000);
 catch (WebElementNotFoundException e) {
 KeywordUtil.markFailed("Element not found")
 } catch (Exception e) {
 KeywordUtil.markFailed("Fail to click on element")
 }
 }*/


