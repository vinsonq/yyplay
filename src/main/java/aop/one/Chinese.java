package aop.one;

import org.springframework.stereotype.Component;

/**
 * Created by c on 2016/11/24.
 */
@Component
public class Chinese {
    public String sayHello(String name){
        System.out.println("-- 正在执行 sayhello 方法 --");
        return name + "hello, spring aop";
    }
    public void eat(String food){
        System.out.println("我正在吃："+food);
    }
}
