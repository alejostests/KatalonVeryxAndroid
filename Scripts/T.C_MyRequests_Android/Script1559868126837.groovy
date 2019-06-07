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

Mobile.waitForElementPresent(findTestObject('MyRequests_OR/android.widget.TextView3 - Solicitar Prueba'), 2)

Mobile.tap(findTestObject('MyRequests_OR/android.view.ViewGroup13'), 5)

Mobile.setText(findTestObject('MyRequests_OR/android.view.ViewGroup15'), 'alejostests@gmail.com', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('MyRequests_OR/android.view.ViewGroup23'), 'Inicio.123', 5)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MyRequests_OR/android.view.ViewGroup29'), 5)

Mobile.waitForElementPresent(findTestObject('MyRequests_OR/android.widget.TextView3 - Solicitar Prueba'), 2)

Mobile.tap(findTestObject('MyRequests_OR/android.view.ViewGroup21'), 5)

Mobile.waitForElementPresent(findTestObject('MyRequests_OR/android.widget.TextView3 - Solicitar Prueba'), 2)

Mobile.takeScreenshot(('Screenshots\\MyRequests\\MyRequests' + n) + '.png')

n++

Mobile.tap(findTestObject('MyRequests_OR/android.view.View2'), 5)

Mobile.waitForElementPresent(findTestObject('MyRequests_OR/android.widget.TextView3 - Solicitar Prueba'), 2)

Mobile.takeScreenshot(('Screenshots\\MyRequests\\MyRequests' + n) + '.png')

n++

Mobile.tap(findTestObject('MyRequests_OR/android.view.View1'), 5)

Mobile.waitForElementPresent(findTestObject('MyRequests_OR/android.widget.TextView3 - Solicitar Prueba'), 2)

Mobile.setText(findTestObject('MyRequests_OR/android.view.ViewGroup18'), 'test', 5)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MyRequests_OR/android.view.ViewGroup19'), 5)

Mobile.waitForElementPresent(findTestObject('MyRequests_OR/android.widget.TextView3 - Solicitar Prueba'), 2)

Mobile.takeScreenshot(('Screenshots\\MyRequests\\MyRequests' + n) + '.png')

n++

Mobile.tap(findTestObject('MyRequests_OR/android.view.View2'), 5)

Mobile.waitForElementPresent(findTestObject('MyRequests_OR/android.widget.TextView3 - Solicitar Prueba'), 2)

Mobile.tap(findTestObject('MyRequests_OR/android.view.ViewGroup19'), 5)

Mobile.waitForElementPresent(findTestObject('MyRequests_OR/android.widget.TextView3 - Solicitar Prueba'), 2)

Mobile.takeScreenshot(('Screenshots\\MyRequests\\MyRequests' + n) + '.png')

n++

Mobile.closeApplication()

