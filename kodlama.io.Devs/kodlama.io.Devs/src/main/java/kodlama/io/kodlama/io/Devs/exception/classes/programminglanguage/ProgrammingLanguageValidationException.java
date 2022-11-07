package kodlama.io.kodlama.io.Devs.exception.classes.programminglanguage;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ProgrammingLanguageValidationException extends RuntimeException{
	
	public ProgrammingLanguageValidationException() {
        super("A validation exception has occurred.");
    }

    public ProgrammingLanguageValidationException(String message) {
        super(message);
    }

    public ProgrammingLanguageValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProgrammingLanguageValidationException(Throwable cause) {
        super(cause);
    }
}
