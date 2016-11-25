package aop.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by c on 2016/11/24.
 */
public class BeanTest {
    public static void main(String[] args){
        jdkDynamic();
    }

    public static void cglib(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/bean.xml");
        Chinese chinese = applicationContext.getBean("chinese", Chinese.class);
        System.out.println(chinese.sayHello("张三"));
        chinese.eat("西瓜");
        System.out.println(chinese.getClass());
    }

    public static void jdkDynamic(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/bean.xml");
        Person person = applicationContext.getBean("chineseExtend", Person.class);
        System.out.println(person.sayHello("张三"));
        person.eat("西瓜");
        System.out.println(person.getClass());
    }
}
