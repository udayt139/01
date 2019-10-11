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

WebUI.click(findTestObject('Object Repository/Create Offer/Page_Dashboard/div_Content'))

WebUI.click(findTestObject('Object Repository/Create Offer/Page_Templates/a_Offers'))

WebUI.click(findTestObject('Object Repository/Create Offer/Page_Offers/a_New Offer'))

WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/input_Offer Name_name'), 'abc')

WebUI.click(findTestObject('Object Repository/Create Offer/Page_Offers/input_Marketing Category_marketingCategory'))

WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_Offer Description_description'), 'abc')

not_run: WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_a'), 'ab')

not_run: WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_ab'), 'abc')

WebUI.click(findTestObject('Object Repository/Create Offer/Page_Offers/button_Select'))

WebUI.click(findTestObject('Object Repository/Create Offer/Page_Offers/a_English (US)'))

WebUI.click(findTestObject('Object Repository/Create Offer/Page_Offers/button_Next'))

WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_Title_title'), 'abc')

not_run: WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_a_1'), 'ab')

not_run: WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_ab_1'), 'abc')

WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_Subtitle_subtitle'), 'abc')

not_run: WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_a_2'), 'ab')

not_run: WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_ab_2'), 'abc')

WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_Body_body'), 'abc')

not_run: WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_a_3'), 'ab')

not_run: WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_ab_3'), 'abc')

WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/input_Offer_offer'), '123')

WebUI.click(findTestObject('Object Repository/Create Offer/Page_Offers/button_Select_1'))

WebUI.click(findTestObject('Object Repository/Create Offer/Page_Offers/a_No Expiration Date'))

WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_Terms  Conditions_termsAndConditions'), 
    'abc')

not_run: WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_a_4'), 'ab')

not_run: WebUI.setText(findTestObject('Object Repository/Create Offer/Page_Offers/textarea_ab_4'), 'abc')

WebUI.click(findTestObject('Object Repository/Create Offer/Page_Offers/button_Create'))

