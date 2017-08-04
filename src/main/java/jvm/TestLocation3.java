package jvm;

/**
 * Created by yangyu on 2017/7/27.
 */
public class TestLocation3 {
    private static final int _1MB = 1024 * 1024;

    /**
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1
     */
    public static void testAllocation() {
        byte[] location1,location2,location3;
        location1 = new byte[_1MB / 4];
        location2 = new byte[4 * _1MB];
        location3 = new byte[4 * _1MB];
        location3 = null;
        location3 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testAllocation();
    }
}
