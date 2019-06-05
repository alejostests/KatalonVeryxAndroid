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

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup13'), 0)

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup33'), 0)

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup32'), 0)

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 3)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.swipe(0, 0, 0, 100)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup20'), 'alejos', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup30'), '123', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup40'), '123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Register_OR/android.widget.ImageView8'), 0)

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup50'), '123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup61'), 0)

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup67'), '.123', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup76'), '.123', 0)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 3)

Mobile.swipe(0, 200, 0, 500)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 3)

Mobile.swipe(0, 0, 0, 100)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup20'), 'alejo@test.com', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup28'), 'Prueba', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup36'), 'Dos', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup44'), 'Inicio.123', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup60'), '123456789', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup68'), '555123456', 0)

Mobile.hideKeyboard()

Mobile.swipe(0, 200, 0, 500)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.waitForElementPresent(findTestObject('Register_OR/android.widget.TextView4 - Email'), 3)

Mobile.swipe(0, 0, 0, 100)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

int tapPositionHeight = Mobile.getDeviceHeight() - (Mobile.getDeviceHeight() * 0.05)

int tapPositionWidth = Mobile.getDeviceWidth() / 2

Mobile.tapAtPosition(tapPositionWidth, tapPositionHeight)

//Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup80'), 0)
Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup21'), '123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup29'), 0)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.setText(findTestObject('Register_OR/android.view.ViewGroup15'), 'Pe', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.pressBack()

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup40'), 0)

Mobile.swipe(0, 0, 0, 100)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.pressBack()

Mobile.tap(findTestObject('Register_OR/android.widget.ImageView5'), 0)

Mobile.tap(findTestObject('Register_OR/android.widget.ImageView6'), 0)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.tap(findTestObject('Register_OR/android.view.ViewGroup56'), 0)

Mobile.takeScreenshot(('Screenshots\\Register\\Register' + n) + '.png')

n++

Mobile.closeApplication()

