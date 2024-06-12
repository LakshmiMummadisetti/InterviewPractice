public class StringReverse {
    public static void main(String args[])
    {
        String src = "I want an offer in servicenow";
        String [] str = src.split(" ");
String rev ="";
//StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length;i++)
        {
            rev = str[i]+" "+rev;
        }
        System.out.println(rev);

    }
}
