import java.util.Arrays;
import java.util.Collections;

public class Anagram
{
    public static void main(String args[])
    {
        String str1 = "caRE";
        String str2 = "race";
        String s3 = str1.toLowerCase();
        String s4 = str2.toLowerCase();
        char[] ch1=s3.toCharArray();
        char[] ch2=s4.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean result =Arrays.equals(ch1,ch2);

        if(result)
            System.out.println("this is anagram");
        else
            System.out.println("this is not");
    }
}
