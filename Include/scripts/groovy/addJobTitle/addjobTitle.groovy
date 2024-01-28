package addJobTitle
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

import internal.GlobalVariable

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



class addjobTitle {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to OrangeHRM to add a job title")
	def navigate_addJobTitle() {
		WebUI.callTestCase(findTestCase('00 - Call Test/Login-Admin-JobTitle'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Input a name (.*) for the job title")
	def input_jobTitle(String jobTitle) {
		WebUI.setText(findTestObject('Object Repository/Add Job Titles/Page_OrangeHRM/input_JobTitle'), jobTitle)
	}
	
	@And("I click on the save button")
	def click_SaveButton() {
		WebUI.click(findTestObject('Object Repository/Add Job Titles/Page_OrangeHRM/btn_Save'))
	}

	@Then("I successfully added a job title into the system")
	def verify_JobTitle() {
		WebUI.verifyElementNotPresent(findTestObject('Add Job Titles/Page_OrangeHRM/appear_SuccesfullyAdded'), 0)
	}
}