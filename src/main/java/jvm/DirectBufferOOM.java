package jvm;

import java.nio.ByteBuffer;

/**
 * Created by yangyu on 2017/8/4.
 * 直接内存的申请速度一般要比堆内存慢，但是其访问速度要快于堆内存。因此，对于那些可复用的，并且会经常访问的空间，使用直接内存是可以提高系统性能的
 */
public class DirectBufferOOM {
    public static void main(String[] args) {
        for (int i = 0; i < 1024; i++) {
            ByteBuffer.allocateDirect(1024 * 1024);
            System.out.println(i);
        }
    }
}
