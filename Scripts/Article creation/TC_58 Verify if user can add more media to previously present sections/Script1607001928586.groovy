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

WebUI.callTestCase(findTestCase('Article creation/TC_01 Verify on click of Create Article button user is redircted to article creation page'), 
    [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.check(findTestObject('Article/Category checkbox'))

WebUI.click(findTestObject('Article/Article overlay'))

WebUI.setText(findTestObject('Article/Article title_header'), 'My saved article 2')

WebUI.click(findTestObject('Article/Templates menu button'))

WebUI.click(findTestObject('Article/Templates/Text template'))

WebUI.click(findTestObject('Article/Save button - Article'))

WebUI.delay(3)

WebUI.click(findTestObject('Sidebar/Sidebar menu'))

WebUI.click(findTestObject('Sidebar/Articles menu'))

WebUI.setText(findTestObject('Article listing page/Search_article listing'), 'My saved article 2')

WebUI.delay(1)

WebUI.click(findTestObject('Article listing page/Row- article click 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Article/scroll to added sections/Text section'), 0)

WebUI.click(findTestObject('Article/button_ADD MEDIA'))

WebUI.click(findTestObject('Article/Settings button_content box'))

WebUI.click(findTestObject('Content box/video tab'))

WebUI.setText(findTestObject('Content box/Input video url'), 'https://www.youtube.com/watch?v=hr8m-uvNG6I')

WebUI.click(findTestObject('Content box/save button_content box'))

