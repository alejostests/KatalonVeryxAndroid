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

Mobile.startApplication('E:\\Katalon projects\\APK\'s\\com.takeda.Veryx.apk', true)

Mobile.tap(findTestObject('Login_OR/android.view.ViewGroup13'), 10)

Mobile.waitForElementPresent(findTestObject('Login_OR/android.view.ViewGroup15'), 10)

Mobile.clearText(findTestObject('Login_OR/android.view.ViewGroup15'), 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.setText(findTestObject('Login_OR/android.view.ViewGroup15'), 'alejo', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.setText(findTestObject('Login_OR/android.view.ViewGroup15'), 'alejo@test.com', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.setText(findTestObject('Login_OR/android.view.ViewGroup23'), 'pass', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.tap(findTestObject('Login_OR/android.widget.ImageView4'), 0)

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.tap(findTestObject('Login_OR/android.view.ViewGroup31'), 0)

Mobile.waitForElementPresent(findTestObject('Login_OR/android.widget.ImageView0'), 10)

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.pressBack()

Mobile.tap(findTestObject('Login_OR/android.view.ViewGroup13'), 0)

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.pressBack()

Mobile.tap(findTestObject('Login_OR/android.view.ViewGroup33'), 0)

Mobile.waitForElementPresent(findTestObject('Login_OR/android.view.ViewGroup7'), 10)

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.closeApplication()

