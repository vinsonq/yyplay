package resolve.javaweb;

/**
 * Created by yangyu on 2017/6/26.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println("------------------extension path-------------------");
        String[] extensionPath = System.getProperty("java.ext.dirs").split(":");
        for (String path : extensionPath) {
            System.out.println(path);
        }
        System.out.println("----------------------------------------------");
        System.out.println(ClassLoader.getSystemClassLoader().getParent());
        System.out.println("-------------------app path-------------------");
        String[] appPath = System.getProperty("java.class.path").split(":");
        for (String path : appPath) {
            System.out.println(path);
        }
        System.out.println("----------------------------------------------");
        System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());
        System.out.println("----------------------当前classpath路径------------------------");
        Test test = new Test();
        System.out.println(test.getClass().getClassLoader().getResource("").toString());

        System.out.println("----------------------自定义类加载器------------------------");
        PathClassLoader loader = new PathClassLoader("/Users/chensong/Documents/test");
        Class<?> cl = Class.forName("play.TestLocation", true, loader);
        Object obj = cl.newInstance();
        System.out.println(obj);
        System.out.println(obj.getClass().getClassLoader().getParent());

    }
}
