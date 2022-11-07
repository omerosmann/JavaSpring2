package kodlama.io.kodlama.io.Devs.exception.classes.programmingtechnologytype;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProgrammingTechnologyTypeValidationException extends RuntimeException{
	
	public ProgrammingTechnologyTypeValidationException() {
        super();
    }

    public ProgrammingTechnologyTypeValidationException(String message) {
        super(message);
    }
}
