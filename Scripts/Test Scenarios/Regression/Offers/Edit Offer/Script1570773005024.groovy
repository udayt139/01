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

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Edit Offer/Page_Templates/a_Offers'))

WebUI.click(findTestObject('Object Repository/Edit Offer/Page_Offers/a_abc'))

WebUI.click(findTestObject('Object Repository/Edit Offer/Page_Offers/button_Yes Edit'))

WebUI.click(findTestObject('Object Repository/Edit Offer/Page_Offers/input_Aquisition_marketingCategory'))

WebUI.click(findTestObject('Object Repository/Edit Offer/Page_Offers/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Edit Offer/Page_Offers/button_Make Active'))

WebUI.click(findTestObject('Object Repository/Edit Offer/Page_Offers/button_Yes Make Active'))

