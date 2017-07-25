package java8.test1;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by yangyu on 2017/2/14.
 */
public interface BufferedReaderProcessor {
    String process(BufferedReader b) throws IOException;
}
