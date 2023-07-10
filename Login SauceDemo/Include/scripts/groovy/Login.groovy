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



class Login {
	@Given("User membuka browser")
	def openbrowser() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.str_url)
	}

	@When("User berada di login page")
	def loginpage() {
		WebUI.verifyElementPresent(new TestObject().addProperty('name', ConditionType.EQUALS, 'login-button'),0)
	}

	@And("User memasukkan credential yang benar")
	def inputCredential() {
		WebUI.verifyElementPresent(new TestObject().addProperty('placeholder', ConditionType.EQUALS, 'Username' ) (GlobalVariable.str_id),0)
		WebUI.setText(new TestObject().addProperty('placeholder', ConditionType.EQUALS, 'Username' ) (GlobalVariable.str_id),0)
		WebUI.setText(new TestObject().addProperty('placeholder', ConditionType.EQUALS, 'Password') (GlobalVariable.str_pass),0)
	}

	@And("User memasukkan credential yang salah")
	def inputwrongCredential() {
		WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="user-name"]') (GlobalVariable.str_wid),0)
		WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="password"]') (GlobalVariable.str_wpass),0)
	}

	@And("User click tombol login")
	def clickLogin() {
		//verify element password field
		WebUI.click(new TestObject().addProperty('id', ConditionType.EQUALS, 'login-button'),0)
	}

	@Then("User berhasil login")
	def sucessLogin() {
		//delay until page displayed
		WebUI.delay(10)
		//WebUI.waitForElementVisible(new TestObject().addProperty('xpath', ConditionType.EQUALS, ''),0)
		//WebUI.verifyElementPresent(new TestObject().addProperty('xpath', ConditionType.EQUALS, ''),0)
	}
}