package interview.code.local;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vibinramakrishnan on 7/2/17.
 */
public class JavaProblems {


    public static void main(String[] args) {

    }



    /**
     * get the count of put and get calls
     * @param <K>
     * @param <V>
     */
    public static class MyMap<K, V> extends HashMap<K, V> {

        private static int putCount = 0;
        private static int getCount = 0;

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

        public int getPutCount() {
            return putCount;
        }

        public int getGetCount() {
            return getCount;
        }
    }

}



