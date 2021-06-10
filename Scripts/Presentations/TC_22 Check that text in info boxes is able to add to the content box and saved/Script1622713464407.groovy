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

WebUI.callTestCase(findTestCase('Presentations/TC_05 Check that title layout is able to select from the available 4 layouts'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Article/Templates menu button'))

WebUI.click(findTestObject('Presentations/Templates sidebar/Text slide'))

WebUI.click(findTestObject('Presentations/Presentation overlay'))

WebUI.click(findTestObject('Article/button_ADD MEDIA'))

WebUI.click(findTestObject('Presentations/Setting button_content box _pstn'))

WebUI.click(findTestObject('Presentations/Add media pop up/Info tab click'))

WebUI.setText(findTestObject('Presentations/Add media pop up/Input field_Info tab'), 'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.  The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using \'Content here, content here\', making it look like readable English.  Many des')

WebUI.setText(findTestObject('Presentations/Add media pop up/Input bkgd color_info'), '#2155FF')

WebUI.click(findTestObject('Presentations/Add media pop up/Save btn_add media pop up'))

