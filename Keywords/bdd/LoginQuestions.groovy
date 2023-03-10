package bdd

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class LoginQuestions {

	def getLoginConfirmation() {
		assert WebUI.getUrl() == "https://katalon-demo-cura.herokuapp.com/#appointment"
		KeywordUtil.logInfo("Obtained url is: " + WebUI.getUrl())
		WebUI.verifyElementPresent( findTestObject('Object Repository/MakeAppointment/select_facility'), 0)
	}
	
	def getLoggedToggleMenuOptions() {
		WebUI.click(findTestObject('Object Repository/homePage/a_menuToggle'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/homePage/a_menuOptionHistory') , 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/homePage/a_menuOptionProfile') , 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/homePage/a_menuOptionLogout') , 0)
	}
}
