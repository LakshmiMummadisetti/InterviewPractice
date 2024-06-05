package forloopprograms;

public class palindrom {
    public static void main(String args[])
    {
        String name = "radar";
        String rev = "";
        for(int i =0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            rev = ch+rev;

        }
        System.out.println(rev);
        if(rev.equals(name))
        {
            System.out.println("This is palindrome");

        }
        else
            System.out.println("This is not palindrome");

    }
}
