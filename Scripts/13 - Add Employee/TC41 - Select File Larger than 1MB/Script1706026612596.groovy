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

WebUI.callTestCase(findTestCase('13 - Add Employee/TC39 - Add Employee'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('00 - Call Test/Login-Admin-PIM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/btn_AddEmployee'))

WebUI.setText(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/input_AddEmployeeFirstName'), 'Susan')

WebUI.setText(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/input_AddEmployeeMiddleName'), '')

WebUI.setText(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/input_AddEmployeeLastName'), 'Boyle')

WebUI.doubleClick(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/input_AddEmployeeID'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/input_AddEmployeeID'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/input_AddEmployeeID'), '55947')

WebUI.click(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/btn_switchCreateLogDetails'))

WebUI.setText(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/input_AddEmployeeUsername'), 'SusanBoy')

WebUI.setEncryptedText(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/input_Password'), '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.setEncryptedText(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/input_ConfirmPassword'), '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.click(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/btn_AddEmployeeSave'))

WebUI.verifyElementPresent(findTestObject('Add Employee (PIM)/Create Employee/Page_OrangeHRM/div_SuccessSuccessfully Saved'), 
    0)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('test/Page_OrangeHRM/btn_addAttachment'), 0)

WebUI.click(findTestObject('test/Page_OrangeHRM/btn_addAttachment'))

WebUI.uploadFile(findTestObject('test/Page_OrangeHRM/div_BrowseNo file selected'), 'C:\\Users\\60113\\Downloads\\test.png')

