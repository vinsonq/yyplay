package jvm;

/**
 * Created by yangyu on 2017/7/26.
 */
public class Count {
    public Object instance = null;
    private static final int _1MB =1024*1024;
    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        Count a1 = new Count();
        Count a2 = new Count();
        a1.instance = a2;
        a2.instance = a1;
        a1 = null;
        a2 = null;
        System.gc();
    }
}
