package Easy;

import java.util.List;

public class isEvenOdd {
    public static String isEven(List<String> s, int m) {
        long total = 0;

        // iterate through each string in the list and calculate its value
        for (String str : s) {
            long value = 1;
            for (int i = 0; i < str.length(); i++) {
                value *= Math.pow(str.charAt(i) - 'a' + 1, m);
            }
            total += value;
        }

        // check if the sum is even or odd
        if (total % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }

}
