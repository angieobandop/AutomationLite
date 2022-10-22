package co.com.Lite.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class PageAutomationPractice extends PageObject{
	
	public static final Target PRODUCT = Target.the("Selecciona producto").located(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img"));
	public static final Target ADD_CART = Target.the("Boton Agregar al carrito").located(By.xpath("//*[@id=\"add_to_cart\"]/button/span/font/font"));
	public static final Target VALIDATION_ADD_CART = Target.the("validacion de mensaje").located(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/font/font"));

	public static final Target SEARCH_BAR= Target.the("Barra de Buscador").located(By.xpath("//*[@id=\"search_query_top\"]"));
	public static final Target BTN_SEARCH= Target.the("btn Buscar").located(By.xpath("//*[@id=\"searchbox\"]/button"));
	public static final Target TXT_VALIDATION= Target.the("mensaje de validacion").located(By.xpath("//*[@id=\"center_column\"]/h1"));


}
