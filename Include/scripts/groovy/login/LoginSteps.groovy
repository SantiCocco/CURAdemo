package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import bdd.LoginTasks
import bdd.LoginQuestions
import internal.GlobalVariable
import bdd.Navigate

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps {

	LoginQuestions login = new LoginQuestions()

	@Given("that user is on the login page")
	public void that_user_is_on_the_login_page() {

		Navigate goTo = new Navigate()
		goTo.homePage()
		goTo.loginPage()
	}


	@When("user enters userName as {string} and password as {string}")
	public void user_enters_userName_as_and_password_as(userName, password) {

		LoginTasks login = new LoginTasks()
		login.doLogin(userName, password)
	}

	@Then("user should be redirected to the Appointment Page")
	public void user_should_be_redirected_to_the_Appointment_Page() {
		login.getLoginConfirmation()
	}

	@And("see in the Toggle Menu the options History Profile and Logout")
	public void see_in_the_Toggle_Menu_the_options_History_Profile_and_Logout() {

		login.getLoggedToggleMenuOptions()
		WebUI.closeBrowser()
	}
}