package kodlama.io.kodlama.io.Devs.business.businessAspects.pointcutdeclarations;

import org.aspectj.lang.annotation.Pointcut;

public class ProgrammingLanguagePointcutDeclarations {
	
	@Pointcut("target(kodlama.io.devs.business.abstracts.ProgrammingLanguageService)")
    public void getProgrammingLanguageServiceImplementations() {
    }

    @Pointcut("kodlama.io.devs.business.businessaspects.pointcutdeclarations.GlobalPointcutDeclarations.getServiceMethods() && getProgrammingLanguageServiceImplementations()")
    public void getProgrammingTechnologyServiceMethods() {
    }

    @Pointcut("@annotation(kodlama.io.devs.business.customannotations.ValidateRequest)")
    public void getAnnotatedMethodsWithValidateRequestAnnotation() {
    }

    @Pointcut("getProgrammingTechnologyServiceMethods() && getAnnotatedMethodsWithValidateRequestAnnotation()")
    public void getMethodsToValidate() {
    }
}
