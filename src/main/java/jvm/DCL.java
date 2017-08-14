package jvm;

/**
 * Created by yangyu on 2017/8/14.
 * 获取JIT的汇编代码
 * -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly 不好用，需要装插件
 */
public class DCL {
    private static DCL instance;

    public static DCL getInstance(){
        if (instance == null) {
            synchronized (DCL.class) {
                if (instance == null) {
                    instance = new DCL();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        DCL.getInstance();
    }
}
