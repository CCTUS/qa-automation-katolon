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

@keyword
public class  waitForElement(TestObject elementName)
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
			catch (Exception e) {
				System.out.println("Waiting for the element:" + elementName)
				try {
					Thread.sleep(1000)
				} catch (InterruptedException e1) {
					e1.printStackTrace()
				}
			}
		}
		return true
	}

