package Easy;

import java.util.HashMap;

/**
 * This class solves two sum problem
 *
 */
public class TwoSum {

    /**
     * Two sum helper function takes in the input array and the target value
     *
     * @param nums
     * @param target
     * @return int array with two indexes whoes sum of values is equal to the target
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] finalArray = new int[2];
        int curr = target - nums[0];


        HashMap<Integer, Integer> sets = new HashMap<Integer, Integer>() ;
        for(int i = 0; i < nums.length; i++)
        {
            sets.put(nums[i],i);
        }

        for(int i = 1; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if(sets.containsKey(target - complement) && sets.get(complement) != i) {
                return new int[]{i, sets.get(complement)};
            }
        }

        return null;

    }

}

