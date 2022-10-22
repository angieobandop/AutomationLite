package co.com.Lite.automation.exceptions;
import org.openqa.selenium.NoSuchElementException;

@SuppressWarnings("serial")
public class WriteTxtException extends NoSuchElementException {
       
       public static final String MESSAGE_FAILED = "Error" ;
       public WriteTxtException(String message, Throwable testErrorException) {
              super(message, testErrorException);
              
       }

}
