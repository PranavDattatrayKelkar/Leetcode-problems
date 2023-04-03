package Easy;

/**
 * This class solves Palindrome Number problem
 */
public class PalindromeNumber {

    /**
     * Uses two pointer method to check if an integer is palindrome or not. If it is, it returns true
     *
     * @param x
     * @return boolean
     */
    public static Boolean palindromeNumberCheck(int x)
    {
        String number = Integer.toString(x);
        int start = 0;
        int end = number.length()-1;

        boolean palindromeCheck = false;
        if(start == end)
        {
            return true;

        }
        while(start < end)
        {
            if(!(number.charAt(start) == (number.charAt(end))))
            {
                return false;

            }
            palindromeCheck = true;
            start++;
            end--;

        }
        return palindromeCheck;

    }

}
