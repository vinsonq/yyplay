package jvm;

/**
 * Created by yangyu on 2017/7/27.
 */
public class TestLocation2 {
    private static final int _1MB = 1024 * 1024;

    /**
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728 -XX:+UseParNewGC
     */
    public static void testAllocation() {
        byte[] location1;
        location1 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testAllocation();
    }
}
