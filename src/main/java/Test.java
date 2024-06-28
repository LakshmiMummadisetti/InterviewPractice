import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String args[])
    {
        String str = "abc43564356";
        String str1 = str.replaceAll("[a-z]","");
        String res = "";
        StringBuffer sbr = new StringBuffer();
        HashSet<Character> se = new HashSet<>();
        for(char ch : str1.toCharArray())
        {
           if(se.add(ch))
            sbr.append(ch);
        }
        System.out.println(sbr);
    }
}
