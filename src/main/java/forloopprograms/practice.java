package forloopprograms;

public class practice {
    public static void main(String args[]) {
        int x = 1212;
        int y=x;
        int rev = 0;
            while (x != 0) {
                rev = x % 10 + rev * 10;
                x = x / 10;
            }
        System.out.println(rev);
        if (y==rev) {
            System.out.println("palindrome");
        }
        else
            System.out.println("not a palindrome");


    }
}

