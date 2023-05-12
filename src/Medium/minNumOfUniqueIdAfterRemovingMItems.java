package Medium;

import java.util.*;

public class minNumOfUniqueIdAfterRemovingMItems {

    public static int minNumOfUniqueIdAfterRemovingMItems(int[] arr, int m)
    {

        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for(Integer ints: arr)
        {
            if(freqMap.containsKey(ints))
            {
                freqMap.put(ints, freqMap.get(ints) + 1);
            } else
            {
                freqMap.put(ints, 1);
            }
        }

        HashMap<Integer , Integer> finalMap = sortByValue(freqMap);

        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(finalMap.entrySet());
        ListIterator<Map.Entry<Integer, Integer>> iter = list.listIterator();

        while(iter.hasNext())
        {
            int value = iter.next().getValue();
            while(m != 0 && value !=0)
            {
                --value;
                --m;
            }
            if(value == 0)
            {
                iter.remove();
            }
            if(m == 0)
            {
                break;
            }
        }

        return (list.size());
    }

    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());


        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

}
