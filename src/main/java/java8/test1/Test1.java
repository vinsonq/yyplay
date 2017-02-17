package java8.test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by chensong on 2017/2/14.
 */


public class Test1 {
    public static String processFile(BufferedReaderProcessor p) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("/Users/chensong/Documents/data.txt"));
        return p.process(br);
    }

    public static void main(String args[]) {
        try {
            String oneline = processFile((BufferedReader br) -> br.readLine());
            String twolines = processFile((BufferedReader br) -> br.readLine() + br.readLine());
            System.out.println("oneline:"+oneline);
            System.out.println("twolines:"+twolines);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
