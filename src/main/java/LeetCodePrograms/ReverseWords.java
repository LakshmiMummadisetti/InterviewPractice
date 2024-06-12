package LeetCodePrograms;

public class ReverseWords {
    public static void main(String args[])
    {
        String str = "I want an offer in servicenow";
        String [] arraystr = str.trim().split("\\s+");
        String rev = "";
        for(int i=arraystr.length-1;i>=0;i--)
        {
            rev=rev+" "+arraystr[i];
        }
        System.out.println(rev);

    }
}
