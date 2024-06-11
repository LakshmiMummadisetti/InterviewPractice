package ServiceNow;

import java.util.HashSet;

public class GuessTheOutput {
    public static void main(String args[])
    {
        // first one
        String s1= "abc";
        String s2 = "abc";
        System.out.println(s1==s2);

        //second
        String s3 = "LakshmiMKum";
        int start = 1;
        char end =7;
        System.out.println(s3.substring(start,end));

        //third
        HashSet shotrset = new HashSet();
        for(short i =0; i<100; i ++)
        {
            shotrset.add(i);
            shotrset.remove(i-1);
        }
        System.out.println(shotrset.size());
    }

}
