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

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup13'), 5)

Mobile.setText(findTestObject('RequestDetails_OR/android.view.ViewGroup15'), 'alejostests@gmail.com', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('RequestDetails_OR/android.view.ViewGroup23'), 'Inicio.123', 5)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup29'), 10)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup21'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup38'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup34'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.swipe(0, 0, 0, 200)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup55'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.swipe(0, 0, 0, 100)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup52'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.swipe(0, 200, 0, 0)

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup36'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.tap(findTestObject('RequestDetails_OR/android.widget.ImageView0'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.tap(findTestObject('RequestDetails_OR/android.view.View2'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup38'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup34'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.swipe(0, 0, 0, 200)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup55'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.swipe(0, 0, 0, 200)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup52'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.swipe(0, 200, 0, 0)

Mobile.tap(findTestObject('RequestDetails_OR/android.view.ViewGroup36'), 5)

Mobile.waitForElementPresent(findTestObject('RequestDetails_OR/android.widget.TextView2 - Usuario No activo'), 5)

Mobile.takeScreenshot(('Screenshots\\RequestDetails\\RequestDetails' + n) + '.png')

n++

Mobile.closeApplication()

