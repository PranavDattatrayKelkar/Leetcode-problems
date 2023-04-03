package Easy;

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
        int i = 1;
        while(i < nums.length)
        {
            int temp = i;
            while(temp < nums.length)
            {
                if(curr == nums[temp])
                {
                    finalArray[0] = i-1;
                    finalArray[1] = temp;
                    return finalArray;

                }
                temp++;

            }
            curr = target - nums[i];
            i++;

        }
        return finalArray;

    }

}

