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

Mobile.tap(findTestObject('Login_OR/android.view.ViewGroup13'), 5)

Mobile.setText(findTestObject('Login_OR/android.view.ViewGroup15'), 'alejo', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Login_OR/android.view.ViewGroup25'), 'Inicio.123', 5)

Mobile.hideKeyboard()

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.setText(findTestObject('Login_OR/android.view.ViewGroup15'), 'alejostests@gmail.com', 5)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login_OR/android.widget.ImageView4'), 5)

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.tap(findTestObject('Login_OR/android.view.ViewGroup29'), 5)

Mobile.waitForElementPresent(findTestObject('Login_OR/android.widget.TextView3 - Solicitar Prueba'), 5)

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.pressBack()

Mobile.tap(findTestObject('Login_OR/android.view.ViewGroup30'), 5)

Mobile.waitForElementPresent(findTestObject('Login_OR/android.widget.TextView8 - Last names'), 5)

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.pressBack()

Mobile.tap(findTestObject('Login_OR/android.view.ViewGroup33'), 5)

Mobile.waitForElementPresent(findTestObject('Login_OR/android.view.View18'), 5)

Mobile.takeScreenshot(('Screenshots\\Login\\Login' + n) + '.png')

n++

Mobile.pressBack()

Mobile.closeApplication()

