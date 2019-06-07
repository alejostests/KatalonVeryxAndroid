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

Mobile.startApplication('E:\\Katalon projects\\KatalonVeryxAndroid\\APK\\com.takeda.Veryx.apk', true)

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup10'), 5)

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup23'), '123', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup33'), '123', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup43'), '123', 5)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.swipe(0, 0, 0, 200)

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup46'), '123', 5)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup57'), 5)

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup90'), 5)

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup63'), '1234', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup72'), '.123', 5)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.swipe(0, 200, 0, 0)

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup23'), 'test2@test.com', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup33'), 'Test', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup41'), 'Dos', 5)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.swipe(0, 0, 0, 200)

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup42'), 'Inicio.123', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup57 (1)'), '123456789', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup66'), '3002134567', 5)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup70'), 5)

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup21'), 'mr12345', 5)

Mobile.hideKeyboard()

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup29'), 5)

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup26'), 0)

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup29'), 5)

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup14'), 'Med', 5)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup38'), 5)

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.swipe(0, 0, 0, 200)

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup47'), 5)

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup52'), 5)

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 2)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.closeApplication()

