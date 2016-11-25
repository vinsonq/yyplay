package aop.twoCglib;

import aop.one.Chinese;

/**
 * Created by c on 2016/11/24.
 */
public class Main {
    public static void main(String[] args)
    {
        Chinese chin = ChineseProxyFactory.getAuthInstance();
        System.out.println(chin.sayHello("孙悟空"));
        chin.eat("西瓜");
        System.out.println(chin.getClass());
    }
}
