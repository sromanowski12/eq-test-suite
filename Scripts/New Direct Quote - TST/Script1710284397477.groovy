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

username = findTestData('LoginAndSignUp').getValue(5, 1)

password = findTestData('LoginAndSignUp').getValue(6, 1)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mingle-portal.inforcloudsuite.com/KINRO_TST?Identity=Mingle')

WebUI.click(findTestObject('Object Repository/KINRO_TST/Page_Infor CloudIdentities - Sign In/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/KINRO_TST/Page_Infor CloudIdentities - Sign In/input_Username_username'), 
    username)

WebUI.setEncryptedText(findTestObject('Object Repository/KINRO_TST/Page_Infor CloudIdentities - Sign In/input_Password_pass'), 
    'VCJAGvRPL32rAH9ErxswkbUpa0/gezy0')

WebUI.sendKeys(findTestObject('Object Repository/KINRO_TST/Page_Infor CloudIdentities - Sign In/input_Password_pass'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/KINRO_TST/Page_Enterprise Quoting/span_New Quote'))

WebUI.click(findTestObject('Object Repository/KINRO_TST/Page_Enterprise Quoting/span_Select Customer'))

WebUI.click(findTestObject('Object Repository/KINRO_TST/Page_Enterprise Quoting/span_Select_ARE'))

WebUI.setText(findTestObject('Page_Infor CloudIdentities - Sign In/input_Username_username'), 'sromanowski@lci1.com')

WebUI.setEncryptedText(findTestObject('Page_Infor CloudIdentities - Sign In/input_Password_pass'), 'VCJAGvRPL32rAH9ErxswkbUpa0/gezy0')

WebUI.sendKeys(findTestObject('Page_Infor CloudIdentities - Sign In/input_Password_pass'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Enterprise Quoting/a_New Quote'))

WebUI.click(findTestObject('Object Repository/Page_Enterprise Quoting/span_Select Customer'))

WebUI.click(findTestObject('Page_Enterprise Quoting/span_Select_ARE'))


WebUI.click(findTestObject('Page_Enterprise Quoting/span_Add Items'))

WebUI.setText(findTestObject('Page_Enterprise Quoting/input_DQ002574-1  0 Line (s)_v-field-value'), 'picture')

WebUI.sendKeys(findTestObject('Page_Enterprise Quoting/input_DQ002574-1  0 Line (s)_v-field-value'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Enterprise Quoting/Picture Window'))

WebUI.click(findTestObject('Page_Enterprise Quoting/a_Configure'))

