package interview.code.local.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by vibinramakrishnan on 7/8/17.
 */
public class AnagramComparator implements Comparator<String> {

    private String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public int compare(String s1, String s2) {
        return sortChars(s1).compareTo(sortChars(s2));
    }
}
