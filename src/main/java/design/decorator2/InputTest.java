package design.decorator2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by chensong on 2017/2/22.
 */
public class InputTest {

    public static void main(String[] args) {
        int c = 0;
        try {
            InputStream input = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/chensong/Downloads/test.txt")));
            while ((c = input.read()) > 0) {
                System.out.print((char)c);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
