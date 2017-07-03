package interview.code.local;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vibinramakrishnan on 7/2/17.
 */
public class JavaProblems {


    public static void main(String[] args) {

        MyMap myMap = new MyMap();
        myMap.put(1,"b");
        myMap.put(2,"a");
        System.out.println(myMap.getPutCount());


        MyMap myMap2 = new MyMap();
        myMap2.put(1,"b");
        myMap2.put(2,"a");
        myMap2.put(3,"g");
        System.out.println(myMap2.getPutCount());


    }



    /**
     * get the count of put and get calls
     * @param <K>
     * @param <V>
     */
    public static class MyMap<K, V> extends HashMap<K, V> {

        private int putCount = 0;
        private int getCount = 0;

        @Override
        public V put(K key, V value) {
            putCount++;
            return super.put(key, value);
        }

        @Override
        public V get(Object key) {
            getCount++;
            return super.get(key);
        }

        private  int getPutCount() {
            return putCount;
        }

        private  int getGetCount() {
            return getCount;
        }
    }

}



