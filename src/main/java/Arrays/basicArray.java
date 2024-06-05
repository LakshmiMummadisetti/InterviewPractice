package Arrays;

public class basicArray {
    public static void main(String args[])
    {
        int num[] ={1,2,3,4};
        System.out.println("print the value of index 3" +num[3]); // this prints the value of index 3. which is 4.
        num[2]=7; //this changes the value of index 2 to new value 7
        System.out.println("print the value of index 2" +num[2]);

        int ran[] =new int[4];// if we dont know the values in array, then use this. 4 represents the size of an array
        System.out.println("Print the value of index 1 for ran array" +ran[1]); // it doesn't have any values, so it prints 0
        ran[0] = 9; //we are updating the values now for the empty array
        ran[1] = 8;
        ran[2] = 7;
        ran[3] = 5;
        for(int i=0;i<4;i++)
        {
            System.out.println(ran[i]);
        }

    }
}
