package aop.one;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by c on 2016/11/24.
 */
@Aspect
public class AfterReturningAdviceTest {
    @AfterReturning(returning = "rvt",pointcut = "execution(* aop.one.*.*(..))")
    public void log(Object rvt){
        System.out.println("获取目标方法返回值："+rvt);
        System.out.println("模拟记录日志功能");
    }
}
