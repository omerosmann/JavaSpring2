package kodlama.io.kodlama.io.Devs.exception.classes.programmingtechnologytype;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProgrammingTechnologyValidationException extends RuntimeException{
	
	public ProgrammingTechnologyValidationException() {
    }

    public ProgrammingTechnologyValidationException(String message) {
        super(message);
    }
}
