package kodlama.io.kodlama.io.Devs.business.businessAspects.pointcutdeclarations;

import org.aspectj.lang.annotation.Pointcut;

public class ProgrammingTechnologyTypePointcutDeclarations {
	
	 @Pointcut("target(kodlama.io.devs.business.abstracts.ProgrammingTechnologyTypeService)")
	    public void getProgrammingTechnologyTypeServiceImplementations() {
	    }

	    @Pointcut("kodlama.io.devs.business.businessaspects.pointcutdeclarations.GlobalPointcutDeclarations.getServiceMethods() && getProgrammingTechnologyTypeServiceImplementations()")
	    public void getProgrammingTechnologyTypeServiceMethods() {
	    }

	    @Pointcut("@annotation(kodlama.io.devs.business.customannotations.ValidateRequest)")
	    public void getAnnotatedMethodsWithValidateRequestAnnotation() {
	    }

	    @Pointcut("getProgrammingTechnologyTypeServiceMethods() && getAnnotatedMethodsWithValidateRequestAnnotation()")
	    public void getMethodsToValidate() {
	    }
}
