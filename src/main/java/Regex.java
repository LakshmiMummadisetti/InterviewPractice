public class Regex {
    public static void main(String args[])
    {
        String str = "sdasdASHASjhjgfg$%#@!njghg";
        String removeSpecialCharacters = str.replaceAll("[^a-zA-z0-9]","");
        System.out.println("removeSpecialCharacters : "+ removeSpecialCharacters);


        String str2 = "       dfsdfs     sdfsdfsd    sdfsd      ";
        String removeLeadingandTrailingSpaces = str2.trim();
        System.out.println("removeLeadingandTrailingSpaces : "+ removeLeadingandTrailingSpaces);

        String str3 = "dfsdfs     sdfsdfsd    sdfsd";
        String removemoreThanOneSpace = str3.replace("[.\\s]{2,}","");
        System.out.println("removemoreThanOneSpace : "+ removemoreThanOneSpace);
    }
}
