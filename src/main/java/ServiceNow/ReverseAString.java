package ServiceNow;

public class ReverseAString {
    public static void main(String args[])
    {
        String str = "DaD";
        String rev="";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
        for(int i = 0;i< str.length();i++)
        {
            char ch = str.charAt(i);
            rev = ch+rev;
        }
        System.out.println(rev);
        if(rev.equals(str))
        {
            System.out.println("This is palin");
        }
        else
            System.out.println("This is NOT palin");

    }
}
