import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//login with empty credentials

//Open browser
WebUI.openBrowser(GlobalVariable.cura_url)
WebUI.maximizeWindow()

//Try to make an appointment
WebUI.click( findTestObject('Object Repository/homePage/a_Make Appointment'))

//Enter empty credentials
WebUI.setText(findTestObject('Object Repository/login/input_Username_username'), "")
WebUI.setText(findTestObject('Object Repository/login/input_Password_password'), "")
WebUI.click(findTestObject('Object Repository/login/button_Login'))

//Verify error message appears
WebUI.verifyElementPresent(findTestObject('Object Repository/login/p_Login failed text') , 0)

//Close browser
WebUI.closeBrowser()