package FreshWorks;

public class ReverseWordsInString {
    public static void main(String args[])
    {
        String str = "I want a job in servicenow at any cost";
        ReverseWords rw = new ReverseWords();
        String result = rw.reverse(str);
        System.out.println(result);
    }
}

class ReverseWords
{
    public String reverse(String str)
    {
        String[] str2 = str.split("\\s");
        String res="";
        for(int i =0;i<str2.length;i++)
        {
            res = str2[i]+" "+res;
        }
        res = res.trim();
        return res;
    }
}
