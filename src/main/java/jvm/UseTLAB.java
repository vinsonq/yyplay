package jvm;

/**
 * Created by yangyu on 2017/8/4.
 * 参数1 -XX:+UseTLAB -Xcomp -XX:-BackgroundCompilation -XX:-DoEscapeAnalysis
 * 参数2 -XX:-UseTLAB -Xcomp -XX:-BackgroundCompilation -XX:-DoEscapeAnalysis
 */
public class UseTLAB {

    public static void alloc() {
        byte[] bytes = new byte[2];
        bytes[0] = 1;
    }

    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long e = System.currentTimeMillis();
        System.out.println(e - b);
    }
}
