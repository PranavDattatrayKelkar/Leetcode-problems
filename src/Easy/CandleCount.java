package Easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class creates a map of height of candles to the frequency of candles
 */
public class CandleCount {

    /**
     * This function returns the frequency count of the tallest candle
     *
     * @param nums
     * @return frequency count of the tallest candle
     */
    public static int candleCountTallestCandle(ArrayList<Integer> nums)
    {
        HashMap<Integer, Integer> candleCount = new HashMap<>();
        int max = 0;
        for(int i = 0; i < nums.size(); i++)
        {
            if(max < nums.get(i))
            {
                max = nums.get(i);
            }
            if(candleCount.containsKey(nums.get(i)))
            {
                candleCount.put(nums.get(i), candleCount.get(nums.get(i)) + 1);
            }else
            {
                candleCount.put(nums.get(i),1);
            }
        }
        return (candleCount.get(max));
    }
}
