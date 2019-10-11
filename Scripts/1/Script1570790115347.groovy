import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sandbox.gsm.auto/logout')

WebUI.click(findTestObject('Object Repository/1/Page_GSM Portal/button_Log in'))

WebUI.setText(findTestObject('Object Repository/1/Page_GSM Login/input_Email Address_email'), 'sankaran@totient.co.in')

WebUI.setEncryptedText(findTestObject('Object Repository/1/Page_GSM Login/input_Password_password'), '4bOuNFpH31s4Qkh1shYRow==')

WebUI.click(findTestObject('Object Repository/1/Page_GSM Login/button_Log In'))

WebUI.verifyElementText(findTestObject('1/Page_Offers/div_Welcome Sankaran'), 'Welcome, Sankaran')

not_run: WebUI.verifyElementPresent(findTestObject('1/Page_Offers/div_Welcome Sankaran'), 5)

WebUI.click(findTestObject('Object Repository/1/Page_Dashboard/div_Content'))

WebUI.click(findTestObject('Object Repository/1/Page_Templates/a_Offers'))

WebUI.click(findTestObject('Object Repository/1/Page_Offers/a_New Offer'))

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/input_Offer Name_name'), 'ab')

WebUI.click(findTestObject('Object Repository/1/Page_Offers/input_Marketing Category_marketingCategory'))

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_Offer Description_description'), 'a')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_a'), 'ab')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/input_Objects set to expire will be automatically archived_expiration'), 
    '12/12/2019')

WebUI.click(findTestObject('Object Repository/1/Page_Offers/button_Select'))

WebUI.click(findTestObject('Object Repository/1/Page_Offers/a_English (US)'))

WebUI.click(findTestObject('Object Repository/1/Page_Offers/button_Next'))

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_Title_title'), 'a')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_a_1'), 'ab')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_Subtitle_subtitle'), 'a')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_a_2'), 'ab')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_ab'), 'aba')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_aba'), 'abab')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_abab'), 'aba')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_aba'), 'ab')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_Body_body'), 'a')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_a_3'), 'ab')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/input_Offer_offer'), '12')

WebUI.click(findTestObject('Object Repository/1/Page_Offers/button_Select_1'))

WebUI.click(findTestObject('Object Repository/1/Page_Offers/a_No Expiration Date'))

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_Terms  Conditions_termsAndConditions'), 'a')

WebUI.setText(findTestObject('Object Repository/1/Page_Offers/textarea_a_4'), 'ab')

WebUI.click(findTestObject('Object Repository/1/Page_Offers/button_Create'))

WebUI.closeBrowser()

