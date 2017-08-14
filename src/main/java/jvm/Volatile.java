package jvm;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by yangyu on 2017/8/14.
 */
public class Volatile {
    boolean flag;

    public void shutdown() {
        flag = true;
    }

    public void doWork() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        int count = 0;
        while (!flag) {
            count++;
        }
        System.out.println(name + "stop count:" + count);
    }

    public static void main(String[] args) {
        Volatile vo = new Volatile();
        Executor executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    vo.doWork();
                }
            });
        }
        vo.shutdown();
    }
}
