package club.guava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multiset;

/**
 * Created by ty on 2017/8/26.
 */
public class CollentTest {


    public static void main(String[] args) {

        ImmutableSet<String> COLOR_NAMES = ImmutableSet.of("red", "orange",

                "yellow",

                "green",

                "blue",

                "purple");

//        COLOR_NAMES.add("!23");


        System.out.println(COLOR_NAMES);


//        ImmutableAsList.of("ss","234ds");
        ImmutableList<String> immutableList = ImmutableList.of("sss","Ccc");

       String s =  immutableList.get(2);
//        Multiset<String> mu = Multi

    }
}
