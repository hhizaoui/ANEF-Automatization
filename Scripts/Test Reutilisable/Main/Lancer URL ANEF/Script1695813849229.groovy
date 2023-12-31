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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.github.kklisura.cdt.protocol.commands.Fetch as Fetch
import com.github.kklisura.cdt.protocol.commands.Page as Page
import com.github.kklisura.cdt.services.ChromeDevToolsService as ChromeDevToolsService
import com.github.kklisura.cdt.launch.ChromeLauncher;
import com.github.kklisura.cdt.protocol.commands.Network;
import com.github.kklisura.cdt.protocol.commands.Page;
import com.github.kklisura.cdt.services.ChromeDevToolsService;
import com.github.kklisura.cdt.services.ChromeService;
import com.github.kklisura.cdt.services.types.ChromeTab;
import com.katalon.cdp.CdpUtils as CdpUtils
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.internal.Base64 as Base64
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.UnexpectedAlertBehaviour as UnexpectedAlertBehaviour
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.CapabilityType as CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

/** modify WebUI.* keywords which take TestObject as arg0
 * @author hhizaoui
 *so that they call Highlight.on() automatically
 */

'Call Highlight.on() automatically'
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()

/**
	Runtime.getRuntime().exec('taskkill /f /im chrome.exe')
	Runtime.getRuntime().exec('taskkill /f /im chromedriver.exe')
	Runtime.getRuntime().exec('taskkill /f /im geckodriver.exe')
*/
'RunConfiguration: getProjectDir for LogDriver '
String projDir = RunConfiguration.getProjectDir()
'RunConfiguration: getExecutionProperties Driver '
Map RunBrowserConfiguration = RunConfiguration.getExecutionProperties()
String DriverName = RunBrowserConfiguration.get("drivers").get("system").get("WebUI").get("browserType")
println "DriverName :" + DriverName
println "Driverpath :" + RunBrowserConfiguration.get("drivers")
/**Lancer un navigateur avec l'URL de l'application ANEF pour Portail Usager:
 */
if (Profiles == 'Usager') {
	switch (DriverName) {
		case 'CHROME_DRIVER':
			CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()
			WebUI.navigateToUrl(GlobalVariable.URL_ANEFQualif)
			WebUI.maximizeWindow()
			System.setProperty("webdriver.chrome.logfile", "'" +  projDir + "'" + "./chromedriver.log");
			System.setProperty("webdriver.chrome.verboseLogging", "true");
			"Appel de l'action Réutilisable pour contourner l'erreur lié à la confidentialité"
			WebUI.callTestCase(findTestCase('Test Reutilisable/Main/Erreur lie a la confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)
			
			"Vérification de l'étape :"
			WebUI.verifyElementVisible(findTestObject('Object Repository/Connexion Usager/Link_Se Connecter'), FailureHandling.STOP_ON_FAILURE)
			break;
			
		case 'HEADLESS_DRIVER':
			CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()
			WebUI.navigateToUrl(GlobalVariable.URL_ANEFQualif)
			WebUI.maximizeWindow()
			System.setProperty("webdriver.chrome.logfile", "'" +  projDir + "'" + "./chromedriver.log");
			System.setProperty("webdriver.chrome.verboseLogging", "true");
			"Appel de l'action Réutilisable pour contourner l'erreur lié à la confidentialité"
			WebUI.callTestCase(findTestCase('Test Reutilisable/Main/Erreur lie a la confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)
			
			"Vérification de l'étape :"
			WebUI.verifyElementVisible(findTestObject('Object Repository/Connexion Usager/Link_Se Connecter'), FailureHandling.STOP_ON_FAILURE)
			break;
			
		case 'FIREFOX_DRIVER':
			CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()
			WebUI.navigateToUrl(GlobalVariable.URL_ANEFQualif)
			//WebUI.openBrowser(GlobalVariable.URL_ANEFQualif)
			WebUI.maximizeWindow()
			"Appel de l'action Réutilisable pour contourner l'erreur lié à la confidentialité"
			WebUI.callTestCase(findTestCase('Test Reutilisable/Main/Erreur lie a la confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)
			"Vérification de l'étape :"
			WebUI.verifyElementVisible(findTestObject('Object Repository/Connexion Usager/Link_Se Connecter'), FailureHandling.STOP_ON_FAILURE)
			break;

		case 'FIREFOX_HEADLESS_DRIVER':
			CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()
			WebUI.navigateToUrl(GlobalVariable.URL_ANEFQualif)
			//WebUI.openBrowser(GlobalVariable.URL_ANEFQualif)
			WebUI.maximizeWindow()
			"Appel de l'action Réutilisable pour contourner l'erreur lié à la confidentialité"
			WebUI.callTestCase(findTestCase('Test Reutilisable/Main/Erreur lie a la confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)
			"Vérification de l'étape :"
			WebUI.verifyElementVisible(findTestObject('Object Repository/Connexion Usager/Link_Se Connecter'), FailureHandling.STOP_ON_FAILURE)
			break;
						
		case 'EDGE_CHROMIUM_DRIVER':
			CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()
			WebUI.navigateToUrl(GlobalVariable.URL_ANEFQualif)
			WebUI.maximizeWindow()
//			System.setProperty("webdriver.chrome.logfile", "'" +  projDir + "'" + "./chromedriver.log");
//			System.setProperty("webdriver.chrome.verboseLogging", "true");
//			"Appel de l'action Réutilisable pour contourner l'erreur lié à la confidentialité"
			WebUI.callTestCase(findTestCase('Test Reutilisable/Main/Erreur lie a la confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)
			
			"Vérification de l'étape :"
			WebUI.verifyElementVisible(findTestObject('Object Repository/Connexion Usager/Link_Se Connecter'), FailureHandling.STOP_ON_FAILURE)
			break;
			
		case  'EDGE_DRIVER':
			CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()
			WebUI.navigateToUrl(GlobalVariable.URL_ANEFQualif)
			System.setProperty("webdriver.chrome.logfile", "'" +  projDir + "'" + "./chromedriver.log");
			System.setProperty("webdriver.chrome.verboseLogging", "true");
			"Appel de l'action Réutilisable pour contourner l'erreur lié à la confidentialité"
			WebUI.callTestCase(findTestCase('Test Reutilisable/Main/Erreur lie a la confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)
			
			"Vérification de l'étape :"
			WebUI.verifyElementVisible(findTestObject('Object Repository/Connexion Usager/Link_Se Connecter'), FailureHandling.STOP_ON_FAILURE)
			break;
		case  'IE_DRIVER':
			CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()
			WebUI.openBrowser(GlobalVariable.URL_ANEFQualif)
			System.setProperty("webdriver.chrome.logfile", "'" +  projDir + "'" + "./chromedriver.log");
			System.setProperty("webdriver.chrome.verboseLogging", "true");
			"Appel de l'action Réutilisable pour contourner l'erreur lié à la confidentialité"
			WebUI.callTestCase(findTestCase('Test Reutilisable/Main/Erreur lie a la confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)
			
			"Vérification de l'étape :"
			WebUI.verifyElementVisible(findTestObject('Object Repository/Connexion Usager/Link_Se Connecter'), FailureHandling.STOP_ON_FAILURE)
			break;
	}
}






/**Lancer un navigateur avec l'URL de l'application ANEF pour Portail Agent:
 */
if (Profiles == 'Agent') {
	WebUI.openBrowser(GlobalVariable.URLPortailAgentQualif)
	WebUI.maximizeWindow()
	System.setProperty("webdriver.chrome.logfile", "'" +  projDir + "'" + "./chromedriver.log");
	System.setProperty("webdriver.chrome.verboseLogging", "true");
	// Appel de l'action Réutilisable pour contourner l'erreur lié à la confidentialité
	//WebUI.callTestCase(findTestCase('Test Reutilisable/Main/Erreur lie a la confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)
	
	//Vérification de l'étape :
	//WebUI.verifyElementVisible(findTestObject('Object Repository/Connexion Usager/Link_Se Connecter'), FailureHandling.STOP_ON_FAILURE)
	}
	
else {
	println "Vérifier le Portail de votre connexion Usager ou Agent"
}