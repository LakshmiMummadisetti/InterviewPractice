package ServiceNow;

public class RemoveOccuranceInString {
    public static void main(String args[])
    {
        String str = "Ajhgjhjasaa";
        String str3= str.toLowerCase();
        String str2 = str3.replaceAll("[a]","");
        System.out.println(str2);
    }
}
