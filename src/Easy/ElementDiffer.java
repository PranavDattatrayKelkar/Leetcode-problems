package Easy;

import java.util.PriorityQueue;

/**
 * This class runs through an array to find atleast one pair of elements that differ by one
 */
public class ElementDiffer {

    /**
     * Returns true if in the input array has atleast one pair that differ by one
     *
     * @param nums
     * @return returns a boolean flag
     * */
    public static boolean atleastOnePairDifferByOne(int[] nums)
    {
        if(nums.length == 1)
        {
            return false;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b) -> CustomComparator(a,b));
        for(int i=0; i < nums.length; i++)
        {
            priorityQueue.add(nums[i]);
        }
        int temp1 = priorityQueue.poll();
        while(!priorityQueue.isEmpty())
        {
            int temp2 = priorityQueue.poll();
            if(temp2 - temp1 == 1)
            {
                return true;
            }
            temp1 = temp2;
        }
        return false;
    }

    /**
     * This API is a comparator that compares two elements and returns the bigger element
     *
     * @param a
     * @param b
     * @return the bigger integer to the queue
     */
    public static Integer CustomComparator(int a, int b)
    {
        if(a > b)
        {
            return 1;
        } else
        {
            return -1;
        }

    }
}
