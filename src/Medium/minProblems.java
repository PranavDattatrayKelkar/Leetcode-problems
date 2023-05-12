package Medium;

public class minProblems {

    public static int minProblems(int[] points, int threshold)
    {
        int numProblems = points.length;
        int maxDiff = 0;
        for (int i = 0; i < numProblems - 1; i++) {
            int diff = points[i + 1] - points[i];
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        int maxPoints = points[0] + maxDiff;
        int minPoints = points[0];
        int minVal = points[0];
        for (int i = 0; i < numProblems - 1; i++) {
            if (points[i + 1] - minPoints < threshold) {
                continue;
            } else if (i == 0) {
                return 1;
            } else if (points[i] - minPoints >= threshold) {
                return i + 1;
            } else if (points[i + 1] - maxPoints >= threshold) {
                return i + 2;
            } else {
                for (int j = i + 1; j < numProblems - 1; j++) {
                    if (points[j + 1] - maxPoints >= threshold) {
                        return j + 2;
                    }
                }
            }
            minVal = Math.min(minVal, points[i + 1]);
            maxPoints = Math.max(maxPoints, points[i + 1]);
        }
        return numProblems;

    }
}
