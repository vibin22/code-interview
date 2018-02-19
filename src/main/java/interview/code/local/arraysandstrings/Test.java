package interview.code.local.arraysandstrings;

import java.util.*;

public class Test {


    public static void main(String[] args) {


        //System.out.println( findKMinusOneDistinctSubstring("awaglk", 5));

        System.out.println( function1("wawaglknagagunagkwkwagl", 5));

    }



    public static List<String> findKMinusOneDistinctSubstring(String inputString, int k) {

        Map<Character, Integer> occurrenceMap = new HashMap<>();
        List<String> inputList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();

        //i + k <= length, to make sure end index does not go out of bound
        for (int i = 0; i + k <= inputString.length(); i++) {
            inputList.add(inputString.substring(i, i + k));
        }

        for (int j = 0; j < inputList.size(); j++) {
            String str = inputList.get(j);

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
            if(isRepeat)
                resultList.add(str);
            //empty the map
            occurrenceMap.clear();
        }

        return resultList;
    }


    public static List<String> function1(String s,int k){
        List<String> result= new ArrayList<String>();
        if(s==null||s.length()==0||s.length()<k)
            return result;
        int charCount[]= new int[26];
        int len=s.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(charCount[s.charAt(i)-'a']==0)count++;
            charCount[s.charAt(i)-'a']++;
            if(i>=k-1){
                int startIndex=i-k+1;
                if(count==3)
                    result.add(s.substring(startIndex,i+1));
                charCount[s.charAt(startIndex)-'a']--;
                if(charCount[s.charAt(startIndex)-'a']==0)
                    count--;
            }
        }
        return result;}


}
