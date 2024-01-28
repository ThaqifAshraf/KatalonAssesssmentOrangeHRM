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

WebUI.callTestCase(findTestCase('00 - Call Test/Login-Admin-PayGrades'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Add Pay Grade/Page_OrangeHRM/btn_PayGradeAdd'))

WebUI.setText(findTestObject('Add Pay Grade/Page_OrangeHRM/input_PayGradeName'), 'test123')

WebUI.click(findTestObject('Add Pay Grade/Page_OrangeHRM/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Add Currency/Page_OrangeHRM/btn_AddCurrency'))

WebUI.click(findTestObject('Add Currency/Page_OrangeHRM/dropdown_btnCurrency'))

WebUI.verifyElementPresent(findTestObject('Add Currency/Page_OrangeHRM/dropdownList_Currency'), 0)

WebUI.click(findTestObject('Add Currency/Page_OrangeHRM/ListCurrency_MYR'))

WebUI.setText(findTestObject('Add Currency/Page_OrangeHRM/input_MinSalary'), 'test')

WebUI.verifyElementPresent(findTestObject('Add Currency/Page_OrangeHRM/appear_invalidcurrencyMinSalary'), 0)

WebUI.setText(findTestObject('Add Currency/Page_OrangeHRM/input_MaxSalary'), 'test')

WebUI.verifyElementPresent(findTestObject('Add Currency/Page_OrangeHRM/appear_invalidcurrencyMaxSalary'), 0)

WebUI.closeBrowser()

