package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    //.. любое количество параметров
    //было add
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods() {

    }
}
