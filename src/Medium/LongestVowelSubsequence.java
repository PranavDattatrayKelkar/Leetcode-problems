package Medium;

import java.util.HashMap;

public class LongestVowelSubsequence {

    public static String longestVowelSubsequenceWithAllVowels(String initalString)
    {
        String subsequence = "aeiou";
        int globalCount = 0;
        HashMap<Character, Integer> hMap = new HashMap<>();
        hMap.put('a',1);
        hMap.put('e',1);
        hMap.put('i',1);
        hMap.put('o',1);
        hMap.put('u',1);

        HashMap<String, Integer> finalMap = new HashMap<>();
        for(int i = 0; i < initalString.length(); i++)
        {
            for(int j = 0; j < initalString.length(); j++) {
                while (globalCount >= 0)
                {
                    if(hMap.containsKey(initalString.charAt(j)))
                    {
                        int count = hMap.get(j);
                        count--;
                        if(count == 0)
                        {
                            --globalCount;
                        }
                        hMap.put(initalString.charAt(j), count);
                    }
                }

            }
        }
        return "a";


    }
}
