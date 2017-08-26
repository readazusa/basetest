package club.guava;

import com.google.common.io.ByteStreams;
import com.google.common.io.Files;

import java.io.IOException;

/**
 * Created by ty on 2017/8/26.
 */
public class GuavaIOTest {

    public static void main(String[] args) {

        try {
            ByteStreams.toByteArray(null);

//            Files.map().
//            ByteStreams.
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
