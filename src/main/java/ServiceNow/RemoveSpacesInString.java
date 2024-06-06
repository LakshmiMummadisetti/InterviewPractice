package ServiceNow;


public class RemoveSpacesInString {
    public static void main(String args[])
    {
        String str = "       Lakshmi Kumari     sai   M       ";
        System.out.println(str);
        System.out.println(str.trim()); // this removes starting and ending spaces(leading and trailing spaces)
        String rev =str.replaceAll("\\s","");// removes all spaces
        System.out.println(rev);
    }
}
