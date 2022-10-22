package co.com.Lite.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.Lite.automation.userinterfaces.PageAutomationPractice.*;
import static co.com.Lite.automation.userinterfaces.PageAutomationPractice.VALIDATION_ADD_CART;

public class MessageValidation implements Question<String>{
 
	private Target target;
	
	public MessageValidation(Target target) {
			this.target = target;
	
		}
	public static MessageValidation of(Target target) {
		return new MessageValidation(target);
	}
	@Override
	public String answeredBy(Actor actor) {
		
		
		return Text.of(VALIDATION_ADD_CART).viewedBy(actor).asString();
	}

}
