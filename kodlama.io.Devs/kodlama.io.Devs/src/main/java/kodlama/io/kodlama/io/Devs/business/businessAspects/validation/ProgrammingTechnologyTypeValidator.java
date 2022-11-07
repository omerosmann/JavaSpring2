package kodlama.io.kodlama.io.Devs.business.businessAspects.validation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnologytype.CreateProgrammingTechnologyTypeRequest;
import kodlama.io.kodlama.io.Devs.business.requests.programmingtechnologytype.UpdateProgrammingTechnologyTypeRequest;
import kodlama.io.kodlama.io.Devs.exception.classes.programmingtechnologytype.ProgrammingTechnologyTypeValidationException;

import java.util.Arrays;

@Aspect
@Component
public class ProgrammingTechnologyTypeValidator {
	@Before("kodlama.io.devs.business.businessaspects.pointcutdeclarations.ProgrammingTechnologyTypePointcutDeclarations.getMethodsToValidate()")
    public void validateGivenObject(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Arrays.stream(args).forEach(
                arg -> {
                    if (arg instanceof CreateProgrammingTechnologyTypeRequest) {
                        CreateProgrammingTechnologyTypeRequest param = ((CreateProgrammingTechnologyTypeRequest) arg);
                        if (param.getName().isBlank()) {
                            throw new ProgrammingTechnologyTypeValidationException("Programming technology type name can't be null or blank value.");
                        }
                    } else if (arg instanceof UpdateProgrammingTechnologyTypeRequest) {
                        UpdateProgrammingTechnologyTypeRequest param = ((UpdateProgrammingTechnologyTypeRequest) arg);
                        if (param.getName().isBlank()) {
                            throw new ProgrammingTechnologyTypeValidationException("Programming technology type name can't be null or blank value.");
                        }
                    }
                }
        );
    }
}
