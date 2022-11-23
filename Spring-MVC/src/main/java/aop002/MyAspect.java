package aop002;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;

@Aspect
public class MyAspect {
    // @Before("execution(public void aop002.Boy.runSomething())")
    @Before("execution(* runSomething())")
    public void before(JoinPoint joinpoint){
        System.out.println("얼굴 인식 확인: 문을 개방하라");
        // System.out.println("열쇠로 문을 열고 집에 들어간다.");
    }
}
