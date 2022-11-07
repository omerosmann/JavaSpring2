package kodlama.io.kodlama.io.Devs.business.businessAspects.validation;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import kodlama.io.kodlama.io.Devs.business.requests.programminglanguage.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.requests.programminglanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.exception.classes.programminglanguage.ProgrammingLanguageValidationException;

import java.util.Arrays;

@Aspect
@Component
public class ProgrammingLanguageValidator {
	 @Before("kodlama.io.devs.business.businessaspects.pointcutdeclarations.ProgrammingLanguagePointcutDeclarations.getMethodsToValidate()")
	    public void validateGivenObject(JoinPoint joinPoint) {
	        Object[] args = joinPoint.getArgs();
	        Arrays.stream(args).forEach(
	                arg -> {
	                    if (arg instanceof CreateProgrammingLanguageRequest) {
	                        CreateProgrammingLanguageRequest param = ((CreateProgrammingLanguageRequest) arg);
	                        if (param.getName().isBlank()) {
	                            throw new ProgrammingLanguageValidationException("Programming language name can't be null or blank value.");
	                        }
	                    } else if (arg instanceof UpdateProgrammingLanguageRequest) {
	                        UpdateProgrammingLanguageRequest param = ((UpdateProgrammingLanguageRequest) arg);
	                        if (param.getName().isBlank()) {
	                            throw new ProgrammingLanguageValidationException("Programming language name can't be null or blank value.");
	                        }
	                    }
	                }
	        );
	    }
}
