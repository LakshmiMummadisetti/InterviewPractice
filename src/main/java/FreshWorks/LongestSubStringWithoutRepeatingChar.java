package FreshWorks;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String args[]) {
        String s = "bbbbbbbbbbb";

        Solution sol = new Solution();
       int val =  sol.lengthOfLongestSubstring(s);
       System.out.println(val);
    }
}
class Solution
{
    public int lengthOfLongestSubstring(String str)
    {
        int a = 0;
        int b = 0;
        int result = 0;
        Set<Character> se = new HashSet<>();

        while(a<str.length())
        {
            char ch = str.charAt(a);
            if(!se.contains(ch))
            {
                se.add(ch);
                result= Math.max(result,se.size());
                a++;
            }
            else
            {
                se.remove(str.charAt(b));
                b++;
            }
        }
        return result;
    }
}
