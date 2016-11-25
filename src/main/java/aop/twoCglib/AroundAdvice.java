package aop.twoCglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by c on 2016/11/24.
 */
public class AroundAdvice implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行目标方法之前，模拟开始事务 ...");
        Object rvt = methodProxy.invokeSuper(o, new String[]{"被改变的参数"});
        System.out.println("执行目标方法之后，模拟结束事务 ...");
        return rvt + " 新增的内容";
    }
}
