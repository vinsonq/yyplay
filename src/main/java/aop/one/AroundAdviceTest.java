package aop.one;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by c on 2016/11/24.
 */
@Aspect
public class AroundAdviceTest {
    @Around("execution(* aop.one.*.*(..))")
    public Object processTx(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("执行目标方法之前，模拟开始事务 。。。");
        Object rvt = jp.proceed(new String[]{"被改变的参数"});
        System.out.println("执行目标方法之后，模拟结束事务 。。。");
        return rvt + "新的内容";
    }
}
