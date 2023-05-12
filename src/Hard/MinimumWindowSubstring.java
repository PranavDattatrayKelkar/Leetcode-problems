package Hard;

import java.util.HashMap;

/**
 * This class solves Minimum Window Substring problem
 *
 */
public class MinimumWindowSubstring {

    /**
     * This method matches and returns minimum substring as that of the parent string
     *
     * @param actualString
     * @param targetString
     * @return minimum matching substring from the parent string
     */
    public static String getMininmumWindoSubstring(String actualString, String targetString) {
        int globalCount = 0;
        if(actualString.length() == targetString.length())
        {
            if(actualString.equals(targetString))
            {
                return actualString;
            }
        } else if( actualString.length() < targetString.length())
        {
            return "";
        }
        HashMap<Character, Integer> targetMap = new HashMap<Character, Integer>();
        for(int i=0; i< targetString.length(); i++)
        {
            if(targetMap.containsKey(targetString.charAt(i)))
            {
                targetMap.put(targetString.charAt(i), targetMap.get(targetString.charAt(i))+1);

            } else
            {
                targetMap.put(targetString.charAt(i),1);
            }
        }
        HashMap<Character, Integer> tempMap = new HashMap<>();
        tempMap = (HashMap)targetMap.clone();

        globalCount = targetMap.size();
        int temp = globalCount;
        System.out.println(globalCount);
        String finalSubString = "";
        int minimumLength = actualString.length();
        for(int i = 0 ; i < actualString.length(); i++)
        {
            for(int j =0; j < actualString.length(); j++)
            {

                while(globalCount>0 && j < actualString.length()) {
                    if (tempMap.containsKey(actualString.charAt(j))) {
                        int count = tempMap.get(actualString.charAt(j))-1;
                        tempMap.put(actualString.charAt(j),tempMap.get(actualString.charAt(j))-1);
                        if(count == 0)
                        {
                            globalCount--;
                        }
                    }
                    j++;
                }
                if(globalCount == 0) {
                    while (globalCount == 0 && i < actualString.length()) {
                        if (tempMap.containsKey(actualString.charAt(i))) {
                            int count = tempMap.get(actualString.charAt(i)) + 1;
                            if (count > 0) {
                                globalCount++;
                            } else {
                                tempMap.put(actualString.charAt(i), tempMap.get(actualString.charAt(i)) + 1);
                                i++;
                            }
                        } else {
                            i++;
                        }
                    }

                    String potentialSubstring = actualString.substring(i,  j);
                    if (potentialSubstring.length() <= minimumLength) {
                        minimumLength = potentialSubstring.length();
                        finalSubString = potentialSubstring;
                    }
                }
                i++;
                j = i - 1;
                tempMap = (HashMap)targetMap.clone();
                globalCount = temp;

            }
        }

        return finalSubString;

    }

}
