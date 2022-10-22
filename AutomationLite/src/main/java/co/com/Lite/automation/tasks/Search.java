package co.com.Lite.automation.tasks;

import co.com.pragma.certification.automatizacionpragma.models.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.pragma.certification.automatizacionpragma.userinterfaces.PageAutomationPractice.*;

public class Search implements Task{
	
	private SearchPage searchPage ;
    String page;
    
    public Search(String page) {
    	this.page=page;
    }

	@Override
	
	public <T extends Actor> void performAs(T actor) {

		searchPage =new SearchPage(page);
		
		actor.attemptsTo(
				Enter.theValue("dresses").into(SEARCH_BAR), Click.on(BTN_SEARCH));
	}

	public static Search the(String page) {
	
		return Tasks.instrumented(Search.class, page);
	}

}



