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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('Testdata_External').getValue('URL', 3))

WebUI.setText(findTestObject('Object Repository/TestCase2_ecommerce/Page_ProtoCommerce/input_Name_name'), findTestData('Testdata_External').getValue(
        'UserName', 3))

WebUI.setText(findTestObject('Object Repository/TestCase2_ecommerce/Page_ProtoCommerce/input_Email_email'), findTestData(
        'Testdata_External').getValue('Email', 3))

WebUI.setEncryptedText(findTestObject('Object Repository/TestCase2_ecommerce/Page_ProtoCommerce/input_Password_exampleInputPassword1'), 
    findTestData('Testdata_External').getValue('Password', 3))

WebUI.click(findTestObject('Object Repository/TestCase2_ecommerce/Page_ProtoCommerce/input_Password_exampleCheck1'))

WebUI.click(findTestObject('Object Repository/TestCase2_ecommerce/Page_ProtoCommerce/input_Student_inlineRadioOptions'))

WebUI.setText(findTestObject('Object Repository/TestCase2_ecommerce/Page_ProtoCommerce/DOB'), findTestData('Testdata_External').getValue(
        'DOB', 3))

WebUI.click(findTestObject('Object Repository/TestCase2_ecommerce/Page_ProtoCommerce/input_Date of Birth_btn btn-success'))

WebUI.click(findTestObject('Object Repository/TestCase2_ecommerce/Page_ProtoCommerce/div_                    Success The Form ha_13b099'))

WebUI.closeBrowser()

