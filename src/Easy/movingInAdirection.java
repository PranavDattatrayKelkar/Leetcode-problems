package Easy;

public class movingInAdirection {

    public static int removeUnnecessaryMovements(String s)
    {
        int mh = 0;
        int mv = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'U')
            {
                mv++;
            }
            if(s.charAt(i) == 'D')
            {
                mv--;
            }
            if(s.charAt(i) == 'L')
            {
                mh--;
            }
            if(s.charAt(i) == 'R')
            {
                mh++;
            }

        }
        int finalLength = s.length() - mh - mv;
        return finalLength;

    }
}
