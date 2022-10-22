package co.com.Lite.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.pragma.certification.automatizacionpragma.userinterfaces.PageAutomationPractice.*;


public class Select implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(PRODUCT), Click.on(ADD_CART));

		//actor.attemptsTo(SwitchTo.Windows(jse.executeScript("scroll(0, 250);"),
		//		Click.on(PRODUCT), Click.on(ADD_CART));
	}


	public static Select product(Target product) {

		return Tasks.instrumented(Select.class);
	}
}


