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

WebUI.callTestCase(findTestCase('00 - Call Test/Login-Admin-AddUser'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'orangeHRM.addAccounts.addAcc'()

WebUI.setText(findTestObject('Add New Account/TC09 - Add New User/Page_OrangeHRM/EmployeeName'), 'Cassidy Hope')

WebUI.waitForElementPresent(findTestObject('Add New Account/TC09 - Add New User/Page_OrangeHRM/employeeName_appear'), 15)

WebUI.click(findTestObject('Add New Account/TC09 - Add New User/Page_OrangeHRM/Page_OrangeHRM/valid_employeeName'))

WebUI.setText(findTestObject('Add New Account/TC09 - Add New User/Page_OrangeHRM/Username'), 'CassHope')

WebUI.setEncryptedText(findTestObject('Add New Account/TC09 - Add New User/Page_OrangeHRM/input_adduserPassword'), 'tEwjlZ0z5liP8F2yedS15Q==')

WebUI.setEncryptedText(findTestObject('Add New Account/TC09 - Add New User/Page_OrangeHRM/input_adduserConfirmPassword'), 
    'tEwjlZ0z5liP8F2yedS15Q==')

WebUI.click(findTestObject('Add New Account/TC09 - Add New User/Page_OrangeHRM/button_adduserSave'))

WebUI.waitForElementPresent(findTestObject('Add New Account/TC09 - Add New User/Page_OrangeHRM/element_adduserSuccessSuccessfullySaved'), 
    0)

WebUI.waitForElementNotPresent(findTestObject('Add New Account/TC09 - Add New User/Page_OrangeHRM/element_adduserSuccessSuccessfullySaved'), 
    0)

WebUI.closeBrowser()

