package interview.code.local.arraysandstrings;

import java.util.*;

public class Test {


    public static void main(String[] args) {


        System.out.println( findKMinusOneDistinctSubstring("awaglk", 5));

    }



    public static List<String> findKMinusOneDistinctSubstring(String inputString, int k) {

        Map<Character, Integer> occurrenceMap = new HashMap<>();
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i + k <= inputString.length(); i++) {

            String str = inputString.substring(i, i + k);

            boolean isRepeat = false;

            for (char c : str.toCharArray()) {
                if (occurrenceMap.containsKey(c)) {
                    if (!isRepeat)
                        occurrenceMap.put(c, occurrenceMap.get(c) + 1);
                    else
                        break;

                    isRepeat = true;
                } else
                    occurrenceMap.put(c, 1);
            }
            //if it makes it through and has precisely 1 repeat character
            if (isRepeat)
                resultList.add(str);
            //empty the map
            occurrenceMap.clear();
        }

        return resultList;
    }

}
