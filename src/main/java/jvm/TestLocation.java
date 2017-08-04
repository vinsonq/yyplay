package jvm;

/**
 * Created by yangyu on 2017/7/27.
 */
public class TestLocation {
    private static final int _1MB = 1024 * 1024;

    /**
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void testAllocation() {
        byte[] location1, location2, location3, location4;
        location1 = new byte[2 * _1MB];
        location2 = new byte[2 * _1MB];
        location3 = new byte[2 * _1MB];
        location4 = new byte[5 * _1MB];
    }

    public static void main(String[] args) {
        testAllocation();
    }
}
