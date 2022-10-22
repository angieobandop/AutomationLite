package co.com.Lite.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class SwitchTo implements Interaction {

	public  JavascriptExecutor jse;
	private WebDriver browser;
    private int tab;


	public SwitchTo(WebDriver browser , int tab) {
		this.browser = browser;
		this.tab = tab;
		//WebDriver driver = new FirefoxDriver();
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		jse.executeScript("window.scrollBy(0,250)");

}
	@Override
	public <T extends Actor> void performAs(T Actor) {
		
		ArrayList<String> tabs = new ArrayList<String>(browser.getWindowHandles());
		browser.switchTo().window(tabs.get(tab));
	}
	
	public static SwitchTo Windows(WebDriver browser, int tab) {
	
		return Tasks.instrumented(SwitchTo.class, browser, tab);
	}

}
