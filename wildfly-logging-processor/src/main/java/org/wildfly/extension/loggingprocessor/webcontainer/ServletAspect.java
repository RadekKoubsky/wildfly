package org.wildfly.extension.loggingprocessor.webcontainer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class ServletAspect {
    @Before("call(* org.wildfly.extension.undertow.Host.registerHandler(..))")
    public void interceptAndLog(JoinPoint joinPoint){
        System.out.println("Just before the methods: " + joinPoint.getSignature().getName() + " with args: " + joinPoint.getArgs()[0] + ", " + joinPoint.getArgs()[1]);
        System.out.println(joinPoint.getSignature().getDeclaringType().getDeclaredMethods()[0]);
        final MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        final String[] parameterNames = signature.getParameterNames();
        for (String string : parameterNames) {
            System.out.println("paramName: " + string);
        }
        System.out.println("************ASPECTJ SUCCESS!!!************");
    }
}
