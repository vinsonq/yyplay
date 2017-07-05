package resolve.javaweb;

/**
 * Created by yangyu on 2017/6/28.
 * 此类用作反编译
 */
public class Math {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = math(a, b) / 10;
    }

    public static int math(int a, int b) {
        return (a + b) * 10;
    }
}
