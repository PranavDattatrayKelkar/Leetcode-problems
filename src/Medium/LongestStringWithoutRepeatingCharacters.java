package Medium;

import java.util.HashMap;

public class LongestStringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int currMax = 0;
        if(s.length() == 0)
        {
            return 0;
        }
        if(s.length() == 1)
        {
            return 1;
        }
        for(int i = 0; i < s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1 );
            } else {
                map.put(s.charAt(i),1);
            }
        }


        for(int i=0; i < s.length(); i++)
        {
            for(int j = 0; j < s.length();j++)
            {
                if(map.containsKey(s.charAt(j)))
                {
                    String temp = s.substring(i, j);
                    if ((temp.length()) > currMax){
                        currMax = temp.length();
                    }
                    while(s.charAt(i) != s.charAt(j))
                    {
                        i++;
                    }
                    i++;
                    map = new HashMap<Character, Integer>();
                    map.put(s.charAt(j),1);
                } else
                {
                    map.put(s.charAt(j),1);
                }
            }
            if(!map.isEmpty()){
                if(map.size() > currMax)
                {
                    return map.size();
                }
            }
            break;

        }
        return currMax;
    }
}
