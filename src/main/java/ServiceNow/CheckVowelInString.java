package ServiceNow;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class CheckVowelInString {
    public static void main(String args[])
    {
        String str = "Lakshmi";
        Boolean b = str.matches(".*[aeiou].*");
        System.out.println(b);
    }
}
