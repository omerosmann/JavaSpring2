package kodlama.io.kodlama.io.Devs.exception.classes.programmingtechnology;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProgrammingTechnologyTypeNotFoundException extends RuntimeException{
	
	public ProgrammingTechnologyTypeNotFoundException() {
        super();
    }

    public ProgrammingTechnologyTypeNotFoundException(String message) {
        super(message);
    }
}
