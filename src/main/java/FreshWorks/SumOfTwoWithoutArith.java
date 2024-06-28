package FreshWorks;

public class SumOfTwoWithoutArith {
    public static void main(String args[]) {
        int i = 9;
        int j = 9;
        while (j != 0) {

            int carry = i&j;
            i = i^j;
            j = carry <<1;
        }
        System.out.println(i);
    }
}
