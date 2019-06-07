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

int n = 0

Mobile.startApplication('APK\\com.takeda.Veryx.apk', true)

Mobile.waitForElementPresent(findTestObject('Contact_OR/android.widget.TextView9 - Close Section'), 5)

Mobile.tap(findTestObject('Contact_OR/android.view.ViewGroup13'), 5)

Mobile.waitForElementPresent(findTestObject('Contact_OR/android.widget.TextView9 - Close Section'), 5)

Mobile.setText(findTestObject('Contact_OR/android.view.ViewGroup15'), 'alejostests@gmail.com', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Contact_OR/android.view.ViewGroup23'), 'Inicio.123', 5)

Mobile.hideKeyboard()

Mobile.takeScreenshot(('Screenshots\\Contact\\Contact' + n) + '.png')

n++

Mobile.tap(findTestObject('Contact_OR/android.view.ViewGroup29'), 5)

Mobile.waitForElementPresent(findTestObject('Contact_OR/android.widget.TextView9 - Close Section'), 5)

Mobile.takeScreenshot(('Screenshots\\Contact\\Contact' + n) + '.png')

n++

Mobile.tap(findTestObject('Contact_OR/android.widget.ImageView0'), 5)

Mobile.waitForElementPresent(findTestObject('Contact_OR/android.widget.TextView9 - Close Section'), 5)

Mobile.takeScreenshot(('Screenshots\\Contact\\Contact' + n) + '.png')

n++

Mobile.tap(findTestObject('Contact_OR/android.view.ViewGroup35'), 5)

Mobile.waitForElementPresent(findTestObject('Contact_OR/android.widget.TextView4 - Address Baxalta'), 5)

Mobile.takeScreenshot(('Screenshots\\Contact\\Contact' + n) + '.png')

n++

Mobile.closeApplication()

