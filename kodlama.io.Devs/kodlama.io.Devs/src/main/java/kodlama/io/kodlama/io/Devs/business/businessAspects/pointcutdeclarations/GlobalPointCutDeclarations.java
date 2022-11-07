package kodlama.io.kodlama.io.Devs.business.businessAspects.pointcutdeclarations;

import org.aspectj.lang.annotation.Pointcut;

public class GlobalPointCutDeclarations {
	
	 @Pointcut("execution(* kodlama.io.devs.business.concretes.*.*(..))")
	    public void getServiceMethods() {
	    }
}
