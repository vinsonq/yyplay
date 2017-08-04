package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangyu on 2017/8/4.
 */
public class SimpleHeapOOM {
    public static void main(String[] args) {
        List<Byte[]> list = new ArrayList<>();
        for (int i = 0; i < 1024; i++) {
            list.add(new Byte[1024 * 1024]);
        }
    }
}
